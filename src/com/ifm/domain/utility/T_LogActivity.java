package com.ifm.domain.utility;
/**
 * @author febriantoro
 */

import com.ifm.domain.master.M_Company;
import com.ifm.domain.security.M_Project;
import com.ifm.domain.security.M_User;

import java.util.Date;

public class T_LogActivity implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private M_Company company;
    private M_Project project;
    private M_User user;
    private Date d_tlaTransDate;
    private String s_tlaDescription;
    private String s_tlaHostName;
    private String s_tlaIPAddress;

    public T_LogActivity() {
    }

    public T_LogActivity(M_Company company,
                         M_Project project,
                         M_User user,
                         Date d_tlaTransDate, String s_tlaDescription,
                         String s_tlaHostName, String s_tlaIPAddress) {
        this.company = company;
        this.project = project;
        this.user = user;
        this.d_tlaTransDate = d_tlaTransDate;
        this.s_tlaDescription = s_tlaDescription;
        this.s_tlaHostName = s_tlaHostName;
        this.s_tlaIPAddress = s_tlaIPAddress;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_Project getProject() {
        return project;
    }

    public void setProject(M_Project project) {
        this.project = project;
    }

    public M_User getUser() {
        return user;
    }

    public void setUser(M_User user) {
        this.user = user;
    }

    public Date getD_tlaTransDate() {
        return d_tlaTransDate;
    }

    public void setD_tlaTransDate(Date d_tlaTransDate) {
        this.d_tlaTransDate = d_tlaTransDate;
    }

    public String getS_tlaDescription() {
        return s_tlaDescription;
    }

    public void setS_tlaDescription(String s_tlaDescription) {
        this.s_tlaDescription = s_tlaDescription;
    }

    public String getS_tlaHostName() {
        return s_tlaHostName;
    }

    public void setS_tlaHostName(String s_tlaHostName) {
        this.s_tlaHostName = s_tlaHostName;
    }

    public String getS_tlaIPAddress() {
        return s_tlaIPAddress;
    }

    public void setS_tlaIPAddress(String s_tlaIPAddress) {
        this.s_tlaIPAddress = s_tlaIPAddress;
    }
}
