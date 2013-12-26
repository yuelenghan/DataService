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
@Table(name = "TP_SCHEDULE", schema = "SEP3", catalog = "")
public class TpSchedule {
    private BigDecimal id;
    private String personid;
    private BigDecimal needfreq;
    private BigDecimal needhour;
    private BigDecimal planfreq;
    private String status;
    private String createuser;
    private String createdept;
    private Timestamp createtime;
    private Timestamp canceltime;
    private String about;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PERSONID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    @Basic
    @Column(name = "NEEDFREQ", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getNeedfreq() {
        return needfreq;
    }

    public void setNeedfreq(BigDecimal needfreq) {
        this.needfreq = needfreq;
    }

    @Basic
    @Column(name = "NEEDHOUR", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getNeedhour() {
        return needhour;
    }

    public void setNeedhour(BigDecimal needhour) {
        this.needhour = needhour;
    }

    @Basic
    @Column(name = "PLANFREQ", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getPlanfreq() {
        return planfreq;
    }

    public void setPlanfreq(BigDecimal planfreq) {
        this.planfreq = planfreq;
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
    @Column(name = "CANCELTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getCanceltime() {
        return canceltime;
    }

    public void setCanceltime(Timestamp canceltime) {
        this.canceltime = canceltime;
    }

    @Basic
    @Column(name = "ABOUT", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TpSchedule that = (TpSchedule) o;

        if (about != null ? !about.equals(that.about) : that.about != null) return false;
        if (canceltime != null ? !canceltime.equals(that.canceltime) : that.canceltime != null) return false;
        if (createdept != null ? !createdept.equals(that.createdept) : that.createdept != null) return false;
        if (createtime != null ? !createtime.equals(that.createtime) : that.createtime != null) return false;
        if (createuser != null ? !createuser.equals(that.createuser) : that.createuser != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (needfreq != null ? !needfreq.equals(that.needfreq) : that.needfreq != null) return false;
        if (needhour != null ? !needhour.equals(that.needhour) : that.needhour != null) return false;
        if (personid != null ? !personid.equals(that.personid) : that.personid != null) return false;
        if (planfreq != null ? !planfreq.equals(that.planfreq) : that.planfreq != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        result = 31 * result + (needfreq != null ? needfreq.hashCode() : 0);
        result = 31 * result + (needhour != null ? needhour.hashCode() : 0);
        result = 31 * result + (planfreq != null ? planfreq.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createuser != null ? createuser.hashCode() : 0);
        result = 31 * result + (createdept != null ? createdept.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (canceltime != null ? canceltime.hashCode() : 0);
        result = 31 * result + (about != null ? about.hashCode() : 0);
        return result;
    }
}
