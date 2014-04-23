package com.ghtn.vo;

/**
 * User: Administrator
 * Date: 2014/4/23
 * Time: 15:19
 */
public class YhEnterQueryVO {

    private String deptName;
    private String yhContent;
    private String remarks;
    private String jcTypeDesc;
    private String inTime;

    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getYhContent() {
        return yhContent;
    }

    public void setYhContent(String yhContent) {
        this.yhContent = yhContent;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getJcTypeDesc() {
        return jcTypeDesc;
    }

    public void setJcTypeDesc(String jcTypeDesc) {
        this.jcTypeDesc = jcTypeDesc;
    }
}
