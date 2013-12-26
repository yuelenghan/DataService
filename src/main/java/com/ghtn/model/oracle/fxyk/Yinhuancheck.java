package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
public class Yinhuancheck {
    private int id;
    private int yhputinid;
    private String measures;
    private String instructions;
    private String personid;
    private Timestamp instrtime;
    private Timestamp reclimit;
    private Integer reviewlimit;
    private Timestamp checktime;
    private String responsibleid;
    private String responsibledept;
    private String banci;
    private BigInteger isfine;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "YHPUTINID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(int yhputinid) {
        this.yhputinid = yhputinid;
    }

    @Basic
    @Column(name = "MEASURES", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getMeasures() {
        return measures;
    }

    public void setMeasures(String measures) {
        this.measures = measures;
    }

    @Basic
    @Column(name = "INSTRUCTIONS", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
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
    @Column(name = "INSTRTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getInstrtime() {
        return instrtime;
    }

    public void setInstrtime(Timestamp instrtime) {
        this.instrtime = instrtime;
    }

    @Basic
    @Column(name = "RECLIMIT", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getReclimit() {
        return reclimit;
    }

    public void setReclimit(Timestamp reclimit) {
        this.reclimit = reclimit;
    }

    @Basic
    @Column(name = "REVIEWLIMIT", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getReviewlimit() {
        return reviewlimit;
    }

    public void setReviewlimit(Integer reviewlimit) {
        this.reviewlimit = reviewlimit;
    }

    @Basic
    @Column(name = "CHECKTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getChecktime() {
        return checktime;
    }

    public void setChecktime(Timestamp checktime) {
        this.checktime = checktime;
    }

    @Basic
    @Column(name = "RESPONSIBLEID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getResponsibleid() {
        return responsibleid;
    }

    public void setResponsibleid(String responsibleid) {
        this.responsibleid = responsibleid;
    }

    @Basic
    @Column(name = "RESPONSIBLEDEPT", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getResponsibledept() {
        return responsibledept;
    }

    public void setResponsibledept(String responsibledept) {
        this.responsibledept = responsibledept;
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
    @Column(name = "ISFINE", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getIsfine() {
        return isfine;
    }

    public void setIsfine(BigInteger isfine) {
        this.isfine = isfine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Yinhuancheck that = (Yinhuancheck) o;

        if (id != that.id) return false;
        if (yhputinid != that.yhputinid) return false;
        if (banci != null ? !banci.equals(that.banci) : that.banci != null) return false;
        if (checktime != null ? !checktime.equals(that.checktime) : that.checktime != null) return false;
        if (instrtime != null ? !instrtime.equals(that.instrtime) : that.instrtime != null) return false;
        if (instructions != null ? !instructions.equals(that.instructions) : that.instructions != null) return false;
        if (isfine != null ? !isfine.equals(that.isfine) : that.isfine != null) return false;
        if (measures != null ? !measures.equals(that.measures) : that.measures != null) return false;
        if (personid != null ? !personid.equals(that.personid) : that.personid != null) return false;
        if (reclimit != null ? !reclimit.equals(that.reclimit) : that.reclimit != null) return false;
        if (responsibledept != null ? !responsibledept.equals(that.responsibledept) : that.responsibledept != null)
            return false;
        if (responsibleid != null ? !responsibleid.equals(that.responsibleid) : that.responsibleid != null)
            return false;
        if (reviewlimit != null ? !reviewlimit.equals(that.reviewlimit) : that.reviewlimit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + yhputinid;
        result = 31 * result + (measures != null ? measures.hashCode() : 0);
        result = 31 * result + (instructions != null ? instructions.hashCode() : 0);
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        result = 31 * result + (instrtime != null ? instrtime.hashCode() : 0);
        result = 31 * result + (reclimit != null ? reclimit.hashCode() : 0);
        result = 31 * result + (reviewlimit != null ? reviewlimit.hashCode() : 0);
        result = 31 * result + (checktime != null ? checktime.hashCode() : 0);
        result = 31 * result + (responsibleid != null ? responsibleid.hashCode() : 0);
        result = 31 * result + (responsibledept != null ? responsibledept.hashCode() : 0);
        result = 31 * result + (banci != null ? banci.hashCode() : 0);
        result = 31 * result + (isfine != null ? isfine.hashCode() : 0);
        return result;
    }
}
