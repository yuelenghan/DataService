package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
@Table(name = "SF_CONFIGURATION", schema = "SEP3", catalog = "")
public class SfConfiguration {
    private BigDecimal itemid;
    private String itemname;
    private String itemvalue;
    private String about;
    private String status;
    private String itemtag;

    @Id
    @Column(name = "ITEMID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getItemid() {
        return itemid;
    }

    public void setItemid(BigDecimal itemid) {
        this.itemid = itemid;
    }

    @Basic
    @Column(name = "ITEMNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    @Basic
    @Column(name = "ITEMVALUE", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getItemvalue() {
        return itemvalue;
    }

    public void setItemvalue(String itemvalue) {
        this.itemvalue = itemvalue;
    }

    @Basic
    @Column(name = "ABOUT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "ITEMTAG", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getItemtag() {
        return itemtag;
    }

    public void setItemtag(String itemtag) {
        this.itemtag = itemtag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SfConfiguration that = (SfConfiguration) o;

        if (about != null ? !about.equals(that.about) : that.about != null) return false;
        if (itemid != null ? !itemid.equals(that.itemid) : that.itemid != null) return false;
        if (itemname != null ? !itemname.equals(that.itemname) : that.itemname != null) return false;
        if (itemtag != null ? !itemtag.equals(that.itemtag) : that.itemtag != null) return false;
        if (itemvalue != null ? !itemvalue.equals(that.itemvalue) : that.itemvalue != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = itemid != null ? itemid.hashCode() : 0;
        result = 31 * result + (itemname != null ? itemname.hashCode() : 0);
        result = 31 * result + (itemvalue != null ? itemvalue.hashCode() : 0);
        result = 31 * result + (about != null ? about.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (itemtag != null ? itemtag.hashCode() : 0);
        return result;
    }
}
