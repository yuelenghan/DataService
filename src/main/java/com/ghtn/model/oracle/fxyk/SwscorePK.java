package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
public class SwscorePK implements Serializable {
    private int levelid;
    private String deptnumber;

    @Column(name = "LEVELID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    @Id
    public int getLevelid() {
        return levelid;
    }

    public void setLevelid(int levelid) {
        this.levelid = levelid;
    }

    @Column(name = "DEPTNUMBER", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
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

        SwscorePK swscorePK = (SwscorePK) o;

        if (levelid != swscorePK.levelid) return false;
        if (deptnumber != null ? !deptnumber.equals(swscorePK.deptnumber) : swscorePK.deptnumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = levelid;
        result = 31 * result + (deptnumber != null ? deptnumber.hashCode() : 0);
        return result;
    }
}
