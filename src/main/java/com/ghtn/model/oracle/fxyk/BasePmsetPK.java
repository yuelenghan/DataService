package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
public class BasePmsetPK implements Serializable {
    private String personnumber;
    private String maindept;

    @Column(name = "PERSONNUMBER", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    @Id
    public String getPersonnumber() {
        return personnumber;
    }

    public void setPersonnumber(String personnumber) {
        this.personnumber = personnumber;
    }

    @Column(name = "MAINDEPT", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    @Id
    public String getMaindept() {
        return maindept;
    }

    public void setMaindept(String maindept) {
        this.maindept = maindept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasePmsetPK that = (BasePmsetPK) o;

        if (maindept != null ? !maindept.equals(that.maindept) : that.maindept != null) return false;
        if (personnumber != null ? !personnumber.equals(that.personnumber) : that.personnumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personnumber != null ? personnumber.hashCode() : 0;
        result = 31 * result + (maindept != null ? maindept.hashCode() : 0);
        return result;
    }
}
