package com.ghtn.model.oracle;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * User: Administrator
 * Date: 2014/4/8
 * Time: 9:47
 */
public class NyhstatuschangePK implements Serializable {
    private int yhputinid;
    private long lcmark;
    private Date recorddate;

    @Column(name = "YHPUTINID", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public int getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(int yhputinid) {
        this.yhputinid = yhputinid;
    }

    @Column(name = "LCMARK", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public long getLcmark() {
        return lcmark;
    }

    public void setLcmark(long lcmark) {
        this.lcmark = lcmark;
    }

    @Column(name = "RECORDDATE", nullable = false, insertable = true, updatable = true)
    @Id
    @Temporal(TemporalType.TIMESTAMP)
    public Date getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NyhstatuschangePK that = (NyhstatuschangePK) o;

        if (lcmark != that.lcmark) return false;
        if (yhputinid != that.yhputinid) return false;
        if (recorddate != null ? !recorddate.equals(that.recorddate) : that.recorddate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhputinid;
        result = 31 * result + (int) (lcmark ^ (lcmark >>> 32));
        result = 31 * result + (recorddate != null ? recorddate.hashCode() : 0);
        return result;
    }
}
