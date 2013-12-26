package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
public class Hazardsno {
    private BigDecimal processid;
    private BigDecimal serialnumber;

    @Basic
    @Column(name = "PROCESSID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getProcessid() {
        return processid;
    }

    public void setProcessid(BigDecimal processid) {
        this.processid = processid;
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

        Hazardsno hazardsno = (Hazardsno) o;

        if (processid != null ? !processid.equals(hazardsno.processid) : hazardsno.processid != null) return false;
        if (serialnumber != null ? !serialnumber.equals(hazardsno.serialnumber) : hazardsno.serialnumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = processid != null ? processid.hashCode() : 0;
        result = 31 * result + (serialnumber != null ? serialnumber.hashCode() : 0);
        return result;
    }
}
