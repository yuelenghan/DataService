package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
@Table(name = "TP_WORKATTENDANCEEX", schema = "SEP3", catalog = "")
public class TpWorkattendanceex {
    private BigDecimal id;
    private String stafferid;
    private Timestamp downtime;
    private Timestamp uptime;
    private Timestamp kqtime;

    @Basic
    @Column(name = "ID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column(name = "STAFFERID", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getStafferid() {
        return stafferid;
    }

    public void setStafferid(String stafferid) {
        this.stafferid = stafferid;
    }

    @Basic
    @Column(name = "DOWNTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getDowntime() {
        return downtime;
    }

    public void setDowntime(Timestamp downtime) {
        this.downtime = downtime;
    }

    @Basic
    @Column(name = "UPTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getUptime() {
        return uptime;
    }

    public void setUptime(Timestamp uptime) {
        this.uptime = uptime;
    }

    @Basic
    @Column(name = "KQTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getKqtime() {
        return kqtime;
    }

    public void setKqtime(Timestamp kqtime) {
        this.kqtime = kqtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TpWorkattendanceex that = (TpWorkattendanceex) o;

        if (downtime != null ? !downtime.equals(that.downtime) : that.downtime != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (kqtime != null ? !kqtime.equals(that.kqtime) : that.kqtime != null) return false;
        if (stafferid != null ? !stafferid.equals(that.stafferid) : that.stafferid != null) return false;
        if (uptime != null ? !uptime.equals(that.uptime) : that.uptime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (stafferid != null ? stafferid.hashCode() : 0);
        result = 31 * result + (downtime != null ? downtime.hashCode() : 0);
        result = 31 * result + (uptime != null ? uptime.hashCode() : 0);
        result = 31 * result + (kqtime != null ? kqtime.hashCode() : 0);
        return result;
    }
}
