package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
@IdClass(PositionfswsetPK.class)
public class Positionfswset {
    private BigDecimal positionid;
    private BigDecimal swtypeid;
    private BigDecimal month;
    private BigDecimal count;
    private String maindeptid;

    @Id
    @Column(name = "POSITIONID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getPositionid() {
        return positionid;
    }

    public void setPositionid(BigDecimal positionid) {
        this.positionid = positionid;
    }

    @Id
    @Column(name = "SWTYPEID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getSwtypeid() {
        return swtypeid;
    }

    public void setSwtypeid(BigDecimal swtypeid) {
        this.swtypeid = swtypeid;
    }

    @Basic
    @Column(name = "MONTH", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getMonth() {
        return month;
    }

    public void setMonth(BigDecimal month) {
        this.month = month;
    }

    @Basic
    @Column(name = "COUNT", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    @Basic
    @Column(name = "MAINDEPTID", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindeptid() {
        return maindeptid;
    }

    public void setMaindeptid(String maindeptid) {
        this.maindeptid = maindeptid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Positionfswset that = (Positionfswset) o;

        if (count != null ? !count.equals(that.count) : that.count != null) return false;
        if (maindeptid != null ? !maindeptid.equals(that.maindeptid) : that.maindeptid != null) return false;
        if (month != null ? !month.equals(that.month) : that.month != null) return false;
        if (positionid != null ? !positionid.equals(that.positionid) : that.positionid != null) return false;
        if (swtypeid != null ? !swtypeid.equals(that.swtypeid) : that.swtypeid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = positionid != null ? positionid.hashCode() : 0;
        result = 31 * result + (swtypeid != null ? swtypeid.hashCode() : 0);
        result = 31 * result + (month != null ? month.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (maindeptid != null ? maindeptid.hashCode() : 0);
        return result;
    }
}
