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
@Table(name = "TP_PLAN_CHANGE", schema = "SEP3", catalog = "")
public class TpPlanChange {
    private BigDecimal id;
    private BigDecimal planid;
    private Timestamp downminedate;
    private String banci;
    private String reason;
    private String createuser;
    private Timestamp createtime;
    private String status;
    private String createdept;
    private String log;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PLANID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getPlanid() {
        return planid;
    }

    public void setPlanid(BigDecimal planid) {
        this.planid = planid;
    }

    @Basic
    @Column(name = "DOWNMINEDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getDownminedate() {
        return downminedate;
    }

    public void setDownminedate(Timestamp downminedate) {
        this.downminedate = downminedate;
    }

    @Basic
    @Column(name = "BANCI", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getBanci() {
        return banci;
    }

    public void setBanci(String banci) {
        this.banci = banci;
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
    @Column(name = "CREATEDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getCreatedept() {
        return createdept;
    }

    public void setCreatedept(String createdept) {
        this.createdept = createdept;
    }

    @Basic
    @Column(name = "LOG", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TpPlanChange that = (TpPlanChange) o;

        if (banci != null ? !banci.equals(that.banci) : that.banci != null) return false;
        if (createdept != null ? !createdept.equals(that.createdept) : that.createdept != null) return false;
        if (createtime != null ? !createtime.equals(that.createtime) : that.createtime != null) return false;
        if (createuser != null ? !createuser.equals(that.createuser) : that.createuser != null) return false;
        if (downminedate != null ? !downminedate.equals(that.downminedate) : that.downminedate != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (log != null ? !log.equals(that.log) : that.log != null) return false;
        if (planid != null ? !planid.equals(that.planid) : that.planid != null) return false;
        if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (planid != null ? planid.hashCode() : 0);
        result = 31 * result + (downminedate != null ? downminedate.hashCode() : 0);
        result = 31 * result + (banci != null ? banci.hashCode() : 0);
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        result = 31 * result + (createuser != null ? createuser.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createdept != null ? createdept.hashCode() : 0);
        result = 31 * result + (log != null ? log.hashCode() : 0);
        return result;
    }
}
