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
@Table(name = "SQS_KIND", schema = "SEP3", catalog = "")
public class SqsKind {
    private int pkindid;
    private Integer did;
    private String pkindname;
    private BigDecimal fullscore;
    private BigDecimal rate;
    private Timestamp indate;
    private String status;
    private Integer fid;

    @Id
    @Column(name = "PKINDID", nullable = false, insertable = true, updatable = true, length = 8, precision = 0)
    public int getPkindid() {
        return pkindid;
    }

    public void setPkindid(int pkindid) {
        this.pkindid = pkindid;
    }

    @Basic
    @Column(name = "DID", nullable = true, insertable = true, updatable = true, length = 8, precision = 0)
    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    @Basic
    @Column(name = "PKINDNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getPkindname() {
        return pkindname;
    }

    public void setPkindname(String pkindname) {
        this.pkindname = pkindname;
    }

    @Basic
    @Column(name = "FULLSCORE", nullable = true, insertable = true, updatable = true, length = 4, precision = 1)
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
    @Column(name = "INDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getIndate() {
        return indate;
    }

    public void setIndate(Timestamp indate) {
        this.indate = indate;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

        SqsKind sqsKind = (SqsKind) o;

        if (pkindid != sqsKind.pkindid) return false;
        if (did != null ? !did.equals(sqsKind.did) : sqsKind.did != null) return false;
        if (fid != null ? !fid.equals(sqsKind.fid) : sqsKind.fid != null) return false;
        if (fullscore != null ? !fullscore.equals(sqsKind.fullscore) : sqsKind.fullscore != null) return false;
        if (indate != null ? !indate.equals(sqsKind.indate) : sqsKind.indate != null) return false;
        if (pkindname != null ? !pkindname.equals(sqsKind.pkindname) : sqsKind.pkindname != null) return false;
        if (rate != null ? !rate.equals(sqsKind.rate) : sqsKind.rate != null) return false;
        if (status != null ? !status.equals(sqsKind.status) : sqsKind.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkindid;
        result = 31 * result + (did != null ? did.hashCode() : 0);
        result = 31 * result + (pkindname != null ? pkindname.hashCode() : 0);
        result = 31 * result + (fullscore != null ? fullscore.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (indate != null ? indate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (fid != null ? fid.hashCode() : 0);
        return result;
    }
}
