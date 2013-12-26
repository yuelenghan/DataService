package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
@IdClass(YsnoPK.class)
public class Ysno {
    private int typeid;
    private int levelid;
    private BigDecimal autono;

    @Id
    @Column(name = "TYPEID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    @Id
    @Column(name = "LEVELID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getLevelid() {
        return levelid;
    }

    public void setLevelid(int levelid) {
        this.levelid = levelid;
    }

    @Basic
    @Column(name = "AUTONO", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getAutono() {
        return autono;
    }

    public void setAutono(BigDecimal autono) {
        this.autono = autono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ysno ysno = (Ysno) o;

        if (levelid != ysno.levelid) return false;
        if (typeid != ysno.typeid) return false;
        if (autono != null ? !autono.equals(ysno.autono) : ysno.autono != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = typeid;
        result = 31 * result + levelid;
        result = 31 * result + (autono != null ? autono.hashCode() : 0);
        return result;
    }
}
