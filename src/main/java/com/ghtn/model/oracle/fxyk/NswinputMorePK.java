package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
public class NswinputMorePK implements Serializable {
    private int swinputid;
    private String personid;

    @Column(name = "SWINPUTID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Id
    public int getSwinputid() {
        return swinputid;
    }

    public void setSwinputid(int swinputid) {
        this.swinputid = swinputid;
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

        NswinputMorePK that = (NswinputMorePK) o;

        if (swinputid != that.swinputid) return false;
        if (personid != null ? !personid.equals(that.personid) : that.personid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = swinputid;
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        return result;
    }
}
