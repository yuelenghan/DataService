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
@Table(name = "SF_CONFIGDETAIL", schema = "SEP3", catalog = "")
public class SfConfigdetail {
    private BigDecimal configdetailid;
    private String configdetailname;
    private String about;
    private Timestamp createtime;
    private String configdetailtag;

    @Id
    @Column(name = "CONFIGDETAILID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getConfigdetailid() {
        return configdetailid;
    }

    public void setConfigdetailid(BigDecimal configdetailid) {
        this.configdetailid = configdetailid;
    }

    @Basic
    @Column(name = "CONFIGDETAILNAME", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getConfigdetailname() {
        return configdetailname;
    }

    public void setConfigdetailname(String configdetailname) {
        this.configdetailname = configdetailname;
    }

    @Basic
    @Column(name = "ABOUT", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Basic
    @Column(name = "CREATETIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "CONFIGDETAILTAG", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getConfigdetailtag() {
        return configdetailtag;
    }

    public void setConfigdetailtag(String configdetailtag) {
        this.configdetailtag = configdetailtag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SfConfigdetail that = (SfConfigdetail) o;

        if (about != null ? !about.equals(that.about) : that.about != null) return false;
        if (configdetailid != null ? !configdetailid.equals(that.configdetailid) : that.configdetailid != null)
            return false;
        if (configdetailname != null ? !configdetailname.equals(that.configdetailname) : that.configdetailname != null)
            return false;
        if (configdetailtag != null ? !configdetailtag.equals(that.configdetailtag) : that.configdetailtag != null)
            return false;
        if (createtime != null ? !createtime.equals(that.createtime) : that.createtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = configdetailid != null ? configdetailid.hashCode() : 0;
        result = 31 * result + (configdetailname != null ? configdetailname.hashCode() : 0);
        result = 31 * result + (about != null ? about.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (configdetailtag != null ? configdetailtag.hashCode() : 0);
        return result;
    }
}
