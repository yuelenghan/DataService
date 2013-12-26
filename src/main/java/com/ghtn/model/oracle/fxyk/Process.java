package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
public class Process {
    private int processid;
    private String name;
    private Integer worktaskid;
    private Integer professionalid;
    private Integer danweiid;
    private String isomux;
    private Integer serialnumber;

    @Id
    @Column(name = "PROCESSID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getProcessid() {
        return processid;
    }

    public void setProcessid(int processid) {
        this.processid = processid;
    }

    @Basic
    @Column(name = "NAME", nullable = true, insertable = true, updatable = true, length = 600, precision = 0)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "WORKTASKID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getWorktaskid() {
        return worktaskid;
    }

    public void setWorktaskid(Integer worktaskid) {
        this.worktaskid = worktaskid;
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
    @Column(name = "DANWEIID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getDanweiid() {
        return danweiid;
    }

    public void setDanweiid(Integer danweiid) {
        this.danweiid = danweiid;
    }

    @Basic
    @Column(name = "ISOMUX", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getIsomux() {
        return isomux;
    }

    public void setIsomux(String isomux) {
        this.isomux = isomux;
    }

    @Basic
    @Column(name = "SERIALNUMBER", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(Integer serialnumber) {
        this.serialnumber = serialnumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Process process = (Process) o;

        if (processid != process.processid) return false;
        if (danweiid != null ? !danweiid.equals(process.danweiid) : process.danweiid != null) return false;
        if (isomux != null ? !isomux.equals(process.isomux) : process.isomux != null) return false;
        if (name != null ? !name.equals(process.name) : process.name != null) return false;
        if (professionalid != null ? !professionalid.equals(process.professionalid) : process.professionalid != null)
            return false;
        if (serialnumber != null ? !serialnumber.equals(process.serialnumber) : process.serialnumber != null)
            return false;
        if (worktaskid != null ? !worktaskid.equals(process.worktaskid) : process.worktaskid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = processid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (worktaskid != null ? worktaskid.hashCode() : 0);
        result = 31 * result + (professionalid != null ? professionalid.hashCode() : 0);
        result = 31 * result + (danweiid != null ? danweiid.hashCode() : 0);
        result = 31 * result + (isomux != null ? isomux.hashCode() : 0);
        result = 31 * result + (serialnumber != null ? serialnumber.hashCode() : 0);
        return result;
    }
}
