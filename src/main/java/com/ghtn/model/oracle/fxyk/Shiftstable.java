package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@IdClass(ShiftstablePK.class)
public class Shiftstable {
    private Timestamp dutydate;
    private BigDecimal groupid;
    private String dutyperson;
    private String pname;
    private String tel;
    private String miandept;

    @Id
    @Column(name = "DUTYDATE", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getDutydate() {
        return dutydate;
    }

    public void setDutydate(Timestamp dutydate) {
        this.dutydate = dutydate;
    }

    @Basic
    @Column(name = "GROUPID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getGroupid() {
        return groupid;
    }

    public void setGroupid(BigDecimal groupid) {
        this.groupid = groupid;
    }

    @Id
    @Column(name = "DUTYPERSON", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    public String getDutyperson() {
        return dutyperson;
    }

    public void setDutyperson(String dutyperson) {
        this.dutyperson = dutyperson;
    }

    @Basic
    @Column(name = "PNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Basic
    @Column(name = "TEL", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "MIANDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMiandept() {
        return miandept;
    }

    public void setMiandept(String miandept) {
        this.miandept = miandept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shiftstable that = (Shiftstable) o;

        if (dutydate != null ? !dutydate.equals(that.dutydate) : that.dutydate != null) return false;
        if (dutyperson != null ? !dutyperson.equals(that.dutyperson) : that.dutyperson != null) return false;
        if (groupid != null ? !groupid.equals(that.groupid) : that.groupid != null) return false;
        if (miandept != null ? !miandept.equals(that.miandept) : that.miandept != null) return false;
        if (pname != null ? !pname.equals(that.pname) : that.pname != null) return false;
        if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dutydate != null ? dutydate.hashCode() : 0;
        result = 31 * result + (groupid != null ? groupid.hashCode() : 0);
        result = 31 * result + (dutyperson != null ? dutyperson.hashCode() : 0);
        result = 31 * result + (pname != null ? pname.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (miandept != null ? miandept.hashCode() : 0);
        return result;
    }
}
