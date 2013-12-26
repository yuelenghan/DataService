package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
public class SwexamineDetailPK implements Serializable {
    private int lid;
    private int swid;

    @Column(name = "LID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    @Id
    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    @Column(name = "SWID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    @Id
    public int getSwid() {
        return swid;
    }

    public void setSwid(int swid) {
        this.swid = swid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SwexamineDetailPK that = (SwexamineDetailPK) o;

        if (lid != that.lid) return false;
        if (swid != that.swid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lid;
        result = 31 * result + swid;
        return result;
    }
}
