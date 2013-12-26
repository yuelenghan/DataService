package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
public class Loginmark {
    private BigDecimal lmark;
    private String keytype;

    @Basic
    @Column(name = "LMARK", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getLmark() {
        return lmark;
    }

    public void setLmark(BigDecimal lmark) {
        this.lmark = lmark;
    }

    @Basic
    @Column(name = "KEYTYPE", nullable = false, insertable = true, updatable = true, length = 3, precision = 0)
    public String getKeytype() {
        return keytype;
    }

    public void setKeytype(String keytype) {
        this.keytype = keytype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Loginmark loginmark = (Loginmark) o;

        if (keytype != null ? !keytype.equals(loginmark.keytype) : loginmark.keytype != null) return false;
        if (lmark != null ? !lmark.equals(loginmark.lmark) : loginmark.lmark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lmark != null ? lmark.hashCode() : 0;
        result = 31 * result + (keytype != null ? keytype.hashCode() : 0);
        return result;
    }
}
