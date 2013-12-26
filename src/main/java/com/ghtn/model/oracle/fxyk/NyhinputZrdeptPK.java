package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
public class NyhinputZrdeptPK implements Serializable {
    private int yhputinid;
    private String deptnumber;

    @Column(name = "YHPUTINID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Id
    public int getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(int yhputinid) {
        this.yhputinid = yhputinid;
    }

    @Column(name = "DEPTNUMBER", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    @Id
    public String getDeptnumber() {
        return deptnumber;
    }

    public void setDeptnumber(String deptnumber) {
        this.deptnumber = deptnumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NyhinputZrdeptPK that = (NyhinputZrdeptPK) o;

        if (yhputinid != that.yhputinid) return false;
        if (deptnumber != null ? !deptnumber.equals(that.deptnumber) : that.deptnumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhputinid;
        result = 31 * result + (deptnumber != null ? deptnumber.hashCode() : 0);
        return result;
    }
}
