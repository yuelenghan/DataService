package com.ghtn.model.oracle;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigInteger;

/**
 * Created by lihe on 14-6-10.
 */
public class NswfinesetPK implements Serializable {
    private int levelid;

    @Column(name = "LEVELID", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public int getLevelid() {
        return levelid;
    }

    public void setLevelid(int levelid) {
        this.levelid = levelid;
    }

    private BigInteger jctype;

    @Column(name = "JCTYPE", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public BigInteger getJctype() {
        return jctype;
    }

    public void setJctype(BigInteger jctype) {
        this.jctype = jctype;
    }

    private BigInteger fineobject;

    @Column(name = "FINEOBJECT", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public BigInteger getFineobject() {
        return fineobject;
    }

    public void setFineobject(BigInteger fineobject) {
        this.fineobject = fineobject;
    }

    private BigInteger finetype;

    @Column(name = "FINETYPE", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public BigInteger getFinetype() {
        return finetype;
    }

    public void setFinetype(BigInteger finetype) {
        this.finetype = finetype;
    }

    private String maindeptid;

    @Column(name = "MAINDEPTID", nullable = false, insertable = true, updatable = true, length = 100)
    @Id
    public String getMaindeptid() {
        return maindeptid;
    }

    public void setMaindeptid(String maindeptid) {
        this.maindeptid = maindeptid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NswfinesetPK that = (NswfinesetPK) o;

        if (levelid != that.levelid) return false;
        if (fineobject != null ? !fineobject.equals(that.fineobject) : that.fineobject != null) return false;
        if (finetype != null ? !finetype.equals(that.finetype) : that.finetype != null) return false;
        if (jctype != null ? !jctype.equals(that.jctype) : that.jctype != null) return false;
        if (maindeptid != null ? !maindeptid.equals(that.maindeptid) : that.maindeptid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = levelid;
        result = 31 * result + (jctype != null ? jctype.hashCode() : 0);
        result = 31 * result + (fineobject != null ? fineobject.hashCode() : 0);
        result = 31 * result + (finetype != null ? finetype.hashCode() : 0);
        result = 31 * result + (maindeptid != null ? maindeptid.hashCode() : 0);
        return result;
    }
}
