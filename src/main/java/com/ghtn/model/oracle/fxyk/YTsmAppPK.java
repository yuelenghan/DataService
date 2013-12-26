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
public class YTsmAppPK implements Serializable {
    private Timestamp recordtime;
    private String aperson;

    @Column(name = "RECORDTIME", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    @Id
    public Timestamp getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Timestamp recordtime) {
        this.recordtime = recordtime;
    }

    @Column(name = "APERSON", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    @Id
    public String getAperson() {
        return aperson;
    }

    public void setAperson(String aperson) {
        this.aperson = aperson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YTsmAppPK yTsmAppPK = (YTsmAppPK) o;

        if (aperson != null ? !aperson.equals(yTsmAppPK.aperson) : yTsmAppPK.aperson != null) return false;
        if (recordtime != null ? !recordtime.equals(yTsmAppPK.recordtime) : yTsmAppPK.recordtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recordtime != null ? recordtime.hashCode() : 0;
        result = 31 * result + (aperson != null ? aperson.hashCode() : 0);
        return result;
    }
}
