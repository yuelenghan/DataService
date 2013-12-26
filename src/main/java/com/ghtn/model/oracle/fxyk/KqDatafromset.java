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
@Table(name = "KQ_DATAFROMSET", schema = "SEP3", catalog = "")
public class KqDatafromset {
    private String maindeptid;
    private BigInteger datafrom;
    private Timestamp createtime;
    private Timestamp lastupdate;

    @Id
    @Column(name = "MAINDEPTID", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindeptid() {
        return maindeptid;
    }

    public void setMaindeptid(String maindeptid) {
        this.maindeptid = maindeptid;
    }

    @Basic
    @Column(name = "DATAFROM", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getDatafrom() {
        return datafrom;
    }

    public void setDatafrom(BigInteger datafrom) {
        this.datafrom = datafrom;
    }

    @Basic
    @Column(name = "CREATETIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "LASTUPDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Timestamp lastupdate) {
        this.lastupdate = lastupdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KqDatafromset that = (KqDatafromset) o;

        if (createtime != null ? !createtime.equals(that.createtime) : that.createtime != null) return false;
        if (datafrom != null ? !datafrom.equals(that.datafrom) : that.datafrom != null) return false;
        if (lastupdate != null ? !lastupdate.equals(that.lastupdate) : that.lastupdate != null) return false;
        if (maindeptid != null ? !maindeptid.equals(that.maindeptid) : that.maindeptid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = maindeptid != null ? maindeptid.hashCode() : 0;
        result = 31 * result + (datafrom != null ? datafrom.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (lastupdate != null ? lastupdate.hashCode() : 0);
        return result;
    }
}
