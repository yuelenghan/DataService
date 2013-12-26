package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
@IdClass(NyhdelayPK.class)
public class Nyhdelay {
    private int yhputinid;
    private BigDecimal lcmark;
    private Timestamp recorddate;
    private String applyperson;
    private String approveperson;
    private String recordperson;
    private Timestamp xqdate;
    private String xqbanci;
    private String remarks;
    private String annex;
    private Timestamp olddata;
    private String oldbanci;

    @Id
    @Column(name = "YHPUTINID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(int yhputinid) {
        this.yhputinid = yhputinid;
    }

    @Id
    @Column(name = "LCMARK", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getLcmark() {
        return lcmark;
    }

    public void setLcmark(BigDecimal lcmark) {
        this.lcmark = lcmark;
    }

    @Basic
    @Column(name = "RECORDDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Timestamp recorddate) {
        this.recorddate = recorddate;
    }

    @Basic
    @Column(name = "APPLYPERSON", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getApplyperson() {
        return applyperson;
    }

    public void setApplyperson(String applyperson) {
        this.applyperson = applyperson;
    }

    @Basic
    @Column(name = "APPROVEPERSON", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getApproveperson() {
        return approveperson;
    }

    public void setApproveperson(String approveperson) {
        this.approveperson = approveperson;
    }

    @Basic
    @Column(name = "RECORDPERSON", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getRecordperson() {
        return recordperson;
    }

    public void setRecordperson(String recordperson) {
        this.recordperson = recordperson;
    }

    @Basic
    @Column(name = "XQDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getXqdate() {
        return xqdate;
    }

    public void setXqdate(Timestamp xqdate) {
        this.xqdate = xqdate;
    }

    @Basic
    @Column(name = "XQBANCI", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public String getXqbanci() {
        return xqbanci;
    }

    public void setXqbanci(String xqbanci) {
        this.xqbanci = xqbanci;
    }

    @Basic
    @Column(name = "REMARKS", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "ANNEX", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getAnnex() {
        return annex;
    }

    public void setAnnex(String annex) {
        this.annex = annex;
    }

    @Basic
    @Column(name = "OLDDATA", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getOlddata() {
        return olddata;
    }

    public void setOlddata(Timestamp olddata) {
        this.olddata = olddata;
    }

    @Basic
    @Column(name = "OLDBANCI", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public String getOldbanci() {
        return oldbanci;
    }

    public void setOldbanci(String oldbanci) {
        this.oldbanci = oldbanci;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nyhdelay nyhdelay = (Nyhdelay) o;

        if (yhputinid != nyhdelay.yhputinid) return false;
        if (annex != null ? !annex.equals(nyhdelay.annex) : nyhdelay.annex != null) return false;
        if (applyperson != null ? !applyperson.equals(nyhdelay.applyperson) : nyhdelay.applyperson != null)
            return false;
        if (approveperson != null ? !approveperson.equals(nyhdelay.approveperson) : nyhdelay.approveperson != null)
            return false;
        if (lcmark != null ? !lcmark.equals(nyhdelay.lcmark) : nyhdelay.lcmark != null) return false;
        if (oldbanci != null ? !oldbanci.equals(nyhdelay.oldbanci) : nyhdelay.oldbanci != null) return false;
        if (olddata != null ? !olddata.equals(nyhdelay.olddata) : nyhdelay.olddata != null) return false;
        if (recorddate != null ? !recorddate.equals(nyhdelay.recorddate) : nyhdelay.recorddate != null) return false;
        if (recordperson != null ? !recordperson.equals(nyhdelay.recordperson) : nyhdelay.recordperson != null)
            return false;
        if (remarks != null ? !remarks.equals(nyhdelay.remarks) : nyhdelay.remarks != null) return false;
        if (xqbanci != null ? !xqbanci.equals(nyhdelay.xqbanci) : nyhdelay.xqbanci != null) return false;
        if (xqdate != null ? !xqdate.equals(nyhdelay.xqdate) : nyhdelay.xqdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhputinid;
        result = 31 * result + (lcmark != null ? lcmark.hashCode() : 0);
        result = 31 * result + (recorddate != null ? recorddate.hashCode() : 0);
        result = 31 * result + (applyperson != null ? applyperson.hashCode() : 0);
        result = 31 * result + (approveperson != null ? approveperson.hashCode() : 0);
        result = 31 * result + (recordperson != null ? recordperson.hashCode() : 0);
        result = 31 * result + (xqdate != null ? xqdate.hashCode() : 0);
        result = 31 * result + (xqbanci != null ? xqbanci.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (annex != null ? annex.hashCode() : 0);
        result = 31 * result + (olddata != null ? olddata.hashCode() : 0);
        result = 31 * result + (oldbanci != null ? oldbanci.hashCode() : 0);
        return result;
    }
}
