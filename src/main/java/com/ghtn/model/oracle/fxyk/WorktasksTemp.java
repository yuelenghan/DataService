package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
@Table(name = "WORKTASKS_TEMP", schema = "SEP3", catalog = "")
public class WorktasksTemp {
    private BigDecimal worktaskid;
    private String worktask;
    private Integer professionalid;
    private String status;
    private String deptnumber;
    private Timestamp dateinput;
    private String personid;

    @Id
    @Column(name = "WORKTASKID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getWorktaskid() {
        return worktaskid;
    }

    public void setWorktaskid(BigDecimal worktaskid) {
        this.worktaskid = worktaskid;
    }

    @Basic
    @Column(name = "WORKTASK", nullable = true, insertable = true, updatable = true, length = 600, precision = 0)
    public String getWorktask() {
        return worktask;
    }

    public void setWorktask(String worktask) {
        this.worktask = worktask;
    }

    @Basic
    @Column(name = "PROFESSIONALID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getProfessionalid() {
        return professionalid;
    }

    public void setProfessionalid(Integer professionalid) {
        this.professionalid = professionalid;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "DEPTNUMBER", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getDeptnumber() {
        return deptnumber;
    }

    public void setDeptnumber(String deptnumber) {
        this.deptnumber = deptnumber;
    }

    @Basic
    @Column(name = "DATEINPUT", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getDateinput() {
        return dateinput;
    }

    public void setDateinput(Timestamp dateinput) {
        this.dateinput = dateinput;
    }

    @Basic
    @Column(name = "PERSONID", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorktasksTemp that = (WorktasksTemp) o;

        if (dateinput != null ? !dateinput.equals(that.dateinput) : that.dateinput != null) return false;
        if (deptnumber != null ? !deptnumber.equals(that.deptnumber) : that.deptnumber != null) return false;
        if (personid != null ? !personid.equals(that.personid) : that.personid != null) return false;
        if (professionalid != null ? !professionalid.equals(that.professionalid) : that.professionalid != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (worktask != null ? !worktask.equals(that.worktask) : that.worktask != null) return false;
        if (worktaskid != null ? !worktaskid.equals(that.worktaskid) : that.worktaskid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = worktaskid != null ? worktaskid.hashCode() : 0;
        result = 31 * result + (worktask != null ? worktask.hashCode() : 0);
        result = 31 * result + (professionalid != null ? professionalid.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (deptnumber != null ? deptnumber.hashCode() : 0);
        result = 31 * result + (dateinput != null ? dateinput.hashCode() : 0);
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        return result;
    }
}
