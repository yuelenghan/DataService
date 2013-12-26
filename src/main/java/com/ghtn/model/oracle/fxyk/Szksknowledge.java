package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
public class Szksknowledge {
    private int kid;
    private Integer zyid;
    private Integer postid;
    private String kcontent;
    private String remarks;
    private String maindept;
    private String status;

    @Id
    @Column(name = "KID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getKid() {
        return kid;
    }

    public void setKid(int kid) {
        this.kid = kid;
    }

    @Basic
    @Column(name = "ZYID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getZyid() {
        return zyid;
    }

    public void setZyid(Integer zyid) {
        this.zyid = zyid;
    }

    @Basic
    @Column(name = "POSTID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    @Basic
    @Column(name = "KCONTENT", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getKcontent() {
        return kcontent;
    }

    public void setKcontent(String kcontent) {
        this.kcontent = kcontent;
    }

    @Basic
    @Column(name = "REMARKS", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "MAINDEPT", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getMaindept() {
        return maindept;
    }

    public void setMaindept(String maindept) {
        this.maindept = maindept;
    }

    @Basic
    @Column(name = "STATUS", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Szksknowledge that = (Szksknowledge) o;

        if (kid != that.kid) return false;
        if (kcontent != null ? !kcontent.equals(that.kcontent) : that.kcontent != null) return false;
        if (maindept != null ? !maindept.equals(that.maindept) : that.maindept != null) return false;
        if (postid != null ? !postid.equals(that.postid) : that.postid != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (zyid != null ? !zyid.equals(that.zyid) : that.zyid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kid;
        result = 31 * result + (zyid != null ? zyid.hashCode() : 0);
        result = 31 * result + (postid != null ? postid.hashCode() : 0);
        result = 31 * result + (kcontent != null ? kcontent.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (maindept != null ? maindept.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
