package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
@Table(name = "SF_LEVEL", schema = "SEP3", catalog = "")
public class SfLevel {
    private BigDecimal levelid;
    private String levelname;

    @Id
    @Column(name = "LEVELID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getLevelid() {
        return levelid;
    }

    public void setLevelid(BigDecimal levelid) {
        this.levelid = levelid;
    }

    @Basic
    @Column(name = "LEVELNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getLevelname() {
        return levelname;
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SfLevel sfLevel = (SfLevel) o;

        if (levelid != null ? !levelid.equals(sfLevel.levelid) : sfLevel.levelid != null) return false;
        if (levelname != null ? !levelname.equals(sfLevel.levelname) : sfLevel.levelname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = levelid != null ? levelid.hashCode() : 0;
        result = 31 * result + (levelname != null ? levelname.hashCode() : 0);
        return result;
    }
}
