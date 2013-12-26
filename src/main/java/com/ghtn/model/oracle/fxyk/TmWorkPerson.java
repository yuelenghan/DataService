package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@Table(name = "TM_WORK_PERSON", schema = "SEP3", catalog = "")
public class TmWorkPerson {
    private BigDecimal id;
    private BigDecimal workid;
    private String personnumber;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column(name = "WORKID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getWorkid() {
        return workid;
    }

    public void setWorkid(BigDecimal workid) {
        this.workid = workid;
    }

    @Basic
    @Column(name = "PERSONNUMBER", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getPersonnumber() {
        return personnumber;
    }

    public void setPersonnumber(String personnumber) {
        this.personnumber = personnumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmWorkPerson that = (TmWorkPerson) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (personnumber != null ? !personnumber.equals(that.personnumber) : that.personnumber != null) return false;
        if (workid != null ? !workid.equals(that.workid) : that.workid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (workid != null ? workid.hashCode() : 0);
        result = 31 * result + (personnumber != null ? personnumber.hashCode() : 0);
        return result;
    }
}
