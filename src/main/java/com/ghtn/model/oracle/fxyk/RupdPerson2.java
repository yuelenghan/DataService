package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Arrays;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
@Table(name = "RUPD$_PERSON2", schema = "SEP3", catalog = "")
public class RupdPerson2 {
    private Integer personid;
    private String dmltype$$;
    private BigDecimal snapid;
    private byte[] changeVector$$;

    @Basic
    @Column(name = "PERSONID", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    @Basic
    @Column(name = "DMLTYPE$$", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public String getDmltype$$() {
        return dmltype$$;
    }

    public void setDmltype$$(String dmltype$$) {
        this.dmltype$$ = dmltype$$;
    }

    @Basic
    @Column(name = "SNAPID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getSnapid() {
        return snapid;
    }

    public void setSnapid(BigDecimal snapid) {
        this.snapid = snapid;
    }

    @Basic
    @Column(name = "CHANGE_VECTOR$$", nullable = true, insertable = true, updatable = true, length = 255, precision = 0)
    public byte[] getChangeVector$$() {
        return changeVector$$;
    }

    public void setChangeVector$$(byte[] changeVector$$) {
        this.changeVector$$ = changeVector$$;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RupdPerson2 that = (RupdPerson2) o;

        if (!Arrays.equals(changeVector$$, that.changeVector$$)) return false;
        if (dmltype$$ != null ? !dmltype$$.equals(that.dmltype$$) : that.dmltype$$ != null) return false;
        if (personid != null ? !personid.equals(that.personid) : that.personid != null) return false;
        if (snapid != null ? !snapid.equals(that.snapid) : that.snapid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personid != null ? personid.hashCode() : 0;
        result = 31 * result + (dmltype$$ != null ? dmltype$$.hashCode() : 0);
        result = 31 * result + (snapid != null ? snapid.hashCode() : 0);
        result = 31 * result + (changeVector$$ != null ? Arrays.hashCode(changeVector$$) : 0);
        return result;
    }
}
