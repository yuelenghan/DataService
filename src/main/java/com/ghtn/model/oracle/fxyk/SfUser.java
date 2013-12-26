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
@Table(name = "SF_USER", schema = "SEP3", catalog = "")
public class SfUser {
    private BigDecimal userid;
    private String personnumber;
    private String username;
    private String password;
    private String isonline;
    private Timestamp lastlogintime;
    private String about;
    private Timestamp createtime;
    private String userstatus;

    @Id
    @Column(name = "USERID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getUserid() {
        return userid;
    }

    public void setUserid(BigDecimal userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "PERSONNUMBER", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getPersonnumber() {
        return personnumber;
    }

    public void setPersonnumber(String personnumber) {
        this.personnumber = personnumber;
    }

    @Basic
    @Column(name = "USERNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "ISONLINE", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public String getIsonline() {
        return isonline;
    }

    public void setIsonline(String isonline) {
        this.isonline = isonline;
    }

    @Basic
    @Column(name = "LASTLOGINTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Timestamp lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    @Basic
    @Column(name = "ABOUT", nullable = true, insertable = true, updatable = true, length = 300, precision = 0)
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
    @Column(name = "USERSTATUS", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public String getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(String userstatus) {
        this.userstatus = userstatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SfUser sfUser = (SfUser) o;

        if (about != null ? !about.equals(sfUser.about) : sfUser.about != null) return false;
        if (createtime != null ? !createtime.equals(sfUser.createtime) : sfUser.createtime != null) return false;
        if (isonline != null ? !isonline.equals(sfUser.isonline) : sfUser.isonline != null) return false;
        if (lastlogintime != null ? !lastlogintime.equals(sfUser.lastlogintime) : sfUser.lastlogintime != null)
            return false;
        if (password != null ? !password.equals(sfUser.password) : sfUser.password != null) return false;
        if (personnumber != null ? !personnumber.equals(sfUser.personnumber) : sfUser.personnumber != null)
            return false;
        if (userid != null ? !userid.equals(sfUser.userid) : sfUser.userid != null) return false;
        if (username != null ? !username.equals(sfUser.username) : sfUser.username != null) return false;
        if (userstatus != null ? !userstatus.equals(sfUser.userstatus) : sfUser.userstatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid != null ? userid.hashCode() : 0;
        result = 31 * result + (personnumber != null ? personnumber.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (isonline != null ? isonline.hashCode() : 0);
        result = 31 * result + (lastlogintime != null ? lastlogintime.hashCode() : 0);
        result = 31 * result + (about != null ? about.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (userstatus != null ? userstatus.hashCode() : 0);
        return result;
    }
}
