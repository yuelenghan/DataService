package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@Table(name = "TM_PREWARNING", schema = "SEP3", catalog = "")
public class TmPrewarning {
    private BigDecimal id;
    private BigDecimal workid;
    private BigDecimal worktypeid;
    private BigDecimal warningday;
    private BigDecimal trainperiod;
    private BigDecimal nexttrainperiod;
    private BigDecimal validityyear;
    private BigDecimal workingage;
    private BigDecimal viaworkingage;
    private String maindeptid;
    private String name;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column(name = "WORKID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getWorkid() {
        return workid;
    }

    public void setWorkid(BigDecimal workid) {
        this.workid = workid;
    }

    @Basic
    @Column(name = "WORKTYPEID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getWorktypeid() {
        return worktypeid;
    }

    public void setWorktypeid(BigDecimal worktypeid) {
        this.worktypeid = worktypeid;
    }

    @Basic
    @Column(name = "WARNINGDAY", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getWarningday() {
        return warningday;
    }

    public void setWarningday(BigDecimal warningday) {
        this.warningday = warningday;
    }

    @Basic
    @Column(name = "TRAINPERIOD", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getTrainperiod() {
        return trainperiod;
    }

    public void setTrainperiod(BigDecimal trainperiod) {
        this.trainperiod = trainperiod;
    }

    @Basic
    @Column(name = "NEXTTRAINPERIOD", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getNexttrainperiod() {
        return nexttrainperiod;
    }

    public void setNexttrainperiod(BigDecimal nexttrainperiod) {
        this.nexttrainperiod = nexttrainperiod;
    }

    @Basic
    @Column(name = "VALIDITYYEAR", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getValidityyear() {
        return validityyear;
    }

    public void setValidityyear(BigDecimal validityyear) {
        this.validityyear = validityyear;
    }

    @Basic
    @Column(name = "WORKINGAGE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getWorkingage() {
        return workingage;
    }

    public void setWorkingage(BigDecimal workingage) {
        this.workingage = workingage;
    }

    @Basic
    @Column(name = "VIAWORKINGAGE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getViaworkingage() {
        return viaworkingage;
    }

    public void setViaworkingage(BigDecimal viaworkingage) {
        this.viaworkingage = viaworkingage;
    }

    @Basic
    @Column(name = "MAINDEPTID", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindeptid() {
        return maindeptid;
    }

    public void setMaindeptid(String maindeptid) {
        this.maindeptid = maindeptid;
    }

    @Basic
    @Column(name = "NAME", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmPrewarning that = (TmPrewarning) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (maindeptid != null ? !maindeptid.equals(that.maindeptid) : that.maindeptid != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (nexttrainperiod != null ? !nexttrainperiod.equals(that.nexttrainperiod) : that.nexttrainperiod != null)
            return false;
        if (trainperiod != null ? !trainperiod.equals(that.trainperiod) : that.trainperiod != null) return false;
        if (validityyear != null ? !validityyear.equals(that.validityyear) : that.validityyear != null) return false;
        if (viaworkingage != null ? !viaworkingage.equals(that.viaworkingage) : that.viaworkingage != null)
            return false;
        if (warningday != null ? !warningday.equals(that.warningday) : that.warningday != null) return false;
        if (workid != null ? !workid.equals(that.workid) : that.workid != null) return false;
        if (workingage != null ? !workingage.equals(that.workingage) : that.workingage != null) return false;
        if (worktypeid != null ? !worktypeid.equals(that.worktypeid) : that.worktypeid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (workid != null ? workid.hashCode() : 0);
        result = 31 * result + (worktypeid != null ? worktypeid.hashCode() : 0);
        result = 31 * result + (warningday != null ? warningday.hashCode() : 0);
        result = 31 * result + (trainperiod != null ? trainperiod.hashCode() : 0);
        result = 31 * result + (nexttrainperiod != null ? nexttrainperiod.hashCode() : 0);
        result = 31 * result + (validityyear != null ? validityyear.hashCode() : 0);
        result = 31 * result + (workingage != null ? workingage.hashCode() : 0);
        result = 31 * result + (viaworkingage != null ? viaworkingage.hashCode() : 0);
        result = 31 * result + (maindeptid != null ? maindeptid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
