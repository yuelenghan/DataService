package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
@Table(name = "HANGTAG_MORE", schema = "SEP3", catalog = "")
@IdClass(HangtagMorePK.class)
public class HangtagMore {
    private Timestamp recordtime;
    private String personid;
    private BigInteger atype;

    @Id
    @Column(name = "RECORDTIME", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Timestamp recordtime) {
        this.recordtime = recordtime;
    }

    @Id
    @Column(name = "PERSONID", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    @Id
    @Column(name = "ATYPE", nullable = false, insertable = true, updatable = true, length = 1, precision = 0)
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

        HangtagMore that = (HangtagMore) o;

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
