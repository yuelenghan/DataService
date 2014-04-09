package com.ghtn.model.oracle;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 2014/4/3
 * Time: 16:38
 */
@Entity
public class Nyhinput {
    private int yhputinid;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nyhinput")
    @SequenceGenerator(name = "nyhinput", sequenceName = "SEQ_NYHINPUT", allocationSize = 1)
    @javax.persistence.Column(name = "YHPUTINID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(int yhputinid) {
        this.yhputinid = yhputinid;
    }

    private String deptid;

    @Basic
    @javax.persistence.Column(name = "DEPTID", nullable = true, insertable = true, updatable = true, length = 100)
    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    private Integer rjid;

    @Basic
    @javax.persistence.Column(name = "RJID", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getRjid() {
        return rjid;
    }

    public void setRjid(Integer rjid) {
        this.rjid = rjid;
    }

    private Integer placeid;

    @Basic
    @javax.persistence.Column(name = "PLACEID", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getPlaceid() {
        return placeid;
    }

    public void setPlaceid(Integer placeid) {
        this.placeid = placeid;
    }

    private String placedetail;

    @Basic
    @javax.persistence.Column(name = "PLACEDETAIL", nullable = true, insertable = true, updatable = true, length = 100)
    public String getPlacedetail() {
        return placedetail;
    }

    public void setPlacedetail(String placedetail) {
        this.placedetail = placedetail;
    }

    private String banci;

    @Basic
    @javax.persistence.Column(name = "BANCI", nullable = true, insertable = true, updatable = true, length = 10)
    public String getBanci() {
        return banci;
    }

    public void setBanci(String banci) {
        this.banci = banci;
    }

    private String personid;

    @Basic
    @javax.persistence.Column(name = "PERSONID", nullable = true, insertable = true, updatable = true, length = 15)
    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    private Timestamp pctime;

    @Basic
    @javax.persistence.Column(name = "PCTIME", nullable = true, insertable = true, updatable = true)
    public Timestamp getPctime() {
        return pctime;
    }

    public void setPctime(Timestamp pctime) {
        this.pctime = pctime;
    }

    private Timestamp intime;

    @Basic
    @javax.persistence.Column(name = "INTIME", nullable = true, insertable = true, updatable = true)
    public Timestamp getIntime() {
        return intime;
    }

    public void setIntime(Timestamp intime) {
        this.intime = intime;
    }

    private Integer yhid;

    @Basic
    @javax.persistence.Column(name = "YHID", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getYhid() {
        return yhid;
    }

    public void setYhid(Integer yhid) {
        this.yhid = yhid;
    }

    private Integer levelid;

    @Basic
    @javax.persistence.Column(name = "LEVELID", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getLevelid() {
        return levelid;
    }

    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

    private Integer typeid;

    @Basic
    @javax.persistence.Column(name = "TYPEID", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    private String hNumber;

    @Basic
    @javax.persistence.Column(name = "H_NUMBER", nullable = true, insertable = true, updatable = true, length = 100)
    public String gethNumber() {
        return hNumber;
    }

    public void sethNumber(String hNumber) {
        this.hNumber = hNumber;
    }

    private String remarks;

    @Basic
    @javax.persistence.Column(name = "REMARKS", nullable = true, insertable = true, updatable = true, length = 2000)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    private String status;

    @Basic
    @javax.persistence.Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 20)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String inputpersonid;

    @Basic
    @javax.persistence.Column(name = "INPUTPERSONID", nullable = true, insertable = true, updatable = true, length = 15)
    public String getInputpersonid() {
        return inputpersonid;
    }

    public void setInputpersonid(String inputpersonid) {
        this.inputpersonid = inputpersonid;
    }

    private String maindeptid;

    @Basic
    @javax.persistence.Column(name = "MAINDEPTID", nullable = true, insertable = true, updatable = true, length = 100)
    public String getMaindeptid() {
        return maindeptid;
    }

    public void setMaindeptid(String maindeptid) {
        this.maindeptid = maindeptid;
    }

    private Long lcmark;

    @Basic
    @javax.persistence.Column(name = "LCMARK", nullable = true, insertable = true, updatable = true, precision = 0)
    public Long getLcmark() {
        return lcmark;
    }

    public void setLcmark(Long lcmark) {
        this.lcmark = lcmark;
    }

    private Timestamp xqdate;

    @Basic
    @javax.persistence.Column(name = "XQDATE", nullable = true, insertable = true, updatable = true)
    public Timestamp getXqdate() {
        return xqdate;
    }

    public void setXqdate(Timestamp xqdate) {
        this.xqdate = xqdate;
    }

    private String xqbanci;

    @Basic
    @javax.persistence.Column(name = "XQBANCI", nullable = true, insertable = true, updatable = true, length = 10)
    public String getXqbanci() {
        return xqbanci;
    }

    public void setXqbanci(String xqbanci) {
        this.xqbanci = xqbanci;
    }

    private String leaderid;

    @Basic
    @javax.persistence.Column(name = "LEADERID", nullable = true, insertable = true, updatable = true, length = 15)
    public String getLeaderid() {
        return leaderid;
    }

    public void setLeaderid(String leaderid) {
        this.leaderid = leaderid;
    }

    private BigInteger yqcs;

    @Basic
    @javax.persistence.Column(name = "YQCS", nullable = true, insertable = true, updatable = true, precision = 0)
    public BigInteger getYqcs() {
        return yqcs;
    }

    public void setYqcs(BigInteger yqcs) {
        this.yqcs = yqcs;
    }

    private BigInteger dxtx;

    @Basic
    @javax.persistence.Column(name = "DXTX", nullable = true, insertable = true, updatable = true, precision = 0)
    public BigInteger getDxtx() {
        return dxtx;
    }

    public void setDxtx(BigInteger dxtx) {
        this.dxtx = dxtx;
    }

    private Integer yhzyid;

    @Basic
    @javax.persistence.Column(name = "YHZYID", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getYhzyid() {
        return yhzyid;
    }

    public void setYhzyid(Integer yhzyid) {
        this.yhzyid = yhzyid;
    }

    private Timestamp lastxqtime;

    @Basic
    @javax.persistence.Column(name = "LASTXQTIME", nullable = true, insertable = true, updatable = true)
    public Timestamp getLastxqtime() {
        return lastxqtime;
    }

    public void setLastxqtime(Timestamp lastxqtime) {
        this.lastxqtime = lastxqtime;
    }

    private Integer jctype;

    @Basic
    @javax.persistence.Column(name = "JCTYPE", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getJctype() {
        return jctype;
    }

    public void setJctype(Integer jctype) {
        this.jctype = jctype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nyhinput nyhinput = (Nyhinput) o;

        if (yhputinid != nyhinput.yhputinid) return false;
        if (banci != null ? !banci.equals(nyhinput.banci) : nyhinput.banci != null) return false;
        if (deptid != null ? !deptid.equals(nyhinput.deptid) : nyhinput.deptid != null) return false;
        if (dxtx != null ? !dxtx.equals(nyhinput.dxtx) : nyhinput.dxtx != null) return false;
        if (hNumber != null ? !hNumber.equals(nyhinput.hNumber) : nyhinput.hNumber != null) return false;
        if (inputpersonid != null ? !inputpersonid.equals(nyhinput.inputpersonid) : nyhinput.inputpersonid != null)
            return false;
        if (intime != null ? !intime.equals(nyhinput.intime) : nyhinput.intime != null) return false;
        if (jctype != null ? !jctype.equals(nyhinput.jctype) : nyhinput.jctype != null) return false;
        if (lastxqtime != null ? !lastxqtime.equals(nyhinput.lastxqtime) : nyhinput.lastxqtime != null) return false;
        if (lcmark != null ? !lcmark.equals(nyhinput.lcmark) : nyhinput.lcmark != null) return false;
        if (leaderid != null ? !leaderid.equals(nyhinput.leaderid) : nyhinput.leaderid != null) return false;
        if (levelid != null ? !levelid.equals(nyhinput.levelid) : nyhinput.levelid != null) return false;
        if (maindeptid != null ? !maindeptid.equals(nyhinput.maindeptid) : nyhinput.maindeptid != null) return false;
        if (pctime != null ? !pctime.equals(nyhinput.pctime) : nyhinput.pctime != null) return false;
        if (personid != null ? !personid.equals(nyhinput.personid) : nyhinput.personid != null) return false;
        if (placedetail != null ? !placedetail.equals(nyhinput.placedetail) : nyhinput.placedetail != null)
            return false;
        if (placeid != null ? !placeid.equals(nyhinput.placeid) : nyhinput.placeid != null) return false;
        if (remarks != null ? !remarks.equals(nyhinput.remarks) : nyhinput.remarks != null) return false;
        if (rjid != null ? !rjid.equals(nyhinput.rjid) : nyhinput.rjid != null) return false;
        if (status != null ? !status.equals(nyhinput.status) : nyhinput.status != null) return false;
        if (typeid != null ? !typeid.equals(nyhinput.typeid) : nyhinput.typeid != null) return false;
        if (xqbanci != null ? !xqbanci.equals(nyhinput.xqbanci) : nyhinput.xqbanci != null) return false;
        if (xqdate != null ? !xqdate.equals(nyhinput.xqdate) : nyhinput.xqdate != null) return false;
        if (yhid != null ? !yhid.equals(nyhinput.yhid) : nyhinput.yhid != null) return false;
        if (yhzyid != null ? !yhzyid.equals(nyhinput.yhzyid) : nyhinput.yhzyid != null) return false;
        if (yqcs != null ? !yqcs.equals(nyhinput.yqcs) : nyhinput.yqcs != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhputinid;
        result = 31 * result + (deptid != null ? deptid.hashCode() : 0);
        result = 31 * result + (rjid != null ? rjid.hashCode() : 0);
        result = 31 * result + (placeid != null ? placeid.hashCode() : 0);
        result = 31 * result + (placedetail != null ? placedetail.hashCode() : 0);
        result = 31 * result + (banci != null ? banci.hashCode() : 0);
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        result = 31 * result + (pctime != null ? pctime.hashCode() : 0);
        result = 31 * result + (intime != null ? intime.hashCode() : 0);
        result = 31 * result + (yhid != null ? yhid.hashCode() : 0);
        result = 31 * result + (levelid != null ? levelid.hashCode() : 0);
        result = 31 * result + (typeid != null ? typeid.hashCode() : 0);
        result = 31 * result + (hNumber != null ? hNumber.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (inputpersonid != null ? inputpersonid.hashCode() : 0);
        result = 31 * result + (maindeptid != null ? maindeptid.hashCode() : 0);
        result = 31 * result + (lcmark != null ? lcmark.hashCode() : 0);
        result = 31 * result + (xqdate != null ? xqdate.hashCode() : 0);
        result = 31 * result + (xqbanci != null ? xqbanci.hashCode() : 0);
        result = 31 * result + (leaderid != null ? leaderid.hashCode() : 0);
        result = 31 * result + (yqcs != null ? yqcs.hashCode() : 0);
        result = 31 * result + (dxtx != null ? dxtx.hashCode() : 0);
        result = 31 * result + (yhzyid != null ? yhzyid.hashCode() : 0);
        result = 31 * result + (lastxqtime != null ? lastxqtime.hashCode() : 0);
        result = 31 * result + (jctype != null ? jctype.hashCode() : 0);
        return result;
    }
}
