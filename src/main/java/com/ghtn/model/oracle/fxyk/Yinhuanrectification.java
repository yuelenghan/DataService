package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
public class Yinhuanrectification {
    private int id;
    private int yhputinid;
    private String recpersonid;
    private Timestamp rectime;
    private String recstate;
    private String yanshouid;
    private String zgbanci;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "YHPUTINID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(int yhputinid) {
        this.yhputinid = yhputinid;
    }

    @Basic
    @Column(name = "RECPERSONID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getRecpersonid() {
        return recpersonid;
    }

    public void setRecpersonid(String recpersonid) {
        this.recpersonid = recpersonid;
    }

    @Basic
    @Column(name = "RECTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getRectime() {
        return rectime;
    }

    public void setRectime(Timestamp rectime) {
        this.rectime = rectime;
    }

    @Basic
    @Column(name = "RECSTATE", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getRecstate() {
        return recstate;
    }

    public void setRecstate(String recstate) {
        this.recstate = recstate;
    }

    @Basic
    @Column(name = "YANSHOUID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getYanshouid() {
        return yanshouid;
    }

    public void setYanshouid(String yanshouid) {
        this.yanshouid = yanshouid;
    }

    @Basic
    @Column(name = "ZGBANCI", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getZgbanci() {
        return zgbanci;
    }

    public void setZgbanci(String zgbanci) {
        this.zgbanci = zgbanci;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Yinhuanrectification that = (Yinhuanrectification) o;

        if (id != that.id) return false;
        if (yhputinid != that.yhputinid) return false;
        if (recpersonid != null ? !recpersonid.equals(that.recpersonid) : that.recpersonid != null) return false;
        if (recstate != null ? !recstate.equals(that.recstate) : that.recstate != null) return false;
        if (rectime != null ? !rectime.equals(that.rectime) : that.rectime != null) return false;
        if (yanshouid != null ? !yanshouid.equals(that.yanshouid) : that.yanshouid != null) return false;
        if (zgbanci != null ? !zgbanci.equals(that.zgbanci) : that.zgbanci != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + yhputinid;
        result = 31 * result + (recpersonid != null ? recpersonid.hashCode() : 0);
        result = 31 * result + (rectime != null ? rectime.hashCode() : 0);
        result = 31 * result + (recstate != null ? recstate.hashCode() : 0);
        result = 31 * result + (yanshouid != null ? yanshouid.hashCode() : 0);
        result = 31 * result + (zgbanci != null ? zgbanci.hashCode() : 0);
        return result;
    }
}
