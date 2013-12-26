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
@Table(name = "TT_V_T", schema = "SEP3", catalog = "")
public class TtVT {
    private String chr;
    private String letter;

    @Basic
    @Column(name = "CHR", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public String getChr() {
        return chr;
    }

    public void setChr(String chr) {
        this.chr = chr;
    }

    @Basic
    @Column(name = "LETTER", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TtVT ttVT = (TtVT) o;

        if (chr != null ? !chr.equals(ttVT.chr) : ttVT.chr != null) return false;
        if (letter != null ? !letter.equals(ttVT.letter) : ttVT.letter != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = chr != null ? chr.hashCode() : 0;
        result = 31 * result + (letter != null ? letter.hashCode() : 0);
        return result;
    }
}
