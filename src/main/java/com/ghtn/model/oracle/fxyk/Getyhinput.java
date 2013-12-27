package com.ghtn.model.oracle.fxyk;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-27
 * Time: 上午10:21
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Getyhinput {
    private int yhputinid;

    @Id
    @javax.persistence.Column(name = "YHPUTINID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(int yhputinid) {
        this.yhputinid = yhputinid;
    }

    private String deptid;

    @Basic
    @javax.persistence.Column(name = "DEPTID", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    private Integer rjid;

    @Basic
    @javax.persistence.Column(name = "RJID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getRjid() {
        return rjid;
    }

    public void setRjid(Integer rjid) {
        this.rjid = rjid;
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

    private String placedetail;

    @Basic
    @javax.persistence.Column(name = "PLACEDETAIL", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getPlacedetail() {
        return placedetail;
    }

    public void setPlacedetail(String placedetail) {
        this.placedetail = placedetail;
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

    private Integer yhid;

    @Basic
    @javax.persistence.Column(name = "YHID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getYhid() {
        return yhid;
    }

    public void setYhid(Integer yhid) {
        this.yhid = yhid;
    }

    private Integer levelid;

    @Basic
    @javax.persistence.Column(name = "LEVELID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getLevelid() {
        return levelid;
    }

    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

    private Integer typeid;

    @Basic
    @javax.persistence.Column(name = "TYPEID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
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

    private String inputpersonid;

    @Basic
    @javax.persistence.Column(name = "INPUTPERSONID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getInputpersonid() {
        return inputpersonid;
    }

    public void setInputpersonid(String inputpersonid) {
        this.inputpersonid = inputpersonid;
    }

    private String maindeptid;

    @Basic
    @javax.persistence.Column(name = "MAINDEPTID", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindeptid() {
        return maindeptid;
    }

    public void setMaindeptid(String maindeptid) {
        this.maindeptid = maindeptid;
    }

    private Integer jctype;

    @Basic
    @javax.persistence.Column(name = "JCTYPE", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public Integer getJctype() {
        return jctype;
    }

    public void setJctype(Integer jctype) {
        this.jctype = jctype;
    }

    private BigDecimal lcmark;

    @Basic
    @javax.persistence.Column(name = "LCMARK", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getLcmark() {
        return lcmark;
    }

    public void setLcmark(BigDecimal lcmark) {
        this.lcmark = lcmark;
    }

    private Timestamp xqdate;

    @Basic
    @javax.persistence.Column(name = "XQDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getXqdate() {
        return xqdate;
    }

    public void setXqdate(Timestamp xqdate) {
        this.xqdate = xqdate;
    }

    private String xqbanci;

    @Basic
    @javax.persistence.Column(name = "XQBANCI", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getXqbanci() {
        return xqbanci;
    }

    public void setXqbanci(String xqbanci) {
        this.xqbanci = xqbanci;
    }

    private Timestamp lastxqtime;

    @Basic
    @javax.persistence.Column(name = "LASTXQTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getLastxqtime() {
        return lastxqtime;
    }

    public void setLastxqtime(Timestamp lastxqtime) {
        this.lastxqtime = lastxqtime;
    }

    private String leaderid;

    @Basic
    @javax.persistence.Column(name = "LEADERID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getLeaderid() {
        return leaderid;
    }

    public void setLeaderid(String leaderid) {
        this.leaderid = leaderid;
    }

    private String zrdeptname;

    @Basic
    @javax.persistence.Column(name = "ZRDEPTNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getZrdeptname() {
        return zrdeptname;
    }

    public void setZrdeptname(String zrdeptname) {
        this.zrdeptname = zrdeptname;
    }

    private String placename;

    @Basic
    @javax.persistence.Column(name = "PLACENAME", nullable = true, insertable = true, updatable = true, length = 150, precision = 0)
    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    private String yhcontent;

    @Basic
    @javax.persistence.Column(name = "YHCONTENT", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getYhcontent() {
        return yhcontent;
    }

    public void setYhcontent(String yhcontent) {
        this.yhcontent = yhcontent;
    }

    private String zrpername;

    @Basic
    @javax.persistence.Column(name = "ZRPERNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getZrpername() {
        return zrpername;
    }

    public void setZrpername(String zrpername) {
        this.zrpername = zrpername;
    }

    private String typename;

    @Basic
    @javax.persistence.Column(name = "TYPENAME", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    private String levelname;

    @Basic
    @javax.persistence.Column(name = "LEVELNAME", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getLevelname() {
        return levelname;
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname;
    }

    private String maindeptname;

    @Basic
    @javax.persistence.Column(name = "MAINDEPTNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getMaindeptname() {
        return maindeptname;
    }

    public void setMaindeptname(String maindeptname) {
        this.maindeptname = maindeptname;
    }

    private BigInteger yqcs;

    @Basic
    @javax.persistence.Column(name = "YQCS", nullable = true, insertable = true, updatable = true, length = 2, precision = 0)
    public BigInteger getYqcs() {
        return yqcs;
    }

    public void setYqcs(BigInteger yqcs) {
        this.yqcs = yqcs;
    }

    private BigInteger dxtx;

    @Basic
    @javax.persistence.Column(name = "DXTX", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getDxtx() {
        return dxtx;
    }

    public void setDxtx(BigInteger dxtx) {
        this.dxtx = dxtx;
    }

    private Integer yhzyid;

    @Basic
    @javax.persistence.Column(name = "YHZYID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getYhzyid() {
        return yhzyid;
    }

    public void setYhzyid(Integer yhzyid) {
        this.yhzyid = yhzyid;
    }

    private String yhzyname;

    @Basic
    @javax.persistence.Column(name = "YHZYNAME", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getYhzyname() {
        return yhzyname;
    }

    public void setYhzyname(String yhzyname) {
        this.yhzyname = yhzyname;
    }

    private BigDecimal isfine;

    @Basic
    @javax.persistence.Column(name = "ISFINE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getIsfine() {
        return isfine;
    }

    public void setIsfine(BigDecimal isfine) {
        this.isfine = isfine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Getyhinput that = (Getyhinput) o;

        if (yhputinid != that.yhputinid) return false;
        if (banci != null ? !banci.equals(that.banci) : that.banci != null) return false;
        if (deptid != null ? !deptid.equals(that.deptid) : that.deptid != null) return false;
        if (dxtx != null ? !dxtx.equals(that.dxtx) : that.dxtx != null) return false;
        if (hNumber != null ? !hNumber.equals(that.hNumber) : that.hNumber != null) return false;
        if (inputpersonid != null ? !inputpersonid.equals(that.inputpersonid) : that.inputpersonid != null)
            return false;
        if (intime != null ? !intime.equals(that.intime) : that.intime != null) return false;
        if (isfine != null ? !isfine.equals(that.isfine) : that.isfine != null) return false;
        if (jctype != null ? !jctype.equals(that.jctype) : that.jctype != null) return false;
        if (lastxqtime != null ? !lastxqtime.equals(that.lastxqtime) : that.lastxqtime != null) return false;
        if (lcmark != null ? !lcmark.equals(that.lcmark) : that.lcmark != null) return false;
        if (leaderid != null ? !leaderid.equals(that.leaderid) : that.leaderid != null) return false;
        if (levelid != null ? !levelid.equals(that.levelid) : that.levelid != null) return false;
        if (levelname != null ? !levelname.equals(that.levelname) : that.levelname != null) return false;
        if (maindeptid != null ? !maindeptid.equals(that.maindeptid) : that.maindeptid != null) return false;
        if (maindeptname != null ? !maindeptname.equals(that.maindeptname) : that.maindeptname != null) return false;
        if (pctime != null ? !pctime.equals(that.pctime) : that.pctime != null) return false;
        if (personid != null ? !personid.equals(that.personid) : that.personid != null) return false;
        if (placedetail != null ? !placedetail.equals(that.placedetail) : that.placedetail != null) return false;
        if (placeid != null ? !placeid.equals(that.placeid) : that.placeid != null) return false;
        if (placename != null ? !placename.equals(that.placename) : that.placename != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
        if (rjid != null ? !rjid.equals(that.rjid) : that.rjid != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (typeid != null ? !typeid.equals(that.typeid) : that.typeid != null) return false;
        if (typename != null ? !typename.equals(that.typename) : that.typename != null) return false;
        if (xqbanci != null ? !xqbanci.equals(that.xqbanci) : that.xqbanci != null) return false;
        if (xqdate != null ? !xqdate.equals(that.xqdate) : that.xqdate != null) return false;
        if (yhcontent != null ? !yhcontent.equals(that.yhcontent) : that.yhcontent != null) return false;
        if (yhid != null ? !yhid.equals(that.yhid) : that.yhid != null) return false;
        if (yhzyid != null ? !yhzyid.equals(that.yhzyid) : that.yhzyid != null) return false;
        if (yhzyname != null ? !yhzyname.equals(that.yhzyname) : that.yhzyname != null) return false;
        if (yqcs != null ? !yqcs.equals(that.yqcs) : that.yqcs != null) return false;
        if (zrdeptname != null ? !zrdeptname.equals(that.zrdeptname) : that.zrdeptname != null) return false;
        if (zrpername != null ? !zrpername.equals(that.zrpername) : that.zrpername != null) return false;

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
        result = 31 * result + (jctype != null ? jctype.hashCode() : 0);
        result = 31 * result + (lcmark != null ? lcmark.hashCode() : 0);
        result = 31 * result + (xqdate != null ? xqdate.hashCode() : 0);
        result = 31 * result + (xqbanci != null ? xqbanci.hashCode() : 0);
        result = 31 * result + (lastxqtime != null ? lastxqtime.hashCode() : 0);
        result = 31 * result + (leaderid != null ? leaderid.hashCode() : 0);
        result = 31 * result + (zrdeptname != null ? zrdeptname.hashCode() : 0);
        result = 31 * result + (placename != null ? placename.hashCode() : 0);
        result = 31 * result + (yhcontent != null ? yhcontent.hashCode() : 0);
        result = 31 * result + (zrpername != null ? zrpername.hashCode() : 0);
        result = 31 * result + (typename != null ? typename.hashCode() : 0);
        result = 31 * result + (levelname != null ? levelname.hashCode() : 0);
        result = 31 * result + (maindeptname != null ? maindeptname.hashCode() : 0);
        result = 31 * result + (yqcs != null ? yqcs.hashCode() : 0);
        result = 31 * result + (dxtx != null ? dxtx.hashCode() : 0);
        result = 31 * result + (yhzyid != null ? yhzyid.hashCode() : 0);
        result = 31 * result + (yhzyname != null ? yhzyname.hashCode() : 0);
        result = 31 * result + (isfine != null ? isfine.hashCode() : 0);
        return result;
    }
}
