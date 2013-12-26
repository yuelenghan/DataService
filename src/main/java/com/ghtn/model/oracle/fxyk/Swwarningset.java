package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
public class Swwarningset {
    private String deptnumber;
    private BigDecimal maxscore;
    private BigDecimal maxcount;
    private Timestamp intime;

    @Id
    @Column(name = "DEPTNUMBER", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public String getDeptnumber() {
        return deptnumber;
    }

    public void setDeptnumber(String deptnumber) {
        this.deptnumber = deptnumber;
    }

    @Basic
    @Column(name = "MAXSCORE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getMaxscore() {
        return maxscore;
    }

    public void setMaxscore(BigDecimal maxscore) {
        this.maxscore = maxscore;
    }

    @Basic
    @Column(name = "MAXCOUNT", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getMaxcount() {
        return maxcount;
    }

    public void setMaxcount(BigDecimal maxcount) {
        this.maxcount = maxcount;
    }

    @Basic
    @Column(name = "INTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getIntime() {
        return intime;
    }

    public void setIntime(Timestamp intime) {
        this.intime = intime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Swwarningset that = (Swwarningset) o;

        if (deptnumber != null ? !deptnumber.equals(that.deptnumber) : that.deptnumber != null) return false;
        if (intime != null ? !intime.equals(that.intime) : that.intime != null) return false;
        if (maxcount != null ? !maxcount.equals(that.maxcount) : that.maxcount != null) return false;
        if (maxscore != null ? !maxscore.equals(that.maxscore) : that.maxscore != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deptnumber != null ? deptnumber.hashCode() : 0;
        result = 31 * result + (maxscore != null ? maxscore.hashCode() : 0);
        result = 31 * result + (maxcount != null ? maxcount.hashCode() : 0);
        result = 31 * result + (intime != null ? intime.hashCode() : 0);
        return result;
    }
}
