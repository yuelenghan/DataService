package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
public class Moveplan {
    private BigDecimal id;
    private String personid;
    private BigDecimal placeid;
    private Timestamp starttime;
    private Timestamp endtime;
    private Timestamp movestarttime;
    private Timestamp moveendtime;
    private String movestate;
    private String maindept;
    private BigDecimal closetype;
    private String closeremarks;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PERSONID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    @Basic
    @Column(name = "PLACEID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getPlaceid() {
        return placeid;
    }

    public void setPlaceid(BigDecimal placeid) {
        this.placeid = placeid;
    }

    @Basic
    @Column(name = "STARTTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getStarttime() {
        return starttime;
    }

    public void setStarttime(Timestamp starttime) {
        this.starttime = starttime;
    }

    @Basic
    @Column(name = "ENDTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getEndtime() {
        return endtime;
    }

    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
    }

    @Basic
    @Column(name = "MOVESTARTTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getMovestarttime() {
        return movestarttime;
    }

    public void setMovestarttime(Timestamp movestarttime) {
        this.movestarttime = movestarttime;
    }

    @Basic
    @Column(name = "MOVEENDTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getMoveendtime() {
        return moveendtime;
    }

    public void setMoveendtime(Timestamp moveendtime) {
        this.moveendtime = moveendtime;
    }

    @Basic
    @Column(name = "MOVESTATE", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getMovestate() {
        return movestate;
    }

    public void setMovestate(String movestate) {
        this.movestate = movestate;
    }

    @Basic
    @Column(name = "MAINDEPT", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getMaindept() {
        return maindept;
    }

    public void setMaindept(String maindept) {
        this.maindept = maindept;
    }

    @Basic
    @Column(name = "CLOSETYPE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getClosetype() {
        return closetype;
    }

    public void setClosetype(BigDecimal closetype) {
        this.closetype = closetype;
    }

    @Basic
    @Column(name = "CLOSEREMARKS", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getCloseremarks() {
        return closeremarks;
    }

    public void setCloseremarks(String closeremarks) {
        this.closeremarks = closeremarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Moveplan moveplan = (Moveplan) o;

        if (closeremarks != null ? !closeremarks.equals(moveplan.closeremarks) : moveplan.closeremarks != null)
            return false;
        if (closetype != null ? !closetype.equals(moveplan.closetype) : moveplan.closetype != null) return false;
        if (endtime != null ? !endtime.equals(moveplan.endtime) : moveplan.endtime != null) return false;
        if (id != null ? !id.equals(moveplan.id) : moveplan.id != null) return false;
        if (maindept != null ? !maindept.equals(moveplan.maindept) : moveplan.maindept != null) return false;
        if (moveendtime != null ? !moveendtime.equals(moveplan.moveendtime) : moveplan.moveendtime != null)
            return false;
        if (movestarttime != null ? !movestarttime.equals(moveplan.movestarttime) : moveplan.movestarttime != null)
            return false;
        if (movestate != null ? !movestate.equals(moveplan.movestate) : moveplan.movestate != null) return false;
        if (personid != null ? !personid.equals(moveplan.personid) : moveplan.personid != null) return false;
        if (placeid != null ? !placeid.equals(moveplan.placeid) : moveplan.placeid != null) return false;
        if (starttime != null ? !starttime.equals(moveplan.starttime) : moveplan.starttime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        result = 31 * result + (placeid != null ? placeid.hashCode() : 0);
        result = 31 * result + (starttime != null ? starttime.hashCode() : 0);
        result = 31 * result + (endtime != null ? endtime.hashCode() : 0);
        result = 31 * result + (movestarttime != null ? movestarttime.hashCode() : 0);
        result = 31 * result + (moveendtime != null ? moveendtime.hashCode() : 0);
        result = 31 * result + (movestate != null ? movestate.hashCode() : 0);
        result = 31 * result + (maindept != null ? maindept.hashCode() : 0);
        result = 31 * result + (closetype != null ? closetype.hashCode() : 0);
        result = 31 * result + (closeremarks != null ? closeremarks.hashCode() : 0);
        return result;
    }
}
