package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
@Table(name = "Y_TSM", schema = "SEP3", catalog = "")
public class YTsm {
    private Timestamp recordtime;
    private String recordperson;
    private Integer placeid;
    private String pname;
    private String deptnumber;
    private String jsfzr;
    private String gcfzr;
    private String pnumber;
    private String ffnum;
    private Timestamp cdate;
    private String maindept;
    private String status;

    @Id
    @Column(name = "RECORDTIME", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Timestamp recordtime) {
        this.recordtime = recordtime;
    }

    @Basic
    @Column(name = "RECORDPERSON", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getRecordperson() {
        return recordperson;
    }

    public void setRecordperson(String recordperson) {
        this.recordperson = recordperson;
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
    @Column(name = "PNAME", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Basic
    @Column(name = "DEPTNUMBER", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getDeptnumber() {
        return deptnumber;
    }

    public void setDeptnumber(String deptnumber) {
        this.deptnumber = deptnumber;
    }

    @Basic
    @Column(name = "JSFZR", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getJsfzr() {
        return jsfzr;
    }

    public void setJsfzr(String jsfzr) {
        this.jsfzr = jsfzr;
    }

    @Basic
    @Column(name = "GCFZR", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getGcfzr() {
        return gcfzr;
    }

    public void setGcfzr(String gcfzr) {
        this.gcfzr = gcfzr;
    }

    @Basic
    @Column(name = "PNUMBER", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    @Basic
    @Column(name = "FFNUM", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getFfnum() {
        return ffnum;
    }

    public void setFfnum(String ffnum) {
        this.ffnum = ffnum;
    }

    @Basic
    @Column(name = "CDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getCdate() {
        return cdate;
    }

    public void setCdate(Timestamp cdate) {
        this.cdate = cdate;
    }

    @Basic
    @Column(name = "MAINDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindept() {
        return maindept;
    }

    public void setMaindept(String maindept) {
        this.maindept = maindept;
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

        YTsm yTsm = (YTsm) o;

        if (cdate != null ? !cdate.equals(yTsm.cdate) : yTsm.cdate != null) return false;
        if (deptnumber != null ? !deptnumber.equals(yTsm.deptnumber) : yTsm.deptnumber != null) return false;
        if (ffnum != null ? !ffnum.equals(yTsm.ffnum) : yTsm.ffnum != null) return false;
        if (gcfzr != null ? !gcfzr.equals(yTsm.gcfzr) : yTsm.gcfzr != null) return false;
        if (jsfzr != null ? !jsfzr.equals(yTsm.jsfzr) : yTsm.jsfzr != null) return false;
        if (maindept != null ? !maindept.equals(yTsm.maindept) : yTsm.maindept != null) return false;
        if (placeid != null ? !placeid.equals(yTsm.placeid) : yTsm.placeid != null) return false;
        if (pname != null ? !pname.equals(yTsm.pname) : yTsm.pname != null) return false;
        if (pnumber != null ? !pnumber.equals(yTsm.pnumber) : yTsm.pnumber != null) return false;
        if (recordperson != null ? !recordperson.equals(yTsm.recordperson) : yTsm.recordperson != null) return false;
        if (recordtime != null ? !recordtime.equals(yTsm.recordtime) : yTsm.recordtime != null) return false;
        if (status != null ? !status.equals(yTsm.status) : yTsm.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recordtime != null ? recordtime.hashCode() : 0;
        result = 31 * result + (recordperson != null ? recordperson.hashCode() : 0);
        result = 31 * result + (placeid != null ? placeid.hashCode() : 0);
        result = 31 * result + (pname != null ? pname.hashCode() : 0);
        result = 31 * result + (deptnumber != null ? deptnumber.hashCode() : 0);
        result = 31 * result + (jsfzr != null ? jsfzr.hashCode() : 0);
        result = 31 * result + (gcfzr != null ? gcfzr.hashCode() : 0);
        result = 31 * result + (pnumber != null ? pnumber.hashCode() : 0);
        result = 31 * result + (ffnum != null ? ffnum.hashCode() : 0);
        result = 31 * result + (cdate != null ? cdate.hashCode() : 0);
        result = 31 * result + (maindept != null ? maindept.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
