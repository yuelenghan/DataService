package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
public class BaseDutysetPK implements Serializable {
    private BigDecimal groupid;
    private String persunnumber;

    @Column(name = "GROUPID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    @Id
    public BigDecimal getGroupid() {
        return groupid;
    }

    public void setGroupid(BigDecimal groupid) {
        this.groupid = groupid;
    }

    @Column(name = "PERSUNNUMBER", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    @Id
    public String getPersunnumber() {
        return persunnumber;
    }

    public void setPersunnumber(String persunnumber) {
        this.persunnumber = persunnumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseDutysetPK that = (BaseDutysetPK) o;

        if (groupid != null ? !groupid.equals(that.groupid) : that.groupid != null) return false;
        if (persunnumber != null ? !persunnumber.equals(that.persunnumber) : that.persunnumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = groupid != null ? groupid.hashCode() : 0;
        result = 31 * result + (persunnumber != null ? persunnumber.hashCode() : 0);
        return result;
    }
}
