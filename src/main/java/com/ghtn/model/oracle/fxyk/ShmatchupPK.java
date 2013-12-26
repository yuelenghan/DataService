package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
public class ShmatchupPK implements Serializable {
    private int swid;
    private int hazardsid;

    @Column(name = "SWID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    @Id
    public int getSwid() {
        return swid;
    }

    public void setSwid(int swid) {
        this.swid = swid;
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

        ShmatchupPK that = (ShmatchupPK) o;

        if (hazardsid != that.hazardsid) return false;
        if (swid != that.swid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = swid;
        result = 31 * result + hazardsid;
        return result;
    }
}
