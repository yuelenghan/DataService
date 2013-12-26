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
@Table(name = "PAR_JEOMCRITERION", schema = "SEP3", catalog = "")
public class ParJeomcriterion {
    private int jcid;
    private String jccontent;
    private int itemid;
    private BigDecimal minscore;
    private BigDecimal maxscore;
    private Timestamp indate;
    private String status;
    private BigDecimal sort;

    @Id
    @Column(name = "JCID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getJcid() {
        return jcid;
    }

    public void setJcid(int jcid) {
        this.jcid = jcid;
    }

    @Basic
    @Column(name = "JCCONTENT", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getJccontent() {
        return jccontent;
    }

    public void setJccontent(String jccontent) {
        this.jccontent = jccontent;
    }

    @Basic
    @Column(name = "ITEMID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    @Basic
    @Column(name = "MINSCORE", nullable = true, insertable = true, updatable = true, length = 4, precision = 1)
    public BigDecimal getMinscore() {
        return minscore;
    }

    public void setMinscore(BigDecimal minscore) {
        this.minscore = minscore;
    }

    @Basic
    @Column(name = "MAXSCORE", nullable = true, insertable = true, updatable = true, length = 4, precision = 1)
    public BigDecimal getMaxscore() {
        return maxscore;
    }

    public void setMaxscore(BigDecimal maxscore) {
        this.maxscore = maxscore;
    }

    @Basic
    @Column(name = "INDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getIndate() {
        return indate;
    }

    public void setIndate(Timestamp indate) {
        this.indate = indate;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "SORT", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getSort() {
        return sort;
    }

    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParJeomcriterion that = (ParJeomcriterion) o;

        if (itemid != that.itemid) return false;
        if (jcid != that.jcid) return false;
        if (indate != null ? !indate.equals(that.indate) : that.indate != null) return false;
        if (jccontent != null ? !jccontent.equals(that.jccontent) : that.jccontent != null) return false;
        if (maxscore != null ? !maxscore.equals(that.maxscore) : that.maxscore != null) return false;
        if (minscore != null ? !minscore.equals(that.minscore) : that.minscore != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jcid;
        result = 31 * result + (jccontent != null ? jccontent.hashCode() : 0);
        result = 31 * result + itemid;
        result = 31 * result + (minscore != null ? minscore.hashCode() : 0);
        result = 31 * result + (maxscore != null ? maxscore.hashCode() : 0);
        result = 31 * result + (indate != null ? indate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        return result;
    }
}
