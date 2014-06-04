package com.ghtn.model.oracle;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by lihe on 14-6-4.
 */
@Entity
@IdClass(NyhfinedetailPK.class)
public class Nyhfinedetail {
    private int yhputinid;
    private Date recorddate;
    private long lcmark;
    private BigInteger finetype;
    private String objectname;
    private String fineid;
    private String finename;
    private BigDecimal fine;
    private String remarks;

    @Id
    @Column(name = "YHPUTINID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(int yhputinid) {
        this.yhputinid = yhputinid;
    }

    @Id
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RECORDDATE", nullable = false, insertable = true, updatable = true)
    public Date getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }

    @Id
    @Column(name = "LCMARK", nullable = false, insertable = true, updatable = true, precision = 0)
    public long getLcmark() {
        return lcmark;
    }

    public void setLcmark(long lcmark) {
        this.lcmark = lcmark;
    }

    @Basic
    @Column(name = "FINETYPE", nullable = true, insertable = true, updatable = true, precision = 0)
    public BigInteger getFinetype() {
        return finetype;
    }

    public void setFinetype(BigInteger finetype) {
        this.finetype = finetype;
    }

    @Id
    @Column(name = "OBJECTNAME", nullable = false, insertable = true, updatable = true, length = 50)
    public String getObjectname() {
        return objectname;
    }

    public void setObjectname(String objectname) {
        this.objectname = objectname;
    }

    @Id
    @Column(name = "FINEID", nullable = false, insertable = true, updatable = true, length = 50)
    public String getFineid() {
        return fineid;
    }

    public void setFineid(String fineid) {
        this.fineid = fineid;
    }

    @Basic
    @Column(name = "FINENAME", nullable = true, insertable = true, updatable = true, length = 50)
    public String getFinename() {
        return finename;
    }

    public void setFinename(String finename) {
        this.finename = finename;
    }

    @Basic
    @Column(name = "FINE", nullable = true, insertable = true, updatable = true, precision = -127)
    public BigDecimal getFine() {
        return fine;
    }

    public void setFine(BigDecimal fine) {
        this.fine = fine;
    }

    @Basic
    @Column(name = "REMARKS", nullable = true, insertable = true, updatable = true, length = 1000)
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

        Nyhfinedetail that = (Nyhfinedetail) o;

        if (lcmark != that.lcmark) return false;
        if (yhputinid != that.yhputinid) return false;
        if (fine != null ? !fine.equals(that.fine) : that.fine != null) return false;
        if (fineid != null ? !fineid.equals(that.fineid) : that.fineid != null) return false;
        if (finename != null ? !finename.equals(that.finename) : that.finename != null) return false;
        if (finetype != null ? !finetype.equals(that.finetype) : that.finetype != null) return false;
        if (objectname != null ? !objectname.equals(that.objectname) : that.objectname != null) return false;
        if (recorddate != null ? !recorddate.equals(that.recorddate) : that.recorddate != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhputinid;
        result = 31 * result + (recorddate != null ? recorddate.hashCode() : 0);
        result = 31 * result + (int) (lcmark ^ (lcmark >>> 32));
        result = 31 * result + (finetype != null ? finetype.hashCode() : 0);
        result = 31 * result + (objectname != null ? objectname.hashCode() : 0);
        result = 31 * result + (fineid != null ? fineid.hashCode() : 0);
        result = 31 * result + (finename != null ? finename.hashCode() : 0);
        result = 31 * result + (fine != null ? fine.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        return result;
    }
}
