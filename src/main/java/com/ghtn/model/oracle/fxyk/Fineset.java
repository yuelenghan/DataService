package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
@IdClass(FinesetPK.class)
public class Fineset {
    private int levelid;
    private int pid;
    private BigDecimal kcfine;
    private String deptnumber;
    private BigDecimal zcfine;
    private Timestamp usingtime;

    @Id
    @Column(name = "LEVELID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getLevelid() {
        return levelid;
    }

    public void setLevelid(int levelid) {
        this.levelid = levelid;
    }

    @Id
    @Column(name = "PID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "KCFINE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getKcfine() {
        return kcfine;
    }

    public void setKcfine(BigDecimal kcfine) {
        this.kcfine = kcfine;
    }

    @Basic
    @Column(name = "DEPTNUMBER", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public String getDeptnumber() {
        return deptnumber;
    }

    public void setDeptnumber(String deptnumber) {
        this.deptnumber = deptnumber;
    }

    @Basic
    @Column(name = "ZCFINE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getZcfine() {
        return zcfine;
    }

    public void setZcfine(BigDecimal zcfine) {
        this.zcfine = zcfine;
    }

    @Basic
    @Column(name = "USINGTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getUsingtime() {
        return usingtime;
    }

    public void setUsingtime(Timestamp usingtime) {
        this.usingtime = usingtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fineset fineset = (Fineset) o;

        if (levelid != fineset.levelid) return false;
        if (pid != fineset.pid) return false;
        if (deptnumber != null ? !deptnumber.equals(fineset.deptnumber) : fineset.deptnumber != null) return false;
        if (kcfine != null ? !kcfine.equals(fineset.kcfine) : fineset.kcfine != null) return false;
        if (usingtime != null ? !usingtime.equals(fineset.usingtime) : fineset.usingtime != null) return false;
        if (zcfine != null ? !zcfine.equals(fineset.zcfine) : fineset.zcfine != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = levelid;
        result = 31 * result + pid;
        result = 31 * result + (kcfine != null ? kcfine.hashCode() : 0);
        result = 31 * result + (deptnumber != null ? deptnumber.hashCode() : 0);
        result = 31 * result + (zcfine != null ? zcfine.hashCode() : 0);
        result = 31 * result + (usingtime != null ? usingtime.hashCode() : 0);
        return result;
    }
}
