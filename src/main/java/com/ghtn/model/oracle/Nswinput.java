package com.ghtn.model.oracle;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 2014/4/11
 * Time: 9:39
 */
@Entity
public class Nswinput {
    private int swinputid;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nswinput")
    @SequenceGenerator(name = "nswinput", sequenceName = "SEQ_NSWINPUT", allocationSize = 1)
    @javax.persistence.Column(name = "SWINPUTID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getSwinputid() {
        return swinputid;
    }

    public void setSwinputid(int swinputid) {
        this.swinputid = swinputid;
    }

    private Integer swid;

    @Basic
    @javax.persistence.Column(name = "SWID", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getSwid() {
        return swid;
    }

    public void setSwid(Integer swid) {
        this.swid = swid;
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

    private String swpnumber;

    @Basic
    @javax.persistence.Column(name = "SWPNUMBER", nullable = true, insertable = true, updatable = true, length = 15)
    public String getSwpnumber() {
        return swpnumber;
    }

    public void setSwpnumber(String swpnumber) {
        this.swpnumber = swpnumber;
    }

    private String pcpnumber;

    @Basic
    @javax.persistence.Column(name = "PCPNUMBER", nullable = true, insertable = true, updatable = true, length = 15)
    public String getPcpnumber() {
        return pcpnumber;
    }

    public void setPcpnumber(String pcpnumber) {
        this.pcpnumber = pcpnumber;
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

    private Integer typeid;

    @Basic
    @javax.persistence.Column(name = "TYPEID", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
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

    private Integer zyid;

    @Basic
    @javax.persistence.Column(name = "ZYID", nullable = true, insertable = true, updatable = true, precision = 0)
    public Integer getZyid() {
        return zyid;
    }

    public void setZyid(Integer zyid) {
        this.zyid = zyid;
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

    private Timestamp pctime;

    @Basic
    @javax.persistence.Column(name = "PCTIME", nullable = true, insertable = true, updatable = true)
    public Timestamp getPctime() {
        return pctime;
    }

    public void setPctime(Timestamp pctime) {
        this.pctime = pctime;
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

    private BigInteger jctype;

    @Basic
    @javax.persistence.Column(name = "JCTYPE", nullable = true, insertable = true, updatable = true, precision = 0)
    public BigInteger getJctype() {
        return jctype;
    }

    public void setJctype(BigInteger jctype) {
        this.jctype = jctype;
    }

    private BigInteger islearn;

    @Basic
    @javax.persistence.Column(name = "ISLEARN", nullable = true, insertable = true, updatable = true, precision = 0)
    public BigInteger getIslearn() {
        return islearn;
    }

    public void setIslearn(BigInteger islearn) {
        this.islearn = islearn;
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

    private String inputpnumber;

    @Basic
    @javax.persistence.Column(name = "INPUTPNUMBER", nullable = true, insertable = true, updatable = true, length = 15)
    public String getInputpnumber() {
        return inputpnumber;
    }

    public void setInputpnumber(String inputpnumber) {
        this.inputpnumber = inputpnumber;
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

    private String maindeptid;

    @Basic
    @javax.persistence.Column(name = "MAINDEPTID", nullable = true, insertable = true, updatable = true, length = 100)
    public String getMaindeptid() {
        return maindeptid;
    }

    public void setMaindeptid(String maindeptid) {
        this.maindeptid = maindeptid;
    }

    private long lcmark;

    @Basic
    @javax.persistence.Column(name = "LCMARK", nullable = false, insertable = true, updatable = true, precision = 0)
    public long getLcmark() {
        return lcmark;
    }

    public void setLcmark(long lcmark) {
        this.lcmark = lcmark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nswinput nswinput = (Nswinput) o;

        if (lcmark != nswinput.lcmark) return false;
        if (swinputid != nswinput.swinputid) return false;
        if (banci != null ? !banci.equals(nswinput.banci) : nswinput.banci != null) return false;
        if (hNumber != null ? !hNumber.equals(nswinput.hNumber) : nswinput.hNumber != null) return false;
        if (inputpnumber != null ? !inputpnumber.equals(nswinput.inputpnumber) : nswinput.inputpnumber != null)
            return false;
        if (intime != null ? !intime.equals(nswinput.intime) : nswinput.intime != null) return false;
        if (islearn != null ? !islearn.equals(nswinput.islearn) : nswinput.islearn != null) return false;
        if (jctype != null ? !jctype.equals(nswinput.jctype) : nswinput.jctype != null) return false;
        if (levelid != null ? !levelid.equals(nswinput.levelid) : nswinput.levelid != null) return false;
        if (maindeptid != null ? !maindeptid.equals(nswinput.maindeptid) : nswinput.maindeptid != null) return false;
        if (pcpnumber != null ? !pcpnumber.equals(nswinput.pcpnumber) : nswinput.pcpnumber != null) return false;
        if (pctime != null ? !pctime.equals(nswinput.pctime) : nswinput.pctime != null) return false;
        if (placedetail != null ? !placedetail.equals(nswinput.placedetail) : nswinput.placedetail != null)
            return false;
        if (placeid != null ? !placeid.equals(nswinput.placeid) : nswinput.placeid != null) return false;
        if (remarks != null ? !remarks.equals(nswinput.remarks) : nswinput.remarks != null) return false;
        if (status != null ? !status.equals(nswinput.status) : nswinput.status != null) return false;
        if (swid != null ? !swid.equals(nswinput.swid) : nswinput.swid != null) return false;
        if (swpnumber != null ? !swpnumber.equals(nswinput.swpnumber) : nswinput.swpnumber != null) return false;
        if (typeid != null ? !typeid.equals(nswinput.typeid) : nswinput.typeid != null) return false;
        if (zyid != null ? !zyid.equals(nswinput.zyid) : nswinput.zyid != null) return false;

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
        result = 31 * result + (int) (lcmark ^ (lcmark >>> 32));
        return result;
    }
}
