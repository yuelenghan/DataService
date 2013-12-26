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
@javax.persistence.Table(name = "HAZARDS_ORE", schema = "SEP3", catalog = "")
public class HazardsOre {
    private int id;

    @Id
    @javax.persistence.Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    private Integer regulatorypartnersnumber;

    @Basic
    @javax.persistence.Column(name = "REGULATORYPARTNERSNUMBER", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getRegulatorypartnersnumber() {
        return regulatorypartnersnumber;
    }

    public void setRegulatorypartnersnumber(Integer regulatorypartnersnumber) {
        this.regulatorypartnersnumber = regulatorypartnersnumber;
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

    private String releasedept;

    @Basic
    @javax.persistence.Column(name = "RELEASEDEPT", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getReleasedept() {
        return releasedept;
    }

    public void setReleasedept(String releasedept) {
        this.releasedept = releasedept;
    }

    private Integer releaseperson;

    @Basic
    @javax.persistence.Column(name = "RELEASEPERSON", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getReleaseperson() {
        return releaseperson;
    }

    public void setReleaseperson(Integer releaseperson) {
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

    private String hBjw;

    @Basic
    @javax.persistence.Column(name = "H_BJW", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String gethBjw() {
        return hBjw;
    }

    public void sethBjw(String hBjw) {
        this.hBjw = hBjw;
    }

    private String hBm;

    @Basic
    @javax.persistence.Column(name = "H_BM", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String gethBm() {
        return hBm;
    }

    public void sethBm(String hBm) {
        this.hBm = hBm;
    }

    private String hFPinyin;

    @Basic
    @javax.persistence.Column(name = "H_F_PINYIN", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String gethFPinyin() {
        return hFPinyin;
    }

    public void sethFPinyin(String hFPinyin) {
        this.hFPinyin = hFPinyin;
    }

    private String yhSwBjw;

    @Basic
    @javax.persistence.Column(name = "YH_SW_BJW", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getYhSwBjw() {
        return yhSwBjw;
    }

    public void setYhSwBjw(String yhSwBjw) {
        this.yhSwBjw = yhSwBjw;
    }

    private Integer scores;

    @Basic
    @javax.persistence.Column(name = "SCORES", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public Integer getScores() {
        return scores;
    }

    public void setScores(Integer scores) {
        this.scores = scores;
    }

    private Integer levelid;

    @Basic
    @javax.persistence.Column(name = "LEVELID", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public Integer getLevelid() {
        return levelid;
    }

    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

    private String swBm;

    @Basic
    @javax.persistence.Column(name = "SW_BM", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getSwBm() {
        return swBm;
    }

    public void setSwBm(String swBm) {
        this.swBm = swBm;
    }

    private String swPinyin;

    @Basic
    @javax.persistence.Column(name = "SW_PINYIN", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getSwPinyin() {
        return swPinyin;
    }

    public void setSwPinyin(String swPinyin) {
        this.swPinyin = swPinyin;
    }

    private Integer swScores;

    @Basic
    @javax.persistence.Column(name = "SW_SCORES", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public Integer getSwScores() {
        return swScores;
    }

    public void setSwScores(Integer swScores) {
        this.swScores = swScores;
    }

    private Integer swLevelid;

    @Basic
    @javax.persistence.Column(name = "SW_LEVELID", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public Integer getSwLevelid() {
        return swLevelid;
    }

    public void setSwLevelid(Integer swLevelid) {
        this.swLevelid = swLevelid;
    }

    private String swPunishmentstandard;

    @Basic
    @javax.persistence.Column(name = "SW_PUNISHMENTSTANDARD", nullable = true, insertable = true, updatable = true, length = 60, precision = 0)
    public String getSwPunishmentstandard() {
        return swPunishmentstandard;
    }

    public void setSwPunishmentstandard(String swPunishmentstandard) {
        this.swPunishmentstandard = swPunishmentstandard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HazardsOre that = (HazardsOre) o;

        if (id != that.id) return false;
        if (dateinput != null ? !dateinput.equals(that.dateinput) : that.dateinput != null) return false;
        if (deptnumber != null ? !deptnumber.equals(that.deptnumber) : that.deptnumber != null) return false;
        if (directlyresponsiblepersonsnumb != null ? !directlyresponsiblepersonsnumb.equals(that.directlyresponsiblepersonsnumb) : that.directlyresponsiblepersonsnumb != null)
            return false;
        if (frequencynumber != null ? !frequencynumber.equals(that.frequencynumber) : that.frequencynumber != null)
            return false;
        if (hBjw != null ? !hBjw.equals(that.hBjw) : that.hBjw != null) return false;
        if (hBm != null ? !hBm.equals(that.hBm) : that.hBm != null) return false;
        if (hFPinyin != null ? !hFPinyin.equals(that.hFPinyin) : that.hFPinyin != null) return false;
        if (hNumber != null ? !hNumber.equals(that.hNumber) : that.hNumber != null) return false;
        if (ispass != null ? !ispass.equals(that.ispass) : that.ispass != null) return false;
        if (levelid != null ? !levelid.equals(that.levelid) : that.levelid != null) return false;
        if (lossnumber != null ? !lossnumber.equals(that.lossnumber) : that.lossnumber != null) return false;
        if (mObjectnumber != null ? !mObjectnumber.equals(that.mObjectnumber) : that.mObjectnumber != null)
            return false;
        if (mPersonnumber != null ? !mPersonnumber.equals(that.mPersonnumber) : that.mPersonnumber != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (openingtime != null ? !openingtime.equals(that.openingtime) : that.openingtime != null) return false;
        if (personid != null ? !personid.equals(that.personid) : that.personid != null) return false;
        if (processingmode != null ? !processingmode.equals(that.processingmode) : that.processingmode != null)
            return false;
        if (punishmentstandard != null ? !punishmentstandard.equals(that.punishmentstandard) : that.punishmentstandard != null)
            return false;
        if (regulatorypartnersnumber != null ? !regulatorypartnersnumber.equals(that.regulatorypartnersnumber) : that.regulatorypartnersnumber != null)
            return false;
        if (releasedept != null ? !releasedept.equals(that.releasedept) : that.releasedept != null) return false;
        if (releaseperson != null ? !releaseperson.equals(that.releaseperson) : that.releaseperson != null)
            return false;
        if (riskEvelnumber != null ? !riskEvelnumber.equals(that.riskEvelnumber) : that.riskEvelnumber != null)
            return false;
        if (scores != null ? !scores.equals(that.scores) : that.scores != null) return false;
        if (swBm != null ? !swBm.equals(that.swBm) : that.swBm != null) return false;
        if (swLevelid != null ? !swLevelid.equals(that.swLevelid) : that.swLevelid != null) return false;
        if (swPinyin != null ? !swPinyin.equals(that.swPinyin) : that.swPinyin != null) return false;
        if (swPunishmentstandard != null ? !swPunishmentstandard.equals(that.swPunishmentstandard) : that.swPunishmentstandard != null)
            return false;
        if (swScores != null ? !swScores.equals(that.swScores) : that.swScores != null) return false;
        if (yhSwBjw != null ? !yhSwBjw.equals(that.yhSwBjw) : that.yhSwBjw != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (hNumber != null ? hNumber.hashCode() : 0);
        result = 31 * result + (riskEvelnumber != null ? riskEvelnumber.hashCode() : 0);
        result = 31 * result + (mObjectnumber != null ? mObjectnumber.hashCode() : 0);
        result = 31 * result + (mPersonnumber != null ? mPersonnumber.hashCode() : 0);
        result = 31 * result + (directlyresponsiblepersonsnumb != null ? directlyresponsiblepersonsnumb.hashCode() : 0);
        result = 31 * result + (regulatorypartnersnumber != null ? regulatorypartnersnumber.hashCode() : 0);
        result = 31 * result + (frequencynumber != null ? frequencynumber.hashCode() : 0);
        result = 31 * result + (lossnumber != null ? lossnumber.hashCode() : 0);
        result = 31 * result + (dateinput != null ? dateinput.hashCode() : 0);
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        result = 31 * result + (ispass != null ? ispass.hashCode() : 0);
        result = 31 * result + (openingtime != null ? openingtime.hashCode() : 0);
        result = 31 * result + (deptnumber != null ? deptnumber.hashCode() : 0);
        result = 31 * result + (releasedept != null ? releasedept.hashCode() : 0);
        result = 31 * result + (releaseperson != null ? releaseperson.hashCode() : 0);
        result = 31 * result + (processingmode != null ? processingmode.hashCode() : 0);
        result = 31 * result + (punishmentstandard != null ? punishmentstandard.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (hBjw != null ? hBjw.hashCode() : 0);
        result = 31 * result + (hBm != null ? hBm.hashCode() : 0);
        result = 31 * result + (hFPinyin != null ? hFPinyin.hashCode() : 0);
        result = 31 * result + (yhSwBjw != null ? yhSwBjw.hashCode() : 0);
        result = 31 * result + (scores != null ? scores.hashCode() : 0);
        result = 31 * result + (levelid != null ? levelid.hashCode() : 0);
        result = 31 * result + (swBm != null ? swBm.hashCode() : 0);
        result = 31 * result + (swPinyin != null ? swPinyin.hashCode() : 0);
        result = 31 * result + (swScores != null ? swScores.hashCode() : 0);
        result = 31 * result + (swLevelid != null ? swLevelid.hashCode() : 0);
        result = 31 * result + (swPunishmentstandard != null ? swPunishmentstandard.hashCode() : 0);
        return result;
    }
}
