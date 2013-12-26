package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@javax.persistence.Table(name = "TEST_HAZARDS", schema = "SEP3", catalog = "")
public class TestHazards {
    private String gx;

    @Basic
    @javax.persistence.Column(name = "GX", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getGx() {
        return gx;
    }

    public void setGx(String gx) {
        this.gx = gx;
    }

    private Integer gxid;

    @Basic
    @javax.persistence.Column(name = "GXID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getGxid() {
        return gxid;
    }

    public void setGxid(Integer gxid) {
        this.gxid = gxid;
    }

    private String wxy;

    @Basic
    @javax.persistence.Column(name = "WXY", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getWxy() {
        return wxy;
    }

    public void setWxy(String wxy) {
        this.wxy = wxy;
    }

    private String hgms;

    @Basic
    @javax.persistence.Column(name = "HGMS", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getHgms() {
        return hgms;
    }

    public void setHgms(String hgms) {
        this.hgms = hgms;
    }

    private BigDecimal wxyid;

    @Basic
    @javax.persistence.Column(name = "WXYID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getWxyid() {
        return wxyid;
    }

    public void setWxyid(BigDecimal wxyid) {
        this.wxyid = wxyid;
    }

    private BigDecimal fxlx;

    @Basic
    @javax.persistence.Column(name = "FXLX", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getFxlx() {
        return fxlx;
    }

    public void setFxlx(BigDecimal fxlx) {
        this.fxlx = fxlx;
    }

    private BigDecimal sglx;

    @Basic
    @javax.persistence.Column(name = "SGLX", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getSglx() {
        return sglx;
    }

    public void setSglx(BigDecimal sglx) {
        this.sglx = sglx;
    }

    private String fxdj;

    @Basic
    @javax.persistence.Column(name = "FXDJ", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getFxdj() {
        return fxdj;
    }

    public void setFxdj(String fxdj) {
        this.fxdj = fxdj;
    }

    private BigDecimal fxdjid;

    @Basic
    @javax.persistence.Column(name = "FXDJID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getFxdjid() {
        return fxdjid;
    }

    public void setFxdjid(BigDecimal fxdjid) {
        this.fxdjid = fxdjid;
    }

    private BigDecimal pl;

    @Basic
    @javax.persistence.Column(name = "PL", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getPl() {
        return pl;
    }

    public void setPl(BigDecimal pl) {
        this.pl = pl;
    }

    private BigDecimal ss;

    @Basic
    @javax.persistence.Column(name = "SS", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getSs() {
        return ss;
    }

    public void setSs(BigDecimal ss) {
        this.ss = ss;
    }

    private String gldx;

    @Basic
    @javax.persistence.Column(name = "GLDX", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getGldx() {
        return gldx;
    }

    public void setGldx(String gldx) {
        this.gldx = gldx;
    }

    private BigDecimal gldxid;

    @Basic
    @javax.persistence.Column(name = "GLDXID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getGldxid() {
        return gldxid;
    }

    public void setGldxid(BigDecimal gldxid) {
        this.gldxid = gldxid;
    }

    private String glcs;

    @Basic
    @javax.persistence.Column(name = "GLCS", nullable = true, insertable = true, updatable = true, length = 2000, precision = 0)
    public String getGlcs() {
        return glcs;
    }

    public void setGlcs(String glcs) {
        this.glcs = glcs;
    }

    private String glry;

    @Basic
    @javax.persistence.Column(name = "GLRY", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getGlry() {
        return glry;
    }

    public void setGlry(String glry) {
        this.glry = glry;
    }

    private BigDecimal glryid;

    @Basic
    @javax.persistence.Column(name = "GLRYID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getGlryid() {
        return glryid;
    }

    public void setGlryid(BigDecimal glryid) {
        this.glryid = glryid;
    }

    private String glbz;

    @Basic
    @javax.persistence.Column(name = "GLBZ", nullable = true, insertable = true, updatable = true, length = 2000, precision = 0)
    public String getGlbz() {
        return glbz;
    }

    public void setGlbz(String glbz) {
        this.glbz = glbz;
    }

    private String jdzrr;

    @Basic
    @javax.persistence.Column(name = "JDZRR", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getJdzrr() {
        return jdzrr;
    }

    public void setJdzrr(String jdzrr) {
        this.jdzrr = jdzrr;
    }

    private BigDecimal jdzrrid;

    @Basic
    @javax.persistence.Column(name = "JDZRRID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getJdzrrid() {
        return jdzrrid;
    }

    public void setJdzrrid(BigDecimal jdzrrid) {
        this.jdzrrid = jdzrrid;
    }

    private String jdcs;

    @Basic
    @javax.persistence.Column(name = "JDCS", nullable = true, insertable = true, updatable = true, length = 2000, precision = 0)
    public String getJdcs() {
        return jdcs;
    }

    public void setJdcs(String jdcs) {
        this.jdcs = jdcs;
    }

    private String zjzrr;

    @Basic
    @javax.persistence.Column(name = "ZJZRR", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getZjzrr() {
        return zjzrr;
    }

    public void setZjzrr(String zjzrr) {
        this.zjzrr = zjzrr;
    }

    private BigDecimal zjzrrid;

    @Basic
    @javax.persistence.Column(name = "ZJZRRID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getZjzrrid() {
        return zjzrrid;
    }

    public void setZjzrrid(BigDecimal zjzrrid) {
        this.zjzrrid = zjzrrid;
    }

    private String aaa;

    @Basic
    @javax.persistence.Column(name = "AAA", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getAaa() {
        return aaa;
    }

    public void setAaa(String aaa) {
        this.aaa = aaa;
    }

    private String bbb;

    @Basic
    @javax.persistence.Column(name = "BBB", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getBbb() {
        return bbb;
    }

    public void setBbb(String bbb) {
        this.bbb = bbb;
    }

    private BigDecimal gzrwid;

    @Basic
    @javax.persistence.Column(name = "GZRWID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getGzrwid() {
        return gzrwid;
    }

    public void setGzrwid(BigDecimal gzrwid) {
        this.gzrwid = gzrwid;
    }

    private BigDecimal zyid;

    @Basic
    @javax.persistence.Column(name = "ZYID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getZyid() {
        return zyid;
    }

    public void setZyid(BigDecimal zyid) {
        this.zyid = zyid;
    }

    private String gzrwcode;

    @Basic
    @javax.persistence.Column(name = "GZRWCODE", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getGzrwcode() {
        return gzrwcode;
    }

    public void setGzrwcode(String gzrwcode) {
        this.gzrwcode = gzrwcode;
    }

    private String zycode;

    @Basic
    @javax.persistence.Column(name = "ZYCODE", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getZycode() {
        return zycode;
    }

    public void setZycode(String zycode) {
        this.zycode = zycode;
    }

    private String gxcode;

    @Basic
    @javax.persistence.Column(name = "GXCODE", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getGxcode() {
        return gxcode;
    }

    public void setGxcode(String gxcode) {
        this.gxcode = gxcode;
    }

    private String wxycode;

    @Basic
    @javax.persistence.Column(name = "WXYCODE", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getWxycode() {
        return wxycode;
    }

    public void setWxycode(String wxycode) {
        this.wxycode = wxycode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestHazards that = (TestHazards) o;

        if (aaa != null ? !aaa.equals(that.aaa) : that.aaa != null) return false;
        if (bbb != null ? !bbb.equals(that.bbb) : that.bbb != null) return false;
        if (fxdj != null ? !fxdj.equals(that.fxdj) : that.fxdj != null) return false;
        if (fxdjid != null ? !fxdjid.equals(that.fxdjid) : that.fxdjid != null) return false;
        if (fxlx != null ? !fxlx.equals(that.fxlx) : that.fxlx != null) return false;
        if (glbz != null ? !glbz.equals(that.glbz) : that.glbz != null) return false;
        if (glcs != null ? !glcs.equals(that.glcs) : that.glcs != null) return false;
        if (gldx != null ? !gldx.equals(that.gldx) : that.gldx != null) return false;
        if (gldxid != null ? !gldxid.equals(that.gldxid) : that.gldxid != null) return false;
        if (glry != null ? !glry.equals(that.glry) : that.glry != null) return false;
        if (glryid != null ? !glryid.equals(that.glryid) : that.glryid != null) return false;
        if (gx != null ? !gx.equals(that.gx) : that.gx != null) return false;
        if (gxcode != null ? !gxcode.equals(that.gxcode) : that.gxcode != null) return false;
        if (gxid != null ? !gxid.equals(that.gxid) : that.gxid != null) return false;
        if (gzrwcode != null ? !gzrwcode.equals(that.gzrwcode) : that.gzrwcode != null) return false;
        if (gzrwid != null ? !gzrwid.equals(that.gzrwid) : that.gzrwid != null) return false;
        if (hgms != null ? !hgms.equals(that.hgms) : that.hgms != null) return false;
        if (jdcs != null ? !jdcs.equals(that.jdcs) : that.jdcs != null) return false;
        if (jdzrr != null ? !jdzrr.equals(that.jdzrr) : that.jdzrr != null) return false;
        if (jdzrrid != null ? !jdzrrid.equals(that.jdzrrid) : that.jdzrrid != null) return false;
        if (pl != null ? !pl.equals(that.pl) : that.pl != null) return false;
        if (sglx != null ? !sglx.equals(that.sglx) : that.sglx != null) return false;
        if (ss != null ? !ss.equals(that.ss) : that.ss != null) return false;
        if (wxy != null ? !wxy.equals(that.wxy) : that.wxy != null) return false;
        if (wxycode != null ? !wxycode.equals(that.wxycode) : that.wxycode != null) return false;
        if (wxyid != null ? !wxyid.equals(that.wxyid) : that.wxyid != null) return false;
        if (zjzrr != null ? !zjzrr.equals(that.zjzrr) : that.zjzrr != null) return false;
        if (zjzrrid != null ? !zjzrrid.equals(that.zjzrrid) : that.zjzrrid != null) return false;
        if (zycode != null ? !zycode.equals(that.zycode) : that.zycode != null) return false;
        if (zyid != null ? !zyid.equals(that.zyid) : that.zyid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gx != null ? gx.hashCode() : 0;
        result = 31 * result + (gxid != null ? gxid.hashCode() : 0);
        result = 31 * result + (wxy != null ? wxy.hashCode() : 0);
        result = 31 * result + (hgms != null ? hgms.hashCode() : 0);
        result = 31 * result + (wxyid != null ? wxyid.hashCode() : 0);
        result = 31 * result + (fxlx != null ? fxlx.hashCode() : 0);
        result = 31 * result + (sglx != null ? sglx.hashCode() : 0);
        result = 31 * result + (fxdj != null ? fxdj.hashCode() : 0);
        result = 31 * result + (fxdjid != null ? fxdjid.hashCode() : 0);
        result = 31 * result + (pl != null ? pl.hashCode() : 0);
        result = 31 * result + (ss != null ? ss.hashCode() : 0);
        result = 31 * result + (gldx != null ? gldx.hashCode() : 0);
        result = 31 * result + (gldxid != null ? gldxid.hashCode() : 0);
        result = 31 * result + (glcs != null ? glcs.hashCode() : 0);
        result = 31 * result + (glry != null ? glry.hashCode() : 0);
        result = 31 * result + (glryid != null ? glryid.hashCode() : 0);
        result = 31 * result + (glbz != null ? glbz.hashCode() : 0);
        result = 31 * result + (jdzrr != null ? jdzrr.hashCode() : 0);
        result = 31 * result + (jdzrrid != null ? jdzrrid.hashCode() : 0);
        result = 31 * result + (jdcs != null ? jdcs.hashCode() : 0);
        result = 31 * result + (zjzrr != null ? zjzrr.hashCode() : 0);
        result = 31 * result + (zjzrrid != null ? zjzrrid.hashCode() : 0);
        result = 31 * result + (aaa != null ? aaa.hashCode() : 0);
        result = 31 * result + (bbb != null ? bbb.hashCode() : 0);
        result = 31 * result + (gzrwid != null ? gzrwid.hashCode() : 0);
        result = 31 * result + (zyid != null ? zyid.hashCode() : 0);
        result = 31 * result + (gzrwcode != null ? gzrwcode.hashCode() : 0);
        result = 31 * result + (zycode != null ? zycode.hashCode() : 0);
        result = 31 * result + (gxcode != null ? gxcode.hashCode() : 0);
        result = 31 * result + (wxycode != null ? wxycode.hashCode() : 0);
        return result;
    }
}
