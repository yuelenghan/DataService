package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
@Table(name = "Y_TSM_ANNEX", schema = "SEP3", catalog = "")
@IdClass(YTsmAnnexPK.class)
public class YTsmAnnex {
    private Timestamp recordtime;
    private String aperson;
    private String filename;
    private String annex;
    private Timestamp uptime;

    @Id
    @Column(name = "RECORDTIME", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Timestamp recordtime) {
        this.recordtime = recordtime;
    }

    @Basic
    @Column(name = "APERSON", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    public String getAperson() {
        return aperson;
    }

    public void setAperson(String aperson) {
        this.aperson = aperson;
    }

    @Basic
    @Column(name = "FILENAME", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Basic
    @Column(name = "ANNEX", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getAnnex() {
        return annex;
    }

    public void setAnnex(String annex) {
        this.annex = annex;
    }

    @Id
    @Column(name = "UPTIME", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getUptime() {
        return uptime;
    }

    public void setUptime(Timestamp uptime) {
        this.uptime = uptime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YTsmAnnex yTsmAnnex = (YTsmAnnex) o;

        if (annex != null ? !annex.equals(yTsmAnnex.annex) : yTsmAnnex.annex != null) return false;
        if (aperson != null ? !aperson.equals(yTsmAnnex.aperson) : yTsmAnnex.aperson != null) return false;
        if (filename != null ? !filename.equals(yTsmAnnex.filename) : yTsmAnnex.filename != null) return false;
        if (recordtime != null ? !recordtime.equals(yTsmAnnex.recordtime) : yTsmAnnex.recordtime != null) return false;
        if (uptime != null ? !uptime.equals(yTsmAnnex.uptime) : yTsmAnnex.uptime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recordtime != null ? recordtime.hashCode() : 0;
        result = 31 * result + (aperson != null ? aperson.hashCode() : 0);
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + (annex != null ? annex.hashCode() : 0);
        result = 31 * result + (uptime != null ? uptime.hashCode() : 0);
        return result;
    }
}
