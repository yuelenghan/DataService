package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
@Table(name = "BASE_PL", schema = "SEP3", catalog = "")
@IdClass(BasePlPK.class)
public class BasePl {
    private Timestamp levelid;
    private String personnumber;
    private Timestamp createtime;
    private String createuser;
    private BigInteger status;

    @Id
    @Column(name = "LEVELID", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getLevelid() {
        return levelid;
    }

    public void setLevelid(Timestamp levelid) {
        this.levelid = levelid;
    }

    @Id
    @Column(name = "PERSONNUMBER", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPersonnumber() {
        return personnumber;
    }

    public void setPersonnumber(String personnumber) {
        this.personnumber = personnumber;
    }

    @Basic
    @Column(name = "CREATETIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "CREATEUSER", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
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

        BasePl basePl = (BasePl) o;

        if (createtime != null ? !createtime.equals(basePl.createtime) : basePl.createtime != null) return false;
        if (createuser != null ? !createuser.equals(basePl.createuser) : basePl.createuser != null) return false;
        if (levelid != null ? !levelid.equals(basePl.levelid) : basePl.levelid != null) return false;
        if (personnumber != null ? !personnumber.equals(basePl.personnumber) : basePl.personnumber != null)
            return false;
        if (status != null ? !status.equals(basePl.status) : basePl.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = levelid != null ? levelid.hashCode() : 0;
        result = 31 * result + (personnumber != null ? personnumber.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (createuser != null ? createuser.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
