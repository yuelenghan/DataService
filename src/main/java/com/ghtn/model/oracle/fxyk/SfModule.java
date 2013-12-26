package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@Table(name = "SF_MODULE", schema = "SEP3", catalog = "")
public class SfModule {
    private BigDecimal moduleid;
    private String modulename;
    private String moduletag;
    private String moduleurl;
    private BigDecimal moduleorder;
    private String about;
    private String status;

    @Id
    @Column(name = "MODULEID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getModuleid() {
        return moduleid;
    }

    public void setModuleid(BigDecimal moduleid) {
        this.moduleid = moduleid;
    }

    @Basic
    @Column(name = "MODULENAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename;
    }

    @Basic
    @Column(name = "MODULETAG", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getModuletag() {
        return moduletag;
    }

    public void setModuletag(String moduletag) {
        this.moduletag = moduletag;
    }

    @Basic
    @Column(name = "MODULEURL", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getModuleurl() {
        return moduleurl;
    }

    public void setModuleurl(String moduleurl) {
        this.moduleurl = moduleurl;
    }

    @Basic
    @Column(name = "MODULEORDER", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getModuleorder() {
        return moduleorder;
    }

    public void setModuleorder(BigDecimal moduleorder) {
        this.moduleorder = moduleorder;
    }

    @Basic
    @Column(name = "ABOUT", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SfModule sfModule = (SfModule) o;

        if (about != null ? !about.equals(sfModule.about) : sfModule.about != null) return false;
        if (moduleid != null ? !moduleid.equals(sfModule.moduleid) : sfModule.moduleid != null) return false;
        if (modulename != null ? !modulename.equals(sfModule.modulename) : sfModule.modulename != null) return false;
        if (moduleorder != null ? !moduleorder.equals(sfModule.moduleorder) : sfModule.moduleorder != null)
            return false;
        if (moduletag != null ? !moduletag.equals(sfModule.moduletag) : sfModule.moduletag != null) return false;
        if (moduleurl != null ? !moduleurl.equals(sfModule.moduleurl) : sfModule.moduleurl != null) return false;
        if (status != null ? !status.equals(sfModule.status) : sfModule.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = moduleid != null ? moduleid.hashCode() : 0;
        result = 31 * result + (modulename != null ? modulename.hashCode() : 0);
        result = 31 * result + (moduletag != null ? moduletag.hashCode() : 0);
        result = 31 * result + (moduleurl != null ? moduleurl.hashCode() : 0);
        result = 31 * result + (moduleorder != null ? moduleorder.hashCode() : 0);
        result = 31 * result + (about != null ? about.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
