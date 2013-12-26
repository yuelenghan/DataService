package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@IdClass(ShmatchupPK.class)
public class Shmatchup {
    private int swid;
    private int hazardsid;

    @Id
    @Column(name = "SWID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getSwid() {
        return swid;
    }

    public void setSwid(int swid) {
        this.swid = swid;
    }

    @Id
    @Column(name = "HAZARDSID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
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

        Shmatchup shmatchup = (Shmatchup) o;

        if (hazardsid != shmatchup.hazardsid) return false;
        if (swid != shmatchup.swid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = swid;
        result = 31 * result + hazardsid;
        return result;
    }
}
