package com.ghtn.model.oracle;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-27
 * Time: 下午4:28
 */
@Entity
@Table(name = "KQ_RECORD", schema = "SEP3", catalog = "")
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class KqRecord {
    private int rjid;
    private String kqpnumber;
    private Timestamp downtime;
    private Timestamp uptime;
    private Timestamp kqtime;
    private String kqbenci;
    private BigInteger kqtype;
    private BigInteger datafrom;
    private String zdgj;
    private String inputperson;
    private String kqdept;
    private Integer worktime;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kqrecord")
    @SequenceGenerator(name = "kqrecord", sequenceName = "SEQ_KQ_RECORD", allocationSize = 1)
    @Column(name = "RJID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getRjid() {
        return rjid;
    }

    public void setRjid(int rjid) {
        this.rjid = rjid;
    }

    @Basic
    @Column(name = "KQPNUMBER", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    public String getKqpnumber() {
        return kqpnumber;
    }

    public void setKqpnumber(String kqpnumber) {
        this.kqpnumber = kqpnumber;
    }

    @Basic
    @Column(name = "DOWNTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getDowntime() {
        return downtime;
    }

    public void setDowntime(Timestamp downtime) {
        this.downtime = downtime;
    }

    @Basic
    @Column(name = "UPTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getUptime() {
        return uptime;
    }

    public void setUptime(Timestamp uptime) {
        this.uptime = uptime;
    }

    @Basic
    @Column(name = "KQTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getKqtime() {
        return kqtime;
    }

    public void setKqtime(Timestamp kqtime) {
        this.kqtime = kqtime;
    }

    @Basic
    @Column(name = "KQBENCI", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getKqbenci() {
        return kqbenci;
    }

    public void setKqbenci(String kqbenci) {
        this.kqbenci = kqbenci;
    }

    @Basic
    @Column(name = "KQTYPE", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getKqtype() {
        return kqtype;
    }

    public void setKqtype(BigInteger kqtype) {
        this.kqtype = kqtype;
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
    @Column(name = "ZDGJ", nullable = true, insertable = true, updatable = true, length = 1000, precision = 0)
    public String getZdgj() {
        return zdgj;
    }

    public void setZdgj(String zdgj) {
        this.zdgj = zdgj;
    }

    @Basic
    @Column(name = "INPUTPERSON", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getInputperson() {
        return inputperson;
    }

    public void setInputperson(String inputperson) {
        this.inputperson = inputperson;
    }

    @Basic
    @Column(name = "KQDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getKqdept() {
        return kqdept;
    }

    public void setKqdept(String kqdept) {
        this.kqdept = kqdept;
    }

    @Basic
    @Column(name = "WORKTIME", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public Integer getWorktime() {
        return worktime;
    }

    public void setWorktime(Integer worktime) {
        this.worktime = worktime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KqRecord kqRecord = (KqRecord) o;

        if (rjid != kqRecord.rjid) return false;
        if (datafrom != null ? !datafrom.equals(kqRecord.datafrom) : kqRecord.datafrom != null) return false;
        if (downtime != null ? !downtime.equals(kqRecord.downtime) : kqRecord.downtime != null) return false;
        if (inputperson != null ? !inputperson.equals(kqRecord.inputperson) : kqRecord.inputperson != null)
            return false;
        if (kqbenci != null ? !kqbenci.equals(kqRecord.kqbenci) : kqRecord.kqbenci != null) return false;
        if (kqdept != null ? !kqdept.equals(kqRecord.kqdept) : kqRecord.kqdept != null) return false;
        if (kqpnumber != null ? !kqpnumber.equals(kqRecord.kqpnumber) : kqRecord.kqpnumber != null) return false;
        if (kqtime != null ? !kqtime.equals(kqRecord.kqtime) : kqRecord.kqtime != null) return false;
        if (kqtype != null ? !kqtype.equals(kqRecord.kqtype) : kqRecord.kqtype != null) return false;
        if (uptime != null ? !uptime.equals(kqRecord.uptime) : kqRecord.uptime != null) return false;
        if (worktime != null ? !worktime.equals(kqRecord.worktime) : kqRecord.worktime != null) return false;
        if (zdgj != null ? !zdgj.equals(kqRecord.zdgj) : kqRecord.zdgj != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rjid;
        result = 31 * result + (kqpnumber != null ? kqpnumber.hashCode() : 0);
        result = 31 * result + (downtime != null ? downtime.hashCode() : 0);
        result = 31 * result + (uptime != null ? uptime.hashCode() : 0);
        result = 31 * result + (kqtime != null ? kqtime.hashCode() : 0);
        result = 31 * result + (kqbenci != null ? kqbenci.hashCode() : 0);
        result = 31 * result + (kqtype != null ? kqtype.hashCode() : 0);
        result = 31 * result + (datafrom != null ? datafrom.hashCode() : 0);
        result = 31 * result + (zdgj != null ? zdgj.hashCode() : 0);
        result = 31 * result + (inputperson != null ? inputperson.hashCode() : 0);
        result = 31 * result + (kqdept != null ? kqdept.hashCode() : 0);
        result = 31 * result + (worktime != null ? worktime.hashCode() : 0);
        return result;
    }
}
