package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
public class Placetest {
    private String placename;
    private String placeare;
    private BigDecimal placeid;

    @Basic
    @Column(name = "PLACENAME", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    @Basic
    @Column(name = "PLACEARE", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getPlaceare() {
        return placeare;
    }

    public void setPlaceare(String placeare) {
        this.placeare = placeare;
    }

    @Basic
    @Column(name = "PLACEID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getPlaceid() {
        return placeid;
    }

    public void setPlaceid(BigDecimal placeid) {
        this.placeid = placeid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Placetest placetest = (Placetest) o;

        if (placeare != null ? !placeare.equals(placetest.placeare) : placetest.placeare != null) return false;
        if (placeid != null ? !placeid.equals(placetest.placeid) : placetest.placeid != null) return false;
        if (placename != null ? !placename.equals(placetest.placename) : placetest.placename != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = placename != null ? placename.hashCode() : 0;
        result = 31 * result + (placeare != null ? placeare.hashCode() : 0);
        result = 31 * result + (placeid != null ? placeid.hashCode() : 0);
        return result;
    }
}
