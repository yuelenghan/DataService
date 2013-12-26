package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@IdClass(SwscorePK.class)
public class Swscore {
    private int levelid;
    private String deptnumber;
    private BigDecimal kcscore;
    private BigDecimal zcscore;
    private BigDecimal dwscore;
    private Timestamp usingtime;
    private BigDecimal second;
    private BigDecimal third;

    @Id
    @Column(name = "LEVELID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getLevelid() {
        return levelid;
    }

    public void setLevelid(int levelid) {
        this.levelid = levelid;
    }

    @Id
    @Column(name = "DEPTNUMBER", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public String getDeptnumber() {
        return deptnumber;
    }

    public void setDeptnumber(String deptnumber) {
        this.deptnumber = deptnumber;
    }

    @Basic
    @Column(name = "KCSCORE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getKcscore() {
        return kcscore;
    }

    public void setKcscore(BigDecimal kcscore) {
        this.kcscore = kcscore;
    }

    @Basic
    @Column(name = "ZCSCORE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getZcscore() {
        return zcscore;
    }

    public void setZcscore(BigDecimal zcscore) {
        this.zcscore = zcscore;
    }

    @Basic
    @Column(name = "DWSCORE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getDwscore() {
        return dwscore;
    }

    public void setDwscore(BigDecimal dwscore) {
        this.dwscore = dwscore;
    }

    @Basic
    @Column(name = "USINGTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getUsingtime() {
        return usingtime;
    }

    public void setUsingtime(Timestamp usingtime) {
        this.usingtime = usingtime;
    }

    @Basic
    @Column(name = "SECOND", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getSecond() {
        return second;
    }

    public void setSecond(BigDecimal second) {
        this.second = second;
    }

    @Basic
    @Column(name = "THIRD", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getThird() {
        return third;
    }

    public void setThird(BigDecimal third) {
        this.third = third;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Swscore swscore = (Swscore) o;

        if (levelid != swscore.levelid) return false;
        if (deptnumber != null ? !deptnumber.equals(swscore.deptnumber) : swscore.deptnumber != null) return false;
        if (dwscore != null ? !dwscore.equals(swscore.dwscore) : swscore.dwscore != null) return false;
        if (kcscore != null ? !kcscore.equals(swscore.kcscore) : swscore.kcscore != null) return false;
        if (second != null ? !second.equals(swscore.second) : swscore.second != null) return false;
        if (third != null ? !third.equals(swscore.third) : swscore.third != null) return false;
        if (usingtime != null ? !usingtime.equals(swscore.usingtime) : swscore.usingtime != null) return false;
        if (zcscore != null ? !zcscore.equals(swscore.zcscore) : swscore.zcscore != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = levelid;
        result = 31 * result + (deptnumber != null ? deptnumber.hashCode() : 0);
        result = 31 * result + (kcscore != null ? kcscore.hashCode() : 0);
        result = 31 * result + (zcscore != null ? zcscore.hashCode() : 0);
        result = 31 * result + (dwscore != null ? dwscore.hashCode() : 0);
        result = 31 * result + (usingtime != null ? usingtime.hashCode() : 0);
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (third != null ? third.hashCode() : 0);
        return result;
    }
}
