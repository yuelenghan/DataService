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
public class Yhaction {
    private int actionid;
    private int yhputinid;
    private String historystatus;
    private String newstauts;
    private String detail;
    private Integer fine;
    private Timestamp happendate;
    private String remark;
    private String fineperson;

    @Id
    @Column(name = "ACTIONID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getActionid() {
        return actionid;
    }

    public void setActionid(int actionid) {
        this.actionid = actionid;
    }

    @Basic
    @Column(name = "YHPUTINID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(int yhputinid) {
        this.yhputinid = yhputinid;
    }

    @Basic
    @Column(name = "HISTORYSTATUS", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getHistorystatus() {
        return historystatus;
    }

    public void setHistorystatus(String historystatus) {
        this.historystatus = historystatus;
    }

    @Basic
    @Column(name = "NEWSTAUTS", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getNewstauts() {
        return newstauts;
    }

    public void setNewstauts(String newstauts) {
        this.newstauts = newstauts;
    }

    @Basic
    @Column(name = "DETAIL", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Basic
    @Column(name = "FINE", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getFine() {
        return fine;
    }

    public void setFine(Integer fine) {
        this.fine = fine;
    }

    @Basic
    @Column(name = "HAPPENDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getHappendate() {
        return happendate;
    }

    public void setHappendate(Timestamp happendate) {
        this.happendate = happendate;
    }

    @Basic
    @Column(name = "REMARK", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "FINEPERSON", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getFineperson() {
        return fineperson;
    }

    public void setFineperson(String fineperson) {
        this.fineperson = fineperson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Yhaction yhaction = (Yhaction) o;

        if (actionid != yhaction.actionid) return false;
        if (yhputinid != yhaction.yhputinid) return false;
        if (detail != null ? !detail.equals(yhaction.detail) : yhaction.detail != null) return false;
        if (fine != null ? !fine.equals(yhaction.fine) : yhaction.fine != null) return false;
        if (fineperson != null ? !fineperson.equals(yhaction.fineperson) : yhaction.fineperson != null) return false;
        if (happendate != null ? !happendate.equals(yhaction.happendate) : yhaction.happendate != null) return false;
        if (historystatus != null ? !historystatus.equals(yhaction.historystatus) : yhaction.historystatus != null)
            return false;
        if (newstauts != null ? !newstauts.equals(yhaction.newstauts) : yhaction.newstauts != null) return false;
        if (remark != null ? !remark.equals(yhaction.remark) : yhaction.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = actionid;
        result = 31 * result + yhputinid;
        result = 31 * result + (historystatus != null ? historystatus.hashCode() : 0);
        result = 31 * result + (newstauts != null ? newstauts.hashCode() : 0);
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        result = 31 * result + (fine != null ? fine.hashCode() : 0);
        result = 31 * result + (happendate != null ? happendate.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (fineperson != null ? fineperson.hashCode() : 0);
        return result;
    }
}
