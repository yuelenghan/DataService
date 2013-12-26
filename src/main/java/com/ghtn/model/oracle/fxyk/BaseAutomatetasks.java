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
@Table(name = "BASE_AUTOMATETASKS", schema = "SEP3", catalog = "")
public class BaseAutomatetasks {
    private String amcode;
    private String amname;
    private Timestamp runtime;
    private BigInteger status;

    @Id
    @Column(name = "AMCODE", nullable = false, insertable = true, updatable = true, length = 50, precision = 0)
    public String getAmcode() {
        return amcode;
    }

    public void setAmcode(String amcode) {
        this.amcode = amcode;
    }

    @Basic
    @Column(name = "AMNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getAmname() {
        return amname;
    }

    public void setAmname(String amname) {
        this.amname = amname;
    }

    @Basic
    @Column(name = "RUNTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getRuntime() {
        return runtime;
    }

    public void setRuntime(Timestamp runtime) {
        this.runtime = runtime;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getStatus() {
        return status;
    }

    public void setStatus(BigInteger status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseAutomatetasks that = (BaseAutomatetasks) o;

        if (amcode != null ? !amcode.equals(that.amcode) : that.amcode != null) return false;
        if (amname != null ? !amname.equals(that.amname) : that.amname != null) return false;
        if (runtime != null ? !runtime.equals(that.runtime) : that.runtime != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = amcode != null ? amcode.hashCode() : 0;
        result = 31 * result + (amname != null ? amname.hashCode() : 0);
        result = 31 * result + (runtime != null ? runtime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
