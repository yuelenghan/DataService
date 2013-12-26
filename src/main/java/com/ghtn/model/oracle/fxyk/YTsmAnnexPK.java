package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
public class YTsmAnnexPK implements Serializable {
    private Timestamp recordtime;
    private Timestamp uptime;

    @Column(name = "RECORDTIME", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    @Id
    public Timestamp getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Timestamp recordtime) {
        this.recordtime = recordtime;
    }

    @Column(name = "UPTIME", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    @Id
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

        YTsmAnnexPK that = (YTsmAnnexPK) o;

        if (recordtime != null ? !recordtime.equals(that.recordtime) : that.recordtime != null) return false;
        if (uptime != null ? !uptime.equals(that.uptime) : that.uptime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recordtime != null ? recordtime.hashCode() : 0;
        result = 31 * result + (uptime != null ? uptime.hashCode() : 0);
        return result;
    }
}
