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
@Table(name = "SQS_RESULT", schema = "SEP3", catalog = "")
public class SqsResult {
    private BigDecimal rid;
    private Integer did;
    private String checkdept;
    private String checkfordept;
    private Timestamp checkdate;
    private String checkway;
    private String placeid;
    private BigDecimal total;
    private String rstatus;

    @Id
    @Column(name = "RID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getRid() {
        return rid;
    }

    public void setRid(BigDecimal rid) {
        this.rid = rid;
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
    @Column(name = "CHECKDEPT", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getCheckdept() {
        return checkdept;
    }

    public void setCheckdept(String checkdept) {
        this.checkdept = checkdept;
    }

    @Basic
    @Column(name = "CHECKFORDEPT", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getCheckfordept() {
        return checkfordept;
    }

    public void setCheckfordept(String checkfordept) {
        this.checkfordept = checkfordept;
    }

    @Basic
    @Column(name = "CHECKDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Timestamp checkdate) {
        this.checkdate = checkdate;
    }

    @Basic
    @Column(name = "CHECKWAY", nullable = true, insertable = true, updatable = true, length = 8, precision = 0)
    public String getCheckway() {
        return checkway;
    }

    public void setCheckway(String checkway) {
        this.checkway = checkway;
    }

    @Basic
    @Column(name = "PLACEID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getPlaceid() {
        return placeid;
    }

    public void setPlaceid(String placeid) {
        this.placeid = placeid;
    }

    @Basic
    @Column(name = "TOTAL", nullable = true, insertable = true, updatable = true, length = 4, precision = 1)
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Basic
    @Column(name = "RSTATUS", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public String getRstatus() {
        return rstatus;
    }

    public void setRstatus(String rstatus) {
        this.rstatus = rstatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SqsResult sqsResult = (SqsResult) o;

        if (checkdate != null ? !checkdate.equals(sqsResult.checkdate) : sqsResult.checkdate != null) return false;
        if (checkdept != null ? !checkdept.equals(sqsResult.checkdept) : sqsResult.checkdept != null) return false;
        if (checkfordept != null ? !checkfordept.equals(sqsResult.checkfordept) : sqsResult.checkfordept != null)
            return false;
        if (checkway != null ? !checkway.equals(sqsResult.checkway) : sqsResult.checkway != null) return false;
        if (did != null ? !did.equals(sqsResult.did) : sqsResult.did != null) return false;
        if (placeid != null ? !placeid.equals(sqsResult.placeid) : sqsResult.placeid != null) return false;
        if (rid != null ? !rid.equals(sqsResult.rid) : sqsResult.rid != null) return false;
        if (rstatus != null ? !rstatus.equals(sqsResult.rstatus) : sqsResult.rstatus != null) return false;
        if (total != null ? !total.equals(sqsResult.total) : sqsResult.total != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rid != null ? rid.hashCode() : 0;
        result = 31 * result + (did != null ? did.hashCode() : 0);
        result = 31 * result + (checkdept != null ? checkdept.hashCode() : 0);
        result = 31 * result + (checkfordept != null ? checkfordept.hashCode() : 0);
        result = 31 * result + (checkdate != null ? checkdate.hashCode() : 0);
        result = 31 * result + (checkway != null ? checkway.hashCode() : 0);
        result = 31 * result + (placeid != null ? placeid.hashCode() : 0);
        result = 31 * result + (total != null ? total.hashCode() : 0);
        result = 31 * result + (rstatus != null ? rstatus.hashCode() : 0);
        return result;
    }
}
