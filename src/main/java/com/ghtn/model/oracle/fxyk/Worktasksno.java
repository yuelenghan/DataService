package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
public class Worktasksno {
    private BigDecimal zyid;
    private BigDecimal serialnumber;

    @Basic
    @Column(name = "ZYID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getZyid() {
        return zyid;
    }

    public void setZyid(BigDecimal zyid) {
        this.zyid = zyid;
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

        Worktasksno that = (Worktasksno) o;

        if (serialnumber != null ? !serialnumber.equals(that.serialnumber) : that.serialnumber != null) return false;
        if (zyid != null ? !zyid.equals(that.zyid) : that.zyid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zyid != null ? zyid.hashCode() : 0;
        result = 31 * result + (serialnumber != null ? serialnumber.hashCode() : 0);
        return result;
    }
}
