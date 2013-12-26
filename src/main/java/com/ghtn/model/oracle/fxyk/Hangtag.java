package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
public class Hangtag {
    private Timestamp recordtime;
    private String htman;
    private String zrdept;
    private String zrperson;
    private Integer htplace;
    private String placedetail;
    private Timestamp gpdate;
    private String gpbanci;
    private Timestamp zpdate;
    private String zpbanci;
    private String gpreason;
    private String zpreason;
    private String inputperson;
    private BigDecimal deptfine;
    private BigDecimal perfine;
    private BigInteger httype;
    private BigInteger htstatus;
    private String maindept;

    @Id
    @Column(name = "RECORDTIME", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Timestamp recordtime) {
        this.recordtime = recordtime;
    }

    @Basic
    @Column(name = "HTMAN", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getHtman() {
        return htman;
    }

    public void setHtman(String htman) {
        this.htman = htman;
    }

    @Basic
    @Column(name = "ZRDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getZrdept() {
        return zrdept;
    }

    public void setZrdept(String zrdept) {
        this.zrdept = zrdept;
    }

    @Basic
    @Column(name = "ZRPERSON", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getZrperson() {
        return zrperson;
    }

    public void setZrperson(String zrperson) {
        this.zrperson = zrperson;
    }

    @Basic
    @Column(name = "HTPLACE", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getHtplace() {
        return htplace;
    }

    public void setHtplace(Integer htplace) {
        this.htplace = htplace;
    }

    @Basic
    @Column(name = "PLACEDETAIL", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getPlacedetail() {
        return placedetail;
    }

    public void setPlacedetail(String placedetail) {
        this.placedetail = placedetail;
    }

    @Basic
    @Column(name = "GPDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getGpdate() {
        return gpdate;
    }

    public void setGpdate(Timestamp gpdate) {
        this.gpdate = gpdate;
    }

    @Basic
    @Column(name = "GPBANCI", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getGpbanci() {
        return gpbanci;
    }

    public void setGpbanci(String gpbanci) {
        this.gpbanci = gpbanci;
    }

    @Basic
    @Column(name = "ZPDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getZpdate() {
        return zpdate;
    }

    public void setZpdate(Timestamp zpdate) {
        this.zpdate = zpdate;
    }

    @Basic
    @Column(name = "ZPBANCI", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getZpbanci() {
        return zpbanci;
    }

    public void setZpbanci(String zpbanci) {
        this.zpbanci = zpbanci;
    }

    @Basic
    @Column(name = "GPREASON", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getGpreason() {
        return gpreason;
    }

    public void setGpreason(String gpreason) {
        this.gpreason = gpreason;
    }

    @Basic
    @Column(name = "ZPREASON", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getZpreason() {
        return zpreason;
    }

    public void setZpreason(String zpreason) {
        this.zpreason = zpreason;
    }

    @Basic
    @Column(name = "INPUTPERSON", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getInputperson() {
        return inputperson;
    }

    public void setInputperson(String inputperson) {
        this.inputperson = inputperson;
    }

    @Basic
    @Column(name = "DEPTFINE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getDeptfine() {
        return deptfine;
    }

    public void setDeptfine(BigDecimal deptfine) {
        this.deptfine = deptfine;
    }

    @Basic
    @Column(name = "PERFINE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getPerfine() {
        return perfine;
    }

    public void setPerfine(BigDecimal perfine) {
        this.perfine = perfine;
    }

    @Basic
    @Column(name = "HTTYPE", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getHttype() {
        return httype;
    }

    public void setHttype(BigInteger httype) {
        this.httype = httype;
    }

    @Basic
    @Column(name = "HTSTATUS", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getHtstatus() {
        return htstatus;
    }

    public void setHtstatus(BigInteger htstatus) {
        this.htstatus = htstatus;
    }

    @Basic
    @Column(name = "MAINDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindept() {
        return maindept;
    }

    public void setMaindept(String maindept) {
        this.maindept = maindept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hangtag hangtag = (Hangtag) o;

        if (deptfine != null ? !deptfine.equals(hangtag.deptfine) : hangtag.deptfine != null) return false;
        if (gpbanci != null ? !gpbanci.equals(hangtag.gpbanci) : hangtag.gpbanci != null) return false;
        if (gpdate != null ? !gpdate.equals(hangtag.gpdate) : hangtag.gpdate != null) return false;
        if (gpreason != null ? !gpreason.equals(hangtag.gpreason) : hangtag.gpreason != null) return false;
        if (htman != null ? !htman.equals(hangtag.htman) : hangtag.htman != null) return false;
        if (htplace != null ? !htplace.equals(hangtag.htplace) : hangtag.htplace != null) return false;
        if (htstatus != null ? !htstatus.equals(hangtag.htstatus) : hangtag.htstatus != null) return false;
        if (httype != null ? !httype.equals(hangtag.httype) : hangtag.httype != null) return false;
        if (inputperson != null ? !inputperson.equals(hangtag.inputperson) : hangtag.inputperson != null) return false;
        if (maindept != null ? !maindept.equals(hangtag.maindept) : hangtag.maindept != null) return false;
        if (perfine != null ? !perfine.equals(hangtag.perfine) : hangtag.perfine != null) return false;
        if (placedetail != null ? !placedetail.equals(hangtag.placedetail) : hangtag.placedetail != null) return false;
        if (recordtime != null ? !recordtime.equals(hangtag.recordtime) : hangtag.recordtime != null) return false;
        if (zpbanci != null ? !zpbanci.equals(hangtag.zpbanci) : hangtag.zpbanci != null) return false;
        if (zpdate != null ? !zpdate.equals(hangtag.zpdate) : hangtag.zpdate != null) return false;
        if (zpreason != null ? !zpreason.equals(hangtag.zpreason) : hangtag.zpreason != null) return false;
        if (zrdept != null ? !zrdept.equals(hangtag.zrdept) : hangtag.zrdept != null) return false;
        if (zrperson != null ? !zrperson.equals(hangtag.zrperson) : hangtag.zrperson != null) return false;

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
        return result;
    }
}
