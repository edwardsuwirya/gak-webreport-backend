package com.ifm.domain.master;
/**
 * @author febriantoro
 */

import java.util.Date;
import java.util.Set;

import com.ifm.domain.security.M_User;

public class M_Employee implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    private String s_employeeCode;
    private M_Company company;
    private M_Religion religion;
    private M_MaritalStatus maritalstatus;
    private M_User user;
    private String s_employeeRealCode;
    private String s_employeeName;
    private Date d_employeeBirthday;
    private String s_employeeBirthPlace;
    private String s_employeeBloodType;
    private int i_employeeHeight;
    private int i_employeeWeight;
    private String s_employeeGender;
    private String s_employeeCellPhoneNumber1;
    private String s_employeeCellPhoneNumber2;
    private String s_employeeCellPhoneNumber3;
    private byte[] b_employeePictureFile;
    private int i_employeeCreateID;
    private Date d_employeeCreateDate;
    private int i_employeeDeleteID;
    private Date d_employeeDeleteDate;
    private int i_employeeUpdateID;
    private Date d_employeeUpdateDate;
    private String s_employeeActive;
    private Set addresses;
    private Set familymembers;
    private Set idcards;
    private Set jobpositions;

    public M_Employee() {
    }

    public String getS_employeeCode() {
        return s_employeeCode;
    }

    public void setS_employeeCode(String s_employeeCode) {
        this.s_employeeCode = s_employeeCode;
    }

    public M_Company getCompany() {
        return company;
    }

    public void setCompany(M_Company company) {
        this.company = company;
    }

    public M_Religion getReligion() {
        return religion;
    }

    public void setReligion(M_Religion religion) {
        this.religion = religion;
    }

    public M_MaritalStatus getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(M_MaritalStatus maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public M_User getUser() {
        return user;
    }

    public void setUser(M_User user) {
        this.user = user;
    }

    public String getS_employeeRealCode() {
        return s_employeeRealCode;
    }

    public void setS_employeeRealCode(String s_employeeRealCode) {
        this.s_employeeRealCode = s_employeeRealCode;
    }

    public String getS_employeeName() {
        return s_employeeName;
    }

    public void setS_employeeName(String s_employeeName) {
        this.s_employeeName = s_employeeName;
    }

    public Date getD_employeeBirthday() {
        return d_employeeBirthday;
    }

    public void setD_employeeBirthday(Date d_employeeBirthday) {
        this.d_employeeBirthday = d_employeeBirthday;
    }

    public String getS_employeeBirthPlace() {
        return s_employeeBirthPlace;
    }

    public void setS_employeeBirthPlace(String s_employeeBirthPlace) {
        this.s_employeeBirthPlace = s_employeeBirthPlace;
    }

    public String getS_employeeBloodType() {
        return s_employeeBloodType;
    }

    public void setS_employeeBloodType(String s_employeeBloodType) {
        this.s_employeeBloodType = s_employeeBloodType;
    }

    public int getI_employeeHeight() {
        return i_employeeHeight;
    }

    public void setI_employeeHeight(int i_employeeHeight) {
        this.i_employeeHeight = i_employeeHeight;
    }

    public int getI_employeeWeight() {
        return i_employeeWeight;
    }

    public void setI_employeeWeight(int i_employeeWeight) {
        this.i_employeeWeight = i_employeeWeight;
    }

    public String getS_employeeGender() {
        return s_employeeGender;
    }

    public void setS_employeeGender(String s_employeeGender) {
        this.s_employeeGender = s_employeeGender;
    }

    public String getS_employeeCellPhoneNumber1() {
        return s_employeeCellPhoneNumber1;
    }

    public void setS_employeeCellPhoneNumber1(String s_employeeCellPhoneNumber1) {
        this.s_employeeCellPhoneNumber1 = s_employeeCellPhoneNumber1;
    }

    public String getS_employeeCellPhoneNumber2() {
        return s_employeeCellPhoneNumber2;
    }

    public void setS_employeeCellPhoneNumber2(String s_employeeCellPhoneNumber2) {
        this.s_employeeCellPhoneNumber2 = s_employeeCellPhoneNumber2;
    }

    public String getS_employeeCellPhoneNumber3() {
        return s_employeeCellPhoneNumber3;
    }

    public void setS_employeeCellPhoneNumber3(String s_employeeCellPhoneNumber3) {
        this.s_employeeCellPhoneNumber3 = s_employeeCellPhoneNumber3;
    }

    public byte[] getB_employeePictureFile() {
        return b_employeePictureFile;
    }

    public void setB_employeePictureFile(byte[] b_employeePictureFile) {
        this.b_employeePictureFile = b_employeePictureFile;
    }

    public int getI_employeeCreateID() {
        return i_employeeCreateID;
    }

    public void setI_employeeCreateID(int i_employeeCreateID) {
        this.i_employeeCreateID = i_employeeCreateID;
    }

    public Date getD_employeeCreateDate() {
        return d_employeeCreateDate;
    }

    public void setD_employeeCreateDate(Date d_employeeCreateDate) {
        this.d_employeeCreateDate = d_employeeCreateDate;
    }

    public int getI_employeeDeleteID() {
        return i_employeeDeleteID;
    }

    public void setI_employeeDeleteID(int i_employeeDeleteID) {
        this.i_employeeDeleteID = i_employeeDeleteID;
    }

    public Date getD_employeeDeleteDate() {
        return d_employeeDeleteDate;
    }

    public void setD_employeeDeleteDate(Date d_employeeDeleteDate) {
        this.d_employeeDeleteDate = d_employeeDeleteDate;
    }

    public int getI_employeeUpdateID() {
        return i_employeeUpdateID;
    }

    public void setI_employeeUpdateID(int i_employeeUpdateID) {
        this.i_employeeUpdateID = i_employeeUpdateID;
    }

    public Date getD_employeeUpdateDate() {
        return d_employeeUpdateDate;
    }

    public void setD_employeeUpdateDate(Date d_employeeUpdateDate) {
        this.d_employeeUpdateDate = d_employeeUpdateDate;
    }

    public String getS_employeeActive() {
        return s_employeeActive;
    }

    public void setS_employeeActive(String s_employeeActive) {
        this.s_employeeActive = s_employeeActive;
    }

    public Set getAddresses() {
        return addresses;
    }

    public void setAddresses(Set addresses) {
        this.addresses = addresses;
    }

    public Set getFamilymembers() {
        return familymembers;
    }

    public void setFamilymembers(Set familymembers) {
        this.familymembers = familymembers;
    }

    public Set getIdcards() {
        return idcards;
    }

    public void setIdcards(Set idcards) {
        this.idcards = idcards;
    }

    public Set getJobpositions() {
        return jobpositions;
    }

    public void setJobpositions(Set jobpositions) {
        this.jobpositions = jobpositions;
    }
}
