package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
public class YhmatchupPK implements Serializable {
    private int yhid;
    private int hazardsid;

    @Column(name = "YHID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    @Id
    public int getYhid() {
        return yhid;
    }

    public void setYhid(int yhid) {
        this.yhid = yhid;
    }

    @Column(name = "HAZARDSID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    @Id
    public int getHazardsid() {
        return hazardsid;
    }

    public void setHazardsid(int hazardsid) {
        this.hazardsid = hazardsid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YhmatchupPK that = (YhmatchupPK) o;

        if (hazardsid != that.hazardsid) return false;
        if (yhid != that.yhid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhid;
        result = 31 * result + hazardsid;
        return result;
    }
}
