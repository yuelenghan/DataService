package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
public class Worktasks {
    private BigDecimal worktaskid;
    private String worktask;
    private BigDecimal professionalid;
    private String taskNumber;

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
    @Column(name = "PROFESSIONALID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getProfessionalid() {
        return professionalid;
    }

    public void setProfessionalid(BigDecimal professionalid) {
        this.professionalid = professionalid;
    }

    @Basic
    @Column(name = "TASK_NUMBER", nullable = true, insertable = true, updatable = true, length = 8, precision = 0)
    public String getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(String taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worktasks worktasks = (Worktasks) o;

        if (professionalid != null ? !professionalid.equals(worktasks.professionalid) : worktasks.professionalid != null)
            return false;
        if (taskNumber != null ? !taskNumber.equals(worktasks.taskNumber) : worktasks.taskNumber != null) return false;
        if (worktask != null ? !worktask.equals(worktasks.worktask) : worktasks.worktask != null) return false;
        if (worktaskid != null ? !worktaskid.equals(worktasks.worktaskid) : worktasks.worktaskid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = worktaskid != null ? worktaskid.hashCode() : 0;
        result = 31 * result + (worktask != null ? worktask.hashCode() : 0);
        result = 31 * result + (professionalid != null ? professionalid.hashCode() : 0);
        result = 31 * result + (taskNumber != null ? taskNumber.hashCode() : 0);
        return result;
    }
}
