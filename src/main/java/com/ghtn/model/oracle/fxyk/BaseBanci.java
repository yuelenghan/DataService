package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
@Table(name = "BASE_BANCI", schema = "SEP3", catalog = "")
public class BaseBanci {
    private BigDecimal id;
    private String name;
    private String starttime;
    private String endtime;
    private String about;
    private String maindept;
    private String btype;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "STARTTIME", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    @Basic
    @Column(name = "ENDTIME", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    @Basic
    @Column(name = "ABOUT", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Basic
    @Column(name = "MAINDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindept() {
        return maindept;
    }

    public void setMaindept(String maindept) {
        this.maindept = maindept;
    }

    @Basic
    @Column(name = "BTYPE", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseBanci baseBanci = (BaseBanci) o;

        if (about != null ? !about.equals(baseBanci.about) : baseBanci.about != null) return false;
        if (btype != null ? !btype.equals(baseBanci.btype) : baseBanci.btype != null) return false;
        if (endtime != null ? !endtime.equals(baseBanci.endtime) : baseBanci.endtime != null) return false;
        if (id != null ? !id.equals(baseBanci.id) : baseBanci.id != null) return false;
        if (maindept != null ? !maindept.equals(baseBanci.maindept) : baseBanci.maindept != null) return false;
        if (name != null ? !name.equals(baseBanci.name) : baseBanci.name != null) return false;
        if (starttime != null ? !starttime.equals(baseBanci.starttime) : baseBanci.starttime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (starttime != null ? starttime.hashCode() : 0);
        result = 31 * result + (endtime != null ? endtime.hashCode() : 0);
        result = 31 * result + (about != null ? about.hashCode() : 0);
        result = 31 * result + (maindept != null ? maindept.hashCode() : 0);
        result = 31 * result + (btype != null ? btype.hashCode() : 0);
        return result;
    }
}
