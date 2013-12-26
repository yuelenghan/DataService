package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
public class Swinput {
    private int id;
    private String swnumber;
    private String swpersonid;
    private Integer placeid;
    private Timestamp pctime;
    private String banci;
    private String pcpersonid;
    private BigInteger isend;
    private BigInteger ispublic;
    private Timestamp intime;
    private BigDecimal fine;
    private BigInteger isadministrativepenalty;
    private String inputpersonid;
    private String maindeptid;
    private String remarks;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "SWNUMBER", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getSwnumber() {
        return swnumber;
    }

    public void setSwnumber(String swnumber) {
        this.swnumber = swnumber;
    }

    @Basic
    @Column(name = "SWPERSONID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getSwpersonid() {
        return swpersonid;
    }

    public void setSwpersonid(String swpersonid) {
        this.swpersonid = swpersonid;
    }

    @Basic
    @Column(name = "PLACEID", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPlaceid() {
        return placeid;
    }

    public void setPlaceid(Integer placeid) {
        this.placeid = placeid;
    }

    @Basic
    @Column(name = "PCTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getPctime() {
        return pctime;
    }

    public void setPctime(Timestamp pctime) {
        this.pctime = pctime;
    }

    @Basic
    @Column(name = "BANCI", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getBanci() {
        return banci;
    }

    public void setBanci(String banci) {
        this.banci = banci;
    }

    @Basic
    @Column(name = "PCPERSONID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPcpersonid() {
        return pcpersonid;
    }

    public void setPcpersonid(String pcpersonid) {
        this.pcpersonid = pcpersonid;
    }

    @Basic
    @Column(name = "ISEND", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getIsend() {
        return isend;
    }

    public void setIsend(BigInteger isend) {
        this.isend = isend;
    }

    @Basic
    @Column(name = "ISPUBLIC", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getIspublic() {
        return ispublic;
    }

    public void setIspublic(BigInteger ispublic) {
        this.ispublic = ispublic;
    }

    @Basic
    @Column(name = "INTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getIntime() {
        return intime;
    }

    public void setIntime(Timestamp intime) {
        this.intime = intime;
    }

    @Basic
    @Column(name = "FINE", nullable = true, insertable = true, updatable = true, length = 19, precision = 4)
    public BigDecimal getFine() {
        return fine;
    }

    public void setFine(BigDecimal fine) {
        this.fine = fine;
    }

    @Basic
    @Column(name = "ISADMINISTRATIVEPENALTY", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getIsadministrativepenalty() {
        return isadministrativepenalty;
    }

    public void setIsadministrativepenalty(BigInteger isadministrativepenalty) {
        this.isadministrativepenalty = isadministrativepenalty;
    }

    @Basic
    @Column(name = "INPUTPERSONID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getInputpersonid() {
        return inputpersonid;
    }

    public void setInputpersonid(String inputpersonid) {
        this.inputpersonid = inputpersonid;
    }

    @Basic
    @Column(name = "MAINDEPTID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getMaindeptid() {
        return maindeptid;
    }

    public void setMaindeptid(String maindeptid) {
        this.maindeptid = maindeptid;
    }

    @Basic
    @Column(name = "REMARKS", nullable = true, insertable = true, updatable = true, length = 2000, precision = 0)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Swinput swinput = (Swinput) o;

        if (id != swinput.id) return false;
        if (banci != null ? !banci.equals(swinput.banci) : swinput.banci != null) return false;
        if (fine != null ? !fine.equals(swinput.fine) : swinput.fine != null) return false;
        if (inputpersonid != null ? !inputpersonid.equals(swinput.inputpersonid) : swinput.inputpersonid != null)
            return false;
        if (intime != null ? !intime.equals(swinput.intime) : swinput.intime != null) return false;
        if (isadministrativepenalty != null ? !isadministrativepenalty.equals(swinput.isadministrativepenalty) : swinput.isadministrativepenalty != null)
            return false;
        if (isend != null ? !isend.equals(swinput.isend) : swinput.isend != null) return false;
        if (ispublic != null ? !ispublic.equals(swinput.ispublic) : swinput.ispublic != null) return false;
        if (maindeptid != null ? !maindeptid.equals(swinput.maindeptid) : swinput.maindeptid != null) return false;
        if (pcpersonid != null ? !pcpersonid.equals(swinput.pcpersonid) : swinput.pcpersonid != null) return false;
        if (pctime != null ? !pctime.equals(swinput.pctime) : swinput.pctime != null) return false;
        if (placeid != null ? !placeid.equals(swinput.placeid) : swinput.placeid != null) return false;
        if (remarks != null ? !remarks.equals(swinput.remarks) : swinput.remarks != null) return false;
        if (swnumber != null ? !swnumber.equals(swinput.swnumber) : swinput.swnumber != null) return false;
        if (swpersonid != null ? !swpersonid.equals(swinput.swpersonid) : swinput.swpersonid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (swnumber != null ? swnumber.hashCode() : 0);
        result = 31 * result + (swpersonid != null ? swpersonid.hashCode() : 0);
        result = 31 * result + (placeid != null ? placeid.hashCode() : 0);
        result = 31 * result + (pctime != null ? pctime.hashCode() : 0);
        result = 31 * result + (banci != null ? banci.hashCode() : 0);
        result = 31 * result + (pcpersonid != null ? pcpersonid.hashCode() : 0);
        result = 31 * result + (isend != null ? isend.hashCode() : 0);
        result = 31 * result + (ispublic != null ? ispublic.hashCode() : 0);
        result = 31 * result + (intime != null ? intime.hashCode() : 0);
        result = 31 * result + (fine != null ? fine.hashCode() : 0);
        result = 31 * result + (isadministrativepenalty != null ? isadministrativepenalty.hashCode() : 0);
        result = 31 * result + (inputpersonid != null ? inputpersonid.hashCode() : 0);
        result = 31 * result + (maindeptid != null ? maindeptid.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        return result;
    }
}
