package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
@Table(name = "PAR_ITEM", schema = "SEP3", catalog = "")
public class ParItem {
    private int itemid;
    private String itemname;
    private BigDecimal fullscore;
    private int pkindid;
    private Timestamp indate;
    private String status;
    private BigDecimal sort;

    @Id
    @Column(name = "ITEMID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    @Basic
    @Column(name = "ITEMNAME", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    @Basic
    @Column(name = "FULLSCORE", nullable = true, insertable = true, updatable = true, length = 4, precision = 1)
    public BigDecimal getFullscore() {
        return fullscore;
    }

    public void setFullscore(BigDecimal fullscore) {
        this.fullscore = fullscore;
    }

    @Basic
    @Column(name = "PKINDID", nullable = false, insertable = true, updatable = true, length = 8, precision = 0)
    public int getPkindid() {
        return pkindid;
    }

    public void setPkindid(int pkindid) {
        this.pkindid = pkindid;
    }

    @Basic
    @Column(name = "INDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getIndate() {
        return indate;
    }

    public void setIndate(Timestamp indate) {
        this.indate = indate;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "SORT", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getSort() {
        return sort;
    }

    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParItem parItem = (ParItem) o;

        if (itemid != parItem.itemid) return false;
        if (pkindid != parItem.pkindid) return false;
        if (fullscore != null ? !fullscore.equals(parItem.fullscore) : parItem.fullscore != null) return false;
        if (indate != null ? !indate.equals(parItem.indate) : parItem.indate != null) return false;
        if (itemname != null ? !itemname.equals(parItem.itemname) : parItem.itemname != null) return false;
        if (sort != null ? !sort.equals(parItem.sort) : parItem.sort != null) return false;
        if (status != null ? !status.equals(parItem.status) : parItem.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = itemid;
        result = 31 * result + (itemname != null ? itemname.hashCode() : 0);
        result = 31 * result + (fullscore != null ? fullscore.hashCode() : 0);
        result = 31 * result + pkindid;
        result = 31 * result + (indate != null ? indate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        return result;
    }
}
