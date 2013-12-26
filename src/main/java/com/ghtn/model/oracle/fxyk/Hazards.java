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
public class Hazards {
    private int hazardsid;

    @Id
    @javax.persistence.Column(name = "HAZARDSID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getHazardsid() {
        return hazardsid;
    }

    public void setHazardsid(int hazardsid) {
        this.hazardsid = hazardsid;
    }

    private Integer processid;

    @Basic
    @javax.persistence.Column(name = "PROCESSID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getProcessid() {
        return processid;
    }

    public void setProcessid(Integer processid) {
        this.processid = processid;
    }

    private String hNumber;

    @Basic
    @javax.persistence.Column(name = "H_NUMBER", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String gethNumber() {
        return hNumber;
    }

    public void sethNumber(String hNumber) {
        this.hNumber = hNumber;
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

    private Integer frequencynumber;

    @Basic
    @javax.persistence.Column(name = "FREQUENCYNUMBER", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getFrequencynumber() {
        return frequencynumber;
    }

    public void setFrequencynumber(Integer frequencynumber) {
        this.frequencynumber = frequencynumber;
    }

    private Integer lossnumber;

    @Basic
    @javax.persistence.Column(name = "LOSSNUMBER", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getLossnumber() {
        return lossnumber;
    }

    public void setLossnumber(Integer lossnumber) {
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

    private String personid;

    @Basic
    @javax.persistence.Column(name = "PERSONID", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
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

    private Timestamp openingtime;

    @Basic
    @javax.persistence.Column(name = "OPENINGTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getOpeningtime() {
        return openingtime;
    }

    public void setOpeningtime(Timestamp openingtime) {
        this.openingtime = openingtime;
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

    private String releasedept;

    @Basic
    @javax.persistence.Column(name = "RELEASEDEPT", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getReleasedept() {
        return releasedept;
    }

    public void setReleasedept(String releasedept) {
        this.releasedept = releasedept;
    }

    private String releaseperson;

    @Basic
    @javax.persistence.Column(name = "RELEASEPERSON", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getReleaseperson() {
        return releaseperson;
    }

    public void setReleaseperson(String releaseperson) {
        this.releaseperson = releaseperson;
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
    @javax.persistence.Column(name = "PUNISHMENTSTANDARD", nullable = true, insertable = true, updatable = true, length = 60, precision = 0)
    public String getPunishmentstandard() {
        return punishmentstandard;
    }

    public void setPunishmentstandard(String punishmentstandard) {
        this.punishmentstandard = punishmentstandard;
    }

    private String note;

    @Basic
    @javax.persistence.Column(name = "NOTE", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hazards hazards = (Hazards) o;

        if (hazardsid != hazards.hazardsid) return false;
        if (accidentTypenumber != null ? !accidentTypenumber.equals(hazards.accidentTypenumber) : hazards.accidentTypenumber != null)
            return false;
        if (dateinput != null ? !dateinput.equals(hazards.dateinput) : hazards.dateinput != null) return false;
        if (deptnumber != null ? !deptnumber.equals(hazards.deptnumber) : hazards.deptnumber != null) return false;
        if (directlyresponsiblepersonsnumb != null ? !directlyresponsiblepersonsnumb.equals(hazards.directlyresponsiblepersonsnumb) : hazards.directlyresponsiblepersonsnumb != null)
            return false;
        if (frequencynumber != null ? !frequencynumber.equals(hazards.frequencynumber) : hazards.frequencynumber != null)
            return false;
        if (hConsequences != null ? !hConsequences.equals(hazards.hConsequences) : hazards.hConsequences != null)
            return false;
        if (hContent != null ? !hContent.equals(hazards.hContent) : hazards.hContent != null) return false;
        if (hNumber != null ? !hNumber.equals(hazards.hNumber) : hazards.hNumber != null) return false;
        if (ispass != null ? !ispass.equals(hazards.ispass) : hazards.ispass != null) return false;
        if (lossnumber != null ? !lossnumber.equals(hazards.lossnumber) : hazards.lossnumber != null) return false;
        if (mMeasures != null ? !mMeasures.equals(hazards.mMeasures) : hazards.mMeasures != null) return false;
        if (mObjectnumber != null ? !mObjectnumber.equals(hazards.mObjectnumber) : hazards.mObjectnumber != null)
            return false;
        if (mPersonnumber != null ? !mPersonnumber.equals(hazards.mPersonnumber) : hazards.mPersonnumber != null)
            return false;
        if (mStandards != null ? !mStandards.equals(hazards.mStandards) : hazards.mStandards != null) return false;
        if (note != null ? !note.equals(hazards.note) : hazards.note != null) return false;
        if (openingtime != null ? !openingtime.equals(hazards.openingtime) : hazards.openingtime != null) return false;
        if (personid != null ? !personid.equals(hazards.personid) : hazards.personid != null) return false;
        if (processid != null ? !processid.equals(hazards.processid) : hazards.processid != null) return false;
        if (processingmode != null ? !processingmode.equals(hazards.processingmode) : hazards.processingmode != null)
            return false;
        if (punishmentstandard != null ? !punishmentstandard.equals(hazards.punishmentstandard) : hazards.punishmentstandard != null)
            return false;
        if (regulatorymeasures != null ? !regulatorymeasures.equals(hazards.regulatorymeasures) : hazards.regulatorymeasures != null)
            return false;
        if (regulatorypartnersnumber != null ? !regulatorypartnersnumber.equals(hazards.regulatorypartnersnumber) : hazards.regulatorypartnersnumber != null)
            return false;
        if (releasedept != null ? !releasedept.equals(hazards.releasedept) : hazards.releasedept != null) return false;
        if (releaseperson != null ? !releaseperson.equals(hazards.releaseperson) : hazards.releaseperson != null)
            return false;
        if (riskEvelnumber != null ? !riskEvelnumber.equals(hazards.riskEvelnumber) : hazards.riskEvelnumber != null)
            return false;
        if (riskTypesnumber != null ? !riskTypesnumber.equals(hazards.riskTypesnumber) : hazards.riskTypesnumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hazardsid;
        result = 31 * result + (processid != null ? processid.hashCode() : 0);
        result = 31 * result + (hNumber != null ? hNumber.hashCode() : 0);
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
        result = 31 * result + (openingtime != null ? openingtime.hashCode() : 0);
        result = 31 * result + (deptnumber != null ? deptnumber.hashCode() : 0);
        result = 31 * result + (riskTypesnumber != null ? riskTypesnumber.hashCode() : 0);
        result = 31 * result + (accidentTypenumber != null ? accidentTypenumber.hashCode() : 0);
        result = 31 * result + (releasedept != null ? releasedept.hashCode() : 0);
        result = 31 * result + (releaseperson != null ? releaseperson.hashCode() : 0);
        result = 31 * result + (processingmode != null ? processingmode.hashCode() : 0);
        result = 31 * result + (punishmentstandard != null ? punishmentstandard.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
