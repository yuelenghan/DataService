package com.ghtn.model.oracle;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-27
 * Time: 上午11:52
 */
@Entity
@Table(name = "NYHINPUT_MORE", schema = "SEP3", catalog = "")
@IdClass(NyhinputMorePK.class)
public class NyhinputMore {
    private int yhputinid;
    private String personid;
    private Timestamp pctime;
    private String banci;
    private BigInteger jctype;
    private String remarks;
    private Integer rjid;

    @Id
    @Column(name = "YHPUTINID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(int yhputinid) {
        this.yhputinid = yhputinid;
    }

    @Id
    @Column(name = "PERSONID", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    @Basic
    @Column(name = "PCTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getPctime() {
        return pctime;
    }

    public void setPctime(Timestamp pctime) {
        this.pctime = pctime;
    }

    @Basic
    @Column(name = "BANCI", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getBanci() {
        return banci;
    }

    public void setBanci(String banci) {
        this.banci = banci;
    }

    @Basic
    @Column(name = "JCTYPE", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getJctype() {
        return jctype;
    }

    public void setJctype(BigInteger jctype) {
        this.jctype = jctype;
    }

    @Basic
    @Column(name = "REMARKS", nullable = true, insertable = true, updatable = true, length = 2000, precision = 0)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "RJID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getRjid() {
        return rjid;
    }

    public void setRjid(Integer rjid) {
        this.rjid = rjid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NyhinputMore that = (NyhinputMore) o;

        if (yhputinid != that.yhputinid) return false;
        if (banci != null ? !banci.equals(that.banci) : that.banci != null) return false;
        if (jctype != null ? !jctype.equals(that.jctype) : that.jctype != null) return false;
        if (pctime != null ? !pctime.equals(that.pctime) : that.pctime != null) return false;
        if (personid != null ? !personid.equals(that.personid) : that.personid != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
        if (rjid != null ? !rjid.equals(that.rjid) : that.rjid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhputinid;
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        result = 31 * result + (pctime != null ? pctime.hashCode() : 0);
        result = 31 * result + (banci != null ? banci.hashCode() : 0);
        result = 31 * result + (jctype != null ? jctype.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (rjid != null ? rjid.hashCode() : 0);
        return result;
    }
}
