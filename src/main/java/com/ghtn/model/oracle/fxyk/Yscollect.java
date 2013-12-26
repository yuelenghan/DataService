package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:58
 */
@Entity
public class Yscollect {
    private int cid;
    private String yhcontent;
    private String personnumber;
    private Timestamp intime;
    private String remark;
    private String maindept;
    private String ysbz;
    private String status;

    @Id
    @Column(name = "CID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "YHCONTENT", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getYhcontent() {
        return yhcontent;
    }

    public void setYhcontent(String yhcontent) {
        this.yhcontent = yhcontent;
    }

    @Basic
    @Column(name = "PERSONNUMBER", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getPersonnumber() {
        return personnumber;
    }

    public void setPersonnumber(String personnumber) {
        this.personnumber = personnumber;
    }

    @Basic
    @Column(name = "INTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getIntime() {
        return intime;
    }

    public void setIntime(Timestamp intime) {
        this.intime = intime;
    }

    @Basic
    @Column(name = "REMARK", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
    @Column(name = "YSBZ", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getYsbz() {
        return ysbz;
    }

    public void setYsbz(String ysbz) {
        this.ysbz = ysbz;
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

        Yscollect yscollect = (Yscollect) o;

        if (cid != yscollect.cid) return false;
        if (intime != null ? !intime.equals(yscollect.intime) : yscollect.intime != null) return false;
        if (maindept != null ? !maindept.equals(yscollect.maindept) : yscollect.maindept != null) return false;
        if (personnumber != null ? !personnumber.equals(yscollect.personnumber) : yscollect.personnumber != null)
            return false;
        if (remark != null ? !remark.equals(yscollect.remark) : yscollect.remark != null) return false;
        if (status != null ? !status.equals(yscollect.status) : yscollect.status != null) return false;
        if (yhcontent != null ? !yhcontent.equals(yscollect.yhcontent) : yscollect.yhcontent != null) return false;
        if (ysbz != null ? !ysbz.equals(yscollect.ysbz) : yscollect.ysbz != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cid;
        result = 31 * result + (yhcontent != null ? yhcontent.hashCode() : 0);
        result = 31 * result + (personnumber != null ? personnumber.hashCode() : 0);
        result = 31 * result + (intime != null ? intime.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (maindept != null ? maindept.hashCode() : 0);
        result = 31 * result + (ysbz != null ? ysbz.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
