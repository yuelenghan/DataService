package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
@Table(name = "BASE_PERSONLEVEL", schema = "SEP3", catalog = "")
public class BasePersonlevel {
    private Timestamp levelid;
    private String levelname;
    private Integer levelsort;
    private String createuser;
    private BigInteger edittype;
    private String createdept;
    private String about;
    private BigInteger status;

    @Id
    @Column(name = "LEVELID", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getLevelid() {
        return levelid;
    }

    public void setLevelid(Timestamp levelid) {
        this.levelid = levelid;
    }

    @Basic
    @Column(name = "LEVELNAME", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getLevelname() {
        return levelname;
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname;
    }

    @Basic
    @Column(name = "LEVELSORT", nullable = true, insertable = true, updatable = true, length = 4, precision = 0)
    public Integer getLevelsort() {
        return levelsort;
    }

    public void setLevelsort(Integer levelsort) {
        this.levelsort = levelsort;
    }

    @Basic
    @Column(name = "CREATEUSER", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    @Basic
    @Column(name = "EDITTYPE", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getEdittype() {
        return edittype;
    }

    public void setEdittype(BigInteger edittype) {
        this.edittype = edittype;
    }

    @Basic
    @Column(name = "CREATEDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getCreatedept() {
        return createdept;
    }

    public void setCreatedept(String createdept) {
        this.createdept = createdept;
    }

    @Basic
    @Column(name = "ABOUT", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 1, precision = 0)
    public BigInteger getStatus() {
        return status;
    }

    public void setStatus(BigInteger status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasePersonlevel that = (BasePersonlevel) o;

        if (about != null ? !about.equals(that.about) : that.about != null) return false;
        if (createdept != null ? !createdept.equals(that.createdept) : that.createdept != null) return false;
        if (createuser != null ? !createuser.equals(that.createuser) : that.createuser != null) return false;
        if (edittype != null ? !edittype.equals(that.edittype) : that.edittype != null) return false;
        if (levelid != null ? !levelid.equals(that.levelid) : that.levelid != null) return false;
        if (levelname != null ? !levelname.equals(that.levelname) : that.levelname != null) return false;
        if (levelsort != null ? !levelsort.equals(that.levelsort) : that.levelsort != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = levelid != null ? levelid.hashCode() : 0;
        result = 31 * result + (levelname != null ? levelname.hashCode() : 0);
        result = 31 * result + (levelsort != null ? levelsort.hashCode() : 0);
        result = 31 * result + (createuser != null ? createuser.hashCode() : 0);
        result = 31 * result + (edittype != null ? edittype.hashCode() : 0);
        result = 31 * result + (createdept != null ? createdept.hashCode() : 0);
        result = 31 * result + (about != null ? about.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
