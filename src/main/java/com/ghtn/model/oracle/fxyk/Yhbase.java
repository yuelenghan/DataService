package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
public class Yhbase {
    private int yhid;
    private String yhnumber;
    private String yhcontent;
    private Integer levelid;
    private Integer typeid;
    private String conpyfirst;
    private Timestamp intime;
    private BigDecimal nstatus;
    private Integer sglxid;
    private String submitdept;
    private String pyall;

    @Id
    @Column(name = "YHID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getYhid() {
        return yhid;
    }

    public void setYhid(int yhid) {
        this.yhid = yhid;
    }

    @Basic
    @Column(name = "YHNUMBER", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getYhnumber() {
        return yhnumber;
    }

    public void setYhnumber(String yhnumber) {
        this.yhnumber = yhnumber;
    }

    @Basic
    @Column(name = "YHCONTENT", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getYhcontent() {
        return yhcontent;
    }

    public void setYhcontent(String yhcontent) {
        this.yhcontent = yhcontent;
    }

    @Basic
    @Column(name = "LEVELID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getLevelid() {
        return levelid;
    }

    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

    @Basic
    @Column(name = "TYPEID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    @Basic
    @Column(name = "CONPYFIRST", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getConpyfirst() {
        return conpyfirst;
    }

    public void setConpyfirst(String conpyfirst) {
        this.conpyfirst = conpyfirst;
    }

    @Basic
    @Column(name = "INTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getIntime() {
        return intime;
    }

    public void setIntime(Timestamp intime) {
        this.intime = intime;
    }

    @Basic
    @Column(name = "NSTATUS", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getNstatus() {
        return nstatus;
    }

    public void setNstatus(BigDecimal nstatus) {
        this.nstatus = nstatus;
    }

    @Basic
    @Column(name = "SGLXID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getSglxid() {
        return sglxid;
    }

    public void setSglxid(Integer sglxid) {
        this.sglxid = sglxid;
    }

    @Basic
    @Column(name = "SUBMITDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getSubmitdept() {
        return submitdept;
    }

    public void setSubmitdept(String submitdept) {
        this.submitdept = submitdept;
    }

    @Basic
    @Column(name = "PYALL", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getPyall() {
        return pyall;
    }

    public void setPyall(String pyall) {
        this.pyall = pyall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Yhbase yhbase = (Yhbase) o;

        if (yhid != yhbase.yhid) return false;
        if (conpyfirst != null ? !conpyfirst.equals(yhbase.conpyfirst) : yhbase.conpyfirst != null) return false;
        if (intime != null ? !intime.equals(yhbase.intime) : yhbase.intime != null) return false;
        if (levelid != null ? !levelid.equals(yhbase.levelid) : yhbase.levelid != null) return false;
        if (nstatus != null ? !nstatus.equals(yhbase.nstatus) : yhbase.nstatus != null) return false;
        if (pyall != null ? !pyall.equals(yhbase.pyall) : yhbase.pyall != null) return false;
        if (sglxid != null ? !sglxid.equals(yhbase.sglxid) : yhbase.sglxid != null) return false;
        if (submitdept != null ? !submitdept.equals(yhbase.submitdept) : yhbase.submitdept != null) return false;
        if (typeid != null ? !typeid.equals(yhbase.typeid) : yhbase.typeid != null) return false;
        if (yhcontent != null ? !yhcontent.equals(yhbase.yhcontent) : yhbase.yhcontent != null) return false;
        if (yhnumber != null ? !yhnumber.equals(yhbase.yhnumber) : yhbase.yhnumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhid;
        result = 31 * result + (yhnumber != null ? yhnumber.hashCode() : 0);
        result = 31 * result + (yhcontent != null ? yhcontent.hashCode() : 0);
        result = 31 * result + (levelid != null ? levelid.hashCode() : 0);
        result = 31 * result + (typeid != null ? typeid.hashCode() : 0);
        result = 31 * result + (conpyfirst != null ? conpyfirst.hashCode() : 0);
        result = 31 * result + (intime != null ? intime.hashCode() : 0);
        result = 31 * result + (nstatus != null ? nstatus.hashCode() : 0);
        result = 31 * result + (sglxid != null ? sglxid.hashCode() : 0);
        result = 31 * result + (submitdept != null ? submitdept.hashCode() : 0);
        result = 31 * result + (pyall != null ? pyall.hashCode() : 0);
        return result;
    }
}
