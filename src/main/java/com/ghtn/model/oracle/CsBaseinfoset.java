package com.ghtn.model.oracle;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
@Table(name = "CS_BASEINFOSET", schema = "SEP3", catalog = "")
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class CsBaseinfoset {
    private int infoid;
    private String infocode;
    private String infoname;
    private Integer fid;
    private String codingtype;
    private BigDecimal codingl;
    private String pdepart;
    private String pperid;
    private Timestamp pday;
    private String sperid;
    private Timestamp sday;
    private String remarks;
    private String status;

    @Id
    @Column(name = "INFOID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getInfoid() {
        return infoid;
    }

    public void setInfoid(int infoid) {
        this.infoid = infoid;
    }

    @Basic
    @Column(name = "INFOCODE", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getInfocode() {
        return infocode;
    }

    public void setInfocode(String infocode) {
        this.infocode = infocode;
    }

    @Basic
    @Column(name = "INFONAME", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getInfoname() {
        return infoname;
    }

    public void setInfoname(String infoname) {
        this.infoname = infoname;
    }

    @Basic
    @Column(name = "FID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "CODINGTYPE", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getCodingtype() {
        return codingtype;
    }

    public void setCodingtype(String codingtype) {
        this.codingtype = codingtype;
    }

    @Basic
    @Column(name = "CODINGL", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getCodingl() {
        return codingl;
    }

    public void setCodingl(BigDecimal codingl) {
        this.codingl = codingl;
    }

    @Basic
    @Column(name = "PDEPART", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getPdepart() {
        return pdepart;
    }

    public void setPdepart(String pdepart) {
        this.pdepart = pdepart;
    }

    @Basic
    @Column(name = "PPERID", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getPperid() {
        return pperid;
    }

    public void setPperid(String pperid) {
        this.pperid = pperid;
    }

    @Basic
    @Column(name = "PDAY", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getPday() {
        return pday;
    }

    public void setPday(Timestamp pday) {
        this.pday = pday;
    }

    @Basic
    @Column(name = "SPERID", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getSperid() {
        return sperid;
    }

    public void setSperid(String sperid) {
        this.sperid = sperid;
    }

    @Basic
    @Column(name = "SDAY", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getSday() {
        return sday;
    }

    public void setSday(Timestamp sday) {
        this.sday = sday;
    }

    @Basic
    @Column(name = "REMARKS", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

        CsBaseinfoset that = (CsBaseinfoset) o;

        if (infoid != that.infoid) return false;
        if (codingl != null ? !codingl.equals(that.codingl) : that.codingl != null) return false;
        if (codingtype != null ? !codingtype.equals(that.codingtype) : that.codingtype != null) return false;
        if (fid != null ? !fid.equals(that.fid) : that.fid != null) return false;
        if (infocode != null ? !infocode.equals(that.infocode) : that.infocode != null) return false;
        if (infoname != null ? !infoname.equals(that.infoname) : that.infoname != null) return false;
        if (pday != null ? !pday.equals(that.pday) : that.pday != null) return false;
        if (pdepart != null ? !pdepart.equals(that.pdepart) : that.pdepart != null) return false;
        if (pperid != null ? !pperid.equals(that.pperid) : that.pperid != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
        if (sday != null ? !sday.equals(that.sday) : that.sday != null) return false;
        if (sperid != null ? !sperid.equals(that.sperid) : that.sperid != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = infoid;
        result = 31 * result + (infocode != null ? infocode.hashCode() : 0);
        result = 31 * result + (infoname != null ? infoname.hashCode() : 0);
        result = 31 * result + (fid != null ? fid.hashCode() : 0);
        result = 31 * result + (codingtype != null ? codingtype.hashCode() : 0);
        result = 31 * result + (codingl != null ? codingl.hashCode() : 0);
        result = 31 * result + (pdepart != null ? pdepart.hashCode() : 0);
        result = 31 * result + (pperid != null ? pperid.hashCode() : 0);
        result = 31 * result + (pday != null ? pday.hashCode() : 0);
        result = 31 * result + (sperid != null ? sperid.hashCode() : 0);
        result = 31 * result + (sday != null ? sday.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
