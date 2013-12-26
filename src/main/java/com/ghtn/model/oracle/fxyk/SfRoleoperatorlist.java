package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@Table(name = "SF_ROLEOPERATORLIST", schema = "SEP3", catalog = "")
public class SfRoleoperatorlist {
    private BigDecimal id;
    private String status;
    private BigDecimal userid;
    private String operatortag;
    private BigDecimal usergroupid;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "USERID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getUserid() {
        return userid;
    }

    public void setUserid(BigDecimal userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "OPERATORTAG", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getOperatortag() {
        return operatortag;
    }

    public void setOperatortag(String operatortag) {
        this.operatortag = operatortag;
    }

    @Basic
    @Column(name = "USERGROUPID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getUsergroupid() {
        return usergroupid;
    }

    public void setUsergroupid(BigDecimal usergroupid) {
        this.usergroupid = usergroupid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SfRoleoperatorlist that = (SfRoleoperatorlist) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (operatortag != null ? !operatortag.equals(that.operatortag) : that.operatortag != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (usergroupid != null ? !usergroupid.equals(that.usergroupid) : that.usergroupid != null) return false;
        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (operatortag != null ? operatortag.hashCode() : 0);
        result = 31 * result + (usergroupid != null ? usergroupid.hashCode() : 0);
        return result;
    }
}
