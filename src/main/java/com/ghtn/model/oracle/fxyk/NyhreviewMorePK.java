package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
public class NyhreviewMorePK implements Serializable {
    private int yhputinid;
    private BigDecimal lcmark;
    private String personid;

    @Column(name = "YHPUTINID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Id
    public int getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(int yhputinid) {
        this.yhputinid = yhputinid;
    }

    @Column(name = "LCMARK", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    @Id
    public BigDecimal getLcmark() {
        return lcmark;
    }

    public void setLcmark(BigDecimal lcmark) {
        this.lcmark = lcmark;
    }

    @Column(name = "PERSONID", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    @Id
    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NyhreviewMorePK that = (NyhreviewMorePK) o;

        if (yhputinid != that.yhputinid) return false;
        if (lcmark != null ? !lcmark.equals(that.lcmark) : that.lcmark != null) return false;
        if (personid != null ? !personid.equals(that.personid) : that.personid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhputinid;
        result = 31 * result + (lcmark != null ? lcmark.hashCode() : 0);
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        return result;
    }
}
