package com.eter.gtw.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.eter.gtw.dao.PersistentManagerDAO;
import com.eter.gtw.dao.PersistentManagerFactoryDAO;

public abstract class BaseController {

    @Autowired
    protected PersistentManagerDAO pm;

    @Autowired
    protected PersistentManagerFactoryDAO pmf;

    public void setPm(PersistentManagerDAO pm) {
        this.pm = pm;
    }

    public void setPmf(PersistentManagerFactoryDAO pmf) {
        this.pmf = pmf;
    }

}
