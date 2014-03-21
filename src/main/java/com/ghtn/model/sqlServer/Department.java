package com.ghtn.model.sqlServer;

import javax.persistence.*;

/**
 * User: Administrator
 * Date: 14-3-17
 * Time: 下午4:59
 */
@Entity
@Table(name = "Department")
public class Department {
    private short deptId;

    @Id
    @Column(name = "Dept_id", nullable = false, insertable = true, updatable = true, length = 5, precision = 0)
    public short getDeptId() {
        return deptId;
    }

    public void setDeptId(short deptId) {
        this.deptId = deptId;
    }

    private String deptName;

    @Basic
    @Column(name = "Dept_name", nullable = false, insertable = true, updatable = true, length = 32, precision = 0)
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    private String deptFullname;

    @Basic
    @Column(name = "Dept_fullname", nullable = false, insertable = true, updatable = true, length = 64, precision = 0)
    public String getDeptFullname() {
        return deptFullname;
    }

    public void setDeptFullname(String deptFullname) {
        this.deptFullname = deptFullname;
    }

    private String address;

    @Basic
    @Column(name = "Address", nullable = false, insertable = true, updatable = true, length = 64, precision = 0)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String phone;

    @Basic
    @Column(name = "Phone", nullable = false, insertable = true, updatable = true, length = 32, precision = 0)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String deptInfo;

    @Basic
    @Column(name = "Dept_info", nullable = false, insertable = true, updatable = true, length = 64, precision = 0)
    public String getDeptInfo() {
        return deptInfo;
    }

    public void setDeptInfo(String deptInfo) {
        this.deptInfo = deptInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (deptId != that.deptId) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (deptFullname != null ? !deptFullname.equals(that.deptFullname) : that.deptFullname != null) return false;
        if (deptInfo != null ? !deptInfo.equals(that.deptInfo) : that.deptInfo != null) return false;
        if (deptName != null ? !deptName.equals(that.deptName) : that.deptName != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) deptId;
        result = 31 * result + (deptName != null ? deptName.hashCode() : 0);
        result = 31 * result + (deptFullname != null ? deptFullname.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (deptInfo != null ? deptInfo.hashCode() : 0);
        return result;
    }
}
