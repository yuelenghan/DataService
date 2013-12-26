package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
@Table(name = "TP_CARDREADER", schema = "SEP3", catalog = "")
public class TpCardreader {
    private BigDecimal id;
    private BigDecimal cardreaderid;
    private String shortname;
    private BigDecimal ground;

    @Basic
    @Column(name = "ID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CARDREADERID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getCardreaderid() {
        return cardreaderid;
    }

    public void setCardreaderid(BigDecimal cardreaderid) {
        this.cardreaderid = cardreaderid;
    }

    @Basic
    @Column(name = "SHORTNAME", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    @Basic
    @Column(name = "GROUND", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getGround() {
        return ground;
    }

    public void setGround(BigDecimal ground) {
        this.ground = ground;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TpCardreader that = (TpCardreader) o;

        if (cardreaderid != null ? !cardreaderid.equals(that.cardreaderid) : that.cardreaderid != null) return false;
        if (ground != null ? !ground.equals(that.ground) : that.ground != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (shortname != null ? !shortname.equals(that.shortname) : that.shortname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cardreaderid != null ? cardreaderid.hashCode() : 0);
        result = 31 * result + (shortname != null ? shortname.hashCode() : 0);
        result = 31 * result + (ground != null ? ground.hashCode() : 0);
        return result;
    }
}
