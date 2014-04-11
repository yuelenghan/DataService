package com.ghtn.model.oracle;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * User: Administrator
 * Date: 2014/4/11
 * Time: 9:39
 */
@Entity
@Table(name = "NSWINPUT_MORE", schema = "SEP3", catalog = "")
@IdClass(NswinputMorePK.class)
public class NswinputMore {
    private int swinputid;
    private String personid;
    private BigInteger jctype;
    private String remarks;

    @Id
    @Column(name = "SWINPUTID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSwinputid() {
        return swinputid;
    }

    public void setSwinputid(int swinputid) {
        this.swinputid = swinputid;
    }

    @Id
    @Column(name = "PERSONID", nullable = false, insertable = true, updatable = true, length = 15)
    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    @Basic
    @Column(name = "JCTYPE", nullable = true, insertable = true, updatable = true, precision = 0)
    public BigInteger getJctype() {
        return jctype;
    }

    public void setJctype(BigInteger jctype) {
        this.jctype = jctype;
    }

    @Basic
    @Column(name = "REMARKS", nullable = true, insertable = true, updatable = true, length = 2000)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NswinputMore that = (NswinputMore) o;

        if (swinputid != that.swinputid) return false;
        if (jctype != null ? !jctype.equals(that.jctype) : that.jctype != null) return false;
        if (personid != null ? !personid.equals(that.personid) : that.personid != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = swinputid;
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        result = 31 * result + (jctype != null ? jctype.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        return result;
    }
}
