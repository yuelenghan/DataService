package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
@Table(name = "TT_MONTH_2", schema = "SEP3", catalog = "")
public class TtMonth2 {
    private String swfield;
    private String yhfield;
    private Integer m;
    private Integer amount;

    @Basic
    @Column(name = "SWFIELD", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public String getSwfield() {
        return swfield;
    }

    public void setSwfield(String swfield) {
        this.swfield = swfield;
    }

    @Basic
    @Column(name = "YHFIELD", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public String getYhfield() {
        return yhfield;
    }

    public void setYhfield(String yhfield) {
        this.yhfield = yhfield;
    }

    @Basic
    @Column(name = "M", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getM() {
        return m;
    }

    public void setM(Integer m) {
        this.m = m;
    }

    @Basic
    @Column(name = "AMOUNT", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TtMonth2 ttMonth2 = (TtMonth2) o;

        if (amount != null ? !amount.equals(ttMonth2.amount) : ttMonth2.amount != null) return false;
        if (m != null ? !m.equals(ttMonth2.m) : ttMonth2.m != null) return false;
        if (swfield != null ? !swfield.equals(ttMonth2.swfield) : ttMonth2.swfield != null) return false;
        if (yhfield != null ? !yhfield.equals(ttMonth2.yhfield) : ttMonth2.yhfield != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = swfield != null ? swfield.hashCode() : 0;
        result = 31 * result + (yhfield != null ? yhfield.hashCode() : 0);
        result = 31 * result + (m != null ? m.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }
}
