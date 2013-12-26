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
@Table(name = "SQS_DEMOTION", schema = "SEP3", catalog = "")
public class SqsDemotion {
    private BigDecimal deid;
    private Integer did;
    private String content;
    private String status;
    private Timestamp indate;

    @Id
    @Column(name = "DEID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getDeid() {
        return deid;
    }

    public void setDeid(BigDecimal deid) {
        this.deid = deid;
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
    @Column(name = "CONTENT", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
    @Column(name = "INDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getIndate() {
        return indate;
    }

    public void setIndate(Timestamp indate) {
        this.indate = indate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SqsDemotion that = (SqsDemotion) o;

        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (deid != null ? !deid.equals(that.deid) : that.deid != null) return false;
        if (did != null ? !did.equals(that.did) : that.did != null) return false;
        if (indate != null ? !indate.equals(that.indate) : that.indate != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deid != null ? deid.hashCode() : 0;
        result = 31 * result + (did != null ? did.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (indate != null ? indate.hashCode() : 0);
        return result;
    }
}
