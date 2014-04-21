package com.ghtn.model.oracle;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 2014/4/16
 * Time: 16:04
 */
@Entity
@Table(name = "SF_ROLE", schema = "SEP3", catalog = "")
public class SfRole {
    private BigDecimal roleid;
    private String rolename;
    private String roleabout;
    private Timestamp createtime;
    private String rolestatus;
    private BigDecimal levelid;
    private String maindeptid;

    @Id
    @Column(name = "ROLEID", nullable = false, insertable = true, updatable = true, precision = -127)
    public BigDecimal getRoleid() {
        return roleid;
    }

    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }

    @Basic
    @Column(name = "ROLENAME", nullable = true, insertable = true, updatable = true)
    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Basic
    @Column(name = "ROLEABOUT", nullable = true, insertable = true, updatable = true)
    public String getRoleabout() {
        return roleabout;
    }

    public void setRoleabout(String roleabout) {
        this.roleabout = roleabout;
    }

    @Basic
    @Column(name = "CREATETIME", nullable = true, insertable = true, updatable = true)
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "ROLESTATUS", nullable = true, insertable = true, updatable = true, length = 1)
    public String getRolestatus() {
        return rolestatus;
    }

    public void setRolestatus(String rolestatus) {
        this.rolestatus = rolestatus;
    }

    @Basic
    @Column(name = "LEVELID", nullable = true, insertable = true, updatable = true, precision = -127)
    public BigDecimal getLevelid() {
        return levelid;
    }

    public void setLevelid(BigDecimal levelid) {
        this.levelid = levelid;
    }

    @Basic
    @Column(name = "MAINDEPTID", nullable = true, insertable = true, updatable = true)
    public String getMaindeptid() {
        return maindeptid;
    }

    public void setMaindeptid(String maindeptid) {
        this.maindeptid = maindeptid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SfRole sfRole = (SfRole) o;

        if (createtime != null ? !createtime.equals(sfRole.createtime) : sfRole.createtime != null) return false;
        if (levelid != null ? !levelid.equals(sfRole.levelid) : sfRole.levelid != null) return false;
        if (maindeptid != null ? !maindeptid.equals(sfRole.maindeptid) : sfRole.maindeptid != null) return false;
        if (roleabout != null ? !roleabout.equals(sfRole.roleabout) : sfRole.roleabout != null) return false;
        if (roleid != null ? !roleid.equals(sfRole.roleid) : sfRole.roleid != null) return false;
        if (rolename != null ? !rolename.equals(sfRole.rolename) : sfRole.rolename != null) return false;
        if (rolestatus != null ? !rolestatus.equals(sfRole.rolestatus) : sfRole.rolestatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleid != null ? roleid.hashCode() : 0;
        result = 31 * result + (rolename != null ? rolename.hashCode() : 0);
        result = 31 * result + (roleabout != null ? roleabout.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (rolestatus != null ? rolestatus.hashCode() : 0);
        result = 31 * result + (levelid != null ? levelid.hashCode() : 0);
        result = 31 * result + (maindeptid != null ? maindeptid.hashCode() : 0);
        return result;
    }
}
