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
@Table(name = "TT_V_T_2", schema = "SEP3", catalog = "")
public class TtVT2 {
    private String chr;
    private String py;

    @Basic
    @Column(name = "CHR", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public String getChr() {
        return chr;
    }

    public void setChr(String chr) {
        this.chr = chr;
    }

    @Basic
    @Column(name = "PY", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getPy() {
        return py;
    }

    public void setPy(String py) {
        this.py = py;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TtVT2 ttVT2 = (TtVT2) o;

        if (chr != null ? !chr.equals(ttVT2.chr) : ttVT2.chr != null) return false;
        if (py != null ? !py.equals(ttVT2.py) : ttVT2.py != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = chr != null ? chr.hashCode() : 0;
        result = 31 * result + (py != null ? py.hashCode() : 0);
        return result;
    }
}
