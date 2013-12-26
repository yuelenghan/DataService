package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
@Table(name = "DEPT_BZ", schema = "SEP3", catalog = "")
public class DeptBz {
    private String bzcode;
    private String bzname;
    private String fnumber;
    private Timestamp ctime;
    private String cuser;
    private String bzleader;
    private String miandept;
    private BigDecimal status;

    @Id
    @Column(name = "BZCODE", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    public String getBzcode() {
        return bzcode;
    }

    public void setBzcode(String bzcode) {
        this.bzcode = bzcode;
    }

    @Basic
    @Column(name = "BZNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getBzname() {
        return bzname;
    }

    public void setBzname(String bzname) {
        this.bzname = bzname;
    }

    @Basic
    @Column(name = "FNUMBER", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getFnumber() {
        return fnumber;
    }

    public void setFnumber(String fnumber) {
        this.fnumber = fnumber;
    }

    @Basic
    @Column(name = "CTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getCtime() {
        return ctime;
    }

    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
    }

    @Basic
    @Column(name = "CUSER", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getCuser() {
        return cuser;
    }

    public void setCuser(String cuser) {
        this.cuser = cuser;
    }

    @Basic
    @Column(name = "BZLEADER", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getBzleader() {
        return bzleader;
    }

    public void setBzleader(String bzleader) {
        this.bzleader = bzleader;
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
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeptBz deptBz = (DeptBz) o;

        if (bzcode != null ? !bzcode.equals(deptBz.bzcode) : deptBz.bzcode != null) return false;
        if (bzleader != null ? !bzleader.equals(deptBz.bzleader) : deptBz.bzleader != null) return false;
        if (bzname != null ? !bzname.equals(deptBz.bzname) : deptBz.bzname != null) return false;
        if (ctime != null ? !ctime.equals(deptBz.ctime) : deptBz.ctime != null) return false;
        if (cuser != null ? !cuser.equals(deptBz.cuser) : deptBz.cuser != null) return false;
        if (fnumber != null ? !fnumber.equals(deptBz.fnumber) : deptBz.fnumber != null) return false;
        if (miandept != null ? !miandept.equals(deptBz.miandept) : deptBz.miandept != null) return false;
        if (status != null ? !status.equals(deptBz.status) : deptBz.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bzcode != null ? bzcode.hashCode() : 0;
        result = 31 * result + (bzname != null ? bzname.hashCode() : 0);
        result = 31 * result + (fnumber != null ? fnumber.hashCode() : 0);
        result = 31 * result + (ctime != null ? ctime.hashCode() : 0);
        result = 31 * result + (cuser != null ? cuser.hashCode() : 0);
        result = 31 * result + (bzleader != null ? bzleader.hashCode() : 0);
        result = 31 * result + (miandept != null ? miandept.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
