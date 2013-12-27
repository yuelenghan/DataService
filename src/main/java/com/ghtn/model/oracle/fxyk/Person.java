package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-27
 * Time: 下午4:36
 */
@Entity
public class Person {
    private int personid;

    @Id
    @javax.persistence.Column(name = "PERSONID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
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

    private String name;

    @Basic
    @javax.persistence.Column(name = "NAME", nullable = true, insertable = true, updatable = true, length = 30, precision = 0)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String sex;

    @Basic
    @javax.persistence.Column(name = "SEX", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private String tel;

    @Basic
    @javax.persistence.Column(name = "TEL", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    private String othertel;

    @Basic
    @javax.persistence.Column(name = "OTHERTEL", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getOthertel() {
        return othertel;
    }

    public void setOthertel(String othertel) {
        this.othertel = othertel;
    }

    private Integer posid;

    @Basic
    @javax.persistence.Column(name = "POSID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getPosid() {
        return posid;
    }

    public void setPosid(Integer posid) {
        this.posid = posid;
    }

    private Integer postid;

    @Basic
    @javax.persistence.Column(name = "POSTID", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
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

    private String areadeptid;

    @Basic
    @javax.persistence.Column(name = "AREADEPTID", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getAreadeptid() {
        return areadeptid;
    }

    public void setAreadeptid(String areadeptid) {
        this.areadeptid = areadeptid;
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

    private String usingdept;

    @Basic
    @javax.persistence.Column(name = "USINGDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getUsingdept() {
        return usingdept;
    }

    public void setUsingdept(String usingdept) {
        this.usingdept = usingdept;
    }

    private String pinyin;

    @Basic
    @javax.persistence.Column(name = "PINYIN", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    private BigInteger pertype;

    @Basic
    @javax.persistence.Column(name = "PERTYPE", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getPertype() {
        return pertype;
    }

    public void setPertype(BigInteger pertype) {
        this.pertype = pertype;
    }

    private BigInteger personstatus;

    @Basic
    @javax.persistence.Column(name = "PERSONSTATUS", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getPersonstatus() {
        return personstatus;
    }

    public void setPersonstatus(BigInteger personstatus) {
        this.personstatus = personstatus;
    }

    private Integer plevel;

    @Basic
    @javax.persistence.Column(name = "PLEVEL", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getPlevel() {
        return plevel;
    }

    public void setPlevel(Integer plevel) {
        this.plevel = plevel;
    }

    private Timestamp sr;

    @Basic
    @javax.persistence.Column(name = "SR", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getSr() {
        return sr;
    }

    public void setSr(Timestamp sr) {
        this.sr = sr;
    }

    private Integer gl;

    @Basic
    @javax.persistence.Column(name = "GL", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public Integer getGl() {
        return gl;
    }

    public void setGl(Integer gl) {
        this.gl = gl;
    }

    private String whcd;

    @Basic
    @javax.persistence.Column(name = "WHCD", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public String getWhcd() {
        return whcd;
    }

    public void setWhcd(String whcd) {
        this.whcd = whcd;
    }

    private String zwjb;

    @Basic
    @javax.persistence.Column(name = "ZWJB", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getZwjb() {
        return zwjb;
    }

    public void setZwjb(String zwjb) {
        this.zwjb = zwjb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (personid != person.personid) return false;
        if (areadeptid != null ? !areadeptid.equals(person.areadeptid) : person.areadeptid != null) return false;
        if (deptid != null ? !deptid.equals(person.deptid) : person.deptid != null) return false;
        if (gl != null ? !gl.equals(person.gl) : person.gl != null) return false;
        if (maindeptid != null ? !maindeptid.equals(person.maindeptid) : person.maindeptid != null) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (othertel != null ? !othertel.equals(person.othertel) : person.othertel != null) return false;
        if (personnumber != null ? !personnumber.equals(person.personnumber) : person.personnumber != null)
            return false;
        if (personstatus != null ? !personstatus.equals(person.personstatus) : person.personstatus != null)
            return false;
        if (pertype != null ? !pertype.equals(person.pertype) : person.pertype != null) return false;
        if (pinyin != null ? !pinyin.equals(person.pinyin) : person.pinyin != null) return false;
        if (plevel != null ? !plevel.equals(person.plevel) : person.plevel != null) return false;
        if (posid != null ? !posid.equals(person.posid) : person.posid != null) return false;
        if (postid != null ? !postid.equals(person.postid) : person.postid != null) return false;
        if (sex != null ? !sex.equals(person.sex) : person.sex != null) return false;
        if (sr != null ? !sr.equals(person.sr) : person.sr != null) return false;
        if (tel != null ? !tel.equals(person.tel) : person.tel != null) return false;
        if (usingdept != null ? !usingdept.equals(person.usingdept) : person.usingdept != null) return false;
        if (whcd != null ? !whcd.equals(person.whcd) : person.whcd != null) return false;
        if (zwjb != null ? !zwjb.equals(person.zwjb) : person.zwjb != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personid;
        result = 31 * result + (personnumber != null ? personnumber.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (othertel != null ? othertel.hashCode() : 0);
        result = 31 * result + (posid != null ? posid.hashCode() : 0);
        result = 31 * result + (postid != null ? postid.hashCode() : 0);
        result = 31 * result + (deptid != null ? deptid.hashCode() : 0);
        result = 31 * result + (areadeptid != null ? areadeptid.hashCode() : 0);
        result = 31 * result + (maindeptid != null ? maindeptid.hashCode() : 0);
        result = 31 * result + (usingdept != null ? usingdept.hashCode() : 0);
        result = 31 * result + (pinyin != null ? pinyin.hashCode() : 0);
        result = 31 * result + (pertype != null ? pertype.hashCode() : 0);
        result = 31 * result + (personstatus != null ? personstatus.hashCode() : 0);
        result = 31 * result + (plevel != null ? plevel.hashCode() : 0);
        result = 31 * result + (sr != null ? sr.hashCode() : 0);
        result = 31 * result + (gl != null ? gl.hashCode() : 0);
        result = 31 * result + (whcd != null ? whcd.hashCode() : 0);
        result = 31 * result + (zwjb != null ? zwjb.hashCode() : 0);
        return result;
    }
}
