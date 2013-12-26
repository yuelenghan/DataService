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
@Table(name = "TM_CERTIFICATE", schema = "SEP3", catalog = "")
public class TmCertificate {
    private BigDecimal id;
    private String certifcode;
    private String personnumber;
    private BigDecimal workid;
    private BigDecimal prewarningid;
    private Timestamp getdate;
    private Timestamp firstdate;
    private String firstaddr;
    private Timestamp seconddate;
    private String secondaddr;
    private BigDecimal isprimary;
    private String about;
    private BigDecimal status;
    private String maindeptid;
    private String certifname;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CERTIFCODE", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    public String getCertifcode() {
        return certifcode;
    }

    public void setCertifcode(String certifcode) {
        this.certifcode = certifcode;
    }

    @Basic
    @Column(name = "PERSONNUMBER", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPersonnumber() {
        return personnumber;
    }

    public void setPersonnumber(String personnumber) {
        this.personnumber = personnumber;
    }

    @Basic
    @Column(name = "WORKID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getWorkid() {
        return workid;
    }

    public void setWorkid(BigDecimal workid) {
        this.workid = workid;
    }

    @Basic
    @Column(name = "PREWARNINGID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getPrewarningid() {
        return prewarningid;
    }

    public void setPrewarningid(BigDecimal prewarningid) {
        this.prewarningid = prewarningid;
    }

    @Basic
    @Column(name = "GETDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getGetdate() {
        return getdate;
    }

    public void setGetdate(Timestamp getdate) {
        this.getdate = getdate;
    }

    @Basic
    @Column(name = "FIRSTDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getFirstdate() {
        return firstdate;
    }

    public void setFirstdate(Timestamp firstdate) {
        this.firstdate = firstdate;
    }

    @Basic
    @Column(name = "FIRSTADDR", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getFirstaddr() {
        return firstaddr;
    }

    public void setFirstaddr(String firstaddr) {
        this.firstaddr = firstaddr;
    }

    @Basic
    @Column(name = "SECONDDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getSeconddate() {
        return seconddate;
    }

    public void setSeconddate(Timestamp seconddate) {
        this.seconddate = seconddate;
    }

    @Basic
    @Column(name = "SECONDADDR", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getSecondaddr() {
        return secondaddr;
    }

    public void setSecondaddr(String secondaddr) {
        this.secondaddr = secondaddr;
    }

    @Basic
    @Column(name = "ISPRIMARY", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getIsprimary() {
        return isprimary;
    }

    public void setIsprimary(BigDecimal isprimary) {
        this.isprimary = isprimary;
    }

    @Basic
    @Column(name = "ABOUT", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    @Basic
    @Column(name = "MAINDEPTID", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindeptid() {
        return maindeptid;
    }

    public void setMaindeptid(String maindeptid) {
        this.maindeptid = maindeptid;
    }

    @Basic
    @Column(name = "CERTIFNAME", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getCertifname() {
        return certifname;
    }

    public void setCertifname(String certifname) {
        this.certifname = certifname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmCertificate that = (TmCertificate) o;

        if (about != null ? !about.equals(that.about) : that.about != null) return false;
        if (certifcode != null ? !certifcode.equals(that.certifcode) : that.certifcode != null) return false;
        if (certifname != null ? !certifname.equals(that.certifname) : that.certifname != null) return false;
        if (firstaddr != null ? !firstaddr.equals(that.firstaddr) : that.firstaddr != null) return false;
        if (firstdate != null ? !firstdate.equals(that.firstdate) : that.firstdate != null) return false;
        if (getdate != null ? !getdate.equals(that.getdate) : that.getdate != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (isprimary != null ? !isprimary.equals(that.isprimary) : that.isprimary != null) return false;
        if (maindeptid != null ? !maindeptid.equals(that.maindeptid) : that.maindeptid != null) return false;
        if (personnumber != null ? !personnumber.equals(that.personnumber) : that.personnumber != null) return false;
        if (prewarningid != null ? !prewarningid.equals(that.prewarningid) : that.prewarningid != null) return false;
        if (secondaddr != null ? !secondaddr.equals(that.secondaddr) : that.secondaddr != null) return false;
        if (seconddate != null ? !seconddate.equals(that.seconddate) : that.seconddate != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (workid != null ? !workid.equals(that.workid) : that.workid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (certifcode != null ? certifcode.hashCode() : 0);
        result = 31 * result + (personnumber != null ? personnumber.hashCode() : 0);
        result = 31 * result + (workid != null ? workid.hashCode() : 0);
        result = 31 * result + (prewarningid != null ? prewarningid.hashCode() : 0);
        result = 31 * result + (getdate != null ? getdate.hashCode() : 0);
        result = 31 * result + (firstdate != null ? firstdate.hashCode() : 0);
        result = 31 * result + (firstaddr != null ? firstaddr.hashCode() : 0);
        result = 31 * result + (seconddate != null ? seconddate.hashCode() : 0);
        result = 31 * result + (secondaddr != null ? secondaddr.hashCode() : 0);
        result = 31 * result + (isprimary != null ? isprimary.hashCode() : 0);
        result = 31 * result + (about != null ? about.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (maindeptid != null ? maindeptid.hashCode() : 0);
        result = 31 * result + (certifname != null ? certifname.hashCode() : 0);
        return result;
    }
}
