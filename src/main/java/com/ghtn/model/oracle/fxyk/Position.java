package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
public class Position {
    private BigDecimal posid;
    private String posname;
    private String posnumber;
    private String movegblevel;
    private String maindeptid;
    private BigDecimal psort;

    @Id
    @Column(name = "POSID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getPosid() {
        return posid;
    }

    public void setPosid(BigDecimal posid) {
        this.posid = posid;
    }

    @Basic
    @Column(name = "POSNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getPosname() {
        return posname;
    }

    public void setPosname(String posname) {
        this.posname = posname;
    }

    @Basic
    @Column(name = "POSNUMBER", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPosnumber() {
        return posnumber;
    }

    public void setPosnumber(String posnumber) {
        this.posnumber = posnumber;
    }

    @Basic
    @Column(name = "MOVEGBLEVEL", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getMovegblevel() {
        return movegblevel;
    }

    public void setMovegblevel(String movegblevel) {
        this.movegblevel = movegblevel;
    }

    @Basic
    @Column(name = "MAINDEPTID", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindeptid() {
        return maindeptid;
    }

    public void setMaindeptid(String maindeptid) {
        this.maindeptid = maindeptid;
    }

    @Basic
    @Column(name = "PSORT", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getPsort() {
        return psort;
    }

    public void setPsort(BigDecimal psort) {
        this.psort = psort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (maindeptid != null ? !maindeptid.equals(position.maindeptid) : position.maindeptid != null) return false;
        if (movegblevel != null ? !movegblevel.equals(position.movegblevel) : position.movegblevel != null)
            return false;
        if (posid != null ? !posid.equals(position.posid) : position.posid != null) return false;
        if (posname != null ? !posname.equals(position.posname) : position.posname != null) return false;
        if (posnumber != null ? !posnumber.equals(position.posnumber) : position.posnumber != null) return false;
        if (psort != null ? !psort.equals(position.psort) : position.psort != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = posid != null ? posid.hashCode() : 0;
        result = 31 * result + (posname != null ? posname.hashCode() : 0);
        result = 31 * result + (posnumber != null ? posnumber.hashCode() : 0);
        result = 31 * result + (movegblevel != null ? movegblevel.hashCode() : 0);
        result = 31 * result + (maindeptid != null ? maindeptid.hashCode() : 0);
        result = 31 * result + (psort != null ? psort.hashCode() : 0);
        return result;
    }
}
