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
public class Person2 {
    private int personid;
    private String personnumber;
    private String name;
    private String sex;
    private String tel;
    private Integer posid;
    private Integer deptid;
    private String lightnumber;
    private Integer postid;
    private String pinyin;

    @Id
    @Column(name = "PERSONID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }

    @Basic
    @Column(name = "PERSONNUMBER", nullable = true, insertable = true, updatable = true, length = 60, precision = 0)
    public String getPersonnumber() {
        return personnumber;
    }

    public void setPersonnumber(String personnumber) {
        this.personnumber = personnumber;
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
    @Column(name = "SEX", nullable = true, insertable = true, updatable = true, length = 2, precision = 0)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "TEL", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "POSID", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPosid() {
        return posid;
    }

    public void setPosid(Integer posid) {
        this.posid = posid;
    }

    @Basic
    @Column(name = "DEPTID", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    @Basic
    @Column(name = "LIGHTNUMBER", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getLightnumber() {
        return lightnumber;
    }

    public void setLightnumber(String lightnumber) {
        this.lightnumber = lightnumber;
    }

    @Basic
    @Column(name = "POSTID", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    @Basic
    @Column(name = "PINYIN", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person2 person2 = (Person2) o;

        if (personid != person2.personid) return false;
        if (deptid != null ? !deptid.equals(person2.deptid) : person2.deptid != null) return false;
        if (lightnumber != null ? !lightnumber.equals(person2.lightnumber) : person2.lightnumber != null) return false;
        if (name != null ? !name.equals(person2.name) : person2.name != null) return false;
        if (personnumber != null ? !personnumber.equals(person2.personnumber) : person2.personnumber != null)
            return false;
        if (pinyin != null ? !pinyin.equals(person2.pinyin) : person2.pinyin != null) return false;
        if (posid != null ? !posid.equals(person2.posid) : person2.posid != null) return false;
        if (postid != null ? !postid.equals(person2.postid) : person2.postid != null) return false;
        if (sex != null ? !sex.equals(person2.sex) : person2.sex != null) return false;
        if (tel != null ? !tel.equals(person2.tel) : person2.tel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personid;
        result = 31 * result + (personnumber != null ? personnumber.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (posid != null ? posid.hashCode() : 0);
        result = 31 * result + (deptid != null ? deptid.hashCode() : 0);
        result = 31 * result + (lightnumber != null ? lightnumber.hashCode() : 0);
        result = 31 * result + (postid != null ? postid.hashCode() : 0);
        result = 31 * result + (pinyin != null ? pinyin.hashCode() : 0);
        return result;
    }
}
