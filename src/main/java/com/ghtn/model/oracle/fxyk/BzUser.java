package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
@Table(name = "BZ_USER", schema = "SEP3", catalog = "")
@IdClass(BzUserPK.class)
public class BzUser {
    private String bzcode;
    private String pnumber;

    @Id
    @Column(name = "BZCODE", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    public String getBzcode() {
        return bzcode;
    }

    public void setBzcode(String bzcode) {
        this.bzcode = bzcode;
    }

    @Id
    @Column(name = "PNUMBER", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
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

        BzUser bzUser = (BzUser) o;

        if (bzcode != null ? !bzcode.equals(bzUser.bzcode) : bzUser.bzcode != null) return false;
        if (pnumber != null ? !pnumber.equals(bzUser.pnumber) : bzUser.pnumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bzcode != null ? bzcode.hashCode() : 0;
        result = 31 * result + (pnumber != null ? pnumber.hashCode() : 0);
        return result;
    }
}
