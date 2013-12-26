package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
@Table(name = "TT_MONTH", schema = "SEP3", catalog = "")
public class TtMonth {
    private String 三违;
    private String 隐患;
    private String m;
    private Integer 总数;

    @Basic
    @Column(name = "三违", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public String get三违() {
        return 三违;
    }

    public void set三违(String 三违) {
        this.三违 = 三违;
    }

    @Basic
    @Column(name = "隐患", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public String get隐患() {
        return 隐患;
    }

    public void set隐患(String 隐患) {
        this.隐患 = 隐患;
    }

    @Basic
    @Column(name = "M", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    @Basic
    @Column(name = "总数", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer get总数() {
        return 总数;
    }

    public void set总数(Integer 总数) {
        this.总数 = 总数;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TtMonth ttMonth = (TtMonth) o;

        if (m != null ? !m.equals(ttMonth.m) : ttMonth.m != null) return false;
        if (三违 != null ? !三违.equals(ttMonth.三违) : ttMonth.三违 != null) return false;
        if (总数 != null ? !总数.equals(ttMonth.总数) : ttMonth.总数 != null) return false;
        if (隐患 != null ? !隐患.equals(ttMonth.隐患) : ttMonth.隐患 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = 三违 != null ? 三违.hashCode() : 0;
        result = 31 * result + (隐患 != null ? 隐患.hashCode() : 0);
        result = 31 * result + (m != null ? m.hashCode() : 0);
        result = 31 * result + (总数 != null ? 总数.hashCode() : 0);
        return result;
    }
}
