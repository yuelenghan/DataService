package com.ghtn.model.oracle;

import javax.persistence.*;
import java.util.Date;

/**
 * User: Administrator
 * Date: 2014/4/8
 * Time: 9:47
 */
@Entity
@IdClass(NyhstatuschangePK.class)
public class Nyhstatuschange {
    private int yhputinid;
    private long lcmark;
    private Date recorddate;
    private String nstatus;
    private String hstatus;
    private String cremarks;

    @Id
    @Column(name = "YHPUTINID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(int yhputinid) {
        this.yhputinid = yhputinid;
    }

    @Id
    @Column(name = "LCMARK", nullable = false, insertable = true, updatable = true, precision = 0)
    public long getLcmark() {
        return lcmark;
    }

    public void setLcmark(long lcmark) {
        this.lcmark = lcmark;
    }

    @Id
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RECORDDATE", nullable = false, insertable = true, updatable = true)
    public Date getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }

    @Basic
    @Column(name = "NSTATUS", nullable = false, insertable = true, updatable = true, length = 20)
    public String getNstatus() {
        return nstatus;
    }

    public void setNstatus(String nstatus) {
        this.nstatus = nstatus;
    }

    @Basic
    @Column(name = "HSTATUS", nullable = true, insertable = true, updatable = true, length = 20)
    public String getHstatus() {
        return hstatus;
    }

    public void setHstatus(String hstatus) {
        this.hstatus = hstatus;
    }

    @Basic
    @Column(name = "CREMARKS", nullable = true, insertable = true, updatable = true, length = 500)
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

        if (lcmark != that.lcmark) return false;
        if (yhputinid != that.yhputinid) return false;
        if (cremarks != null ? !cremarks.equals(that.cremarks) : that.cremarks != null) return false;
        if (hstatus != null ? !hstatus.equals(that.hstatus) : that.hstatus != null) return false;
        if (nstatus != null ? !nstatus.equals(that.nstatus) : that.nstatus != null) return false;
        if (recorddate != null ? !recorddate.equals(that.recorddate) : that.recorddate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhputinid;
        result = 31 * result + (int) (lcmark ^ (lcmark >>> 32));
        result = 31 * result + (recorddate != null ? recorddate.hashCode() : 0);
        result = 31 * result + (nstatus != null ? nstatus.hashCode() : 0);
        result = 31 * result + (hstatus != null ? hstatus.hashCode() : 0);
        result = 31 * result + (cremarks != null ? cremarks.hashCode() : 0);
        return result;
    }
}
