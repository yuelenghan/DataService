package com.ghtn.model.oracle;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by lihe on 14-6-10.
 */
public class NswfinedetailPK implements Serializable {
    private int swinputid;

    @Column(name = "SWINPUTID", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public int getSwinputid() {
        return swinputid;
    }

    public void setSwinputid(int swinputid) {
        this.swinputid = swinputid;
    }

    private long lcmark;

    @Column(name = "LCMARK", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public long getLcmark() {
        return lcmark;
    }

    public void setLcmark(long lcmark) {
        this.lcmark = lcmark;
    }

    private Date recorddate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RECORDDATE", nullable = false, insertable = true, updatable = true)
    @Id
    public Date getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }

    private BigInteger finekind;

    @Column(name = "FINEKIND", nullable = false, insertable = true, updatable = true, precision = 0)
    @Id
    public BigInteger getFinekind() {
        return finekind;
    }

    public void setFinekind(BigInteger finekind) {
        this.finekind = finekind;
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

    private String objectname;

    @Column(name = "OBJECTNAME", nullable = false, insertable = true, updatable = true, length = 50)
    @Id
    public String getObjectname() {
        return objectname;
    }

    public void setObjectname(String objectname) {
        this.objectname = objectname;
    }

    private String fineid;

    @Column(name = "FINEID", nullable = false, insertable = true, updatable = true, length = 50)
    @Id
    public String getFineid() {
        return fineid;
    }

    public void setFineid(String fineid) {
        this.fineid = fineid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NswfinedetailPK that = (NswfinedetailPK) o;

        if (lcmark != that.lcmark) return false;
        if (swinputid != that.swinputid) return false;
        if (fineid != null ? !fineid.equals(that.fineid) : that.fineid != null) return false;
        if (finekind != null ? !finekind.equals(that.finekind) : that.finekind != null) return false;
        if (finetype != null ? !finetype.equals(that.finetype) : that.finetype != null) return false;
        if (objectname != null ? !objectname.equals(that.objectname) : that.objectname != null) return false;
        if (recorddate != null ? !recorddate.equals(that.recorddate) : that.recorddate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = swinputid;
        result = 31 * result + (int) (lcmark ^ (lcmark >>> 32));
        result = 31 * result + (recorddate != null ? recorddate.hashCode() : 0);
        result = 31 * result + (finekind != null ? finekind.hashCode() : 0);
        result = 31 * result + (finetype != null ? finetype.hashCode() : 0);
        result = 31 * result + (objectname != null ? objectname.hashCode() : 0);
        result = 31 * result + (fineid != null ? fineid.hashCode() : 0);
        return result;
    }
}
