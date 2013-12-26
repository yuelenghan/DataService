package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@Table(name = "SQS_RESULT_DETAIL", schema = "SEP3", catalog = "")
public class SqsResultDetail {
    private BigDecimal rdid;
    private BigDecimal rid;
    private Integer jcid;
    private BigDecimal jeom;
    private String remark;

    @Id
    @Column(name = "RDID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getRdid() {
        return rdid;
    }

    public void setRdid(BigDecimal rdid) {
        this.rdid = rdid;
    }

    @Basic
    @Column(name = "RID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getRid() {
        return rid;
    }

    public void setRid(BigDecimal rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "JCID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getJcid() {
        return jcid;
    }

    public void setJcid(Integer jcid) {
        this.jcid = jcid;
    }

    @Basic
    @Column(name = "JEOM", nullable = true, insertable = true, updatable = true, length = 4, precision = 1)
    public BigDecimal getJeom() {
        return jeom;
    }

    public void setJeom(BigDecimal jeom) {
        this.jeom = jeom;
    }

    @Basic
    @Column(name = "REMARK", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SqsResultDetail that = (SqsResultDetail) o;

        if (jcid != null ? !jcid.equals(that.jcid) : that.jcid != null) return false;
        if (jeom != null ? !jeom.equals(that.jeom) : that.jeom != null) return false;
        if (rdid != null ? !rdid.equals(that.rdid) : that.rdid != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (rid != null ? !rid.equals(that.rid) : that.rid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rdid != null ? rdid.hashCode() : 0;
        result = 31 * result + (rid != null ? rid.hashCode() : 0);
        result = 31 * result + (jcid != null ? jcid.hashCode() : 0);
        result = 31 * result + (jeom != null ? jeom.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
