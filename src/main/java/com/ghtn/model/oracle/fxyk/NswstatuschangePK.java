package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
public class NswstatuschangePK implements Serializable {
    private int swinputid;
    private BigDecimal lcmark;
    private Timestamp recorddate;

    @Column(name = "SWINPUTID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Id
    public int getSwinputid() {
        return swinputid;
    }

    public void setSwinputid(int swinputid) {
        this.swinputid = swinputid;
    }

    @Column(name = "LCMARK", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    @Id
    public BigDecimal getLcmark() {
        return lcmark;
    }

    public void setLcmark(BigDecimal lcmark) {
        this.lcmark = lcmark;
    }

    @Column(name = "RECORDDATE", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    @Id
    public Timestamp getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Timestamp recorddate) {
        this.recorddate = recorddate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NswstatuschangePK that = (NswstatuschangePK) o;

        if (swinputid != that.swinputid) return false;
        if (lcmark != null ? !lcmark.equals(that.lcmark) : that.lcmark != null) return false;
        if (recorddate != null ? !recorddate.equals(that.recorddate) : that.recorddate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = swinputid;
        result = 31 * result + (lcmark != null ? lcmark.hashCode() : 0);
        result = 31 * result + (recorddate != null ? recorddate.hashCode() : 0);
        return result;
    }
}
