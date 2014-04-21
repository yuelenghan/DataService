package com.ghtn.model.oracle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 2014/4/16
 * Time: 16:04
 */
@Entity
@Table(name = "SF_USERROLE", schema = "SEP3", catalog = "")
public class SfUserrole {
    private BigDecimal userroleid;

    @Id
    @Column(name = "USERROLEID", nullable = false, insertable = true, updatable = true, precision = -127)
    public BigDecimal getUserroleid() {
        return userroleid;
    }

    public void setUserroleid(BigDecimal userroleid) {
        this.userroleid = userroleid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SfUserrole that = (SfUserrole) o;

        if (userroleid != null ? !userroleid.equals(that.userroleid) : that.userroleid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return userroleid != null ? userroleid.hashCode() : 0;
    }
}
