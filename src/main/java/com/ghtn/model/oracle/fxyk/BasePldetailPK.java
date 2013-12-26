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
public class BasePldetailPK implements Serializable {
    private Timestamp levelid;

    @Column(name = "LEVELID", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    @Id
    public Timestamp getLevelid() {
        return levelid;
    }

    public void setLevelid(Timestamp levelid) {
        this.levelid = levelid;
    }

    private String personnumber;

    @Column(name = "PERSONNUMBER", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    @Id
    public String getPersonnumber() {
        return personnumber;
    }

    public void setPersonnumber(String personnumber) {
        this.personnumber = personnumber;
    }

    private String gxobject;

    @Column(name = "GXOBJECT", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    @Id
    public String getGxobject() {
        return gxobject;
    }

    public void setGxobject(String gxobject) {
        this.gxobject = gxobject;
    }

    private int yhlevel;

    @Column(name = "YHLEVEL", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    @Id
    public int getYhlevel() {
        return yhlevel;
    }

    public void setYhlevel(int yhlevel) {
        this.yhlevel = yhlevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasePldetailPK that = (BasePldetailPK) o;

        if (yhlevel != that.yhlevel) return false;
        if (gxobject != null ? !gxobject.equals(that.gxobject) : that.gxobject != null) return false;
        if (levelid != null ? !levelid.equals(that.levelid) : that.levelid != null) return false;
        if (personnumber != null ? !personnumber.equals(that.personnumber) : that.personnumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = levelid != null ? levelid.hashCode() : 0;
        result = 31 * result + (personnumber != null ? personnumber.hashCode() : 0);
        result = 31 * result + (gxobject != null ? gxobject.hashCode() : 0);
        result = 31 * result + yhlevel;
        return result;
    }
}
