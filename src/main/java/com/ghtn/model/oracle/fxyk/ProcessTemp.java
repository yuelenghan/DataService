package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
@Table(name = "PROCESS_TEMP", schema = "SEP3", catalog = "")
public class ProcessTemp {
    private int processid;
    private String name;
    private Integer worktaskid;
    private String status;
    private String deptnumber;
    private Timestamp dateinput;
    private Integer personid;

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
    @Column(name = "PERSONID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProcessTemp that = (ProcessTemp) o;

        if (processid != that.processid) return false;
        if (dateinput != null ? !dateinput.equals(that.dateinput) : that.dateinput != null) return false;
        if (deptnumber != null ? !deptnumber.equals(that.deptnumber) : that.deptnumber != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (personid != null ? !personid.equals(that.personid) : that.personid != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (worktaskid != null ? !worktaskid.equals(that.worktaskid) : that.worktaskid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = processid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (worktaskid != null ? worktaskid.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (deptnumber != null ? deptnumber.hashCode() : 0);
        result = 31 * result + (dateinput != null ? dateinput.hashCode() : 0);
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        return result;
    }
}
