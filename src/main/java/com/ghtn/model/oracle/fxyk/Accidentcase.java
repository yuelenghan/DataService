package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
public class Accidentcase {
    private Timestamp recordtime;

    @Id
    @javax.persistence.Column(name = "RECORDTIME", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Timestamp recordtime) {
        this.recordtime = recordtime;
    }

    private String recordperson;

    @Basic
    @javax.persistence.Column(name = "RECORDPERSON", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getRecordperson() {
        return recordperson;
    }

    public void setRecordperson(String recordperson) {
        this.recordperson = recordperson;
    }

    private String upperson;

    @Basic
    @javax.persistence.Column(name = "UPPERSON", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getUpperson() {
        return upperson;
    }

    public void setUpperson(String upperson) {
        this.upperson = upperson;
    }

    private String hdppt;

    @Basic
    @javax.persistence.Column(name = "HDPPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getHdppt() {
        return hdppt;
    }

    public void setHdppt(String hdppt) {
        this.hdppt = hdppt;
    }

    private String jjlx;

    @Basic
    @javax.persistence.Column(name = "JJLX", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getJjlx() {
        return jjlx;
    }

    public void setJjlx(String jjlx) {
        this.jjlx = jjlx;
    }

    private String iscard;

    @Basic
    @javax.persistence.Column(name = "ISCARD", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getIscard() {
        return iscard;
    }

    public void setIscard(String iscard) {
        this.iscard = iscard;
    }

    private Integer hplace;

    @Basic
    @javax.persistence.Column(name = "HPLACE", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public Integer getHplace() {
        return hplace;
    }

    public void setHplace(Integer hplace) {
        this.hplace = hplace;
    }

    private String htype;

    @Basic
    @javax.persistence.Column(name = "HTYPE", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getHtype() {
        return htype;
    }

    public void setHtype(String htype) {
        this.htype = htype;
    }

    private String hsb;

    @Basic
    @javax.persistence.Column(name = "HSB", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getHsb() {
        return hsb;
    }

    public void setHsb(String hsb) {
        this.hsb = hsb;
    }

    private String hxz;

    @Basic
    @javax.persistence.Column(name = "HXZ", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getHxz() {
        return hxz;
    }

    public void setHxz(String hxz) {
        this.hxz = hxz;
    }

    private String zgdept;

    @Basic
    @javax.persistence.Column(name = "ZGDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getZgdept() {
        return zgdept;
    }

    public void setZgdept(String zgdept) {
        this.zgdept = zgdept;
    }

    private Integer zsnum;

    @Basic
    @javax.persistence.Column(name = "ZSNUM", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getZsnum() {
        return zsnum;
    }

    public void setZsnum(Integer zsnum) {
        this.zsnum = zsnum;
    }

    private Integer swnum;

    @Basic
    @javax.persistence.Column(name = "SWNUM", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getSwnum() {
        return swnum;
    }

    public void setSwnum(Integer swnum) {
        this.swnum = swnum;
    }

    private Integer qsnum;

    @Basic
    @javax.persistence.Column(name = "QSNUM", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getQsnum() {
        return qsnum;
    }

    public void setQsnum(Integer qsnum) {
        this.qsnum = qsnum;
    }

    private Integer zjss;

    @Basic
    @javax.persistence.Column(name = "ZJSS", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getZjss() {
        return zjss;
    }

    public void setZjss(Integer zjss) {
        this.zjss = zjss;
    }

    private String remark;

    @Basic
    @javax.persistence.Column(name = "REMARK", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private String kjname;

    @Basic
    @javax.persistence.Column(name = "KJNAME", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getKjname() {
        return kjname;
    }

    public void setKjname(String kjname) {
        this.kjname = kjname;
    }

    private Timestamp hdate;

    @Basic
    @javax.persistence.Column(name = "HDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getHdate() {
        return hdate;
    }

    public void setHdate(Timestamp hdate) {
        this.hdate = hdate;
    }

    private String hbanci;

    @Basic
    @javax.persistence.Column(name = "HBANCI", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getHbanci() {
        return hbanci;
    }

    public void setHbanci(String hbanci) {
        this.hbanci = hbanci;
    }

    private String maindept;

    @Basic
    @javax.persistence.Column(name = "MAINDEPT", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getMaindept() {
        return maindept;
    }

    public void setMaindept(String maindept) {
        this.maindept = maindept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Accidentcase that = (Accidentcase) o;

        if (hbanci != null ? !hbanci.equals(that.hbanci) : that.hbanci != null) return false;
        if (hdate != null ? !hdate.equals(that.hdate) : that.hdate != null) return false;
        if (hdppt != null ? !hdppt.equals(that.hdppt) : that.hdppt != null) return false;
        if (hplace != null ? !hplace.equals(that.hplace) : that.hplace != null) return false;
        if (hsb != null ? !hsb.equals(that.hsb) : that.hsb != null) return false;
        if (htype != null ? !htype.equals(that.htype) : that.htype != null) return false;
        if (hxz != null ? !hxz.equals(that.hxz) : that.hxz != null) return false;
        if (iscard != null ? !iscard.equals(that.iscard) : that.iscard != null) return false;
        if (jjlx != null ? !jjlx.equals(that.jjlx) : that.jjlx != null) return false;
        if (kjname != null ? !kjname.equals(that.kjname) : that.kjname != null) return false;
        if (maindept != null ? !maindept.equals(that.maindept) : that.maindept != null) return false;
        if (qsnum != null ? !qsnum.equals(that.qsnum) : that.qsnum != null) return false;
        if (recordperson != null ? !recordperson.equals(that.recordperson) : that.recordperson != null) return false;
        if (recordtime != null ? !recordtime.equals(that.recordtime) : that.recordtime != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (swnum != null ? !swnum.equals(that.swnum) : that.swnum != null) return false;
        if (upperson != null ? !upperson.equals(that.upperson) : that.upperson != null) return false;
        if (zgdept != null ? !zgdept.equals(that.zgdept) : that.zgdept != null) return false;
        if (zjss != null ? !zjss.equals(that.zjss) : that.zjss != null) return false;
        if (zsnum != null ? !zsnum.equals(that.zsnum) : that.zsnum != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recordtime != null ? recordtime.hashCode() : 0;
        result = 31 * result + (recordperson != null ? recordperson.hashCode() : 0);
        result = 31 * result + (upperson != null ? upperson.hashCode() : 0);
        result = 31 * result + (hdppt != null ? hdppt.hashCode() : 0);
        result = 31 * result + (jjlx != null ? jjlx.hashCode() : 0);
        result = 31 * result + (iscard != null ? iscard.hashCode() : 0);
        result = 31 * result + (hplace != null ? hplace.hashCode() : 0);
        result = 31 * result + (htype != null ? htype.hashCode() : 0);
        result = 31 * result + (hsb != null ? hsb.hashCode() : 0);
        result = 31 * result + (hxz != null ? hxz.hashCode() : 0);
        result = 31 * result + (zgdept != null ? zgdept.hashCode() : 0);
        result = 31 * result + (zsnum != null ? zsnum.hashCode() : 0);
        result = 31 * result + (swnum != null ? swnum.hashCode() : 0);
        result = 31 * result + (qsnum != null ? qsnum.hashCode() : 0);
        result = 31 * result + (zjss != null ? zjss.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (kjname != null ? kjname.hashCode() : 0);
        result = 31 * result + (hdate != null ? hdate.hashCode() : 0);
        result = 31 * result + (hbanci != null ? hbanci.hashCode() : 0);
        result = 31 * result + (maindept != null ? maindept.hashCode() : 0);
        return result;
    }
}
