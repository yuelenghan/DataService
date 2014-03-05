package com.ghtn.model.oracle.fxyk;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * User: Administrator
 * Date: 14-3-5
 * Time: 下午4:22
 */
@Entity
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Gethangtag {
    private Date recordtime;

    @Id
    @Temporal(TemporalType.TIMESTAMP)
    @javax.persistence.Column(name = "RECORDTIME", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }

    private String htman;

    @Basic
    @javax.persistence.Column(name = "HTMAN", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getHtman() {
        return htman;
    }

    public void setHtman(String htman) {
        this.htman = htman;
    }

    private String zrdept;

    @Basic
    @javax.persistence.Column(name = "ZRDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getZrdept() {
        return zrdept;
    }

    public void setZrdept(String zrdept) {
        this.zrdept = zrdept;
    }

    private String zrperson;

    @Basic
    @javax.persistence.Column(name = "ZRPERSON", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getZrperson() {
        return zrperson;
    }

    public void setZrperson(String zrperson) {
        this.zrperson = zrperson;
    }

    private Integer htplace;

    @Basic
    @javax.persistence.Column(name = "HTPLACE", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getHtplace() {
        return htplace;
    }

    public void setHtplace(Integer htplace) {
        this.htplace = htplace;
    }

    private String placedetail;

    @Basic
    @javax.persistence.Column(name = "PLACEDETAIL", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getPlacedetail() {
        return placedetail;
    }

    public void setPlacedetail(String placedetail) {
        this.placedetail = placedetail;
    }

    private Timestamp gpdate;

    @Basic
    @javax.persistence.Column(name = "GPDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getGpdate() {
        return gpdate;
    }

    public void setGpdate(Timestamp gpdate) {
        this.gpdate = gpdate;
    }

    private String gpbanci;

    @Basic
    @javax.persistence.Column(name = "GPBANCI", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getGpbanci() {
        return gpbanci;
    }

    public void setGpbanci(String gpbanci) {
        this.gpbanci = gpbanci;
    }

    private Timestamp zpdate;

    @Basic
    @javax.persistence.Column(name = "ZPDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getZpdate() {
        return zpdate;
    }

    public void setZpdate(Timestamp zpdate) {
        this.zpdate = zpdate;
    }

    private String zpbanci;

    @Basic
    @javax.persistence.Column(name = "ZPBANCI", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getZpbanci() {
        return zpbanci;
    }

    public void setZpbanci(String zpbanci) {
        this.zpbanci = zpbanci;
    }

    private String gpreason;

    @Basic
    @javax.persistence.Column(name = "GPREASON", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getGpreason() {
        return gpreason;
    }

    public void setGpreason(String gpreason) {
        this.gpreason = gpreason;
    }

    private String zpreason;

    @Basic
    @javax.persistence.Column(name = "ZPREASON", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getZpreason() {
        return zpreason;
    }

    public void setZpreason(String zpreason) {
        this.zpreason = zpreason;
    }

    private String inputperson;

    @Basic
    @javax.persistence.Column(name = "INPUTPERSON", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getInputperson() {
        return inputperson;
    }

    public void setInputperson(String inputperson) {
        this.inputperson = inputperson;
    }

    private Long deptfine;

    @Basic
    @javax.persistence.Column(name = "DEPTFINE", nullable = true, insertable = true, updatable = true, length = 38, precision = 0)
    public Long getDeptfine() {
        return deptfine;
    }

    public void setDeptfine(Long deptfine) {
        this.deptfine = deptfine;
    }

    private Long perfine;

    @Basic
    @javax.persistence.Column(name = "PERFINE", nullable = true, insertable = true, updatable = true, length = 38, precision = 0)
    public Long getPerfine() {
        return perfine;
    }

    public void setPerfine(Long perfine) {
        this.perfine = perfine;
    }

    private Integer httype;

    @Basic
    @javax.persistence.Column(name = "HTTYPE", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public Integer getHttype() {
        return httype;
    }

    public void setHttype(Integer httype) {
        this.httype = httype;
    }

    private Integer htstatus;

    @Basic
    @javax.persistence.Column(name = "HTSTATUS", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public Integer getHtstatus() {
        return htstatus;
    }

    public void setHtstatus(Integer htstatus) {
        this.htstatus = htstatus;
    }

    private String maindept;

    @Basic
    @javax.persistence.Column(name = "MAINDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindept() {
        return maindept;
    }

    public void setMaindept(String maindept) {
        this.maindept = maindept;
    }

    private String zrdeptname;

    @Basic
    @javax.persistence.Column(name = "ZRDEPTNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getZrdeptname() {
        return zrdeptname;
    }

    public void setZrdeptname(String zrdeptname) {
        this.zrdeptname = zrdeptname;
    }

    private String htplacename;

    @Basic
    @javax.persistence.Column(name = "HTPLACENAME", nullable = true, insertable = true, updatable = true, length = 80, precision = 0)
    public String getHtplacename() {
        return htplacename;
    }

    public void setHtplacename(String htplacename) {
        this.htplacename = htplacename;
    }

    private String allplacename;

    @Basic
    @javax.persistence.Column(name = "ALLPLACENAME", nullable = true, insertable = true, updatable = true, length = 180, precision = 0)
    public String getAllplacename() {
        return allplacename;
    }

    public void setAllplacename(String allplacename) {
        this.allplacename = allplacename;
    }

    private String inputpersonname;

    @Basic
    @javax.persistence.Column(name = "INPUTPERSONNAME", nullable = true, insertable = true, updatable = true, length = 30, precision = 0)
    public String getInputpersonname() {
        return inputpersonname;
    }

    public void setInputpersonname(String inputpersonname) {
        this.inputpersonname = inputpersonname;
    }

    private String zrpersonname;

    @Basic
    @javax.persistence.Column(name = "ZRPERSONNAME", nullable = true, insertable = true, updatable = true, length = 30, precision = 0)
    public String getZrpersonname() {
        return zrpersonname;
    }

    public void setZrpersonname(String zrpersonname) {
        this.zrpersonname = zrpersonname;
    }

    private String gppname;

    @Basic
    @javax.persistence.Column(name = "GPPNAME", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getGppname() {
        return gppname;
    }

    public void setGppname(String gppname) {
        this.gppname = gppname;
    }

    private String zppname;

    @Basic
    @javax.persistence.Column(name = "ZPPNAME", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getZppname() {
        return zppname;
    }

    public void setZppname(String zppname) {
        this.zppname = zppname;
    }

    private String maindeptid;

    @Basic
    @javax.persistence.Column(name = "MAINDEPTID", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindeptid() {
        return maindeptid;
    }

    public void setMaindeptid(String maindeptid) {
        this.maindeptid = maindeptid;
    }

    private String maindeptname;

    @Basic
    @javax.persistence.Column(name = "MAINDEPTNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getMaindeptname() {
        return maindeptname;
    }

    public void setMaindeptname(String maindeptname) {
        this.maindeptname = maindeptname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gethangtag that = (Gethangtag) o;

        if (allplacename != null ? !allplacename.equals(that.allplacename) : that.allplacename != null) return false;
        if (deptfine != null ? !deptfine.equals(that.deptfine) : that.deptfine != null) return false;
        if (gpbanci != null ? !gpbanci.equals(that.gpbanci) : that.gpbanci != null) return false;
        if (gpdate != null ? !gpdate.equals(that.gpdate) : that.gpdate != null) return false;
        if (gppname != null ? !gppname.equals(that.gppname) : that.gppname != null) return false;
        if (gpreason != null ? !gpreason.equals(that.gpreason) : that.gpreason != null) return false;
        if (htman != null ? !htman.equals(that.htman) : that.htman != null) return false;
        if (htplace != null ? !htplace.equals(that.htplace) : that.htplace != null) return false;
        if (htplacename != null ? !htplacename.equals(that.htplacename) : that.htplacename != null) return false;
        if (htstatus != null ? !htstatus.equals(that.htstatus) : that.htstatus != null) return false;
        if (httype != null ? !httype.equals(that.httype) : that.httype != null) return false;
        if (inputperson != null ? !inputperson.equals(that.inputperson) : that.inputperson != null) return false;
        if (inputpersonname != null ? !inputpersonname.equals(that.inputpersonname) : that.inputpersonname != null)
            return false;
        if (maindept != null ? !maindept.equals(that.maindept) : that.maindept != null) return false;
        if (maindeptid != null ? !maindeptid.equals(that.maindeptid) : that.maindeptid != null) return false;
        if (maindeptname != null ? !maindeptname.equals(that.maindeptname) : that.maindeptname != null) return false;
        if (perfine != null ? !perfine.equals(that.perfine) : that.perfine != null) return false;
        if (placedetail != null ? !placedetail.equals(that.placedetail) : that.placedetail != null) return false;
        if (recordtime != null ? !recordtime.equals(that.recordtime) : that.recordtime != null) return false;
        if (zpbanci != null ? !zpbanci.equals(that.zpbanci) : that.zpbanci != null) return false;
        if (zpdate != null ? !zpdate.equals(that.zpdate) : that.zpdate != null) return false;
        if (zppname != null ? !zppname.equals(that.zppname) : that.zppname != null) return false;
        if (zpreason != null ? !zpreason.equals(that.zpreason) : that.zpreason != null) return false;
        if (zrdept != null ? !zrdept.equals(that.zrdept) : that.zrdept != null) return false;
        if (zrdeptname != null ? !zrdeptname.equals(that.zrdeptname) : that.zrdeptname != null) return false;
        if (zrperson != null ? !zrperson.equals(that.zrperson) : that.zrperson != null) return false;
        if (zrpersonname != null ? !zrpersonname.equals(that.zrpersonname) : that.zrpersonname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recordtime != null ? recordtime.hashCode() : 0;
        result = 31 * result + (htman != null ? htman.hashCode() : 0);
        result = 31 * result + (zrdept != null ? zrdept.hashCode() : 0);
        result = 31 * result + (zrperson != null ? zrperson.hashCode() : 0);
        result = 31 * result + (htplace != null ? htplace.hashCode() : 0);
        result = 31 * result + (placedetail != null ? placedetail.hashCode() : 0);
        result = 31 * result + (gpdate != null ? gpdate.hashCode() : 0);
        result = 31 * result + (gpbanci != null ? gpbanci.hashCode() : 0);
        result = 31 * result + (zpdate != null ? zpdate.hashCode() : 0);
        result = 31 * result + (zpbanci != null ? zpbanci.hashCode() : 0);
        result = 31 * result + (gpreason != null ? gpreason.hashCode() : 0);
        result = 31 * result + (zpreason != null ? zpreason.hashCode() : 0);
        result = 31 * result + (inputperson != null ? inputperson.hashCode() : 0);
        result = 31 * result + (deptfine != null ? deptfine.hashCode() : 0);
        result = 31 * result + (perfine != null ? perfine.hashCode() : 0);
        result = 31 * result + (httype != null ? httype.hashCode() : 0);
        result = 31 * result + (htstatus != null ? htstatus.hashCode() : 0);
        result = 31 * result + (maindept != null ? maindept.hashCode() : 0);
        result = 31 * result + (zrdeptname != null ? zrdeptname.hashCode() : 0);
        result = 31 * result + (htplacename != null ? htplacename.hashCode() : 0);
        result = 31 * result + (allplacename != null ? allplacename.hashCode() : 0);
        result = 31 * result + (inputpersonname != null ? inputpersonname.hashCode() : 0);
        result = 31 * result + (zrpersonname != null ? zrpersonname.hashCode() : 0);
        result = 31 * result + (gppname != null ? gppname.hashCode() : 0);
        result = 31 * result + (zppname != null ? zppname.hashCode() : 0);
        result = 31 * result + (maindeptid != null ? maindeptid.hashCode() : 0);
        result = 31 * result + (maindeptname != null ? maindeptname.hashCode() : 0);
        return result;
    }
}
