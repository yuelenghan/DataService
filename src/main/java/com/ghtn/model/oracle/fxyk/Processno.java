package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
public class Processno {
    private BigDecimal worktaskid;
    private BigDecimal serialnumber;

    @Basic
    @Column(name = "WORKTASKID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getWorktaskid() {
        return worktaskid;
    }

    public void setWorktaskid(BigDecimal worktaskid) {
        this.worktaskid = worktaskid;
    }

    @Basic
    @Column(name = "SERIALNUMBER", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(BigDecimal serialnumber) {
        this.serialnumber = serialnumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Processno processno = (Processno) o;

        if (serialnumber != null ? !serialnumber.equals(processno.serialnumber) : processno.serialnumber != null)
            return false;
        if (worktaskid != null ? !worktaskid.equals(processno.worktaskid) : processno.worktaskid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = worktaskid != null ? worktaskid.hashCode() : 0;
        result = 31 * result + (serialnumber != null ? serialnumber.hashCode() : 0);
        return result;
    }
}
