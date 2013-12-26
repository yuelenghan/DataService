package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
public class Yhsmsset {
    private BigDecimal yhsmssetid;
    private BigDecimal yhlevel;
    private String person;
    private String maindept;
    private String deptnumber;

    @Id
    @Column(name = "YHSMSSETID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getYhsmssetid() {
        return yhsmssetid;
    }

    public void setYhsmssetid(BigDecimal yhsmssetid) {
        this.yhsmssetid = yhsmssetid;
    }

    @Basic
    @Column(name = "YHLEVEL", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getYhlevel() {
        return yhlevel;
    }

    public void setYhlevel(BigDecimal yhlevel) {
        this.yhlevel = yhlevel;
    }

    @Basic
    @Column(name = "PERSON", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Basic
    @Column(name = "MAINDEPT", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getMaindept() {
        return maindept;
    }

    public void setMaindept(String maindept) {
        this.maindept = maindept;
    }

    @Basic
    @Column(name = "DEPTNUMBER", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getDeptnumber() {
        return deptnumber;
    }

    public void setDeptnumber(String deptnumber) {
        this.deptnumber = deptnumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Yhsmsset yhsmsset = (Yhsmsset) o;

        if (deptnumber != null ? !deptnumber.equals(yhsmsset.deptnumber) : yhsmsset.deptnumber != null) return false;
        if (maindept != null ? !maindept.equals(yhsmsset.maindept) : yhsmsset.maindept != null) return false;
        if (person != null ? !person.equals(yhsmsset.person) : yhsmsset.person != null) return false;
        if (yhlevel != null ? !yhlevel.equals(yhsmsset.yhlevel) : yhsmsset.yhlevel != null) return false;
        if (yhsmssetid != null ? !yhsmssetid.equals(yhsmsset.yhsmssetid) : yhsmsset.yhsmssetid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = yhsmssetid != null ? yhsmssetid.hashCode() : 0;
        result = 31 * result + (yhlevel != null ? yhlevel.hashCode() : 0);
        result = 31 * result + (person != null ? person.hashCode() : 0);
        result = 31 * result + (maindept != null ? maindept.hashCode() : 0);
        result = 31 * result + (deptnumber != null ? deptnumber.hashCode() : 0);
        return result;
    }
}
