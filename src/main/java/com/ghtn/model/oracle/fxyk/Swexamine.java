package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
public class Swexamine {
    private int swid;
    private Timestamp stime;
    private Timestamp etime;
    private String result;
    private BigDecimal isfinish;

    @Id
    @Column(name = "SWID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getSwid() {
        return swid;
    }

    public void setSwid(int swid) {
        this.swid = swid;
    }

    @Basic
    @Column(name = "STIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getStime() {
        return stime;
    }

    public void setStime(Timestamp stime) {
        this.stime = stime;
    }

    @Basic
    @Column(name = "ETIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getEtime() {
        return etime;
    }

    public void setEtime(Timestamp etime) {
        this.etime = etime;
    }

    @Basic
    @Column(name = "RESULT", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Basic
    @Column(name = "ISFINISH", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getIsfinish() {
        return isfinish;
    }

    public void setIsfinish(BigDecimal isfinish) {
        this.isfinish = isfinish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Swexamine swexamine = (Swexamine) o;

        if (swid != swexamine.swid) return false;
        if (etime != null ? !etime.equals(swexamine.etime) : swexamine.etime != null) return false;
        if (isfinish != null ? !isfinish.equals(swexamine.isfinish) : swexamine.isfinish != null) return false;
        if (result != null ? !result.equals(swexamine.result) : swexamine.result != null) return false;
        if (stime != null ? !stime.equals(swexamine.stime) : swexamine.stime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = swid;
        result1 = 31 * result1 + (stime != null ? stime.hashCode() : 0);
        result1 = 31 * result1 + (etime != null ? etime.hashCode() : 0);
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        result1 = 31 * result1 + (isfinish != null ? isfinish.hashCode() : 0);
        return result1;
    }
}
