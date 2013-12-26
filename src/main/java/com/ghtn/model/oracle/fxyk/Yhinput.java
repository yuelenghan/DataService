package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
public class Yhinput {
    private int yhputinid;
    private String deptid;
    private Integer placeid;
    private String banci;
    private String personid;
    private Timestamp pctime;
    private Timestamp intime;
    private String yhnumber;
    private String remarks;
    private String status;
    private Integer refer;
    private String referid;
    private String inputpersonid;
    private String maindeptid;

    @Id
    @Column(name = "YHPUTINID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(int yhputinid) {
        this.yhputinid = yhputinid;
    }

    @Basic
    @Column(name = "DEPTID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    @Basic
    @Column(name = "PLACEID", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPlaceid() {
        return placeid;
    }

    public void setPlaceid(Integer placeid) {
        this.placeid = placeid;
    }

    @Basic
    @Column(name = "BANCI", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getBanci() {
        return banci;
    }

    public void setBanci(String banci) {
        this.banci = banci;
    }

    @Basic
    @Column(name = "PERSONID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    @Basic
    @Column(name = "PCTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getPctime() {
        return pctime;
    }

    public void setPctime(Timestamp pctime) {
        this.pctime = pctime;
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
    @Column(name = "YHNUMBER", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getYhnumber() {
        return yhnumber;
    }

    public void setYhnumber(String yhnumber) {
        this.yhnumber = yhnumber;
    }

    @Basic
    @Column(name = "REMARKS", nullable = true, insertable = true, updatable = true, length = 2000, precision = 0)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "REFER", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getRefer() {
        return refer;
    }

    public void setRefer(Integer refer) {
        this.refer = refer;
    }

    @Basic
    @Column(name = "REFERID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getReferid() {
        return referid;
    }

    public void setReferid(String referid) {
        this.referid = referid;
    }

    @Basic
    @Column(name = "INPUTPERSONID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getInputpersonid() {
        return inputpersonid;
    }

    public void setInputpersonid(String inputpersonid) {
        this.inputpersonid = inputpersonid;
    }

    @Basic
    @Column(name = "MAINDEPTID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getMaindeptid() {
        return maindeptid;
    }

    public void setMaindeptid(String maindeptid) {
        this.maindeptid = maindeptid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Yhinput yhinput = (Yhinput) o;

        if (yhputinid != yhinput.yhputinid) return false;
        if (banci != null ? !banci.equals(yhinput.banci) : yhinput.banci != null) return false;
        if (deptid != null ? !deptid.equals(yhinput.deptid) : yhinput.deptid != null) return false;
        if (inputpersonid != null ? !inputpersonid.equals(yhinput.inputpersonid) : yhinput.inputpersonid != null)
            return false;
        if (intime != null ? !intime.equals(yhinput.intime) : yhinput.intime != null) return false;
        if (maindeptid != null ? !maindeptid.equals(yhinput.maindeptid) : yhinput.maindeptid != null) return false;
        if (pctime != null ? !pctime.equals(yhinput.pctime) : yhinput.pctime != null) return false;
        if (personid != null ? !personid.equals(yhinput.personid) : yhinput.personid != null) return false;
        if (placeid != null ? !placeid.equals(yhinput.placeid) : yhinput.placeid != null) return false;
        if (refer != null ? !refer.equals(yhinput.refer) : yhinput.refer != null) return false;
        if (referid != null ? !referid.equals(yhinput.referid) : yhinput.referid != null) return false;
        if (remarks != null ? !remarks.equals(yhinput.remarks) : yhinput.remarks != null) return false;
        if (status != null ? !status.equals(yhinput.status) : yhinput.status != null) return false;
        if (yhnumber != null ? !yhnumber.equals(yhinput.yhnumber) : yhinput.yhnumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhputinid;
        result = 31 * result + (deptid != null ? deptid.hashCode() : 0);
        result = 31 * result + (placeid != null ? placeid.hashCode() : 0);
        result = 31 * result + (banci != null ? banci.hashCode() : 0);
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        result = 31 * result + (pctime != null ? pctime.hashCode() : 0);
        result = 31 * result + (intime != null ? intime.hashCode() : 0);
        result = 31 * result + (yhnumber != null ? yhnumber.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (refer != null ? refer.hashCode() : 0);
        result = 31 * result + (referid != null ? referid.hashCode() : 0);
        result = 31 * result + (inputpersonid != null ? inputpersonid.hashCode() : 0);
        result = 31 * result + (maindeptid != null ? maindeptid.hashCode() : 0);
        return result;
    }
}
