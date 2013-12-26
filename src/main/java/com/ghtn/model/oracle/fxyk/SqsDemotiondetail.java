package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@Table(name = "SQS_DEMOTIONDETAIL", schema = "SEP3", catalog = "")
@IdClass(SqsDemotiondetailPK.class)
public class SqsDemotiondetail {
    private BigDecimal rid;
    private BigDecimal deid;

    @Id
    @Column(name = "RID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getRid() {
        return rid;
    }

    public void setRid(BigDecimal rid) {
        this.rid = rid;
    }

    @Id
    @Column(name = "DEID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
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

        SqsDemotiondetail that = (SqsDemotiondetail) o;

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
