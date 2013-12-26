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
@IdClass(NyinhuanrectificationPK.class)
public class Nyinhuanrectification {
    private int yhputinid;
    private BigDecimal lcmark;
    private Timestamp recorddate;
    private String recpersonid;
    private Timestamp rectime;
    private String recstate;
    private String yanshouid;
    private String zgbanci;

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
    @Column(name = "RECPERSONID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getRecpersonid() {
        return recpersonid;
    }

    public void setRecpersonid(String recpersonid) {
        this.recpersonid = recpersonid;
    }

    @Basic
    @Column(name = "RECTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getRectime() {
        return rectime;
    }

    public void setRectime(Timestamp rectime) {
        this.rectime = rectime;
    }

    @Basic
    @Column(name = "RECSTATE", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getRecstate() {
        return recstate;
    }

    public void setRecstate(String recstate) {
        this.recstate = recstate;
    }

    @Basic
    @Column(name = "YANSHOUID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getYanshouid() {
        return yanshouid;
    }

    public void setYanshouid(String yanshouid) {
        this.yanshouid = yanshouid;
    }

    @Basic
    @Column(name = "ZGBANCI", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getZgbanci() {
        return zgbanci;
    }

    public void setZgbanci(String zgbanci) {
        this.zgbanci = zgbanci;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nyinhuanrectification that = (Nyinhuanrectification) o;

        if (yhputinid != that.yhputinid) return false;
        if (lcmark != null ? !lcmark.equals(that.lcmark) : that.lcmark != null) return false;
        if (recorddate != null ? !recorddate.equals(that.recorddate) : that.recorddate != null) return false;
        if (recpersonid != null ? !recpersonid.equals(that.recpersonid) : that.recpersonid != null) return false;
        if (recstate != null ? !recstate.equals(that.recstate) : that.recstate != null) return false;
        if (rectime != null ? !rectime.equals(that.rectime) : that.rectime != null) return false;
        if (yanshouid != null ? !yanshouid.equals(that.yanshouid) : that.yanshouid != null) return false;
        if (zgbanci != null ? !zgbanci.equals(that.zgbanci) : that.zgbanci != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhputinid;
        result = 31 * result + (lcmark != null ? lcmark.hashCode() : 0);
        result = 31 * result + (recorddate != null ? recorddate.hashCode() : 0);
        result = 31 * result + (recpersonid != null ? recpersonid.hashCode() : 0);
        result = 31 * result + (rectime != null ? rectime.hashCode() : 0);
        result = 31 * result + (recstate != null ? recstate.hashCode() : 0);
        result = 31 * result + (yanshouid != null ? yanshouid.hashCode() : 0);
        result = 31 * result + (zgbanci != null ? zgbanci.hashCode() : 0);
        return result;
    }
}
