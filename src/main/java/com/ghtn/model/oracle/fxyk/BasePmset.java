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
@Table(name = "BASE_PMSET", schema = "SEP3", catalog = "")
@IdClass(BasePmsetPK.class)
public class BasePmset {
    private String personnumber;
    private String maindept;
    private BigInteger follow;
    private BigInteger input;
    private BigInteger belong;
    private String createuser;
    private Timestamp createtime;
    private Integer gzzy;

    @Id
    @Column(name = "PERSONNUMBER", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPersonnumber() {
        return personnumber;
    }

    public void setPersonnumber(String personnumber) {
        this.personnumber = personnumber;
    }

    @Id
    @Column(name = "MAINDEPT", nullable = false, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindept() {
        return maindept;
    }

    public void setMaindept(String maindept) {
        this.maindept = maindept;
    }

    @Basic
    @Column(name = "FOLLOW", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getFollow() {
        return follow;
    }

    public void setFollow(BigInteger follow) {
        this.follow = follow;
    }

    @Basic
    @Column(name = "INPUT", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getInput() {
        return input;
    }

    public void setInput(BigInteger input) {
        this.input = input;
    }

    @Basic
    @Column(name = "BELONG", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getBelong() {
        return belong;
    }

    public void setBelong(BigInteger belong) {
        this.belong = belong;
    }

    @Basic
    @Column(name = "CREATEUSER", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    @Basic
    @Column(name = "CREATETIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "GZZY", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getGzzy() {
        return gzzy;
    }

    public void setGzzy(Integer gzzy) {
        this.gzzy = gzzy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasePmset basePmset = (BasePmset) o;

        if (belong != null ? !belong.equals(basePmset.belong) : basePmset.belong != null) return false;
        if (createtime != null ? !createtime.equals(basePmset.createtime) : basePmset.createtime != null) return false;
        if (createuser != null ? !createuser.equals(basePmset.createuser) : basePmset.createuser != null) return false;
        if (follow != null ? !follow.equals(basePmset.follow) : basePmset.follow != null) return false;
        if (gzzy != null ? !gzzy.equals(basePmset.gzzy) : basePmset.gzzy != null) return false;
        if (input != null ? !input.equals(basePmset.input) : basePmset.input != null) return false;
        if (maindept != null ? !maindept.equals(basePmset.maindept) : basePmset.maindept != null) return false;
        if (personnumber != null ? !personnumber.equals(basePmset.personnumber) : basePmset.personnumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personnumber != null ? personnumber.hashCode() : 0;
        result = 31 * result + (maindept != null ? maindept.hashCode() : 0);
        result = 31 * result + (follow != null ? follow.hashCode() : 0);
        result = 31 * result + (input != null ? input.hashCode() : 0);
        result = 31 * result + (belong != null ? belong.hashCode() : 0);
        result = 31 * result + (createuser != null ? createuser.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (gzzy != null ? gzzy.hashCode() : 0);
        return result;
    }
}
