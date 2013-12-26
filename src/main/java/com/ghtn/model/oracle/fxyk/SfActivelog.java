package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
@Table(name = "SF_ACTIVELOG", schema = "SEP3", catalog = "")
public class SfActivelog {
    private BigDecimal id;
    private String personnumber;
    private String username;
    private String ip;
    private Timestamp activetime;
    private String activetype;
    private String activepage;
    private String activedescription;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
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
    @Column(name = "IP", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "ACTIVETIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getActivetime() {
        return activetime;
    }

    public void setActivetime(Timestamp activetime) {
        this.activetime = activetime;
    }

    @Basic
    @Column(name = "ACTIVETYPE", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getActivetype() {
        return activetype;
    }

    public void setActivetype(String activetype) {
        this.activetype = activetype;
    }

    @Basic
    @Column(name = "ACTIVEPAGE", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getActivepage() {
        return activepage;
    }

    public void setActivepage(String activepage) {
        this.activepage = activepage;
    }

    @Basic
    @Column(name = "ACTIVEDESCRIPTION", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getActivedescription() {
        return activedescription;
    }

    public void setActivedescription(String activedescription) {
        this.activedescription = activedescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SfActivelog that = (SfActivelog) o;

        if (activedescription != null ? !activedescription.equals(that.activedescription) : that.activedescription != null)
            return false;
        if (activepage != null ? !activepage.equals(that.activepage) : that.activepage != null) return false;
        if (activetime != null ? !activetime.equals(that.activetime) : that.activetime != null) return false;
        if (activetype != null ? !activetype.equals(that.activetype) : that.activetype != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (personnumber != null ? !personnumber.equals(that.personnumber) : that.personnumber != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (personnumber != null ? personnumber.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (activetime != null ? activetime.hashCode() : 0);
        result = 31 * result + (activetype != null ? activetype.hashCode() : 0);
        result = 31 * result + (activepage != null ? activepage.hashCode() : 0);
        result = 31 * result + (activedescription != null ? activedescription.hashCode() : 0);
        return result;
    }
}
