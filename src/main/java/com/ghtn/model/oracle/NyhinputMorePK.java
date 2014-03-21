package com.ghtn.model.oracle;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * User: Administrator
 * Date: 13-12-27
 * Time: 上午11:52
 */
public class NyhinputMorePK implements Serializable {
    private int yhputinid;
    private String personid;

    @Column(name = "YHPUTINID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Id
    public int getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(int yhputinid) {
        this.yhputinid = yhputinid;
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

        NyhinputMorePK that = (NyhinputMorePK) o;

        if (yhputinid != that.yhputinid) return false;
        if (personid != null ? !personid.equals(that.personid) : that.personid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhputinid;
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        return result;
    }
}
