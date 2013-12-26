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
@IdClass(NyhleaderappPK.class)
public class Nyhleaderapp {
    private int yhputinid;
    private BigDecimal lcmark;
    private Timestamp recorddate;
    private String personnumber;
    private String recdept;
    private String recperson;
    private String adetail;

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
    @Column(name = "PERSONNUMBER", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPersonnumber() {
        return personnumber;
    }

    public void setPersonnumber(String personnumber) {
        this.personnumber = personnumber;
    }

    @Basic
    @Column(name = "RECDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getRecdept() {
        return recdept;
    }

    public void setRecdept(String recdept) {
        this.recdept = recdept;
    }

    @Basic
    @Column(name = "RECPERSON", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getRecperson() {
        return recperson;
    }

    public void setRecperson(String recperson) {
        this.recperson = recperson;
    }

    @Basic
    @Column(name = "ADETAIL", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getAdetail() {
        return adetail;
    }

    public void setAdetail(String adetail) {
        this.adetail = adetail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nyhleaderapp that = (Nyhleaderapp) o;

        if (yhputinid != that.yhputinid) return false;
        if (adetail != null ? !adetail.equals(that.adetail) : that.adetail != null) return false;
        if (lcmark != null ? !lcmark.equals(that.lcmark) : that.lcmark != null) return false;
        if (personnumber != null ? !personnumber.equals(that.personnumber) : that.personnumber != null) return false;
        if (recdept != null ? !recdept.equals(that.recdept) : that.recdept != null) return false;
        if (recorddate != null ? !recorddate.equals(that.recorddate) : that.recorddate != null) return false;
        if (recperson != null ? !recperson.equals(that.recperson) : that.recperson != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhputinid;
        result = 31 * result + (lcmark != null ? lcmark.hashCode() : 0);
        result = 31 * result + (recorddate != null ? recorddate.hashCode() : 0);
        result = 31 * result + (personnumber != null ? personnumber.hashCode() : 0);
        result = 31 * result + (recdept != null ? recdept.hashCode() : 0);
        result = 31 * result + (recperson != null ? recperson.hashCode() : 0);
        result = 31 * result + (adetail != null ? adetail.hashCode() : 0);
        return result;
    }
}
