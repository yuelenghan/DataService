package com.ghtn.model.oracle;

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
 * Time: 下午12:02
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Getswinput {
    private int swinputid;

    @Id
    @javax.persistence.Column(name = "SWINPUTID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getSwinputid() {
        return swinputid;
    }

    public void setSwinputid(int swinputid) {
        this.swinputid = swinputid;
    }

    private Integer swid;

    @Basic
    @javax.persistence.Column(name = "SWID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getSwid() {
        return swid;
    }

    public void setSwid(Integer swid) {
        this.swid = swid;
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

    private String swpnumber;

    @Basic
    @javax.persistence.Column(name = "SWPNUMBER", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getSwpnumber() {
        return swpnumber;
    }

    public void setSwpnumber(String swpnumber) {
        this.swpnumber = swpnumber;
    }

    private String pcpnumber;

    @Basic
    @javax.persistence.Column(name = "PCPNUMBER", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPcpnumber() {
        return pcpnumber;
    }

    public void setPcpnumber(String pcpnumber) {
        this.pcpnumber = pcpnumber;
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

    private Integer typeid;

    @Basic
    @javax.persistence.Column(name = "TYPEID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
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

    private Integer zyid;

    @Basic
    @javax.persistence.Column(name = "ZYID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getZyid() {
        return zyid;
    }

    public void setZyid(Integer zyid) {
        this.zyid = zyid;
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

    private Timestamp pctime;

    @Basic
    @javax.persistence.Column(name = "PCTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getPctime() {
        return pctime;
    }

    public void setPctime(Timestamp pctime) {
        this.pctime = pctime;
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

    private BigInteger jctype;

    @Basic
    @javax.persistence.Column(name = "JCTYPE", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getJctype() {
        return jctype;
    }

    public void setJctype(BigInteger jctype) {
        this.jctype = jctype;
    }

    private BigInteger islearn;

    @Basic
    @javax.persistence.Column(name = "ISLEARN", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getIslearn() {
        return islearn;
    }

    public void setIslearn(BigInteger islearn) {
        this.islearn = islearn;
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

    private String inputpnumber;

    @Basic
    @javax.persistence.Column(name = "INPUTPNUMBER", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getInputpnumber() {
        return inputpnumber;
    }

    public void setInputpnumber(String inputpnumber) {
        this.inputpnumber = inputpnumber;
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

    private String maindeptid;

    @Basic
    @javax.persistence.Column(name = "MAINDEPTID", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindeptid() {
        return maindeptid;
    }

    public void setMaindeptid(String maindeptid) {
        this.maindeptid = maindeptid;
    }

    private BigDecimal lcmark;

    @Basic
    @javax.persistence.Column(name = "LCMARK", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getLcmark() {
        return lcmark;
    }

    public void setLcmark(BigDecimal lcmark) {
        this.lcmark = lcmark;
    }

    private String swpname;

    @Basic
    @javax.persistence.Column(name = "SWPNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getSwpname() {
        return swpname;
    }

    public void setSwpname(String swpname) {
        this.swpname = swpname;
    }

    private String pcpname;

    @Basic
    @javax.persistence.Column(name = "PCPNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getPcpname() {
        return pcpname;
    }

    public void setPcpname(String pcpname) {
        this.pcpname = pcpname;
    }

    private String inputpername;

    @Basic
    @javax.persistence.Column(name = "INPUTPERNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getInputpername() {
        return inputpername;
    }

    public void setInputpername(String inputpername) {
        this.inputpername = inputpername;
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

    private String swcontent;

    @Basic
    @javax.persistence.Column(name = "SWCONTENT", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getSwcontent() {
        return swcontent;
    }

    public void setSwcontent(String swcontent) {
        this.swcontent = swcontent;
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

    private String zrkqid;

    @Basic
    @javax.persistence.Column(name = "ZRKQID", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getZrkqid() {
        return zrkqid;
    }

    public void setZrkqid(String zrkqid) {
        this.zrkqid = zrkqid;
    }

    private String zrkqname;

    @Basic
    @javax.persistence.Column(name = "ZRKQNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getZrkqname() {
        return zrkqname;
    }

    public void setZrkqname(String zrkqname) {
        this.zrkqname = zrkqname;
    }

    private String zyname;

    @Basic
    @javax.persistence.Column(name = "ZYNAME", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getZyname() {
        return zyname;
    }

    public void setZyname(String zyname) {
        this.zyname = zyname;
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

    private String pcpnameNow;

    @Basic
    @javax.persistence.Column(name = "PCPNAME_NOW", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getPcpnameNow() {
        return pcpnameNow;
    }

    public void setPcpnameNow(String pcpnameNow) {
        this.pcpnameNow = pcpnameNow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Getswinput that = (Getswinput) o;

        if (swinputid != that.swinputid) return false;
        if (banci != null ? !banci.equals(that.banci) : that.banci != null) return false;
        if (hNumber != null ? !hNumber.equals(that.hNumber) : that.hNumber != null) return false;
        if (inputpername != null ? !inputpername.equals(that.inputpername) : that.inputpername != null) return false;
        if (inputpnumber != null ? !inputpnumber.equals(that.inputpnumber) : that.inputpnumber != null) return false;
        if (intime != null ? !intime.equals(that.intime) : that.intime != null) return false;
        if (isfine != null ? !isfine.equals(that.isfine) : that.isfine != null) return false;
        if (islearn != null ? !islearn.equals(that.islearn) : that.islearn != null) return false;
        if (jctype != null ? !jctype.equals(that.jctype) : that.jctype != null) return false;
        if (lcmark != null ? !lcmark.equals(that.lcmark) : that.lcmark != null) return false;
        if (levelid != null ? !levelid.equals(that.levelid) : that.levelid != null) return false;
        if (levelname != null ? !levelname.equals(that.levelname) : that.levelname != null) return false;
        if (maindeptid != null ? !maindeptid.equals(that.maindeptid) : that.maindeptid != null) return false;
        if (maindeptname != null ? !maindeptname.equals(that.maindeptname) : that.maindeptname != null) return false;
        if (pcpname != null ? !pcpname.equals(that.pcpname) : that.pcpname != null) return false;
        if (pcpnameNow != null ? !pcpnameNow.equals(that.pcpnameNow) : that.pcpnameNow != null) return false;
        if (pcpnumber != null ? !pcpnumber.equals(that.pcpnumber) : that.pcpnumber != null) return false;
        if (pctime != null ? !pctime.equals(that.pctime) : that.pctime != null) return false;
        if (placedetail != null ? !placedetail.equals(that.placedetail) : that.placedetail != null) return false;
        if (placeid != null ? !placeid.equals(that.placeid) : that.placeid != null) return false;
        if (placename != null ? !placename.equals(that.placename) : that.placename != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (swcontent != null ? !swcontent.equals(that.swcontent) : that.swcontent != null) return false;
        if (swid != null ? !swid.equals(that.swid) : that.swid != null) return false;
        if (swpname != null ? !swpname.equals(that.swpname) : that.swpname != null) return false;
        if (swpnumber != null ? !swpnumber.equals(that.swpnumber) : that.swpnumber != null) return false;
        if (typeid != null ? !typeid.equals(that.typeid) : that.typeid != null) return false;
        if (typename != null ? !typename.equals(that.typename) : that.typename != null) return false;
        if (zrkqid != null ? !zrkqid.equals(that.zrkqid) : that.zrkqid != null) return false;
        if (zrkqname != null ? !zrkqname.equals(that.zrkqname) : that.zrkqname != null) return false;
        if (zyid != null ? !zyid.equals(that.zyid) : that.zyid != null) return false;
        if (zyname != null ? !zyname.equals(that.zyname) : that.zyname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = swinputid;
        result = 31 * result + (swid != null ? swid.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (swpnumber != null ? swpnumber.hashCode() : 0);
        result = 31 * result + (pcpnumber != null ? pcpnumber.hashCode() : 0);
        result = 31 * result + (placeid != null ? placeid.hashCode() : 0);
        result = 31 * result + (placedetail != null ? placedetail.hashCode() : 0);
        result = 31 * result + (typeid != null ? typeid.hashCode() : 0);
        result = 31 * result + (levelid != null ? levelid.hashCode() : 0);
        result = 31 * result + (zyid != null ? zyid.hashCode() : 0);
        result = 31 * result + (hNumber != null ? hNumber.hashCode() : 0);
        result = 31 * result + (pctime != null ? pctime.hashCode() : 0);
        result = 31 * result + (banci != null ? banci.hashCode() : 0);
        result = 31 * result + (jctype != null ? jctype.hashCode() : 0);
        result = 31 * result + (islearn != null ? islearn.hashCode() : 0);
        result = 31 * result + (intime != null ? intime.hashCode() : 0);
        result = 31 * result + (inputpnumber != null ? inputpnumber.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (maindeptid != null ? maindeptid.hashCode() : 0);
        result = 31 * result + (lcmark != null ? lcmark.hashCode() : 0);
        result = 31 * result + (swpname != null ? swpname.hashCode() : 0);
        result = 31 * result + (pcpname != null ? pcpname.hashCode() : 0);
        result = 31 * result + (inputpername != null ? inputpername.hashCode() : 0);
        result = 31 * result + (placename != null ? placename.hashCode() : 0);
        result = 31 * result + (swcontent != null ? swcontent.hashCode() : 0);
        result = 31 * result + (typename != null ? typename.hashCode() : 0);
        result = 31 * result + (levelname != null ? levelname.hashCode() : 0);
        result = 31 * result + (maindeptname != null ? maindeptname.hashCode() : 0);
        result = 31 * result + (zrkqid != null ? zrkqid.hashCode() : 0);
        result = 31 * result + (zrkqname != null ? zrkqname.hashCode() : 0);
        result = 31 * result + (zyname != null ? zyname.hashCode() : 0);
        result = 31 * result + (isfine != null ? isfine.hashCode() : 0);
        result = 31 * result + (pcpnameNow != null ? pcpnameNow.hashCode() : 0);
        return result;
    }
}
