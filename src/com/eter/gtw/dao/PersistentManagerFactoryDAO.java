package com.eter.gtw.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import com.eter.gtw.model.json.ReportParam;

@SuppressWarnings("rawtypes")
public interface PersistentManagerFactoryDAO {
    /**
     * Return EntityManager that mostly use for manual transaction
     */
    public EntityManager getEntityManager() throws Exception;

    /**
     * Save Entity(obj) to Database and return the object so the original object
     * may get the updated ID
     *
     * @param obj
     */
    public <T> Object Save(T obj) throws Exception;

    /**
     * Return row from Table(aClass) Where id=(id)
     *
     * @param aClass
     * @param id
     */
    public <T> Object getById(Class aClass, String id) throws Exception;

    /**
     * Return row list by HQL(strSQL)
     *
     * @param strSQL
     */
    public <T> List getList(String strSQL) throws Exception;

    /**
     * Return row list by HQL(strSQL) with given parameters(params)
     *
     * @param strSQL
     */
    public <T> List getList(String strSQL, Map params) throws Exception;

    /**
     * Return row list by Native SQL Query(strSQL)
     *
     * @param strSQL
     */
    public <T> List getListNative(String strSQL) throws Exception;

    /**
     * Return row list from Table(aClass) Where active_flag=1
     *
     * @param aClass
     */
    public <T> List getAll(Class aClass) throws Exception;

    /**
     * Save list of object
     *
     * @param <T> List
     */
    public <T> List saveAll(List<T> list) throws Exception;

    /**
     * Delete object
     *
     * @param <T> Object
     */
    public <T> boolean delete(T obj) throws Exception;

    public List<Object[]> callStoredProcedure(String procedureName, ReportParam param) throws Exception;

}
