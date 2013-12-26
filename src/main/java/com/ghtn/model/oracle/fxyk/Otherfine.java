package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
public class Otherfine {
    private Timestamp recordtime;
    private Integer ftype;
    private Timestamp fdate;
    private String remark;
    private String miandept;
    private String rperson;
    private BigInteger status;

    @Id
    @Column(name = "RECORDTIME", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Timestamp recordtime) {
        this.recordtime = recordtime;
    }

    @Basic
    @Column(name = "FTYPE", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getFtype() {
        return ftype;
    }

    public void setFtype(Integer ftype) {
        this.ftype = ftype;
    }

    @Basic
    @Column(name = "FDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getFdate() {
        return fdate;
    }

    public void setFdate(Timestamp fdate) {
        this.fdate = fdate;
    }

    @Basic
    @Column(name = "REMARK", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "MIANDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMiandept() {
        return miandept;
    }

    public void setMiandept(String miandept) {
        this.miandept = miandept;
    }

    @Basic
    @Column(name = "RPERSON", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getRperson() {
        return rperson;
    }

    public void setRperson(String rperson) {
        this.rperson = rperson;
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

        Otherfine otherfine = (Otherfine) o;

        if (fdate != null ? !fdate.equals(otherfine.fdate) : otherfine.fdate != null) return false;
        if (ftype != null ? !ftype.equals(otherfine.ftype) : otherfine.ftype != null) return false;
        if (miandept != null ? !miandept.equals(otherfine.miandept) : otherfine.miandept != null) return false;
        if (recordtime != null ? !recordtime.equals(otherfine.recordtime) : otherfine.recordtime != null) return false;
        if (remark != null ? !remark.equals(otherfine.remark) : otherfine.remark != null) return false;
        if (rperson != null ? !rperson.equals(otherfine.rperson) : otherfine.rperson != null) return false;
        if (status != null ? !status.equals(otherfine.status) : otherfine.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recordtime != null ? recordtime.hashCode() : 0;
        result = 31 * result + (ftype != null ? ftype.hashCode() : 0);
        result = 31 * result + (fdate != null ? fdate.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (miandept != null ? miandept.hashCode() : 0);
        result = 31 * result + (rperson != null ? rperson.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
