package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
@IdClass(YhmatchupPK.class)
public class Yhmatchup {
    private int yhid;
    private int hazardsid;
    private String yh;

    @Id
    @Column(name = "YHID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getYhid() {
        return yhid;
    }

    public void setYhid(int yhid) {
        this.yhid = yhid;
    }

    @Id
    @Column(name = "HAZARDSID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getHazardsid() {
        return hazardsid;
    }

    public void setHazardsid(int hazardsid) {
        this.hazardsid = hazardsid;
    }

    @Basic
    @Column(name = "YH", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getYh() {
        return yh;
    }

    public void setYh(String yh) {
        this.yh = yh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Yhmatchup yhmatchup = (Yhmatchup) o;

        if (hazardsid != yhmatchup.hazardsid) return false;
        if (yhid != yhmatchup.yhid) return false;
        if (yh != null ? !yh.equals(yhmatchup.yh) : yhmatchup.yh != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhid;
        result = 31 * result + hazardsid;
        result = 31 * result + (yh != null ? yh.hashCode() : 0);
        return result;
    }
}
