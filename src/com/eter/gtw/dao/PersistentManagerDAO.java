package com.eter.gtw.dao;

import java.util.List;
import java.util.Map;

@SuppressWarnings("rawtypes")
public interface PersistentManagerDAO {
    /**
     * Save Entity(obj) to Database
     *
     * @param obj
     * @return
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
     * Return single entity by HQL(strSQL)
     *
     * @param strSQL
     */
    public <T> Object getSingleResult(String strSQL) throws Exception;

    /**
     * Return single entity by HQL(strSQL) with given parameters(params)
     *
     * @param strSQL
     * @param params
     */
    public <T> Object getSingleResult(String strSQL, Map params) throws Exception;

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
     * Return row list by Native SQL Query(strSQL) with given parameters (params)
     *
     * @param strSQL
     */
    public <T> List getListNative(String strSQL, Map params) throws Exception;

    /**
     * Return row list (Managed Entity) by Native SQL Query(strSQL) with given parameters (params)
     *
     * @param strSQL
     */
    public <T> List getListNative(String strSQL, Map params, Class aClass) throws Exception;

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
    public <T> boolean saveAll(List list) throws Exception;

    public <T> List getListNamedQuery(String queryName) throws Exception;

    public <T> Object getSingleNamedQuery(String queryName) throws Exception;

    public <T> List getListNamedQuery(String queryName, Map params) throws Exception;

    public <T> Object getSingleNamedQuery(String queryName, Map params) throws Exception;

    public <T> boolean delete(T obj) throws Exception;
}
