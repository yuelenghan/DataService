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
@IdClass(NyhstatuschangePK.class)
public class Nyhstatuschange {
    private int yhputinid;
    private BigDecimal lcmark;
    private Timestamp recorddate;
    private String nstatus;
    private String hstatus;
    private String cremarks;

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

    @Id
    @Column(name = "RECORDDATE", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Timestamp recorddate) {
        this.recorddate = recorddate;
    }

    @Basic
    @Column(name = "NSTATUS", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getNstatus() {
        return nstatus;
    }

    public void setNstatus(String nstatus) {
        this.nstatus = nstatus;
    }

    @Basic
    @Column(name = "HSTATUS", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getHstatus() {
        return hstatus;
    }

    public void setHstatus(String hstatus) {
        this.hstatus = hstatus;
    }

    @Basic
    @Column(name = "CREMARKS", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getCremarks() {
        return cremarks;
    }

    public void setCremarks(String cremarks) {
        this.cremarks = cremarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nyhstatuschange that = (Nyhstatuschange) o;

        if (yhputinid != that.yhputinid) return false;
        if (cremarks != null ? !cremarks.equals(that.cremarks) : that.cremarks != null) return false;
        if (hstatus != null ? !hstatus.equals(that.hstatus) : that.hstatus != null) return false;
        if (lcmark != null ? !lcmark.equals(that.lcmark) : that.lcmark != null) return false;
        if (nstatus != null ? !nstatus.equals(that.nstatus) : that.nstatus != null) return false;
        if (recorddate != null ? !recorddate.equals(that.recorddate) : that.recorddate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhputinid;
        result = 31 * result + (lcmark != null ? lcmark.hashCode() : 0);
        result = 31 * result + (recorddate != null ? recorddate.hashCode() : 0);
        result = 31 * result + (nstatus != null ? nstatus.hashCode() : 0);
        result = 31 * result + (hstatus != null ? hstatus.hashCode() : 0);
        result = 31 * result + (cremarks != null ? cremarks.hashCode() : 0);
        return result;
    }
}
