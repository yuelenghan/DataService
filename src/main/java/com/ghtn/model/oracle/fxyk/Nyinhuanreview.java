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
@IdClass(NyinhuanreviewPK.class)
public class Nyinhuanreview {
    private int yhputinid;
    private BigDecimal lcmark;
    private Timestamp recorddate;
    private String inputpersonid;
    private Timestamp fctime;
    private String reviewstate;
    private String reviewopinion;

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
    @Column(name = "INPUTPERSONID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getInputpersonid() {
        return inputpersonid;
    }

    public void setInputpersonid(String inputpersonid) {
        this.inputpersonid = inputpersonid;
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

        Nyinhuanreview that = (Nyinhuanreview) o;

        if (yhputinid != that.yhputinid) return false;
        if (fctime != null ? !fctime.equals(that.fctime) : that.fctime != null) return false;
        if (inputpersonid != null ? !inputpersonid.equals(that.inputpersonid) : that.inputpersonid != null)
            return false;
        if (lcmark != null ? !lcmark.equals(that.lcmark) : that.lcmark != null) return false;
        if (recorddate != null ? !recorddate.equals(that.recorddate) : that.recorddate != null) return false;
        if (reviewopinion != null ? !reviewopinion.equals(that.reviewopinion) : that.reviewopinion != null)
            return false;
        if (reviewstate != null ? !reviewstate.equals(that.reviewstate) : that.reviewstate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhputinid;
        result = 31 * result + (lcmark != null ? lcmark.hashCode() : 0);
        result = 31 * result + (recorddate != null ? recorddate.hashCode() : 0);
        result = 31 * result + (inputpersonid != null ? inputpersonid.hashCode() : 0);
        result = 31 * result + (fctime != null ? fctime.hashCode() : 0);
        result = 31 * result + (reviewstate != null ? reviewstate.hashCode() : 0);
        result = 31 * result + (reviewopinion != null ? reviewopinion.hashCode() : 0);
        return result;
    }
}
