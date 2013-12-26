package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
@Table(name = "YHINPUT_MORE", schema = "SEP3", catalog = "")
public class YhinputMore {
    private int id;
    private String personid;
    private Integer yhputinid;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PERSONID", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    @Basic
    @Column(name = "YHPUTINID", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(Integer yhputinid) {
        this.yhputinid = yhputinid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YhinputMore that = (YhinputMore) o;

        if (id != that.id) return false;
        if (personid != null ? !personid.equals(that.personid) : that.personid != null) return false;
        if (yhputinid != null ? !yhputinid.equals(that.yhputinid) : that.yhputinid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        result = 31 * result + (yhputinid != null ? yhputinid.hashCode() : 0);
        return result;
    }
}
