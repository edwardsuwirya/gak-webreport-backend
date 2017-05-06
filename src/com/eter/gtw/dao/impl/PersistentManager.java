package com.eter.gtw.dao.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.eter.gtw.dao.PersistentManagerDAO;

@SuppressWarnings("rawtypes")
@Transactional
public class PersistentManager implements PersistentManagerDAO {
    @PersistenceContext
    private EntityManager em;
    private Query query;


    @Override
    public <T> Object Save(T obj) throws Exception {
        return em.merge(obj);
    }

    @Override
    public <T> Object getById(Class aClass, String id) throws Exception {
        try {
            query = em.createQuery("FROM " + aClass.getSimpleName() + " c WHERE c.activeFlag<>0 AND c.id=?");
            query.setParameter(1, id);
            return query.getSingleResult();
        } catch (NoResultException noResultException) {
            return null;
        }
    }

    @Override
    public <T> Object getSingleResult(String strSQL) throws Exception {
        try {
            query = em.createQuery(strSQL);
            return query.getSingleResult();
        } catch (NoResultException noResultException) {
            return null;
        }
    }

    @Override
    public <T> Object getSingleResult(String strSQL, Map params) throws Exception {
        try {
            query = em.createQuery(strSQL);
            insertParamsToQuery(query, params);

            return query.getSingleResult();
        } catch (NoResultException noResultException) {
            return null;
        }
    }

    @Override
    public <T> List getList(String strSQL) throws Exception {
        query = em.createQuery(strSQL);
        return query.getResultList();
    }

    @Override
    public <T> List getList(String strSQL, Map params) throws Exception {
        query = em.createQuery(strSQL);
        insertParamsToQuery(query, params);
        return query.getResultList();
    }

    @Override
    public <T> List getListNative(String strSQL) throws Exception {
        query = em.createNativeQuery(strSQL);
        return query.getResultList();
    }

    @Override
    public <T> List getListNative(String strSQL, Map params) throws Exception {
        query = em.createNativeQuery(strSQL);
        insertParamsToQuery(query, params);
        return query.getResultList();
    }

    @Override
    public <T> List getListNative(String strSQL, Map params, Class aClass) throws Exception {
        query = em.createNativeQuery(strSQL, aClass);
        insertParamsToQuery(query, params);
        return query.getResultList();
    }

    @Override
    public <T> List getAll(Class aClass) throws Exception {
        //query = em.createQuery("FROM "+aClass.getSimpleName() +" WHERE activeFlag=1");
        query = em.createQuery("FROM " + aClass.getSimpleName());
        return query.getResultList();
    }

    @Override
    public <T> boolean saveAll(List list) throws Exception {
        em.getTransaction().begin();
        try {
            for (Object object : list) {
                em.merge(object);
            }

            em.getTransaction().commit();

            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        }
    }

    @Override
    public <T> List getListNamedQuery(String queryName) throws Exception {
        query = em.createNamedQuery(queryName);
        return query.getResultList();
    }

    @Override
    public <T> List getListNamedQuery(String queryName, Map params) throws Exception {
        query = em.createNamedQuery(queryName);
        insertParamsToQuery(query, params);
        return query.getResultList();
    }

    @Override
    public <T> Object getSingleNamedQuery(String queryName) throws Exception {
        try {
            query = em.createNamedQuery(queryName);
            return query.getSingleResult();
        } catch (NoResultException noResultException) {
            return null;
        }
    }

    @Override
    public <T> Object getSingleNamedQuery(String queryName, Map params) throws Exception {
        try {
            query = em.createNamedQuery(queryName);
            insertParamsToQuery(query, params);
            return query.getSingleResult();
        } catch (NoResultException noResultException) {
            return null;
        }
    }

    @Override
    public <T> boolean delete(T obj) throws Exception {
        try {
            em.remove(em.contains(obj) ? obj : em.merge(obj));
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Insert parameters(params) to Query(que)
     *
     * @param que
     * @param params
     */
    private void insertParamsToQuery(Query que, Map params) throws Exception {
        Set queryParamKeys = params.keySet();
        Iterator queryParamIterator = queryParamKeys.iterator();

        while (queryParamIterator.hasNext()) {
            String key = queryParamIterator.next().toString();
            Object value = params.get(key);
            que.setParameter(key, value);
        }
    }
}
