package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
@Table(name = "TP_PLAN_EXCHANGE_LOG", schema = "SEP3", catalog = "")
public class TpPlanExchangeLog {
    private Timestamp logdate;
    private String loguser;
    private String maindept;
    private String remarks;

    @Id
    @Column(name = "LOGDATE", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getLogdate() {
        return logdate;
    }

    public void setLogdate(Timestamp logdate) {
        this.logdate = logdate;
    }

    @Basic
    @Column(name = "LOGUSER", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getLoguser() {
        return loguser;
    }

    public void setLoguser(String loguser) {
        this.loguser = loguser;
    }

    @Basic
    @Column(name = "MAINDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindept() {
        return maindept;
    }

    public void setMaindept(String maindept) {
        this.maindept = maindept;
    }

    @Basic
    @Column(name = "REMARKS", nullable = true, insertable = true, updatable = true, length = 2000, precision = 0)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TpPlanExchangeLog that = (TpPlanExchangeLog) o;

        if (logdate != null ? !logdate.equals(that.logdate) : that.logdate != null) return false;
        if (loguser != null ? !loguser.equals(that.loguser) : that.loguser != null) return false;
        if (maindept != null ? !maindept.equals(that.maindept) : that.maindept != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = logdate != null ? logdate.hashCode() : 0;
        result = 31 * result + (loguser != null ? loguser.hashCode() : 0);
        result = 31 * result + (maindept != null ? maindept.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        return result;
    }
}
