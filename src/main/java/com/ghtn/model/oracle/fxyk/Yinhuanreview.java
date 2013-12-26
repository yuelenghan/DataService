package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
public class Yinhuanreview {
    private int id;
    private String personid;
    private Integer yhputinid;
    private Timestamp fctime;
    private String reviewstate;
    private String reviewopinion;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PERSONID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    @Basic
    @Column(name = "YHPUTINID", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(Integer yhputinid) {
        this.yhputinid = yhputinid;
    }

    @Basic
    @Column(name = "FCTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getFctime() {
        return fctime;
    }

    public void setFctime(Timestamp fctime) {
        this.fctime = fctime;
    }

    @Basic
    @Column(name = "REVIEWSTATE", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getReviewstate() {
        return reviewstate;
    }

    public void setReviewstate(String reviewstate) {
        this.reviewstate = reviewstate;
    }

    @Basic
    @Column(name = "REVIEWOPINION", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getReviewopinion() {
        return reviewopinion;
    }

    public void setReviewopinion(String reviewopinion) {
        this.reviewopinion = reviewopinion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Yinhuanreview that = (Yinhuanreview) o;

        if (id != that.id) return false;
        if (fctime != null ? !fctime.equals(that.fctime) : that.fctime != null) return false;
        if (personid != null ? !personid.equals(that.personid) : that.personid != null) return false;
        if (reviewopinion != null ? !reviewopinion.equals(that.reviewopinion) : that.reviewopinion != null)
            return false;
        if (reviewstate != null ? !reviewstate.equals(that.reviewstate) : that.reviewstate != null) return false;
        if (yhputinid != null ? !yhputinid.equals(that.yhputinid) : that.yhputinid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        result = 31 * result + (yhputinid != null ? yhputinid.hashCode() : 0);
        result = 31 * result + (fctime != null ? fctime.hashCode() : 0);
        result = 31 * result + (reviewstate != null ? reviewstate.hashCode() : 0);
        result = 31 * result + (reviewopinion != null ? reviewopinion.hashCode() : 0);
        return result;
    }
}
