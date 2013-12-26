package com.ghtn.model.oracle.fxyk;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
public class ShiftstablePK implements Serializable {
    private Timestamp dutydate;
    private String dutyperson;

    @Column(name = "DUTYDATE", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    @Id
    public Timestamp getDutydate() {
        return dutydate;
    }

    public void setDutydate(Timestamp dutydate) {
        this.dutydate = dutydate;
    }

    @Column(name = "DUTYPERSON", nullable = false, insertable = true, updatable = true, length = 15, precision = 0)
    @Id
    public String getDutyperson() {
        return dutyperson;
    }

    public void setDutyperson(String dutyperson) {
        this.dutyperson = dutyperson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShiftstablePK that = (ShiftstablePK) o;

        if (dutydate != null ? !dutydate.equals(that.dutydate) : that.dutydate != null) return false;
        if (dutyperson != null ? !dutyperson.equals(that.dutyperson) : that.dutyperson != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dutydate != null ? dutydate.hashCode() : 0;
        result = 31 * result + (dutyperson != null ? dutyperson.hashCode() : 0);
        return result;
    }
}
