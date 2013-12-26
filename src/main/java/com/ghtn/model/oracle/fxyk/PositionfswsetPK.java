package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
public class PositionfswsetPK implements Serializable {
    private BigDecimal positionid;
    private BigDecimal swtypeid;

    @Column(name = "POSITIONID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    @Id
    public BigDecimal getPositionid() {
        return positionid;
    }

    public void setPositionid(BigDecimal positionid) {
        this.positionid = positionid;
    }

    @Column(name = "SWTYPEID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    @Id
    public BigDecimal getSwtypeid() {
        return swtypeid;
    }

    public void setSwtypeid(BigDecimal swtypeid) {
        this.swtypeid = swtypeid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PositionfswsetPK that = (PositionfswsetPK) o;

        if (positionid != null ? !positionid.equals(that.positionid) : that.positionid != null) return false;
        if (swtypeid != null ? !swtypeid.equals(that.swtypeid) : that.swtypeid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = positionid != null ? positionid.hashCode() : 0;
        result = 31 * result + (swtypeid != null ? swtypeid.hashCode() : 0);
        return result;
    }
}
