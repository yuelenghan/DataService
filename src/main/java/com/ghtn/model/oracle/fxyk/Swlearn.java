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
public class Swlearn {
    private int lid;
    private int levelid;
    private String lname;
    private String deptnumber;
    private Timestamp intime;
    private BigDecimal nstatus;

    @Id
    @Column(name = "LID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    @Basic
    @Column(name = "LEVELID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getLevelid() {
        return levelid;
    }

    public void setLevelid(int levelid) {
        this.levelid = levelid;
    }

    @Basic
    @Column(name = "LNAME", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Basic
    @Column(name = "DEPTNUMBER", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    public String getDeptnumber() {
        return deptnumber;
    }

    public void setDeptnumber(String deptnumber) {
        this.deptnumber = deptnumber;
    }

    @Basic
    @Column(name = "INTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getIntime() {
        return intime;
    }

    public void setIntime(Timestamp intime) {
        this.intime = intime;
    }

    @Basic
    @Column(name = "NSTATUS", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getNstatus() {
        return nstatus;
    }

    public void setNstatus(BigDecimal nstatus) {
        this.nstatus = nstatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Swlearn swlearn = (Swlearn) o;

        if (levelid != swlearn.levelid) return false;
        if (lid != swlearn.lid) return false;
        if (deptnumber != null ? !deptnumber.equals(swlearn.deptnumber) : swlearn.deptnumber != null) return false;
        if (intime != null ? !intime.equals(swlearn.intime) : swlearn.intime != null) return false;
        if (lname != null ? !lname.equals(swlearn.lname) : swlearn.lname != null) return false;
        if (nstatus != null ? !nstatus.equals(swlearn.nstatus) : swlearn.nstatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lid;
        result = 31 * result + levelid;
        result = 31 * result + (lname != null ? lname.hashCode() : 0);
        result = 31 * result + (deptnumber != null ? deptnumber.hashCode() : 0);
        result = 31 * result + (intime != null ? intime.hashCode() : 0);
        result = 31 * result + (nstatus != null ? nstatus.hashCode() : 0);
        return result;
    }
}
