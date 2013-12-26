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
@Table(name = "TP_LOCATEDATA_EVERYTIMEMOD", schema = "SEP3", catalog = "")
public class TpLocatedataEverytimemod {
    private BigDecimal id;
    private String stafferid;
    private Timestamp starttime;
    private BigDecimal cardreaderid;

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
    @Column(name = "STARTTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getStarttime() {
        return starttime;
    }

    public void setStarttime(Timestamp starttime) {
        this.starttime = starttime;
    }

    @Basic
    @Column(name = "CARDREADERID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getCardreaderid() {
        return cardreaderid;
    }

    public void setCardreaderid(BigDecimal cardreaderid) {
        this.cardreaderid = cardreaderid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TpLocatedataEverytimemod that = (TpLocatedataEverytimemod) o;

        if (cardreaderid != null ? !cardreaderid.equals(that.cardreaderid) : that.cardreaderid != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (stafferid != null ? !stafferid.equals(that.stafferid) : that.stafferid != null) return false;
        if (starttime != null ? !starttime.equals(that.starttime) : that.starttime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (stafferid != null ? stafferid.hashCode() : 0);
        result = 31 * result + (starttime != null ? starttime.hashCode() : 0);
        result = 31 * result + (cardreaderid != null ? cardreaderid.hashCode() : 0);
        return result;
    }
}
