package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;

public class M_File implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_fileCode;
    private M_Company company;
    private String s_fileRealCode;
    private String s_fileName;
    private String s_fileFullPath;
    private String s_fileDirectory;
    private String s_fileExt;
    private int i_fileSize;
    private String s_fileFullPathSource;
    private int i_fileCreateID;
    private Date d_fileCreateDate;
    private int i_fileDeleteID;
    private Date d_fileDeleteDate;
    private int i_fileUpdateID;
    private Date d_fileUpdateDate;
    private String s_fileActive;

    public M_File() {
    }

    public String getS_fileCode() {
        return s_fileCode;
    }

    public void setS_fileCode(String s_fileCode) {
        this.s_fileCode = s_fileCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public String getS_fileRealCode() {
        return s_fileRealCode;
    }

    public void setS_fileRealCode(String s_fileRealCode) {
        this.s_fileRealCode = s_fileRealCode;
    }

    public String getS_fileName() {
        return s_fileName;
    }

    public void setS_fileName(String s_fileName) {
        this.s_fileName = s_fileName;
    }

    public String getS_fileFullPath() {
        return s_fileFullPath;
    }

    public void setS_fileFullPath(String s_fileFullPath) {
        this.s_fileFullPath = s_fileFullPath;
    }

    public String getS_fileDirectory() {
        return s_fileDirectory;
    }

    public void setS_fileDirectory(String s_fileDirectory) {
        this.s_fileDirectory = s_fileDirectory;
    }

    public String getS_fileExt() {
        return s_fileExt;
    }

    public void setS_fileExt(String s_fileExt) {
        this.s_fileExt = s_fileExt;
    }

    public int getI_fileSize() {
        return i_fileSize;
    }

    public void setI_fileSize(int i_fileSize) {
        this.i_fileSize = i_fileSize;
    }

    public String getS_fileFullPathSource() {
        return s_fileFullPathSource;
    }

    public void setS_fileFullPathSource(String s_fileFullPathSource) {
        this.s_fileFullPathSource = s_fileFullPathSource;
    }

    public int getI_fileCreateID() {
        return i_fileCreateID;
    }

    public void setI_fileCreateID(int i_fileCreateID) {
        this.i_fileCreateID = i_fileCreateID;
    }

    public Date getD_fileCreateDate() {
        return d_fileCreateDate;
    }

    public void setD_fileCreateDate(Date d_fileCreateDate) {
        this.d_fileCreateDate = d_fileCreateDate;
    }

    public int getI_fileDeleteID() {
        return i_fileDeleteID;
    }

    public void setI_fileDeleteID(int i_fileDeleteID) {
        this.i_fileDeleteID = i_fileDeleteID;
    }

    public Date getD_fileDeleteDate() {
        return d_fileDeleteDate;
    }

    public void setD_fileDeleteDate(Date d_fileDeleteDate) {
        this.d_fileDeleteDate = d_fileDeleteDate;
    }

    public int getI_fileUpdateID() {
        return i_fileUpdateID;
    }

    public void setI_fileUpdateID(int i_fileUpdateID) {
        this.i_fileUpdateID = i_fileUpdateID;
    }

    public Date getD_fileUpdateDate() {
        return d_fileUpdateDate;
    }

    public void setD_fileUpdateDate(Date d_fileUpdateDate) {
        this.d_fileUpdateDate = d_fileUpdateDate;
    }

    public String getS_fileActive() {
        return s_fileActive;
    }

    public void setS_fileActive(String s_fileActive) {
        this.s_fileActive = s_fileActive;
    }
}
