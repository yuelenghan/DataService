package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
@javax.persistence.Table(name = "HAZARDS_TEMP", schema = "SEP3", catalog = "")
public class HazardsTemp {
    private int hazardstempid;

    @Id
    @javax.persistence.Column(name = "HAZARDSTEMPID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getHazardstempid() {
        return hazardstempid;
    }

    public void setHazardstempid(int hazardstempid) {
        this.hazardstempid = hazardstempid;
    }

    private String processnumber;

    @Basic
    @javax.persistence.Column(name = "PROCESSNUMBER", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getProcessnumber() {
        return processnumber;
    }

    public void setProcessnumber(String processnumber) {
        this.processnumber = processnumber;
    }

    private String hContent;

    @Basic
    @javax.persistence.Column(name = "H_CONTENT", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String gethContent() {
        return hContent;
    }

    public void sethContent(String hContent) {
        this.hContent = hContent;
    }

    private String hConsequences;

    @Basic
    @javax.persistence.Column(name = "H_CONSEQUENCES", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String gethConsequences() {
        return hConsequences;
    }

    public void sethConsequences(String hConsequences) {
        this.hConsequences = hConsequences;
    }

    private Integer riskEvelnumber;

    @Basic
    @javax.persistence.Column(name = "RISK_EVELNUMBER", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getRiskEvelnumber() {
        return riskEvelnumber;
    }

    public void setRiskEvelnumber(Integer riskEvelnumber) {
        this.riskEvelnumber = riskEvelnumber;
    }

    private Integer mObjectnumber;

    @Basic
    @javax.persistence.Column(name = "M_OBJECTNUMBER", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getmObjectnumber() {
        return mObjectnumber;
    }

    public void setmObjectnumber(Integer mObjectnumber) {
        this.mObjectnumber = mObjectnumber;
    }

    private String mStandards;

    @Basic
    @javax.persistence.Column(name = "M_STANDARDS", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getmStandards() {
        return mStandards;
    }

    public void setmStandards(String mStandards) {
        this.mStandards = mStandards;
    }

    private Integer mPersonnumber;

    @Basic
    @javax.persistence.Column(name = "M_PERSONNUMBER", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getmPersonnumber() {
        return mPersonnumber;
    }

    public void setmPersonnumber(Integer mPersonnumber) {
        this.mPersonnumber = mPersonnumber;
    }

    private Integer directlyresponsiblepersonsnumb;

    @Basic
    @javax.persistence.Column(name = "DIRECTLYRESPONSIBLEPERSONSNUMB", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getDirectlyresponsiblepersonsnumb() {
        return directlyresponsiblepersonsnumb;
    }

    public void setDirectlyresponsiblepersonsnumb(Integer directlyresponsiblepersonsnumb) {
        this.directlyresponsiblepersonsnumb = directlyresponsiblepersonsnumb;
    }

    private String mMeasures;

    @Basic
    @javax.persistence.Column(name = "M_MEASURES", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getmMeasures() {
        return mMeasures;
    }

    public void setmMeasures(String mMeasures) {
        this.mMeasures = mMeasures;
    }

    private Integer regulatorypartnersnumber;

    @Basic
    @javax.persistence.Column(name = "REGULATORYPARTNERSNUMBER", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getRegulatorypartnersnumber() {
        return regulatorypartnersnumber;
    }

    public void setRegulatorypartnersnumber(Integer regulatorypartnersnumber) {
        this.regulatorypartnersnumber = regulatorypartnersnumber;
    }

    private String regulatorymeasures;

    @Basic
    @javax.persistence.Column(name = "REGULATORYMEASURES", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getRegulatorymeasures() {
        return regulatorymeasures;
    }

    public void setRegulatorymeasures(String regulatorymeasures) {
        this.regulatorymeasures = regulatorymeasures;
    }

    private String frequencynumber;

    @Basic
    @javax.persistence.Column(name = "FREQUENCYNUMBER", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getFrequencynumber() {
        return frequencynumber;
    }

    public void setFrequencynumber(String frequencynumber) {
        this.frequencynumber = frequencynumber;
    }

    private String lossnumber;

    @Basic
    @javax.persistence.Column(name = "LOSSNUMBER", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getLossnumber() {
        return lossnumber;
    }

    public void setLossnumber(String lossnumber) {
        this.lossnumber = lossnumber;
    }

    private Timestamp dateinput;

    @Basic
    @javax.persistence.Column(name = "DATEINPUT", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getDateinput() {
        return dateinput;
    }

    public void setDateinput(Timestamp dateinput) {
        this.dateinput = dateinput;
    }

    private Integer personid;

    @Basic
    @javax.persistence.Column(name = "PERSONID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    private String ispass;

    @Basic
    @javax.persistence.Column(name = "ISPASS", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getIspass() {
        return ispass;
    }

    public void setIspass(String ispass) {
        this.ispass = ispass;
    }

    private String deptnumber;

    @Basic
    @javax.persistence.Column(name = "DEPTNUMBER", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getDeptnumber() {
        return deptnumber;
    }

    public void setDeptnumber(String deptnumber) {
        this.deptnumber = deptnumber;
    }

    private Integer riskTypesnumber;

    @Basic
    @javax.persistence.Column(name = "RISK_TYPESNUMBER", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getRiskTypesnumber() {
        return riskTypesnumber;
    }

    public void setRiskTypesnumber(Integer riskTypesnumber) {
        this.riskTypesnumber = riskTypesnumber;
    }

    private Integer accidentTypenumber;

    @Basic
    @javax.persistence.Column(name = "ACCIDENT_TYPENUMBER", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getAccidentTypenumber() {
        return accidentTypenumber;
    }

    public void setAccidentTypenumber(Integer accidentTypenumber) {
        this.accidentTypenumber = accidentTypenumber;
    }

    private String processingmode;

    @Basic
    @javax.persistence.Column(name = "PROCESSINGMODE", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getProcessingmode() {
        return processingmode;
    }

    public void setProcessingmode(String processingmode) {
        this.processingmode = processingmode;
    }

    private String punishmentstandard;

    @Basic
    @javax.persistence.Column(name = "PUNISHMENTSTANDARD", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getPunishmentstandard() {
        return punishmentstandard;
    }

    public void setPunishmentstandard(String punishmentstandard) {
        this.punishmentstandard = punishmentstandard;
    }

    private String note;

    @Basic
    @javax.persistence.Column(name = "NOTE", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    private Integer hazardid;

    @Basic
    @javax.persistence.Column(name = "HAZARDID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getHazardid() {
        return hazardid;
    }

    public void setHazardid(Integer hazardid) {
        this.hazardid = hazardid;
    }

    private String isfromtemp;

    @Basic
    @javax.persistence.Column(name = "ISFROMTEMP", nullable = true, insertable = true, updatable = true, length = 2, precision = 0)
    public String getIsfromtemp() {
        return isfromtemp;
    }

    public void setIsfromtemp(String isfromtemp) {
        this.isfromtemp = isfromtemp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HazardsTemp that = (HazardsTemp) o;

        if (hazardstempid != that.hazardstempid) return false;
        if (accidentTypenumber != null ? !accidentTypenumber.equals(that.accidentTypenumber) : that.accidentTypenumber != null)
            return false;
        if (dateinput != null ? !dateinput.equals(that.dateinput) : that.dateinput != null) return false;
        if (deptnumber != null ? !deptnumber.equals(that.deptnumber) : that.deptnumber != null) return false;
        if (directlyresponsiblepersonsnumb != null ? !directlyresponsiblepersonsnumb.equals(that.directlyresponsiblepersonsnumb) : that.directlyresponsiblepersonsnumb != null)
            return false;
        if (frequencynumber != null ? !frequencynumber.equals(that.frequencynumber) : that.frequencynumber != null)
            return false;
        if (hConsequences != null ? !hConsequences.equals(that.hConsequences) : that.hConsequences != null)
            return false;
        if (hContent != null ? !hContent.equals(that.hContent) : that.hContent != null) return false;
        if (hazardid != null ? !hazardid.equals(that.hazardid) : that.hazardid != null) return false;
        if (isfromtemp != null ? !isfromtemp.equals(that.isfromtemp) : that.isfromtemp != null) return false;
        if (ispass != null ? !ispass.equals(that.ispass) : that.ispass != null) return false;
        if (lossnumber != null ? !lossnumber.equals(that.lossnumber) : that.lossnumber != null) return false;
        if (mMeasures != null ? !mMeasures.equals(that.mMeasures) : that.mMeasures != null) return false;
        if (mObjectnumber != null ? !mObjectnumber.equals(that.mObjectnumber) : that.mObjectnumber != null)
            return false;
        if (mPersonnumber != null ? !mPersonnumber.equals(that.mPersonnumber) : that.mPersonnumber != null)
            return false;
        if (mStandards != null ? !mStandards.equals(that.mStandards) : that.mStandards != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (personid != null ? !personid.equals(that.personid) : that.personid != null) return false;
        if (processingmode != null ? !processingmode.equals(that.processingmode) : that.processingmode != null)
            return false;
        if (processnumber != null ? !processnumber.equals(that.processnumber) : that.processnumber != null)
            return false;
        if (punishmentstandard != null ? !punishmentstandard.equals(that.punishmentstandard) : that.punishmentstandard != null)
            return false;
        if (regulatorymeasures != null ? !regulatorymeasures.equals(that.regulatorymeasures) : that.regulatorymeasures != null)
            return false;
        if (regulatorypartnersnumber != null ? !regulatorypartnersnumber.equals(that.regulatorypartnersnumber) : that.regulatorypartnersnumber != null)
            return false;
        if (riskEvelnumber != null ? !riskEvelnumber.equals(that.riskEvelnumber) : that.riskEvelnumber != null)
            return false;
        if (riskTypesnumber != null ? !riskTypesnumber.equals(that.riskTypesnumber) : that.riskTypesnumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hazardstempid;
        result = 31 * result + (processnumber != null ? processnumber.hashCode() : 0);
        result = 31 * result + (hContent != null ? hContent.hashCode() : 0);
        result = 31 * result + (hConsequences != null ? hConsequences.hashCode() : 0);
        result = 31 * result + (riskEvelnumber != null ? riskEvelnumber.hashCode() : 0);
        result = 31 * result + (mObjectnumber != null ? mObjectnumber.hashCode() : 0);
        result = 31 * result + (mStandards != null ? mStandards.hashCode() : 0);
        result = 31 * result + (mPersonnumber != null ? mPersonnumber.hashCode() : 0);
        result = 31 * result + (directlyresponsiblepersonsnumb != null ? directlyresponsiblepersonsnumb.hashCode() : 0);
        result = 31 * result + (mMeasures != null ? mMeasures.hashCode() : 0);
        result = 31 * result + (regulatorypartnersnumber != null ? regulatorypartnersnumber.hashCode() : 0);
        result = 31 * result + (regulatorymeasures != null ? regulatorymeasures.hashCode() : 0);
        result = 31 * result + (frequencynumber != null ? frequencynumber.hashCode() : 0);
        result = 31 * result + (lossnumber != null ? lossnumber.hashCode() : 0);
        result = 31 * result + (dateinput != null ? dateinput.hashCode() : 0);
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        result = 31 * result + (ispass != null ? ispass.hashCode() : 0);
        result = 31 * result + (deptnumber != null ? deptnumber.hashCode() : 0);
        result = 31 * result + (riskTypesnumber != null ? riskTypesnumber.hashCode() : 0);
        result = 31 * result + (accidentTypenumber != null ? accidentTypenumber.hashCode() : 0);
        result = 31 * result + (processingmode != null ? processingmode.hashCode() : 0);
        result = 31 * result + (punishmentstandard != null ? punishmentstandard.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (hazardid != null ? hazardid.hashCode() : 0);
        result = 31 * result + (isfromtemp != null ? isfromtemp.hashCode() : 0);
        return result;
    }
}
