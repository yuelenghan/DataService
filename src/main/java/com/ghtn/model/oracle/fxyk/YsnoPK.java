package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
public class YsnoPK implements Serializable {
    private int typeid;
    private int levelid;

    @Column(name = "TYPEID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    @Id
    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    @Column(name = "LEVELID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    @Id
    public int getLevelid() {
        return levelid;
    }

    public void setLevelid(int levelid) {
        this.levelid = levelid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YsnoPK ysnoPK = (YsnoPK) o;

        if (levelid != ysnoPK.levelid) return false;
        if (typeid != ysnoPK.typeid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = typeid;
        result = 31 * result + levelid;
        return result;
    }
}
