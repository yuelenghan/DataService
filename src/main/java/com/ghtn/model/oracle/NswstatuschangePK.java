package com.ghtn.model.oracle;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * User: Administrator
 * Date: 2014/4/11
 * Time: 9:39
 */
public class NswstatuschangePK implements Serializable {
    private int swinputid;
    private long lcmark;
    private Date recorddate;

    @Column(name = "SWINPUTID", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public int getSwinputid() {
        return swinputid;
    }

    public void setSwinputid(int swinputid) {
        this.swinputid = swinputid;
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
    @Temporal(TemporalType.TIMESTAMP)
    @Id
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

        NswstatuschangePK that = (NswstatuschangePK) o;

        if (lcmark != that.lcmark) return false;
        if (swinputid != that.swinputid) return false;
        if (recorddate != null ? !recorddate.equals(that.recorddate) : that.recorddate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = swinputid;
        result = 31 * result + (int) (lcmark ^ (lcmark >>> 32));
        result = 31 * result + (recorddate != null ? recorddate.hashCode() : 0);
        return result;
    }
}
