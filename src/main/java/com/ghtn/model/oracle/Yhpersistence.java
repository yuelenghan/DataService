package com.ghtn.model.oracle;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * User: Administrator
 * Date: 2014/4/8
 * Time: 10:13
 */
@Entity
public class Yhpersistence {
    private int yhputinid;
    private String zrdeptname;
    private String zrpername;
    private String placename;
    private String inputpername;

    @Id
    @Column(name = "YHPUTINID", nullable = false, insertable = true, updatable = true, precision = 0)
    public int getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(int yhputinid) {
        this.yhputinid = yhputinid;
    }

    @Basic
    @Column(name = "ZRDEPTNAME", nullable = true, insertable = true, updatable = true, length = 50)
    public String getZrdeptname() {
        return zrdeptname;
    }

    public void setZrdeptname(String zrdeptname) {
        this.zrdeptname = zrdeptname;
    }

    @Basic
    @Column(name = "ZRPERNAME", nullable = true, insertable = true, updatable = true, length = 50)
    public String getZrpername() {
        return zrpername;
    }

    public void setZrpername(String zrpername) {
        this.zrpername = zrpername;
    }

    @Basic
    @Column(name = "PLACENAME", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    @Basic
    @Column(name = "INPUTPERNAME", nullable = true, insertable = true, updatable = true, length = 50)
    public String getInputpername() {
        return inputpername;
    }

    public void setInputpername(String inputpername) {
        this.inputpername = inputpername;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Yhpersistence that = (Yhpersistence) o;

        if (yhputinid != that.yhputinid) return false;
        if (inputpername != null ? !inputpername.equals(that.inputpername) : that.inputpername != null) return false;
        if (placename != null ? !placename.equals(that.placename) : that.placename != null) return false;
        if (zrdeptname != null ? !zrdeptname.equals(that.zrdeptname) : that.zrdeptname != null) return false;
        if (zrpername != null ? !zrpername.equals(that.zrpername) : that.zrpername != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhputinid;
        result = 31 * result + (zrdeptname != null ? zrdeptname.hashCode() : 0);
        result = 31 * result + (zrpername != null ? zrpername.hashCode() : 0);
        result = 31 * result + (placename != null ? placename.hashCode() : 0);
        result = 31 * result + (inputpername != null ? inputpername.hashCode() : 0);
        return result;
    }
}
