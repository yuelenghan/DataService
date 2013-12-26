package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:55
 */
@Entity
public class Audithazard {
    private int id;
    private Integer hazardsid;
    private Timestamp auditdate;
    private String auditpersonid;
    private String pass;
    private String opinion;
    private String dept;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "HAZARDSID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public Integer getHazardsid() {
        return hazardsid;
    }

    public void setHazardsid(Integer hazardsid) {
        this.hazardsid = hazardsid;
    }

    @Basic
    @Column(name = "AUDITDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Timestamp auditdate) {
        this.auditdate = auditdate;
    }

    @Basic
    @Column(name = "AUDITPERSONID", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getAuditpersonid() {
        return auditpersonid;
    }

    public void setAuditpersonid(String auditpersonid) {
        this.auditpersonid = auditpersonid;
    }

    @Basic
    @Column(name = "PASS", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Basic
    @Column(name = "OPINION", nullable = true, insertable = true, updatable = true, length = 100, precision = 0)
    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    @Basic
    @Column(name = "DEPT", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Audithazard that = (Audithazard) o;

        if (id != that.id) return false;
        if (auditdate != null ? !auditdate.equals(that.auditdate) : that.auditdate != null) return false;
        if (auditpersonid != null ? !auditpersonid.equals(that.auditpersonid) : that.auditpersonid != null)
            return false;
        if (dept != null ? !dept.equals(that.dept) : that.dept != null) return false;
        if (hazardsid != null ? !hazardsid.equals(that.hazardsid) : that.hazardsid != null) return false;
        if (opinion != null ? !opinion.equals(that.opinion) : that.opinion != null) return false;
        if (pass != null ? !pass.equals(that.pass) : that.pass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (hazardsid != null ? hazardsid.hashCode() : 0);
        result = 31 * result + (auditdate != null ? auditdate.hashCode() : 0);
        result = 31 * result + (auditpersonid != null ? auditpersonid.hashCode() : 0);
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        result = 31 * result + (opinion != null ? opinion.hashCode() : 0);
        result = 31 * result + (dept != null ? dept.hashCode() : 0);
        return result;
    }
}
