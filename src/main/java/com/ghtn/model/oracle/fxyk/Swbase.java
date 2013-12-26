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
 * Time: 上午10:57
 */
@Entity
public class Swbase {
    private int swid;
    private String swnumber;
    private String swcontent;
    private Integer levelid;
    private Integer typeid;
    private String conpyfirst;
    private Timestamp intime;
    private BigDecimal nstatus;
    private String maindept;
    private String pyall;

    @Id
    @Column(name = "SWID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getSwid() {
        return swid;
    }

    public void setSwid(int swid) {
        this.swid = swid;
    }

    @Basic
    @Column(name = "SWNUMBER", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getSwnumber() {
        return swnumber;
    }

    public void setSwnumber(String swnumber) {
        this.swnumber = swnumber;
    }

    @Basic
    @Column(name = "SWCONTENT", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getSwcontent() {
        return swcontent;
    }

    public void setSwcontent(String swcontent) {
        this.swcontent = swcontent;
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
    @Column(name = "MAINDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindept() {
        return maindept;
    }

    public void setMaindept(String maindept) {
        this.maindept = maindept;
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

        Swbase swbase = (Swbase) o;

        if (swid != swbase.swid) return false;
        if (conpyfirst != null ? !conpyfirst.equals(swbase.conpyfirst) : swbase.conpyfirst != null) return false;
        if (intime != null ? !intime.equals(swbase.intime) : swbase.intime != null) return false;
        if (levelid != null ? !levelid.equals(swbase.levelid) : swbase.levelid != null) return false;
        if (maindept != null ? !maindept.equals(swbase.maindept) : swbase.maindept != null) return false;
        if (nstatus != null ? !nstatus.equals(swbase.nstatus) : swbase.nstatus != null) return false;
        if (pyall != null ? !pyall.equals(swbase.pyall) : swbase.pyall != null) return false;
        if (swcontent != null ? !swcontent.equals(swbase.swcontent) : swbase.swcontent != null) return false;
        if (swnumber != null ? !swnumber.equals(swbase.swnumber) : swbase.swnumber != null) return false;
        if (typeid != null ? !typeid.equals(swbase.typeid) : swbase.typeid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = swid;
        result = 31 * result + (swnumber != null ? swnumber.hashCode() : 0);
        result = 31 * result + (swcontent != null ? swcontent.hashCode() : 0);
        result = 31 * result + (levelid != null ? levelid.hashCode() : 0);
        result = 31 * result + (typeid != null ? typeid.hashCode() : 0);
        result = 31 * result + (conpyfirst != null ? conpyfirst.hashCode() : 0);
        result = 31 * result + (intime != null ? intime.hashCode() : 0);
        result = 31 * result + (nstatus != null ? nstatus.hashCode() : 0);
        result = 31 * result + (maindept != null ? maindept.hashCode() : 0);
        result = 31 * result + (pyall != null ? pyall.hashCode() : 0);
        return result;
    }
}
