package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
public class Sysnoticefb {
    private int nfbid;
    private Integer nid;
    private String deptid;
    private String beizhu;
    private String status;

    @Id
    @Column(name = "NFBID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getNfbid() {
        return nfbid;
    }

    public void setNfbid(int nfbid) {
        this.nfbid = nfbid;
    }

    @Basic
    @Column(name = "NID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    @Basic
    @Column(name = "DEPTID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    @Basic
    @Column(name = "BEIZHU", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
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

        Sysnoticefb that = (Sysnoticefb) o;

        if (nfbid != that.nfbid) return false;
        if (beizhu != null ? !beizhu.equals(that.beizhu) : that.beizhu != null) return false;
        if (deptid != null ? !deptid.equals(that.deptid) : that.deptid != null) return false;
        if (nid != null ? !nid.equals(that.nid) : that.nid != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nfbid;
        result = 31 * result + (nid != null ? nid.hashCode() : 0);
        result = 31 * result + (deptid != null ? deptid.hashCode() : 0);
        result = 31 * result + (beizhu != null ? beizhu.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
