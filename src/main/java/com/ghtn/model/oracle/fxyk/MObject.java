package com.ghtn.model.oracle.fxyk;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
@Table(name = "M_OBJECT", schema = "SEP3", catalog = "")
public class MObject {
    private BigDecimal mObjectid;
    private String name;
    private BigDecimal riskTypesid;
    private Integer professionalid;
    private String moFPinyin;

    @Id
    @Column(name = "M_OBJECTID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getmObjectid() {
        return mObjectid;
    }

    public void setmObjectid(BigDecimal mObjectid) {
        this.mObjectid = mObjectid;
    }

    @Basic
    @Column(name = "NAME", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "RISK_TYPESID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getRiskTypesid() {
        return riskTypesid;
    }

    public void setRiskTypesid(BigDecimal riskTypesid) {
        this.riskTypesid = riskTypesid;
    }

    @Basic
    @Column(name = "PROFESSIONALID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getProfessionalid() {
        return professionalid;
    }

    public void setProfessionalid(Integer professionalid) {
        this.professionalid = professionalid;
    }

    @Basic
    @Column(name = "MO_F_PINYIN", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getMoFPinyin() {
        return moFPinyin;
    }

    public void setMoFPinyin(String moFPinyin) {
        this.moFPinyin = moFPinyin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MObject mObject = (MObject) o;

        if (mObjectid != null ? !mObjectid.equals(mObject.mObjectid) : mObject.mObjectid != null) return false;
        if (moFPinyin != null ? !moFPinyin.equals(mObject.moFPinyin) : mObject.moFPinyin != null) return false;
        if (name != null ? !name.equals(mObject.name) : mObject.name != null) return false;
        if (professionalid != null ? !professionalid.equals(mObject.professionalid) : mObject.professionalid != null)
            return false;
        if (riskTypesid != null ? !riskTypesid.equals(mObject.riskTypesid) : mObject.riskTypesid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mObjectid != null ? mObjectid.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (riskTypesid != null ? riskTypesid.hashCode() : 0);
        result = 31 * result + (professionalid != null ? professionalid.hashCode() : 0);
        result = 31 * result + (moFPinyin != null ? moFPinyin.hashCode() : 0);
        return result;
    }
}
