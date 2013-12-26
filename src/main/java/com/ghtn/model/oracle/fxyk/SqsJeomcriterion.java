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
@Table(name = "SQS_JEOMCRITERION", schema = "SEP3", catalog = "")
public class SqsJeomcriterion {
    private int jcid;
    private Integer pkindid;
    private String jccontent;
    private BigDecimal score;
    private String means;
    private Timestamp indate;
    private String status;
    private BigDecimal sort;

    @Id
    @Column(name = "JCID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getJcid() {
        return jcid;
    }

    public void setJcid(int jcid) {
        this.jcid = jcid;
    }

    @Basic
    @Column(name = "PKINDID", nullable = true, insertable = true, updatable = true, length = 8, precision = 0)
    public Integer getPkindid() {
        return pkindid;
    }

    public void setPkindid(Integer pkindid) {
        this.pkindid = pkindid;
    }

    @Basic
    @Column(name = "JCCONTENT", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getJccontent() {
        return jccontent;
    }

    public void setJccontent(String jccontent) {
        this.jccontent = jccontent;
    }

    @Basic
    @Column(name = "SCORE", nullable = true, insertable = true, updatable = true, length = 4, precision = 1)
    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    @Basic
    @Column(name = "MEANS", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getMeans() {
        return means;
    }

    public void setMeans(String means) {
        this.means = means;
    }

    @Basic
    @Column(name = "INDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getIndate() {
        return indate;
    }

    public void setIndate(Timestamp indate) {
        this.indate = indate;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "SORT", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getSort() {
        return sort;
    }

    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SqsJeomcriterion that = (SqsJeomcriterion) o;

        if (jcid != that.jcid) return false;
        if (indate != null ? !indate.equals(that.indate) : that.indate != null) return false;
        if (jccontent != null ? !jccontent.equals(that.jccontent) : that.jccontent != null) return false;
        if (means != null ? !means.equals(that.means) : that.means != null) return false;
        if (pkindid != null ? !pkindid.equals(that.pkindid) : that.pkindid != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jcid;
        result = 31 * result + (pkindid != null ? pkindid.hashCode() : 0);
        result = 31 * result + (jccontent != null ? jccontent.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (means != null ? means.hashCode() : 0);
        result = 31 * result + (indate != null ? indate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        return result;
    }
}
