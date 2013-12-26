package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@Table(name = "SWEXAMINE_DETAIL", schema = "SEP3", catalog = "")
@IdClass(SwexamineDetailPK.class)
public class SwexamineDetail {
    private int lid;
    private int swid;
    private String remark;

    @Id
    @Column(name = "LID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    @Id
    @Column(name = "SWID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getSwid() {
        return swid;
    }

    public void setSwid(int swid) {
        this.swid = swid;
    }

    @Basic
    @Column(name = "REMARK", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SwexamineDetail that = (SwexamineDetail) o;

        if (lid != that.lid) return false;
        if (swid != that.swid) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lid;
        result = 31 * result + swid;
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
