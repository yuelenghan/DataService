package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
public class BzUserPK implements Serializable {
    private String bzcode;
    private String pnumber;

    @Column(name = "BZCODE", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    @Id
    public String getBzcode() {
        return bzcode;
    }

    public void setBzcode(String bzcode) {
        this.bzcode = bzcode;
    }

    @Column(name = "PNUMBER", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    @Id
    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BzUserPK bzUserPK = (BzUserPK) o;

        if (bzcode != null ? !bzcode.equals(bzUserPK.bzcode) : bzUserPK.bzcode != null) return false;
        if (pnumber != null ? !pnumber.equals(bzUserPK.pnumber) : bzUserPK.pnumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bzcode != null ? bzcode.hashCode() : 0;
        result = 31 * result + (pnumber != null ? pnumber.hashCode() : 0);
        return result;
    }
}
