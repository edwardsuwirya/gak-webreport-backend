package com.ifm.domain.utility;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_CurrentDate implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private Date d_currentDate;

    public M_CurrentDate() {
    }

    public Date getD_currentDate() {
        return d_currentDate;
    }

    public void setD_currentDate(Date d_currentDate) {
        this.d_currentDate = d_currentDate;
    }
}
