package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

/**
 * User: Administrator
 * Date: 14-3-5
 * Time: 下午4:06
 */
@Entity
public class Department {
    private String deptnumber;
    private String deptname;
    private String fatherid;
    private BigInteger depttype;
    private BigInteger deptlevel;
    private BigInteger deptstatus;
    private String pinyin;
    private String usingdept;

    @Id
    @Column(name = "DEPTNUMBER", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    public String getDeptnumber() {
        return deptnumber;
    }

    public void setDeptnumber(String deptnumber) {
        this.deptnumber = deptnumber;
    }

    @Basic
    @Column(name = "DEPTNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    @Basic
    @Column(name = "FATHERID", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getFatherid() {
        return fatherid;
    }

    public void setFatherid(String fatherid) {
        this.fatherid = fatherid;
    }

    @Basic
    @Column(name = "DEPTTYPE", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getDepttype() {
        return depttype;
    }

    public void setDepttype(BigInteger depttype) {
        this.depttype = depttype;
    }

    @Basic
    @Column(name = "DEPTLEVEL", nullable = true, insertable = true, updatable = true, length = 2, precision = 0)
    public BigInteger getDeptlevel() {
        return deptlevel;
    }

    public void setDeptlevel(BigInteger deptlevel) {
        this.deptlevel = deptlevel;
    }

    @Basic
    @Column(name = "DEPTSTATUS", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getDeptstatus() {
        return deptstatus;
    }

    public void setDeptstatus(BigInteger deptstatus) {
        this.deptstatus = deptstatus;
    }

    @Basic
    @Column(name = "PINYIN", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    @Basic
    @Column(name = "USINGDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getUsingdept() {
        return usingdept;
    }

    public void setUsingdept(String usingdept) {
        this.usingdept = usingdept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (deptlevel != null ? !deptlevel.equals(that.deptlevel) : that.deptlevel != null) return false;
        if (deptname != null ? !deptname.equals(that.deptname) : that.deptname != null) return false;
        if (deptnumber != null ? !deptnumber.equals(that.deptnumber) : that.deptnumber != null) return false;
        if (deptstatus != null ? !deptstatus.equals(that.deptstatus) : that.deptstatus != null) return false;
        if (depttype != null ? !depttype.equals(that.depttype) : that.depttype != null) return false;
        if (fatherid != null ? !fatherid.equals(that.fatherid) : that.fatherid != null) return false;
        if (pinyin != null ? !pinyin.equals(that.pinyin) : that.pinyin != null) return false;
        if (usingdept != null ? !usingdept.equals(that.usingdept) : that.usingdept != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deptnumber != null ? deptnumber.hashCode() : 0;
        result = 31 * result + (deptname != null ? deptname.hashCode() : 0);
        result = 31 * result + (fatherid != null ? fatherid.hashCode() : 0);
        result = 31 * result + (depttype != null ? depttype.hashCode() : 0);
        result = 31 * result + (deptlevel != null ? deptlevel.hashCode() : 0);
        result = 31 * result + (deptstatus != null ? deptstatus.hashCode() : 0);
        result = 31 * result + (pinyin != null ? pinyin.hashCode() : 0);
        result = 31 * result + (usingdept != null ? usingdept.hashCode() : 0);
        return result;
    }
}
