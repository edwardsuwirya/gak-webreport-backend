package com.eter.gtw.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;

import org.springframework.transaction.annotation.Transactional;

import com.eter.gtw.dao.PersistentManagerFactoryDAO;
import com.eter.gtw.model.json.ReportParam;
import com.eter.gtw.utils.DateConverter;
import com.eter.gtw.utils.SPNameConstants;

@SuppressWarnings({"rawtypes"})
@Transactional
public class PersistentManagerFactory implements PersistentManagerFactoryDAO {
    private Query query;

    private DateConverter dateConverter = new DateConverter();
    @PersistenceUnit
    private EntityManagerFactory emf;
    private EntityManager em = null;

    @Override
    public EntityManager getEntityManager() throws Exception {
        if (em == null) {
            em = emf.createEntityManager();
        }
        return em;
    }

    @Override
    public <T> Object Save(T obj) throws Exception {
        try {
            if (!getEntityManager().getTransaction().isActive())
                throw new Exception("Transaction is not started yet");

            return getEntityManager().merge(obj);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public <T> Object getById(Class aClass, String id) throws Exception {
        query = getEntityManager()
                .createQuery("FROM " + aClass.getSimpleName() + " c WHERE c.activeFlag <> 0 AND c.id=?");
        query.setParameter(1, id);

        if (query.getResultList().size() > 0)
            return query.getSingleResult();
        else
            return null;
    }

    @Override
    public <T> List getList(String strSQL) throws Exception {
        query = getEntityManager().createQuery(strSQL);
        return query.getResultList();
    }

    @Override
    public <T> List getList(String strSQL, Map params) throws Exception {
        query = getEntityManager().createQuery(strSQL);
        insertParamsToQuery(query, params);
        return query.getResultList();
    }

    @Override
    public <T> List getListNative(String strSQL) throws Exception {
        query = getEntityManager().createNativeQuery(strSQL);
        return query.getResultList();
    }

    @Override
    public <T> List getAll(Class aClass) throws Exception {
        query = getEntityManager().createQuery("FROM " + aClass.getSimpleName() + " WHERE activeFlag <> 0");
        return query.getResultList();
    }

    @Override
    public <T> List saveAll(List<T> list) throws Exception {
        try {
            if (!getEntityManager().getTransaction().isActive())
                throw new Exception("Transaction is not started yet");

            List<Object> saveList = new ArrayList<Object>();

            for (Object object : list) {
                getEntityManager().merge(object);
                saveList.add(object);
            }

            return saveList;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public <T> boolean delete(T obj) throws Exception {
        try {
            if (!getEntityManager().getTransaction().isActive())
                throw new Exception("Transaction is not started yet");

            getEntityManager().remove(getEntityManager().contains(obj) ? obj : getEntityManager().merge(obj));
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Object[]> callStoredProcedure(String procedureName, ReportParam param) throws Exception {
        StoredProcedureQuery spq = getEntityManager().createStoredProcedureQuery(procedureName);

        switch (procedureName) {
            case SPNameConstants.RPT_CUSTOMER_TRANSACTION_HISTORY:
                customerTransactionHistorySP(spq, param);
                break;
            case SPNameConstants.RPT_DAILY_LOADING:
                dailyLoadingSP(spq, param);
                break;
            case SPNameConstants.RPT_LIST_DO_ACTIVITY:
                listDOActivitySP(spq, param);
                break;
            case SPNameConstants.RPT_LIST_RO_ACTIVITY:
                listROActivitySP(spq, param);
                break;
            case SPNameConstants.RPT_MEMBER_POINT_HISTORY:
                memberPointSP(spq, param);
                break;
            case SPNameConstants.RPT_STOCK_BY_RO:
                stockReportByROSP(spq, param);
                break;
            case SPNameConstants.RPT_TOP_CUSTOMER:
                topCustomerSP(spq, param);
                break;
            default:
                throw new Exception("Unknown Stored Procedure Name");

        }
        boolean result = spq.execute();
        if (result == true) {
            List<Object[]> report = spq.getResultList();
            return report;
        } else {
            throw new Exception("Can not execute Stored Procedure");
        }
    }

    private void customerTransactionHistorySP(StoredProcedureQuery spq, ReportParam param) {
        spq.registerStoredProcedureParameter("@sCompanyCode", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sDate1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sDate2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sRC1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sRC2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sArticle1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sArticle2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sCustomer1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sCustomer2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sType", String.class, ParameterMode.IN);

        spq.setParameter("@sCompanyCode", param.getsCompanyCode());
        spq.setParameter("@sDate1", dateConverter.convert(param.getsDate1()));
        spq.setParameter("@sDate2", dateConverter.convert(param.getsDate2()));
        spq.setParameter("@sRC1", param.getsRC1());
        spq.setParameter("@sRC2", param.getsRC2());
        spq.setParameter("@sArticle1", param.getsArticle1());
        spq.setParameter("@sArticle2", param.getsArticle2());
        spq.setParameter("@sCustomer1", param.getsCustomer1());
        spq.setParameter("@sCustomer2", param.getsArticle2());
        spq.setParameter("@sType", param.getsType());
    }

    private void dailyLoadingSP(StoredProcedureQuery spq, ReportParam param) {
        spq.registerStoredProcedureParameter("@sCompanyCode", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sDate1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sDate2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sRC1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sRC2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sArticle1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sArticle2", String.class, ParameterMode.IN);

        spq.setParameter("@sCompanyCode", param.getsCompanyCode());
        spq.setParameter("@sDate1", dateConverter.convert(param.getsDate1()));
        spq.setParameter("@sDate2", dateConverter.convert(param.getsDate2()));
        spq.setParameter("@sRC1", param.getsRC1());
        spq.setParameter("@sRC2", param.getsRC2());
        spq.setParameter("@sArticle1", param.getsArticle1());
        spq.setParameter("@sArticle2", param.getsArticle2());
    }

    private void listDOActivitySP(StoredProcedureQuery spq, ReportParam param) {
        spq.registerStoredProcedureParameter("@sCompanyCode", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sDate1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sDate2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sRC1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sRC2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sArticle1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sArticle2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sCustomer1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sCustomer2", String.class, ParameterMode.IN);

        spq.setParameter("@sCompanyCode", param.getsCompanyCode());
        spq.setParameter("@sDate1", dateConverter.convert(param.getsDate1()));
        spq.setParameter("@sDate2", dateConverter.convert(param.getsDate2()));
        spq.setParameter("@sRC1", param.getsRC1());
        spq.setParameter("@sRC2", param.getsRC2());
        spq.setParameter("@sArticle1", param.getsArticle1());
        spq.setParameter("@sArticle2", param.getsArticle2());
        spq.setParameter("@sCustomer1", param.getsCustomer1());
        spq.setParameter("@sCustomer2", param.getsCustomer2());
    }

    private void listROActivitySP(StoredProcedureQuery spq, ReportParam param) {
        spq.registerStoredProcedureParameter("@sCompanyCode", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sDate1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sDate2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sRC1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sRC2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sArticle1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sArticle2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sCustomer1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sCustomer2", String.class, ParameterMode.IN);

        spq.setParameter("@sCompanyCode", param.getsCompanyCode());
        spq.setParameter("@sDate1", dateConverter.convert(param.getsDate1()));
        spq.setParameter("@sDate2", dateConverter.convert(param.getsDate2()));
        spq.setParameter("@sRC1", param.getsRC1());
        spq.setParameter("@sRC2", param.getsRC2());
        spq.setParameter("@sArticle1", param.getsArticle1());
        spq.setParameter("@sArticle2", param.getsArticle2());
        spq.setParameter("@sCustomer1", param.getsCustomer1());
        spq.setParameter("@sCustomer2", param.getsCustomer2());
    }

    private void memberPointSP(StoredProcedureQuery spq, ReportParam param) {
        spq.registerStoredProcedureParameter("@sCompanyCode", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sMemberCodeStart", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sMemberCodeEnd", String.class, ParameterMode.IN);

        spq.setParameter("@sCompanyCode", param.getsCompanyCode());
        spq.setParameter("@sMemberCodeStart", param.getsMemberCodeStart());
        spq.setParameter("@sMemberCodeEnd", param.getsMemberCodeEnd());
    }

    private void stockReportByROSP(StoredProcedureQuery spq, ReportParam param) {
        spq.registerStoredProcedureParameter("@sCompanyCode", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sDateEnd", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sRC1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sRC2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sArticle1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sArticle2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sCustomer1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sCustomer2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sType", String.class, ParameterMode.IN);

        spq.setParameter("@sCompanyCode", param.getsCompanyCode());
        spq.setParameter("@sDateEnd", dateConverter.convert(param.getsDateEnd()));
        spq.setParameter("@sRC1", param.getsRC1());
        spq.setParameter("@sRC2", param.getsRC2());
        spq.setParameter("@sArticle1", param.getsArticle1());
        spq.setParameter("@sArticle2", param.getsArticle2());
        spq.setParameter("@sCustomer1", param.getsCustomer1());
        spq.setParameter("@sCustomer2", param.getsCustomer2());
        spq.setParameter("@sType", param.getsType());
    }

    private void topCustomerSP(StoredProcedureQuery spq, ReportParam param) {
        spq.registerStoredProcedureParameter("@sCompanyCode", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sDate1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sDate2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sRC1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sRC2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sRCCustomerBase1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sRCCustomerBase2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sArticle1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sArticle2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sCustomer1", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sCustomer2", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("@sType", String.class, ParameterMode.IN);

        spq.setParameter("@sCompanyCode", param.getsCompanyCode());
        spq.setParameter("@sDate1", dateConverter.convert(param.getsDate1()));
        spq.setParameter("@sDate2", dateConverter.convert(param.getsDate2()));
        spq.setParameter("@sRC1", param.getsRC1());
        spq.setParameter("@sRC2", param.getsRC2());
        spq.setParameter("@sRCCustomerBase1", param.getsRCCustomerBase1());
        spq.setParameter("@sRCCustomerBase2", param.getsRCCustomerBase2());
        spq.setParameter("@sArticle1", param.getsArticle1());
        spq.setParameter("@sArticle2", param.getsArticle2());
        spq.setParameter("@sCustomer1", param.getsCustomer1());
        spq.setParameter("@sCustomer2", param.getsCustomer2());
        spq.setParameter("@sType", param.getsType());
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

    public EntityManagerFactory getEmf() {
        return emf;
    }

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

}
