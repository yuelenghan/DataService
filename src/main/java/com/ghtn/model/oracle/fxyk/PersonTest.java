package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
@Table(name = "PERSON_TEST", schema = "SEP3", catalog = "")
public class PersonTest {
    private String gonghao;
    private String name;
    private String kequ;
    private String zhiwu;
    private String shouji;
    private String kuang;
    private BigDecimal zhiwuid;
    private String denghao;

    @Basic
    @Column(name = "GONGHAO", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getGonghao() {
        return gonghao;
    }

    public void setGonghao(String gonghao) {
        this.gonghao = gonghao;
    }

    @Basic
    @Column(name = "NAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "KEQU", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getKequ() {
        return kequ;
    }

    public void setKequ(String kequ) {
        this.kequ = kequ;
    }

    @Basic
    @Column(name = "ZHIWU", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getZhiwu() {
        return zhiwu;
    }

    public void setZhiwu(String zhiwu) {
        this.zhiwu = zhiwu;
    }

    @Basic
    @Column(name = "SHOUJI", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getShouji() {
        return shouji;
    }

    public void setShouji(String shouji) {
        this.shouji = shouji;
    }

    @Basic
    @Column(name = "KUANG", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getKuang() {
        return kuang;
    }

    public void setKuang(String kuang) {
        this.kuang = kuang;
    }

    @Basic
    @Column(name = "ZHIWUID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getZhiwuid() {
        return zhiwuid;
    }

    public void setZhiwuid(BigDecimal zhiwuid) {
        this.zhiwuid = zhiwuid;
    }

    @Basic
    @Column(name = "DENGHAO", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getDenghao() {
        return denghao;
    }

    public void setDenghao(String denghao) {
        this.denghao = denghao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonTest that = (PersonTest) o;

        if (denghao != null ? !denghao.equals(that.denghao) : that.denghao != null) return false;
        if (gonghao != null ? !gonghao.equals(that.gonghao) : that.gonghao != null) return false;
        if (kequ != null ? !kequ.equals(that.kequ) : that.kequ != null) return false;
        if (kuang != null ? !kuang.equals(that.kuang) : that.kuang != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (shouji != null ? !shouji.equals(that.shouji) : that.shouji != null) return false;
        if (zhiwu != null ? !zhiwu.equals(that.zhiwu) : that.zhiwu != null) return false;
        if (zhiwuid != null ? !zhiwuid.equals(that.zhiwuid) : that.zhiwuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gonghao != null ? gonghao.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (kequ != null ? kequ.hashCode() : 0);
        result = 31 * result + (zhiwu != null ? zhiwu.hashCode() : 0);
        result = 31 * result + (shouji != null ? shouji.hashCode() : 0);
        result = 31 * result + (kuang != null ? kuang.hashCode() : 0);
        result = 31 * result + (zhiwuid != null ? zhiwuid.hashCode() : 0);
        result = 31 * result + (denghao != null ? denghao.hashCode() : 0);
        return result;
    }
}
