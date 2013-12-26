package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@Table(name = "SF_MODULEGROUP", schema = "SEP3", catalog = "")
public class SfModulegroup {
    private BigDecimal modulegroupid;
    private String modulegroupname;
    private BigDecimal parentmodulegroupid;
    private BigDecimal modulegrouporder;
    private String about;
    private String status;

    @Id
    @Column(name = "MODULEGROUPID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getModulegroupid() {
        return modulegroupid;
    }

    public void setModulegroupid(BigDecimal modulegroupid) {
        this.modulegroupid = modulegroupid;
    }

    @Basic
    @Column(name = "MODULEGROUPNAME", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getModulegroupname() {
        return modulegroupname;
    }

    public void setModulegroupname(String modulegroupname) {
        this.modulegroupname = modulegroupname;
    }

    @Basic
    @Column(name = "PARENTMODULEGROUPID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getParentmodulegroupid() {
        return parentmodulegroupid;
    }

    public void setParentmodulegroupid(BigDecimal parentmodulegroupid) {
        this.parentmodulegroupid = parentmodulegroupid;
    }

    @Basic
    @Column(name = "MODULEGROUPORDER", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getModulegrouporder() {
        return modulegrouporder;
    }

    public void setModulegrouporder(BigDecimal modulegrouporder) {
        this.modulegrouporder = modulegrouporder;
    }

    @Basic
    @Column(name = "ABOUT", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
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

        SfModulegroup that = (SfModulegroup) o;

        if (about != null ? !about.equals(that.about) : that.about != null) return false;
        if (modulegroupid != null ? !modulegroupid.equals(that.modulegroupid) : that.modulegroupid != null)
            return false;
        if (modulegroupname != null ? !modulegroupname.equals(that.modulegroupname) : that.modulegroupname != null)
            return false;
        if (modulegrouporder != null ? !modulegrouporder.equals(that.modulegrouporder) : that.modulegrouporder != null)
            return false;
        if (parentmodulegroupid != null ? !parentmodulegroupid.equals(that.parentmodulegroupid) : that.parentmodulegroupid != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = modulegroupid != null ? modulegroupid.hashCode() : 0;
        result = 31 * result + (modulegroupname != null ? modulegroupname.hashCode() : 0);
        result = 31 * result + (parentmodulegroupid != null ? parentmodulegroupid.hashCode() : 0);
        result = 31 * result + (modulegrouporder != null ? modulegrouporder.hashCode() : 0);
        result = 31 * result + (about != null ? about.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
