package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
public class HangtagMorePK implements Serializable {
    private Timestamp recordtime;
    private String personid;
    private BigInteger atype;

    @Column(name = "RECORDTIME", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    @Id
    public Timestamp getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Timestamp recordtime) {
        this.recordtime = recordtime;
    }

    @Column(name = "PERSONID", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    @Id
    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    @Column(name = "ATYPE", nullable = false, insertable = true, updatable = true, length = 1, precision = 0)
    @Id
    public BigInteger getAtype() {
        return atype;
    }

    public void setAtype(BigInteger atype) {
        this.atype = atype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HangtagMorePK that = (HangtagMorePK) o;

        if (atype != null ? !atype.equals(that.atype) : that.atype != null) return false;
        if (personid != null ? !personid.equals(that.personid) : that.personid != null) return false;
        if (recordtime != null ? !recordtime.equals(that.recordtime) : that.recordtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recordtime != null ? recordtime.hashCode() : 0;
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        result = 31 * result + (atype != null ? atype.hashCode() : 0);
        return result;
    }
}
