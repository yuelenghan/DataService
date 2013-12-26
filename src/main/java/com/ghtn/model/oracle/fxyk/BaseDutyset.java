package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
@Table(name = "BASE_DUTYSET", schema = "SEP3", catalog = "")
@IdClass(BaseDutysetPK.class)
public class BaseDutyset {
    private BigDecimal groupid;
    private String persunnumber;
    private Timestamp inputtime;
    private String inputperson;
    private String maindept;
    private BigInteger status;

    @Id
    @Column(name = "GROUPID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getGroupid() {
        return groupid;
    }

    public void setGroupid(BigDecimal groupid) {
        this.groupid = groupid;
    }

    @Id
    @Column(name = "PERSUNNUMBER", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPersunnumber() {
        return persunnumber;
    }

    public void setPersunnumber(String persunnumber) {
        this.persunnumber = persunnumber;
    }

    @Basic
    @Column(name = "INPUTTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getInputtime() {
        return inputtime;
    }

    public void setInputtime(Timestamp inputtime) {
        this.inputtime = inputtime;
    }

    @Basic
    @Column(name = "INPUTPERSON", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getInputperson() {
        return inputperson;
    }

    public void setInputperson(String inputperson) {
        this.inputperson = inputperson;
    }

    @Basic
    @Column(name = "MAINDEPT", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindept() {
        return maindept;
    }

    public void setMaindept(String maindept) {
        this.maindept = maindept;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getStatus() {
        return status;
    }

    public void setStatus(BigInteger status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseDutyset that = (BaseDutyset) o;

        if (groupid != null ? !groupid.equals(that.groupid) : that.groupid != null) return false;
        if (inputperson != null ? !inputperson.equals(that.inputperson) : that.inputperson != null) return false;
        if (inputtime != null ? !inputtime.equals(that.inputtime) : that.inputtime != null) return false;
        if (maindept != null ? !maindept.equals(that.maindept) : that.maindept != null) return false;
        if (persunnumber != null ? !persunnumber.equals(that.persunnumber) : that.persunnumber != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = groupid != null ? groupid.hashCode() : 0;
        result = 31 * result + (persunnumber != null ? persunnumber.hashCode() : 0);
        result = 31 * result + (inputtime != null ? inputtime.hashCode() : 0);
        result = 31 * result + (inputperson != null ? inputperson.hashCode() : 0);
        result = 31 * result + (maindept != null ? maindept.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
