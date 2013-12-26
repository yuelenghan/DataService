package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
public class Placelevell {
    private int plid;
    private String plname;

    @Id
    @Column(name = "PLID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPlid() {
        return plid;
    }

    public void setPlid(int plid) {
        this.plid = plid;
    }

    @Basic
    @Column(name = "PLNAME", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getPlname() {
        return plname;
    }

    public void setPlname(String plname) {
        this.plname = plname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Placelevell that = (Placelevell) o;

        if (plid != that.plid) return false;
        if (plname != null ? !plname.equals(that.plname) : that.plname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = plid;
        result = 31 * result + (plname != null ? plname.hashCode() : 0);
        return result;
    }
}
