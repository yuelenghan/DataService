package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
@Table(name = "OF_DETAIL", schema = "SEP3", catalog = "")
@IdClass(OfDetailPK.class)
public class OfDetail {
    private Timestamp recordtime;
    private BigInteger fkind;
    private String fobject;
    private String fid;
    private String fname;
    private Integer fine;

    @Id
    @Column(name = "RECORDTIME", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Timestamp recordtime) {
        this.recordtime = recordtime;
    }

    @Basic
    @Column(name = "FKIND", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getFkind() {
        return fkind;
    }

    public void setFkind(BigInteger fkind) {
        this.fkind = fkind;
    }

    @Basic
    @Column(name = "FOBJECT", nullable = true, insertable = true, updatable = true, length = 30, precision = 0)
    public String getFobject() {
        return fobject;
    }

    public void setFobject(String fobject) {
        this.fobject = fobject;
    }

    @Id
    @Column(name = "FID", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "FNAME", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Basic
    @Column(name = "FINE", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getFine() {
        return fine;
    }

    public void setFine(Integer fine) {
        this.fine = fine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OfDetail ofDetail = (OfDetail) o;

        if (fid != null ? !fid.equals(ofDetail.fid) : ofDetail.fid != null) return false;
        if (fine != null ? !fine.equals(ofDetail.fine) : ofDetail.fine != null) return false;
        if (fkind != null ? !fkind.equals(ofDetail.fkind) : ofDetail.fkind != null) return false;
        if (fname != null ? !fname.equals(ofDetail.fname) : ofDetail.fname != null) return false;
        if (fobject != null ? !fobject.equals(ofDetail.fobject) : ofDetail.fobject != null) return false;
        if (recordtime != null ? !recordtime.equals(ofDetail.recordtime) : ofDetail.recordtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recordtime != null ? recordtime.hashCode() : 0;
        result = 31 * result + (fkind != null ? fkind.hashCode() : 0);
        result = 31 * result + (fobject != null ? fobject.hashCode() : 0);
        result = 31 * result + (fid != null ? fid.hashCode() : 0);
        result = 31 * result + (fname != null ? fname.hashCode() : 0);
        result = 31 * result + (fine != null ? fine.hashCode() : 0);
        return result;
    }
}
