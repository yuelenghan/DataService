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
@Table(name = "TEST_PROCESS", schema = "SEP3", catalog = "")
public class TestProcess {
    private String zy;
    private String gzrw;
    private String gx;
    private String xl;
    private BigDecimal gzrwid;
    private BigDecimal zyid;
    private BigDecimal xlid;

    @Basic
    @Column(name = "ZY", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    @Basic
    @Column(name = "GZRW", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getGzrw() {
        return gzrw;
    }

    public void setGzrw(String gzrw) {
        this.gzrw = gzrw;
    }

    @Basic
    @Column(name = "GX", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getGx() {
        return gx;
    }

    public void setGx(String gx) {
        this.gx = gx;
    }

    @Basic
    @Column(name = "XL", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getXl() {
        return xl;
    }

    public void setXl(String xl) {
        this.xl = xl;
    }

    @Basic
    @Column(name = "GZRWID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getGzrwid() {
        return gzrwid;
    }

    public void setGzrwid(BigDecimal gzrwid) {
        this.gzrwid = gzrwid;
    }

    @Basic
    @Column(name = "ZYID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getZyid() {
        return zyid;
    }

    public void setZyid(BigDecimal zyid) {
        this.zyid = zyid;
    }

    @Basic
    @Column(name = "XLID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getXlid() {
        return xlid;
    }

    public void setXlid(BigDecimal xlid) {
        this.xlid = xlid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestProcess that = (TestProcess) o;

        if (gx != null ? !gx.equals(that.gx) : that.gx != null) return false;
        if (gzrw != null ? !gzrw.equals(that.gzrw) : that.gzrw != null) return false;
        if (gzrwid != null ? !gzrwid.equals(that.gzrwid) : that.gzrwid != null) return false;
        if (xl != null ? !xl.equals(that.xl) : that.xl != null) return false;
        if (xlid != null ? !xlid.equals(that.xlid) : that.xlid != null) return false;
        if (zy != null ? !zy.equals(that.zy) : that.zy != null) return false;
        if (zyid != null ? !zyid.equals(that.zyid) : that.zyid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zy != null ? zy.hashCode() : 0;
        result = 31 * result + (gzrw != null ? gzrw.hashCode() : 0);
        result = 31 * result + (gx != null ? gx.hashCode() : 0);
        result = 31 * result + (xl != null ? xl.hashCode() : 0);
        result = 31 * result + (gzrwid != null ? gzrwid.hashCode() : 0);
        result = 31 * result + (zyid != null ? zyid.hashCode() : 0);
        result = 31 * result + (xlid != null ? xlid.hashCode() : 0);
        return result;
    }
}
