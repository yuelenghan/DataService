package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
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
public class Yhhistory {
    private int actionid;

    @Id
    @javax.persistence.Column(name = "ACTIONID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getActionid() {
        return actionid;
    }

    public void setActionid(int actionid) {
        this.actionid = actionid;
    }

    private String deptid;

    @Basic
    @javax.persistence.Column(name = "DEPTID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    private Integer placeid;

    @Basic
    @javax.persistence.Column(name = "PLACEID", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPlaceid() {
        return placeid;
    }

    public void setPlaceid(Integer placeid) {
        this.placeid = placeid;
    }

    private String banci;

    @Basic
    @javax.persistence.Column(name = "BANCI", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getBanci() {
        return banci;
    }

    public void setBanci(String banci) {
        this.banci = banci;
    }

    private String personid;

    @Basic
    @javax.persistence.Column(name = "PERSONID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    private Timestamp pctime;

    @Basic
    @javax.persistence.Column(name = "PCTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getPctime() {
        return pctime;
    }

    public void setPctime(Timestamp pctime) {
        this.pctime = pctime;
    }

    private Timestamp intime;

    @Basic
    @javax.persistence.Column(name = "INTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getIntime() {
        return intime;
    }

    public void setIntime(Timestamp intime) {
        this.intime = intime;
    }

    private String yhnumber;

    @Basic
    @javax.persistence.Column(name = "YHNUMBER", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getYhnumber() {
        return yhnumber;
    }

    public void setYhnumber(String yhnumber) {
        this.yhnumber = yhnumber;
    }

    private String remarks;

    @Basic
    @javax.persistence.Column(name = "REMARKS", nullable = true, insertable = true, updatable = true, length = 2000, precision = 0)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    private String status;

    @Basic
    @javax.persistence.Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String measures;

    @Basic
    @javax.persistence.Column(name = "MEASURES", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getMeasures() {
        return measures;
    }

    public void setMeasures(String measures) {
        this.measures = measures;
    }

    private String instructions;

    @Basic
    @javax.persistence.Column(name = "INSTRUCTIONS", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    private String personid1;

    @Basic
    @javax.persistence.Column(name = "PERSONID1", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPersonid1() {
        return personid1;
    }

    public void setPersonid1(String personid1) {
        this.personid1 = personid1;
    }

    private Timestamp instrtime;

    @Basic
    @javax.persistence.Column(name = "INSTRTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getInstrtime() {
        return instrtime;
    }

    public void setInstrtime(Timestamp instrtime) {
        this.instrtime = instrtime;
    }

    private Timestamp reclimit;

    @Basic
    @javax.persistence.Column(name = "RECLIMIT", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getReclimit() {
        return reclimit;
    }

    public void setReclimit(Timestamp reclimit) {
        this.reclimit = reclimit;
    }

    private Integer reviewlimit;

    @Basic
    @javax.persistence.Column(name = "REVIEWLIMIT", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getReviewlimit() {
        return reviewlimit;
    }

    public void setReviewlimit(Integer reviewlimit) {
        this.reviewlimit = reviewlimit;
    }

    private BigInteger isfine;

    @Basic
    @javax.persistence.Column(name = "ISFINE", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getIsfine() {
        return isfine;
    }

    public void setIsfine(BigInteger isfine) {
        this.isfine = isfine;
    }

    private Timestamp checktime;

    @Basic
    @javax.persistence.Column(name = "CHECKTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getChecktime() {
        return checktime;
    }

    public void setChecktime(Timestamp checktime) {
        this.checktime = checktime;
    }

    private String recopinion;

    @Basic
    @javax.persistence.Column(name = "RECOPINION", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getRecopinion() {
        return recopinion;
    }

    public void setRecopinion(String recopinion) {
        this.recopinion = recopinion;
    }

    private String recpersonid;

    @Basic
    @javax.persistence.Column(name = "RECPERSONID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getRecpersonid() {
        return recpersonid;
    }

    public void setRecpersonid(String recpersonid) {
        this.recpersonid = recpersonid;
    }

    private String responsibleid;

    @Basic
    @javax.persistence.Column(name = "RESPONSIBLEID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getResponsibleid() {
        return responsibleid;
    }

    public void setResponsibleid(String responsibleid) {
        this.responsibleid = responsibleid;
    }

    private Timestamp rectime;

    @Basic
    @javax.persistence.Column(name = "RECTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getRectime() {
        return rectime;
    }

    public void setRectime(Timestamp rectime) {
        this.rectime = rectime;
    }

    private String recstate;

    @Basic
    @javax.persistence.Column(name = "RECSTATE", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getRecstate() {
        return recstate;
    }

    public void setRecstate(String recstate) {
        this.recstate = recstate;
    }

    private String personid2;

    @Basic
    @javax.persistence.Column(name = "PERSONID2", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPersonid2() {
        return personid2;
    }

    public void setPersonid2(String personid2) {
        this.personid2 = personid2;
    }

    private Timestamp fctime;

    @Basic
    @javax.persistence.Column(name = "FCTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getFctime() {
        return fctime;
    }

    public void setFctime(Timestamp fctime) {
        this.fctime = fctime;
    }

    private String reviewstate;

    @Basic
    @javax.persistence.Column(name = "REVIEWSTATE", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getReviewstate() {
        return reviewstate;
    }

    public void setReviewstate(String reviewstate) {
        this.reviewstate = reviewstate;
    }

    private String reviewopinion;

    @Basic
    @javax.persistence.Column(name = "REVIEWOPINION", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getReviewopinion() {
        return reviewopinion;
    }

    public void setReviewopinion(String reviewopinion) {
        this.reviewopinion = reviewopinion;
    }

    private String responsibledept;

    @Basic
    @javax.persistence.Column(name = "RESPONSIBLEDEPT", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getResponsibledept() {
        return responsibledept;
    }

    public void setResponsibledept(String responsibledept) {
        this.responsibledept = responsibledept;
    }

    private String yanshouid;

    @Basic
    @javax.persistence.Column(name = "YANSHOUID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getYanshouid() {
        return yanshouid;
    }

    public void setYanshouid(String yanshouid) {
        this.yanshouid = yanshouid;
    }

    private String zgbanci;

    @Basic
    @javax.persistence.Column(name = "ZGBANCI", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getZgbanci() {
        return zgbanci;
    }

    public void setZgbanci(String zgbanci) {
        this.zgbanci = zgbanci;
    }

    private String maindeptid;

    @Basic
    @javax.persistence.Column(name = "MAINDEPTID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getMaindeptid() {
        return maindeptid;
    }

    public void setMaindeptid(String maindeptid) {
        this.maindeptid = maindeptid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Yhhistory yhhistory = (Yhhistory) o;

        if (actionid != yhhistory.actionid) return false;
        if (banci != null ? !banci.equals(yhhistory.banci) : yhhistory.banci != null) return false;
        if (checktime != null ? !checktime.equals(yhhistory.checktime) : yhhistory.checktime != null) return false;
        if (deptid != null ? !deptid.equals(yhhistory.deptid) : yhhistory.deptid != null) return false;
        if (fctime != null ? !fctime.equals(yhhistory.fctime) : yhhistory.fctime != null) return false;
        if (instrtime != null ? !instrtime.equals(yhhistory.instrtime) : yhhistory.instrtime != null) return false;
        if (instructions != null ? !instructions.equals(yhhistory.instructions) : yhhistory.instructions != null)
            return false;
        if (intime != null ? !intime.equals(yhhistory.intime) : yhhistory.intime != null) return false;
        if (isfine != null ? !isfine.equals(yhhistory.isfine) : yhhistory.isfine != null) return false;
        if (maindeptid != null ? !maindeptid.equals(yhhistory.maindeptid) : yhhistory.maindeptid != null) return false;
        if (measures != null ? !measures.equals(yhhistory.measures) : yhhistory.measures != null) return false;
        if (pctime != null ? !pctime.equals(yhhistory.pctime) : yhhistory.pctime != null) return false;
        if (personid != null ? !personid.equals(yhhistory.personid) : yhhistory.personid != null) return false;
        if (personid1 != null ? !personid1.equals(yhhistory.personid1) : yhhistory.personid1 != null) return false;
        if (personid2 != null ? !personid2.equals(yhhistory.personid2) : yhhistory.personid2 != null) return false;
        if (placeid != null ? !placeid.equals(yhhistory.placeid) : yhhistory.placeid != null) return false;
        if (reclimit != null ? !reclimit.equals(yhhistory.reclimit) : yhhistory.reclimit != null) return false;
        if (recopinion != null ? !recopinion.equals(yhhistory.recopinion) : yhhistory.recopinion != null) return false;
        if (recpersonid != null ? !recpersonid.equals(yhhistory.recpersonid) : yhhistory.recpersonid != null)
            return false;
        if (recstate != null ? !recstate.equals(yhhistory.recstate) : yhhistory.recstate != null) return false;
        if (rectime != null ? !rectime.equals(yhhistory.rectime) : yhhistory.rectime != null) return false;
        if (remarks != null ? !remarks.equals(yhhistory.remarks) : yhhistory.remarks != null) return false;
        if (responsibledept != null ? !responsibledept.equals(yhhistory.responsibledept) : yhhistory.responsibledept != null)
            return false;
        if (responsibleid != null ? !responsibleid.equals(yhhistory.responsibleid) : yhhistory.responsibleid != null)
            return false;
        if (reviewlimit != null ? !reviewlimit.equals(yhhistory.reviewlimit) : yhhistory.reviewlimit != null)
            return false;
        if (reviewopinion != null ? !reviewopinion.equals(yhhistory.reviewopinion) : yhhistory.reviewopinion != null)
            return false;
        if (reviewstate != null ? !reviewstate.equals(yhhistory.reviewstate) : yhhistory.reviewstate != null)
            return false;
        if (status != null ? !status.equals(yhhistory.status) : yhhistory.status != null) return false;
        if (yanshouid != null ? !yanshouid.equals(yhhistory.yanshouid) : yhhistory.yanshouid != null) return false;
        if (yhnumber != null ? !yhnumber.equals(yhhistory.yhnumber) : yhhistory.yhnumber != null) return false;
        if (zgbanci != null ? !zgbanci.equals(yhhistory.zgbanci) : yhhistory.zgbanci != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = actionid;
        result = 31 * result + (deptid != null ? deptid.hashCode() : 0);
        result = 31 * result + (placeid != null ? placeid.hashCode() : 0);
        result = 31 * result + (banci != null ? banci.hashCode() : 0);
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        result = 31 * result + (pctime != null ? pctime.hashCode() : 0);
        result = 31 * result + (intime != null ? intime.hashCode() : 0);
        result = 31 * result + (yhnumber != null ? yhnumber.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (measures != null ? measures.hashCode() : 0);
        result = 31 * result + (instructions != null ? instructions.hashCode() : 0);
        result = 31 * result + (personid1 != null ? personid1.hashCode() : 0);
        result = 31 * result + (instrtime != null ? instrtime.hashCode() : 0);
        result = 31 * result + (reclimit != null ? reclimit.hashCode() : 0);
        result = 31 * result + (reviewlimit != null ? reviewlimit.hashCode() : 0);
        result = 31 * result + (isfine != null ? isfine.hashCode() : 0);
        result = 31 * result + (checktime != null ? checktime.hashCode() : 0);
        result = 31 * result + (recopinion != null ? recopinion.hashCode() : 0);
        result = 31 * result + (recpersonid != null ? recpersonid.hashCode() : 0);
        result = 31 * result + (responsibleid != null ? responsibleid.hashCode() : 0);
        result = 31 * result + (rectime != null ? rectime.hashCode() : 0);
        result = 31 * result + (recstate != null ? recstate.hashCode() : 0);
        result = 31 * result + (personid2 != null ? personid2.hashCode() : 0);
        result = 31 * result + (fctime != null ? fctime.hashCode() : 0);
        result = 31 * result + (reviewstate != null ? reviewstate.hashCode() : 0);
        result = 31 * result + (reviewopinion != null ? reviewopinion.hashCode() : 0);
        result = 31 * result + (responsibledept != null ? responsibledept.hashCode() : 0);
        result = 31 * result + (yanshouid != null ? yanshouid.hashCode() : 0);
        result = 31 * result + (zgbanci != null ? zgbanci.hashCode() : 0);
        result = 31 * result + (maindeptid != null ? maindeptid.hashCode() : 0);
        return result;
    }
}
