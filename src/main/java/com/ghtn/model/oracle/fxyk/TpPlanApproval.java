package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
@Table(name = "TP_PLAN_APPROVAL", schema = "SEP3", catalog = "")
public class TpPlanApproval {
    private BigDecimal id;
    private BigDecimal tpyear;
    private BigDecimal tpmonth;
    private String tpperson;
    private String reason;
    private String createuser;
    private String createdept;
    private Timestamp createtime;
    private String status;
    private BigDecimal qdneedalter;
    private BigDecimal ddneedalter;
    private BigDecimal qdfinishalter;
    private BigDecimal ddfinishalter;
    private String tpkqdept;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TPYEAR", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getTpyear() {
        return tpyear;
    }

    public void setTpyear(BigDecimal tpyear) {
        this.tpyear = tpyear;
    }

    @Basic
    @Column(name = "TPMONTH", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getTpmonth() {
        return tpmonth;
    }

    public void setTpmonth(BigDecimal tpmonth) {
        this.tpmonth = tpmonth;
    }

    @Basic
    @Column(name = "TPPERSON", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getTpperson() {
        return tpperson;
    }

    public void setTpperson(String tpperson) {
        this.tpperson = tpperson;
    }

    @Basic
    @Column(name = "REASON", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "CREATEUSER", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    @Basic
    @Column(name = "CREATEDEPT", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getCreatedept() {
        return createdept;
    }

    public void setCreatedept(String createdept) {
        this.createdept = createdept;
    }

    @Basic
    @Column(name = "CREATETIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "QDNEEDALTER", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getQdneedalter() {
        return qdneedalter;
    }

    public void setQdneedalter(BigDecimal qdneedalter) {
        this.qdneedalter = qdneedalter;
    }

    @Basic
    @Column(name = "DDNEEDALTER", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getDdneedalter() {
        return ddneedalter;
    }

    public void setDdneedalter(BigDecimal ddneedalter) {
        this.ddneedalter = ddneedalter;
    }

    @Basic
    @Column(name = "QDFINISHALTER", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getQdfinishalter() {
        return qdfinishalter;
    }

    public void setQdfinishalter(BigDecimal qdfinishalter) {
        this.qdfinishalter = qdfinishalter;
    }

    @Basic
    @Column(name = "DDFINISHALTER", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getDdfinishalter() {
        return ddfinishalter;
    }

    public void setDdfinishalter(BigDecimal ddfinishalter) {
        this.ddfinishalter = ddfinishalter;
    }

    @Basic
    @Column(name = "TPKQDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getTpkqdept() {
        return tpkqdept;
    }

    public void setTpkqdept(String tpkqdept) {
        this.tpkqdept = tpkqdept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TpPlanApproval that = (TpPlanApproval) o;

        if (createdept != null ? !createdept.equals(that.createdept) : that.createdept != null) return false;
        if (createtime != null ? !createtime.equals(that.createtime) : that.createtime != null) return false;
        if (createuser != null ? !createuser.equals(that.createuser) : that.createuser != null) return false;
        if (ddfinishalter != null ? !ddfinishalter.equals(that.ddfinishalter) : that.ddfinishalter != null)
            return false;
        if (ddneedalter != null ? !ddneedalter.equals(that.ddneedalter) : that.ddneedalter != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (qdfinishalter != null ? !qdfinishalter.equals(that.qdfinishalter) : that.qdfinishalter != null)
            return false;
        if (qdneedalter != null ? !qdneedalter.equals(that.qdneedalter) : that.qdneedalter != null) return false;
        if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (tpkqdept != null ? !tpkqdept.equals(that.tpkqdept) : that.tpkqdept != null) return false;
        if (tpmonth != null ? !tpmonth.equals(that.tpmonth) : that.tpmonth != null) return false;
        if (tpperson != null ? !tpperson.equals(that.tpperson) : that.tpperson != null) return false;
        if (tpyear != null ? !tpyear.equals(that.tpyear) : that.tpyear != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (tpyear != null ? tpyear.hashCode() : 0);
        result = 31 * result + (tpmonth != null ? tpmonth.hashCode() : 0);
        result = 31 * result + (tpperson != null ? tpperson.hashCode() : 0);
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        result = 31 * result + (createuser != null ? createuser.hashCode() : 0);
        result = 31 * result + (createdept != null ? createdept.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (qdneedalter != null ? qdneedalter.hashCode() : 0);
        result = 31 * result + (ddneedalter != null ? ddneedalter.hashCode() : 0);
        result = 31 * result + (qdfinishalter != null ? qdfinishalter.hashCode() : 0);
        result = 31 * result + (ddfinishalter != null ? ddfinishalter.hashCode() : 0);
        result = 31 * result + (tpkqdept != null ? tpkqdept.hashCode() : 0);
        return result;
    }
}
