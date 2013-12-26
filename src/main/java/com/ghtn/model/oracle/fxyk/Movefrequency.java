package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
public class Movefrequency {
    private BigDecimal frequencyid;
    private String deptid;
    private BigDecimal posid;
    private BigDecimal placeid;
    private BigDecimal frequency;
    private String maindept;

    @Id
    @Column(name = "FREQUENCYID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getFrequencyid() {
        return frequencyid;
    }

    public void setFrequencyid(BigDecimal frequencyid) {
        this.frequencyid = frequencyid;
    }

    @Basic
    @Column(name = "DEPTID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    @Basic
    @Column(name = "POSID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getPosid() {
        return posid;
    }

    public void setPosid(BigDecimal posid) {
        this.posid = posid;
    }

    @Basic
    @Column(name = "PLACEID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getPlaceid() {
        return placeid;
    }

    public void setPlaceid(BigDecimal placeid) {
        this.placeid = placeid;
    }

    @Basic
    @Column(name = "FREQUENCY", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getFrequency() {
        return frequency;
    }

    public void setFrequency(BigDecimal frequency) {
        this.frequency = frequency;
    }

    @Basic
    @Column(name = "MAINDEPT", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getMaindept() {
        return maindept;
    }

    public void setMaindept(String maindept) {
        this.maindept = maindept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movefrequency that = (Movefrequency) o;

        if (deptid != null ? !deptid.equals(that.deptid) : that.deptid != null) return false;
        if (frequency != null ? !frequency.equals(that.frequency) : that.frequency != null) return false;
        if (frequencyid != null ? !frequencyid.equals(that.frequencyid) : that.frequencyid != null) return false;
        if (maindept != null ? !maindept.equals(that.maindept) : that.maindept != null) return false;
        if (placeid != null ? !placeid.equals(that.placeid) : that.placeid != null) return false;
        if (posid != null ? !posid.equals(that.posid) : that.posid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = frequencyid != null ? frequencyid.hashCode() : 0;
        result = 31 * result + (deptid != null ? deptid.hashCode() : 0);
        result = 31 * result + (posid != null ? posid.hashCode() : 0);
        result = 31 * result + (placeid != null ? placeid.hashCode() : 0);
        result = 31 * result + (frequency != null ? frequency.hashCode() : 0);
        result = 31 * result + (maindept != null ? maindept.hashCode() : 0);
        return result;
    }
}
