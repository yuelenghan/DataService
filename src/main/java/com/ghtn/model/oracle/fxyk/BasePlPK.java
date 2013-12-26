package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
public class BasePlPK implements Serializable {
    private Timestamp levelid;
    private String personnumber;

    @Column(name = "LEVELID", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    @Id
    public Timestamp getLevelid() {
        return levelid;
    }

    public void setLevelid(Timestamp levelid) {
        this.levelid = levelid;
    }

    @Column(name = "PERSONNUMBER", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    @Id
    public String getPersonnumber() {
        return personnumber;
    }

    public void setPersonnumber(String personnumber) {
        this.personnumber = personnumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasePlPK basePlPK = (BasePlPK) o;

        if (levelid != null ? !levelid.equals(basePlPK.levelid) : basePlPK.levelid != null) return false;
        if (personnumber != null ? !personnumber.equals(basePlPK.personnumber) : basePlPK.personnumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = levelid != null ? levelid.hashCode() : 0;
        result = 31 * result + (personnumber != null ? personnumber.hashCode() : 0);
        return result;
    }
}
