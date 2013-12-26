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
 * Time: 上午10:56
 */
@Entity
public class Objectset {
    private int pid;
    private String pname;
    private String deptnumber;
    private Timestamp intime;
    private BigDecimal nstatus;

    @Id
    @Column(name = "PID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "PNAME", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
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

        Objectset objectset = (Objectset) o;

        if (pid != objectset.pid) return false;
        if (deptnumber != null ? !deptnumber.equals(objectset.deptnumber) : objectset.deptnumber != null) return false;
        if (intime != null ? !intime.equals(objectset.intime) : objectset.intime != null) return false;
        if (nstatus != null ? !nstatus.equals(objectset.nstatus) : objectset.nstatus != null) return false;
        if (pname != null ? !pname.equals(objectset.pname) : objectset.pname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pid;
        result = 31 * result + (pname != null ? pname.hashCode() : 0);
        result = 31 * result + (deptnumber != null ? deptnumber.hashCode() : 0);
        result = 31 * result + (intime != null ? intime.hashCode() : 0);
        result = 31 * result + (nstatus != null ? nstatus.hashCode() : 0);
        return result;
    }
}
