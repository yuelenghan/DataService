package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@Table(name = "TM_WORK", schema = "SEP3", catalog = "")
public class TmWork {
    private BigDecimal id;
    private String name;
    private BigDecimal worktypeid;
    private BigDecimal isthree;
    private String maindeptid;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = false, insertable = true, updatable = true, length = 50, precision = 0)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "WORKTYPEID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getWorktypeid() {
        return worktypeid;
    }

    public void setWorktypeid(BigDecimal worktypeid) {
        this.worktypeid = worktypeid;
    }

    @Basic
    @Column(name = "ISTHREE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getIsthree() {
        return isthree;
    }

    public void setIsthree(BigDecimal isthree) {
        this.isthree = isthree;
    }

    @Basic
    @Column(name = "MAINDEPTID", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindeptid() {
        return maindeptid;
    }

    public void setMaindeptid(String maindeptid) {
        this.maindeptid = maindeptid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmWork tmWork = (TmWork) o;

        if (id != null ? !id.equals(tmWork.id) : tmWork.id != null) return false;
        if (isthree != null ? !isthree.equals(tmWork.isthree) : tmWork.isthree != null) return false;
        if (maindeptid != null ? !maindeptid.equals(tmWork.maindeptid) : tmWork.maindeptid != null) return false;
        if (name != null ? !name.equals(tmWork.name) : tmWork.name != null) return false;
        if (worktypeid != null ? !worktypeid.equals(tmWork.worktypeid) : tmWork.worktypeid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (worktypeid != null ? worktypeid.hashCode() : 0);
        result = 31 * result + (isthree != null ? isthree.hashCode() : 0);
        result = 31 * result + (maindeptid != null ? maindeptid.hashCode() : 0);
        return result;
    }
}
