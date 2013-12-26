package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
@Table(name = "Y_TSM_APP", schema = "SEP3", catalog = "")
@IdClass(YTsmAppPK.class)
public class YTsmApp {
    private Timestamp recordtime;
    private String aperson;
    private String remarks;
    private String maindept;

    @Id
    @Column(name = "RECORDTIME", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Timestamp recordtime) {
        this.recordtime = recordtime;
    }

    @Id
    @Column(name = "APERSON", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    public String getAperson() {
        return aperson;
    }

    public void setAperson(String aperson) {
        this.aperson = aperson;
    }

    @Basic
    @Column(name = "REMARKS", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "MAINDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindept() {
        return maindept;
    }

    public void setMaindept(String maindept) {
        this.maindept = maindept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YTsmApp yTsmApp = (YTsmApp) o;

        if (aperson != null ? !aperson.equals(yTsmApp.aperson) : yTsmApp.aperson != null) return false;
        if (maindept != null ? !maindept.equals(yTsmApp.maindept) : yTsmApp.maindept != null) return false;
        if (recordtime != null ? !recordtime.equals(yTsmApp.recordtime) : yTsmApp.recordtime != null) return false;
        if (remarks != null ? !remarks.equals(yTsmApp.remarks) : yTsmApp.remarks != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recordtime != null ? recordtime.hashCode() : 0;
        result = 31 * result + (aperson != null ? aperson.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (maindept != null ? maindept.hashCode() : 0);
        return result;
    }
}
