package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@Table(name = "SF_USERGROUP", schema = "SEP3", catalog = "")
public class SfUsergroup {
    private BigDecimal usergroupid;
    private String usergroupname;
    private BigDecimal parentusergroupid;
    private String about;
    private Timestamp createtime;
    private String status;

    @Id
    @Column(name = "USERGROUPID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getUsergroupid() {
        return usergroupid;
    }

    public void setUsergroupid(BigDecimal usergroupid) {
        this.usergroupid = usergroupid;
    }

    @Basic
    @Column(name = "USERGROUPNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getUsergroupname() {
        return usergroupname;
    }

    public void setUsergroupname(String usergroupname) {
        this.usergroupname = usergroupname;
    }

    @Basic
    @Column(name = "PARENTUSERGROUPID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getParentusergroupid() {
        return parentusergroupid;
    }

    public void setParentusergroupid(BigDecimal parentusergroupid) {
        this.parentusergroupid = parentusergroupid;
    }

    @Basic
    @Column(name = "ABOUT", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
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
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
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

        SfUsergroup that = (SfUsergroup) o;

        if (about != null ? !about.equals(that.about) : that.about != null) return false;
        if (createtime != null ? !createtime.equals(that.createtime) : that.createtime != null) return false;
        if (parentusergroupid != null ? !parentusergroupid.equals(that.parentusergroupid) : that.parentusergroupid != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (usergroupid != null ? !usergroupid.equals(that.usergroupid) : that.usergroupid != null) return false;
        if (usergroupname != null ? !usergroupname.equals(that.usergroupname) : that.usergroupname != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = usergroupid != null ? usergroupid.hashCode() : 0;
        result = 31 * result + (usergroupname != null ? usergroupname.hashCode() : 0);
        result = 31 * result + (parentusergroupid != null ? parentusergroupid.hashCode() : 0);
        result = 31 * result + (about != null ? about.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
