package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
@Table(name = "TT_DATE", schema = "SEP3", catalog = "")
public class TtDate {
    private Timestamp col;

    @Basic
    @Column(name = "COL", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getCol() {
        return col;
    }

    public void setCol(Timestamp col) {
        this.col = col;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TtDate ttDate = (TtDate) o;

        if (col != null ? !col.equals(ttDate.col) : ttDate.col != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return col != null ? col.hashCode() : 0;
    }
}
