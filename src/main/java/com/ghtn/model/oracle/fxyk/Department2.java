package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
public class Department2 {
    private int deptid;
    private String deptname;
    private Integer fatherid;
    private String deptnumber;

    @Id
    @Column(name = "DEPTID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    @Basic
    @Column(name = "DEPTNAME", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    @Basic
    @Column(name = "FATHERID", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getFatherid() {
        return fatherid;
    }

    public void setFatherid(Integer fatherid) {
        this.fatherid = fatherid;
    }

    @Basic
    @Column(name = "DEPTNUMBER", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getDeptnumber() {
        return deptnumber;
    }

    public void setDeptnumber(String deptnumber) {
        this.deptnumber = deptnumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department2 that = (Department2) o;

        if (deptid != that.deptid) return false;
        if (deptname != null ? !deptname.equals(that.deptname) : that.deptname != null) return false;
        if (deptnumber != null ? !deptnumber.equals(that.deptnumber) : that.deptnumber != null) return false;
        if (fatherid != null ? !fatherid.equals(that.fatherid) : that.fatherid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deptid;
        result = 31 * result + (deptname != null ? deptname.hashCode() : 0);
        result = 31 * result + (fatherid != null ? fatherid.hashCode() : 0);
        result = 31 * result + (deptnumber != null ? deptnumber.hashCode() : 0);
        return result;
    }
}
