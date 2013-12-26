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
@Table(name = "TEST_RYCS", schema = "SEP3", catalog = "")
public class TestRycs {
    private BigDecimal gldxid;
    private String glry;
    private BigDecimal glryid;
    private String glcs;

    @Basic
    @Column(name = "GLDXID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getGldxid() {
        return gldxid;
    }

    public void setGldxid(BigDecimal gldxid) {
        this.gldxid = gldxid;
    }

    @Basic
    @Column(name = "GLRY", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getGlry() {
        return glry;
    }

    public void setGlry(String glry) {
        this.glry = glry;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestRycs testRycs = (TestRycs) o;

        if (glcs != null ? !glcs.equals(testRycs.glcs) : testRycs.glcs != null) return false;
        if (gldxid != null ? !gldxid.equals(testRycs.gldxid) : testRycs.gldxid != null) return false;
        if (glry != null ? !glry.equals(testRycs.glry) : testRycs.glry != null) return false;
        if (glryid != null ? !glryid.equals(testRycs.glryid) : testRycs.glryid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gldxid != null ? gldxid.hashCode() : 0;
        result = 31 * result + (glry != null ? glry.hashCode() : 0);
        result = 31 * result + (glryid != null ? glryid.hashCode() : 0);
        result = 31 * result + (glcs != null ? glcs.hashCode() : 0);
        return result;
    }
}
