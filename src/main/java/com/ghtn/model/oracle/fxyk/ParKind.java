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
@Table(name = "PAR_KIND", schema = "SEP3", catalog = "")
public class ParKind {
    private int pkindid;
    private String pkindname;
    private String usingdept;
    private BigDecimal fullscore;
    private String rate;
    private String checkway;
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
    @Column(name = "PKINDNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getPkindname() {
        return pkindname;
    }

    public void setPkindname(String pkindname) {
        this.pkindname = pkindname;
    }

    @Basic
    @Column(name = "USINGDEPT", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getUsingdept() {
        return usingdept;
    }

    public void setUsingdept(String usingdept) {
        this.usingdept = usingdept;
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
    @Column(name = "RATE", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "CHECKWAY", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public String getCheckway() {
        return checkway;
    }

    public void setCheckway(String checkway) {
        this.checkway = checkway;
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

        ParKind parKind = (ParKind) o;

        if (pkindid != parKind.pkindid) return false;
        if (checkway != null ? !checkway.equals(parKind.checkway) : parKind.checkway != null) return false;
        if (fid != null ? !fid.equals(parKind.fid) : parKind.fid != null) return false;
        if (fullscore != null ? !fullscore.equals(parKind.fullscore) : parKind.fullscore != null) return false;
        if (indate != null ? !indate.equals(parKind.indate) : parKind.indate != null) return false;
        if (pkindname != null ? !pkindname.equals(parKind.pkindname) : parKind.pkindname != null) return false;
        if (rate != null ? !rate.equals(parKind.rate) : parKind.rate != null) return false;
        if (status != null ? !status.equals(parKind.status) : parKind.status != null) return false;
        if (usingdept != null ? !usingdept.equals(parKind.usingdept) : parKind.usingdept != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pkindid;
        result = 31 * result + (pkindname != null ? pkindname.hashCode() : 0);
        result = 31 * result + (usingdept != null ? usingdept.hashCode() : 0);
        result = 31 * result + (fullscore != null ? fullscore.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (checkway != null ? checkway.hashCode() : 0);
        result = 31 * result + (indate != null ? indate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (fid != null ? fid.hashCode() : 0);
        return result;
    }
}
