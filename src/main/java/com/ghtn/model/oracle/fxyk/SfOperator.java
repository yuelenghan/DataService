package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@Table(name = "SF_OPERATOR", schema = "SEP3", catalog = "")
public class SfOperator {
    private BigDecimal operatorid;
    private String operatorname;
    private String operatortag;
    private String about;
    private BigDecimal operatororder;
    private String status;

    @Id
    @Column(name = "OPERATORID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(BigDecimal operatorid) {
        this.operatorid = operatorid;
    }

    @Basic
    @Column(name = "OPERATORNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
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
    @Column(name = "ABOUT", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Basic
    @Column(name = "OPERATORORDER", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getOperatororder() {
        return operatororder;
    }

    public void setOperatororder(BigDecimal operatororder) {
        this.operatororder = operatororder;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SfOperator that = (SfOperator) o;

        if (about != null ? !about.equals(that.about) : that.about != null) return false;
        if (operatorid != null ? !operatorid.equals(that.operatorid) : that.operatorid != null) return false;
        if (operatorname != null ? !operatorname.equals(that.operatorname) : that.operatorname != null) return false;
        if (operatororder != null ? !operatororder.equals(that.operatororder) : that.operatororder != null)
            return false;
        if (operatortag != null ? !operatortag.equals(that.operatortag) : that.operatortag != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = operatorid != null ? operatorid.hashCode() : 0;
        result = 31 * result + (operatorname != null ? operatorname.hashCode() : 0);
        result = 31 * result + (operatortag != null ? operatortag.hashCode() : 0);
        result = 31 * result + (about != null ? about.hashCode() : 0);
        result = 31 * result + (operatororder != null ? operatororder.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
