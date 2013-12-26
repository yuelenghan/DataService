package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
@Table(name = "NYHINPUT_ZRDEPT", schema = "SEP3", catalog = "")
@IdClass(NyhinputZrdeptPK.class)
public class NyhinputZrdept {
    private int yhputinid;
    private String deptnumber;
    private String zrperson;
    private Timestamp addtime;
    private String addperson;
    private String remarks;

    @Id
    @Column(name = "YHPUTINID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(int yhputinid) {
        this.yhputinid = yhputinid;
    }

    @Id
    @Column(name = "DEPTNUMBER", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    public String getDeptnumber() {
        return deptnumber;
    }

    public void setDeptnumber(String deptnumber) {
        this.deptnumber = deptnumber;
    }

    @Basic
    @Column(name = "ZRPERSON", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getZrperson() {
        return zrperson;
    }

    public void setZrperson(String zrperson) {
        this.zrperson = zrperson;
    }

    @Basic
    @Column(name = "ADDTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getAddtime() {
        return addtime;
    }

    public void setAddtime(Timestamp addtime) {
        this.addtime = addtime;
    }

    @Basic
    @Column(name = "ADDPERSON", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getAddperson() {
        return addperson;
    }

    public void setAddperson(String addperson) {
        this.addperson = addperson;
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

        NyhinputZrdept that = (NyhinputZrdept) o;

        if (yhputinid != that.yhputinid) return false;
        if (addperson != null ? !addperson.equals(that.addperson) : that.addperson != null) return false;
        if (addtime != null ? !addtime.equals(that.addtime) : that.addtime != null) return false;
        if (deptnumber != null ? !deptnumber.equals(that.deptnumber) : that.deptnumber != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
        if (zrperson != null ? !zrperson.equals(that.zrperson) : that.zrperson != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhputinid;
        result = 31 * result + (deptnumber != null ? deptnumber.hashCode() : 0);
        result = 31 * result + (zrperson != null ? zrperson.hashCode() : 0);
        result = 31 * result + (addtime != null ? addtime.hashCode() : 0);
        result = 31 * result + (addperson != null ? addperson.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        return result;
    }
}
