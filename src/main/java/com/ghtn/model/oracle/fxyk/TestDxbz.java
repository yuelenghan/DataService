package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@Table(name = "TEST_DXBZ", schema = "SEP3", catalog = "")
public class TestDxbz {
    private BigDecimal wxyid;
    private String gldx;
    private BigDecimal gldxid;
    private String glbz;
    private BigDecimal glryid;
    private String glcs;
    private BigDecimal gldxidid;

    @Basic
    @Column(name = "WXYID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getWxyid() {
        return wxyid;
    }

    public void setWxyid(BigDecimal wxyid) {
        this.wxyid = wxyid;
    }

    @Basic
    @Column(name = "GLDX", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getGldx() {
        return gldx;
    }

    public void setGldx(String gldx) {
        this.gldx = gldx;
    }

    @Basic
    @Column(name = "GLDXID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getGldxid() {
        return gldxid;
    }

    public void setGldxid(BigDecimal gldxid) {
        this.gldxid = gldxid;
    }

    @Basic
    @Column(name = "GLBZ", nullable = true, insertable = true, updatable = true, length = 2000, precision = 0)
    public String getGlbz() {
        return glbz;
    }

    public void setGlbz(String glbz) {
        this.glbz = glbz;
    }

    @Basic
    @Column(name = "GLRYID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getGlryid() {
        return glryid;
    }

    public void setGlryid(BigDecimal glryid) {
        this.glryid = glryid;
    }

    @Basic
    @Column(name = "GLCS", nullable = true, insertable = true, updatable = true, length = 2000, precision = 0)
    public String getGlcs() {
        return glcs;
    }

    public void setGlcs(String glcs) {
        this.glcs = glcs;
    }

    @Basic
    @Column(name = "GLDXIDID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getGldxidid() {
        return gldxidid;
    }

    public void setGldxidid(BigDecimal gldxidid) {
        this.gldxidid = gldxidid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestDxbz testDxbz = (TestDxbz) o;

        if (glbz != null ? !glbz.equals(testDxbz.glbz) : testDxbz.glbz != null) return false;
        if (glcs != null ? !glcs.equals(testDxbz.glcs) : testDxbz.glcs != null) return false;
        if (gldx != null ? !gldx.equals(testDxbz.gldx) : testDxbz.gldx != null) return false;
        if (gldxid != null ? !gldxid.equals(testDxbz.gldxid) : testDxbz.gldxid != null) return false;
        if (gldxidid != null ? !gldxidid.equals(testDxbz.gldxidid) : testDxbz.gldxidid != null) return false;
        if (glryid != null ? !glryid.equals(testDxbz.glryid) : testDxbz.glryid != null) return false;
        if (wxyid != null ? !wxyid.equals(testDxbz.wxyid) : testDxbz.wxyid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wxyid != null ? wxyid.hashCode() : 0;
        result = 31 * result + (gldx != null ? gldx.hashCode() : 0);
        result = 31 * result + (gldxid != null ? gldxid.hashCode() : 0);
        result = 31 * result + (glbz != null ? glbz.hashCode() : 0);
        result = 31 * result + (glryid != null ? glryid.hashCode() : 0);
        result = 31 * result + (glcs != null ? glcs.hashCode() : 0);
        result = 31 * result + (gldxidid != null ? gldxidid.hashCode() : 0);
        return result;
    }
}
