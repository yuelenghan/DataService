package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@Table(name = "SMS_PROJECT", schema = "SEP3", catalog = "")
public class SmsProject {
    private String coding;
    private String functionname;
    private BigDecimal flevel;
    private BigDecimal status;

    @Id
    @Column(name = "CODING", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public String getCoding() {
        return coding;
    }

    public void setCoding(String coding) {
        this.coding = coding;
    }

    @Basic
    @Column(name = "FUNCTIONNAME", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getFunctionname() {
        return functionname;
    }

    public void setFunctionname(String functionname) {
        this.functionname = functionname;
    }

    @Basic
    @Column(name = "FLEVEL", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getFlevel() {
        return flevel;
    }

    public void setFlevel(BigDecimal flevel) {
        this.flevel = flevel;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmsProject that = (SmsProject) o;

        if (coding != null ? !coding.equals(that.coding) : that.coding != null) return false;
        if (flevel != null ? !flevel.equals(that.flevel) : that.flevel != null) return false;
        if (functionname != null ? !functionname.equals(that.functionname) : that.functionname != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = coding != null ? coding.hashCode() : 0;
        result = 31 * result + (functionname != null ? functionname.hashCode() : 0);
        result = 31 * result + (flevel != null ? flevel.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
