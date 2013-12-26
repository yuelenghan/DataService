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
@Table(name = "PAR_RESULT", schema = "SEP3", catalog = "")
public class ParResult {
    private BigDecimal rid;
    private int pkindid;
    private String checkdept;
    private String checkfordept;
    private Timestamp checkdate;
    private String banci;
    private String placeid;
    private BigDecimal total;
    private String rstatus;
    private String bkhperson;
    private String khperson;

    @Id
    @Column(name = "RID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getRid() {
        return rid;
    }

    public void setRid(BigDecimal rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "PKINDID", nullable = false, insertable = true, updatable = true, length = 8, precision = 0)
    public int getPkindid() {
        return pkindid;
    }

    public void setPkindid(int pkindid) {
        this.pkindid = pkindid;
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
    @Column(name = "BANCI", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public String getBanci() {
        return banci;
    }

    public void setBanci(String banci) {
        this.banci = banci;
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

    @Basic
    @Column(name = "BKHPERSON", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getBkhperson() {
        return bkhperson;
    }

    public void setBkhperson(String bkhperson) {
        this.bkhperson = bkhperson;
    }

    @Basic
    @Column(name = "KHPERSON", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getKhperson() {
        return khperson;
    }

    public void setKhperson(String khperson) {
        this.khperson = khperson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParResult parResult = (ParResult) o;

        if (pkindid != parResult.pkindid) return false;
        if (banci != null ? !banci.equals(parResult.banci) : parResult.banci != null) return false;
        if (bkhperson != null ? !bkhperson.equals(parResult.bkhperson) : parResult.bkhperson != null) return false;
        if (checkdate != null ? !checkdate.equals(parResult.checkdate) : parResult.checkdate != null) return false;
        if (checkdept != null ? !checkdept.equals(parResult.checkdept) : parResult.checkdept != null) return false;
        if (checkfordept != null ? !checkfordept.equals(parResult.checkfordept) : parResult.checkfordept != null)
            return false;
        if (khperson != null ? !khperson.equals(parResult.khperson) : parResult.khperson != null) return false;
        if (placeid != null ? !placeid.equals(parResult.placeid) : parResult.placeid != null) return false;
        if (rid != null ? !rid.equals(parResult.rid) : parResult.rid != null) return false;
        if (rstatus != null ? !rstatus.equals(parResult.rstatus) : parResult.rstatus != null) return false;
        if (total != null ? !total.equals(parResult.total) : parResult.total != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rid != null ? rid.hashCode() : 0;
        result = 31 * result + pkindid;
        result = 31 * result + (checkdept != null ? checkdept.hashCode() : 0);
        result = 31 * result + (checkfordept != null ? checkfordept.hashCode() : 0);
        result = 31 * result + (checkdate != null ? checkdate.hashCode() : 0);
        result = 31 * result + (banci != null ? banci.hashCode() : 0);
        result = 31 * result + (placeid != null ? placeid.hashCode() : 0);
        result = 31 * result + (total != null ? total.hashCode() : 0);
        result = 31 * result + (rstatus != null ? rstatus.hashCode() : 0);
        result = 31 * result + (bkhperson != null ? bkhperson.hashCode() : 0);
        result = 31 * result + (khperson != null ? khperson.hashCode() : 0);
        return result;
    }
}
