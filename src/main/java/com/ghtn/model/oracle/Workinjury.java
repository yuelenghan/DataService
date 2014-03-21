package com.ghtn.model.oracle;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 14-3-5
 * Time: 下午4:06
 */
@Entity
public class Workinjury {
    private int id;

    @Id
    @javax.persistence.Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String personnumber;

    @Basic
    @javax.persistence.Column(name = "PERSONNUMBER", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPersonnumber() {
        return personnumber;
    }

    public void setPersonnumber(String personnumber) {
        this.personnumber = personnumber;
    }

    private String deptnumber;

    @Basic
    @javax.persistence.Column(name = "DEPTNUMBER", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getDeptnumber() {
        return deptnumber;
    }

    public void setDeptnumber(String deptnumber) {
        this.deptnumber = deptnumber;
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

    private Integer postid;

    @Basic
    @javax.persistence.Column(name = "POSTID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    private String gsFact;

    @Basic
    @javax.persistence.Column(name = "GS_FACT", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getGsFact() {
        return gsFact;
    }

    public void setGsFact(String gsFact) {
        this.gsFact = gsFact;
    }

    private Long gsLevelid;

    @Basic
    @javax.persistence.Column(name = "GS_LEVELID", nullable = true, insertable = true, updatable = true, length = 38, precision = 0)
    public Long getGsLevelid() {
        return gsLevelid;
    }

    public void setGsLevelid(Long gsLevelid) {
        this.gsLevelid = gsLevelid;
    }

    private Timestamp happendate;

    @Basic
    @javax.persistence.Column(name = "HAPPENDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getHappendate() {
        return happendate;
    }

    public void setHappendate(Timestamp happendate) {
        this.happendate = happendate;
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

    private Long pointsPer;

    @Basic
    @javax.persistence.Column(name = "POINTS_PER", nullable = true, insertable = true, updatable = true, length = 38, precision = 0)
    public Long getPointsPer() {
        return pointsPer;
    }

    public void setPointsPer(Long pointsPer) {
        this.pointsPer = pointsPer;
    }

    private Long finePer;

    @Basic
    @javax.persistence.Column(name = "FINE_PER", nullable = true, insertable = true, updatable = true, length = 38, precision = 0)
    public Long getFinePer() {
        return finePer;
    }

    public void setFinePer(Long finePer) {
        this.finePer = finePer;
    }

    private Long pointsDept;

    @Basic
    @javax.persistence.Column(name = "POINTS_DEPT", nullable = true, insertable = true, updatable = true, length = 38, precision = 0)
    public Long getPointsDept() {
        return pointsDept;
    }

    public void setPointsDept(Long pointsDept) {
        this.pointsDept = pointsDept;
    }

    private Long fineDept;

    @Basic
    @javax.persistence.Column(name = "FINE_DEPT", nullable = true, insertable = true, updatable = true, length = 38, precision = 0)
    public Long getFineDept() {
        return fineDept;
    }

    public void setFineDept(Long fineDept) {
        this.fineDept = fineDept;
    }

    private String inpersonnumber;

    @Basic
    @javax.persistence.Column(name = "INPERSONNUMBER", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getInpersonnumber() {
        return inpersonnumber;
    }

    public void setInpersonnumber(String inpersonnumber) {
        this.inpersonnumber = inpersonnumber;
    }

    private String indeptnumber;

    @Basic
    @javax.persistence.Column(name = "INDEPTNUMBER", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getIndeptnumber() {
        return indeptnumber;
    }

    public void setIndeptnumber(String indeptnumber) {
        this.indeptnumber = indeptnumber;
    }

    private Timestamp indate;

    @Basic
    @javax.persistence.Column(name = "INDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getIndate() {
        return indate;
    }

    public void setIndate(Timestamp indate) {
        this.indate = indate;
    }

    private String reason;

    @Basic
    @javax.persistence.Column(name = "REASON", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    private Integer accidentTypeid;

    @Basic
    @javax.persistence.Column(name = "ACCIDENT_TYPEID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getAccidentTypeid() {
        return accidentTypeid;
    }

    public void setAccidentTypeid(Integer accidentTypeid) {
        this.accidentTypeid = accidentTypeid;
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

    private Integer injurysite;

    @Basic
    @javax.persistence.Column(name = "INJURYSITE", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getInjurysite() {
        return injurysite;
    }

    public void setInjurysite(Integer injurysite) {
        this.injurysite = injurysite;
    }

    private Long pointsBz;

    @Basic
    @javax.persistence.Column(name = "POINTS_BZ", nullable = true, insertable = true, updatable = true, length = 38, precision = 0)
    public Long getPointsBz() {
        return pointsBz;
    }

    public void setPointsBz(Long pointsBz) {
        this.pointsBz = pointsBz;
    }

    private String remarks;

    @Basic
    @javax.persistence.Column(name = "REMARKS", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Workinjury that = (Workinjury) o;

        if (id != that.id) return false;
        if (accidentTypeid != null ? !accidentTypeid.equals(that.accidentTypeid) : that.accidentTypeid != null)
            return false;
        if (banci != null ? !banci.equals(that.banci) : that.banci != null) return false;
        if (deptnumber != null ? !deptnumber.equals(that.deptnumber) : that.deptnumber != null) return false;
        if (fineDept != null ? !fineDept.equals(that.fineDept) : that.fineDept != null) return false;
        if (finePer != null ? !finePer.equals(that.finePer) : that.finePer != null) return false;
        if (gsFact != null ? !gsFact.equals(that.gsFact) : that.gsFact != null) return false;
        if (gsLevelid != null ? !gsLevelid.equals(that.gsLevelid) : that.gsLevelid != null) return false;
        if (happendate != null ? !happendate.equals(that.happendate) : that.happendate != null) return false;
        if (indate != null ? !indate.equals(that.indate) : that.indate != null) return false;
        if (indeptnumber != null ? !indeptnumber.equals(that.indeptnumber) : that.indeptnumber != null) return false;
        if (injurysite != null ? !injurysite.equals(that.injurysite) : that.injurysite != null) return false;
        if (inpersonnumber != null ? !inpersonnumber.equals(that.inpersonnumber) : that.inpersonnumber != null)
            return false;
        if (maindeptid != null ? !maindeptid.equals(that.maindeptid) : that.maindeptid != null) return false;
        if (personnumber != null ? !personnumber.equals(that.personnumber) : that.personnumber != null) return false;
        if (placeid != null ? !placeid.equals(that.placeid) : that.placeid != null) return false;
        if (pointsBz != null ? !pointsBz.equals(that.pointsBz) : that.pointsBz != null) return false;
        if (pointsDept != null ? !pointsDept.equals(that.pointsDept) : that.pointsDept != null) return false;
        if (pointsPer != null ? !pointsPer.equals(that.pointsPer) : that.pointsPer != null) return false;
        if (postid != null ? !postid.equals(that.postid) : that.postid != null) return false;
        if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (personnumber != null ? personnumber.hashCode() : 0);
        result = 31 * result + (deptnumber != null ? deptnumber.hashCode() : 0);
        result = 31 * result + (maindeptid != null ? maindeptid.hashCode() : 0);
        result = 31 * result + (postid != null ? postid.hashCode() : 0);
        result = 31 * result + (gsFact != null ? gsFact.hashCode() : 0);
        result = 31 * result + (gsLevelid != null ? gsLevelid.hashCode() : 0);
        result = 31 * result + (happendate != null ? happendate.hashCode() : 0);
        result = 31 * result + (placeid != null ? placeid.hashCode() : 0);
        result = 31 * result + (pointsPer != null ? pointsPer.hashCode() : 0);
        result = 31 * result + (finePer != null ? finePer.hashCode() : 0);
        result = 31 * result + (pointsDept != null ? pointsDept.hashCode() : 0);
        result = 31 * result + (fineDept != null ? fineDept.hashCode() : 0);
        result = 31 * result + (inpersonnumber != null ? inpersonnumber.hashCode() : 0);
        result = 31 * result + (indeptnumber != null ? indeptnumber.hashCode() : 0);
        result = 31 * result + (indate != null ? indate.hashCode() : 0);
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        result = 31 * result + (accidentTypeid != null ? accidentTypeid.hashCode() : 0);
        result = 31 * result + (banci != null ? banci.hashCode() : 0);
        result = 31 * result + (injurysite != null ? injurysite.hashCode() : 0);
        result = 31 * result + (pointsBz != null ? pointsBz.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        return result;
    }
}
