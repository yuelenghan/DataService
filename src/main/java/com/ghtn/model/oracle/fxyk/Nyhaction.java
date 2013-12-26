package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
@IdClass(NyhactionPK.class)
public class Nyhaction {
    private int yhputinid;
    private BigDecimal lcmark;
    private Timestamp recorddate;
    private String historystatus;
    private String newstauts;
    private String detail;
    private String remark;

    @Id
    @Column(name = "YHPUTINID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(int yhputinid) {
        this.yhputinid = yhputinid;
    }

    @Id
    @Column(name = "LCMARK", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getLcmark() {
        return lcmark;
    }

    public void setLcmark(BigDecimal lcmark) {
        this.lcmark = lcmark;
    }

    @Basic
    @Column(name = "RECORDDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Timestamp recorddate) {
        this.recorddate = recorddate;
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
    @Column(name = "REMARK", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nyhaction nyhaction = (Nyhaction) o;

        if (yhputinid != nyhaction.yhputinid) return false;
        if (detail != null ? !detail.equals(nyhaction.detail) : nyhaction.detail != null) return false;
        if (historystatus != null ? !historystatus.equals(nyhaction.historystatus) : nyhaction.historystatus != null)
            return false;
        if (lcmark != null ? !lcmark.equals(nyhaction.lcmark) : nyhaction.lcmark != null) return false;
        if (newstauts != null ? !newstauts.equals(nyhaction.newstauts) : nyhaction.newstauts != null) return false;
        if (recorddate != null ? !recorddate.equals(nyhaction.recorddate) : nyhaction.recorddate != null) return false;
        if (remark != null ? !remark.equals(nyhaction.remark) : nyhaction.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhputinid;
        result = 31 * result + (lcmark != null ? lcmark.hashCode() : 0);
        result = 31 * result + (recorddate != null ? recorddate.hashCode() : 0);
        result = 31 * result + (historystatus != null ? historystatus.hashCode() : 0);
        result = 31 * result + (newstauts != null ? newstauts.hashCode() : 0);
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
