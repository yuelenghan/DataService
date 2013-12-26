package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@Table(name = "SMS_MANAGEMENT", schema = "SEP3", catalog = "")
public class SmsManagement {
    private BigDecimal mid;
    private String coding;
    private String deptnumber;
    private BigDecimal sendset;

    @Id
    @Column(name = "MID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getMid() {
        return mid;
    }

    public void setMid(BigDecimal mid) {
        this.mid = mid;
    }

    @Basic
    @Column(name = "CODING", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public String getCoding() {
        return coding;
    }

    public void setCoding(String coding) {
        this.coding = coding;
    }

    @Basic
    @Column(name = "DEPTNUMBER", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getDeptnumber() {
        return deptnumber;
    }

    public void setDeptnumber(String deptnumber) {
        this.deptnumber = deptnumber;
    }

    @Basic
    @Column(name = "SENDSET", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getSendset() {
        return sendset;
    }

    public void setSendset(BigDecimal sendset) {
        this.sendset = sendset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SmsManagement that = (SmsManagement) o;

        if (coding != null ? !coding.equals(that.coding) : that.coding != null) return false;
        if (deptnumber != null ? !deptnumber.equals(that.deptnumber) : that.deptnumber != null) return false;
        if (mid != null ? !mid.equals(that.mid) : that.mid != null) return false;
        if (sendset != null ? !sendset.equals(that.sendset) : that.sendset != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mid != null ? mid.hashCode() : 0;
        result = 31 * result + (coding != null ? coding.hashCode() : 0);
        result = 31 * result + (deptnumber != null ? deptnumber.hashCode() : 0);
        result = 31 * result + (sendset != null ? sendset.hashCode() : 0);
        return result;
    }
}
