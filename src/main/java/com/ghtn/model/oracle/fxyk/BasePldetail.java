package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
@Table(name = "BASE_PLDETAIL", schema = "SEP3", catalog = "")
@IdClass(BasePldetailPK.class)
public class BasePldetail {
    private Timestamp levelid;
    private String personnumber;
    private String gxobject;
    private BigInteger gxtype;
    private int yhlevel;
    private BigInteger yqcs;
    private BigInteger dx;

    @Id
    @Column(name = "LEVELID", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getLevelid() {
        return levelid;
    }

    public void setLevelid(Timestamp levelid) {
        this.levelid = levelid;
    }

    @Id
    @Column(name = "PERSONNUMBER", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPersonnumber() {
        return personnumber;
    }

    public void setPersonnumber(String personnumber) {
        this.personnumber = personnumber;
    }

    @Id
    @Column(name = "GXOBJECT", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    public String getGxobject() {
        return gxobject;
    }

    public void setGxobject(String gxobject) {
        this.gxobject = gxobject;
    }

    @Basic
    @Column(name = "GXTYPE", nullable = false, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getGxtype() {
        return gxtype;
    }

    public void setGxtype(BigInteger gxtype) {
        this.gxtype = gxtype;
    }

    @Id
    @Column(name = "YHLEVEL", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getYhlevel() {
        return yhlevel;
    }

    public void setYhlevel(int yhlevel) {
        this.yhlevel = yhlevel;
    }

    @Basic
    @Column(name = "YQCS", nullable = false, insertable = true, updatable = true, length = 2, precision = 0)
    public BigInteger getYqcs() {
        return yqcs;
    }

    public void setYqcs(BigInteger yqcs) {
        this.yqcs = yqcs;
    }

    @Basic
    @Column(name = "DX", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getDx() {
        return dx;
    }

    public void setDx(BigInteger dx) {
        this.dx = dx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasePldetail that = (BasePldetail) o;

        if (yhlevel != that.yhlevel) return false;
        if (dx != null ? !dx.equals(that.dx) : that.dx != null) return false;
        if (gxobject != null ? !gxobject.equals(that.gxobject) : that.gxobject != null) return false;
        if (gxtype != null ? !gxtype.equals(that.gxtype) : that.gxtype != null) return false;
        if (levelid != null ? !levelid.equals(that.levelid) : that.levelid != null) return false;
        if (personnumber != null ? !personnumber.equals(that.personnumber) : that.personnumber != null) return false;
        if (yqcs != null ? !yqcs.equals(that.yqcs) : that.yqcs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = levelid != null ? levelid.hashCode() : 0;
        result = 31 * result + (personnumber != null ? personnumber.hashCode() : 0);
        result = 31 * result + (gxobject != null ? gxobject.hashCode() : 0);
        result = 31 * result + (gxtype != null ? gxtype.hashCode() : 0);
        result = 31 * result + yhlevel;
        result = 31 * result + (yqcs != null ? yqcs.hashCode() : 0);
        result = 31 * result + (dx != null ? dx.hashCode() : 0);
        return result;
    }
}
