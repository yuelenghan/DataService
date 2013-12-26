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
public class Swquote {
    private int sqid;
    private Integer swid;
    private Integer levelid;
    private String deptnumber;
    private Timestamp quotetime;
    private BigDecimal nstatus;

    @Id
    @Column(name = "SQID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getSqid() {
        return sqid;
    }

    public void setSqid(int sqid) {
        this.sqid = sqid;
    }

    @Basic
    @Column(name = "SWID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getSwid() {
        return swid;
    }

    public void setSwid(Integer swid) {
        this.swid = swid;
    }

    @Basic
    @Column(name = "LEVELID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getLevelid() {
        return levelid;
    }

    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

    @Basic
    @Column(name = "DEPTNUMBER", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getDeptnumber() {
        return deptnumber;
    }

    public void setDeptnumber(String deptnumber) {
        this.deptnumber = deptnumber;
    }

    @Basic
    @Column(name = "QUOTETIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getQuotetime() {
        return quotetime;
    }

    public void setQuotetime(Timestamp quotetime) {
        this.quotetime = quotetime;
    }

    @Basic
    @Column(name = "NSTATUS", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getNstatus() {
        return nstatus;
    }

    public void setNstatus(BigDecimal nstatus) {
        this.nstatus = nstatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Swquote swquote = (Swquote) o;

        if (sqid != swquote.sqid) return false;
        if (deptnumber != null ? !deptnumber.equals(swquote.deptnumber) : swquote.deptnumber != null) return false;
        if (levelid != null ? !levelid.equals(swquote.levelid) : swquote.levelid != null) return false;
        if (nstatus != null ? !nstatus.equals(swquote.nstatus) : swquote.nstatus != null) return false;
        if (quotetime != null ? !quotetime.equals(swquote.quotetime) : swquote.quotetime != null) return false;
        if (swid != null ? !swid.equals(swquote.swid) : swquote.swid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sqid;
        result = 31 * result + (swid != null ? swid.hashCode() : 0);
        result = 31 * result + (levelid != null ? levelid.hashCode() : 0);
        result = 31 * result + (deptnumber != null ? deptnumber.hashCode() : 0);
        result = 31 * result + (quotetime != null ? quotetime.hashCode() : 0);
        result = 31 * result + (nstatus != null ? nstatus.hashCode() : 0);
        return result;
    }
}
