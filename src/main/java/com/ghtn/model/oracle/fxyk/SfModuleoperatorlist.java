package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@Table(name = "SF_MODULEOPERATORLIST", schema = "SEP3", catalog = "")
public class SfModuleoperatorlist {
    private BigDecimal moduleoperatorid;
    private String operatortag;

    @Id
    @Column(name = "MODULEOPERATORID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getModuleoperatorid() {
        return moduleoperatorid;
    }

    public void setModuleoperatorid(BigDecimal moduleoperatorid) {
        this.moduleoperatorid = moduleoperatorid;
    }

    @Basic
    @Column(name = "OPERATORTAG", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getOperatortag() {
        return operatortag;
    }

    public void setOperatortag(String operatortag) {
        this.operatortag = operatortag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SfModuleoperatorlist that = (SfModuleoperatorlist) o;

        if (moduleoperatorid != null ? !moduleoperatorid.equals(that.moduleoperatorid) : that.moduleoperatorid != null)
            return false;
        if (operatortag != null ? !operatortag.equals(that.operatortag) : that.operatortag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = moduleoperatorid != null ? moduleoperatorid.hashCode() : 0;
        result = 31 * result + (operatortag != null ? operatortag.hashCode() : 0);
        return result;
    }
}
