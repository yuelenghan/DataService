package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
public class SqsDemotiondetailPK implements Serializable {
    private BigDecimal rid;
    private BigDecimal deid;

    @Column(name = "RID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    @Id
    public BigDecimal getRid() {
        return rid;
    }

    public void setRid(BigDecimal rid) {
        this.rid = rid;
    }

    @Column(name = "DEID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    @Id
    public BigDecimal getDeid() {
        return deid;
    }

    public void setDeid(BigDecimal deid) {
        this.deid = deid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SqsDemotiondetailPK that = (SqsDemotiondetailPK) o;

        if (deid != null ? !deid.equals(that.deid) : that.deid != null) return false;
        if (rid != null ? !rid.equals(that.rid) : that.rid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rid != null ? rid.hashCode() : 0;
        result = 31 * result + (deid != null ? deid.hashCode() : 0);
        return result;
    }
}
