package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
@IdClass(NswfinesetPK.class)
public class Nswfineset {
    private int levelid;
    private BigInteger jctype;
    private BigInteger fineobject;
    private BigInteger finetype;
    private Timestamp indate;
    private BigDecimal fine;
    private String maindeptid;
    private String status;

    @Id
    @Column(name = "LEVELID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getLevelid() {
        return levelid;
    }

    public void setLevelid(int levelid) {
        this.levelid = levelid;
    }

    @Id
    @Column(name = "JCTYPE", nullable = false, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getJctype() {
        return jctype;
    }

    public void setJctype(BigInteger jctype) {
        this.jctype = jctype;
    }

    @Id
    @Column(name = "FINEOBJECT", nullable = false, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getFineobject() {
        return fineobject;
    }

    public void setFineobject(BigInteger fineobject) {
        this.fineobject = fineobject;
    }

    @Id
    @Column(name = "FINETYPE", nullable = false, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getFinetype() {
        return finetype;
    }

    public void setFinetype(BigInteger finetype) {
        this.finetype = finetype;
    }

    @Basic
    @Column(name = "INDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getIndate() {
        return indate;
    }

    public void setIndate(Timestamp indate) {
        this.indate = indate;
    }

    @Basic
    @Column(name = "FINE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getFine() {
        return fine;
    }

    public void setFine(BigDecimal fine) {
        this.fine = fine;
    }

    @Id
    @Column(name = "MAINDEPTID", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindeptid() {
        return maindeptid;
    }

    public void setMaindeptid(String maindeptid) {
        this.maindeptid = maindeptid;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nswfineset that = (Nswfineset) o;

        if (levelid != that.levelid) return false;
        if (fine != null ? !fine.equals(that.fine) : that.fine != null) return false;
        if (fineobject != null ? !fineobject.equals(that.fineobject) : that.fineobject != null) return false;
        if (finetype != null ? !finetype.equals(that.finetype) : that.finetype != null) return false;
        if (indate != null ? !indate.equals(that.indate) : that.indate != null) return false;
        if (jctype != null ? !jctype.equals(that.jctype) : that.jctype != null) return false;
        if (maindeptid != null ? !maindeptid.equals(that.maindeptid) : that.maindeptid != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = levelid;
        result = 31 * result + (jctype != null ? jctype.hashCode() : 0);
        result = 31 * result + (fineobject != null ? fineobject.hashCode() : 0);
        result = 31 * result + (finetype != null ? finetype.hashCode() : 0);
        result = 31 * result + (indate != null ? indate.hashCode() : 0);
        result = 31 * result + (fine != null ? fine.hashCode() : 0);
        result = 31 * result + (maindeptid != null ? maindeptid.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
