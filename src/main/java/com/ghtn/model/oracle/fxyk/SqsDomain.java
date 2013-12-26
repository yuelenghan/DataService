package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@Table(name = "SQS_DOMAIN", schema = "SEP3", catalog = "")
public class SqsDomain {
    private int did;
    private String dname;
    private String createdept;
    private String createuser;
    private BigDecimal fullscore;
    private BigDecimal rate;
    private Timestamp createdate;
    private BigInteger status;
    private Integer fid;

    @Id
    @Column(name = "DID", nullable = false, insertable = true, updatable = true, length = 8, precision = 0)
    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    @Basic
    @Column(name = "DNAME", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Basic
    @Column(name = "CREATEDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getCreatedept() {
        return createdept;
    }

    public void setCreatedept(String createdept) {
        this.createdept = createdept;
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
    @Column(name = "FULLSCORE", nullable = true, insertable = true, updatable = true, length = 8, precision = 1)
    public BigDecimal getFullscore() {
        return fullscore;
    }

    public void setFullscore(BigDecimal fullscore) {
        this.fullscore = fullscore;
    }

    @Basic
    @Column(name = "RATE", nullable = true, insertable = true, updatable = true, length = 4, precision = 3)
    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "CREATEDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getStatus() {
        return status;
    }

    public void setStatus(BigInteger status) {
        this.status = status;
    }

    @Basic
    @Column(name = "FID", nullable = true, insertable = true, updatable = true, length = 8, precision = 0)
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SqsDomain sqsDomain = (SqsDomain) o;

        if (did != sqsDomain.did) return false;
        if (createdate != null ? !createdate.equals(sqsDomain.createdate) : sqsDomain.createdate != null) return false;
        if (createdept != null ? !createdept.equals(sqsDomain.createdept) : sqsDomain.createdept != null) return false;
        if (createuser != null ? !createuser.equals(sqsDomain.createuser) : sqsDomain.createuser != null) return false;
        if (dname != null ? !dname.equals(sqsDomain.dname) : sqsDomain.dname != null) return false;
        if (fid != null ? !fid.equals(sqsDomain.fid) : sqsDomain.fid != null) return false;
        if (fullscore != null ? !fullscore.equals(sqsDomain.fullscore) : sqsDomain.fullscore != null) return false;
        if (rate != null ? !rate.equals(sqsDomain.rate) : sqsDomain.rate != null) return false;
        if (status != null ? !status.equals(sqsDomain.status) : sqsDomain.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = did;
        result = 31 * result + (dname != null ? dname.hashCode() : 0);
        result = 31 * result + (createdept != null ? createdept.hashCode() : 0);
        result = 31 * result + (createuser != null ? createuser.hashCode() : 0);
        result = 31 * result + (fullscore != null ? fullscore.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (fid != null ? fid.hashCode() : 0);
        return result;
    }
}
