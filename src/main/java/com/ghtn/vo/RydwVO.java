package com.ghtn.vo;

/**
 * User: Administrator
 * Date: 14-3-19
 * Time: 上午10:17
 */
public class RydwVO {

    private int peopleId;   //工号（返回-1，则没录入该射频号）
    private String peopleName;  //姓名
    private String gender;  //性别
    private String birthday;    //出生日期
    private String enrollTime;  //入职日期
    private String address; //家庭地址
    private String phone;   //联系电话
    private String idNumber;    //身份证号码


    private String priority;    //职务级别
    private String rankName;    //职务名称

    private String deptName;    //部门简称
    private String deptFullName;    //部门全称
    private String deptAddress; //部门地址
    private String deptPhone;   //部门电话
    private String deptInfo;    //备注信息

    private String workType;    //工种类别
    private String workTypeName;    //工种名称

    private int senderId;   //射频号
    private int branchId;   //分站号
    private int receiverId;     //接收器号
    private int positionId;     //位置编号

    private String firstReportTime; //初次报告时间
    private String lastReportTime;  //末次报告时间
    private String inMineTime;  //入井时间

    private String inReportTime;    //下井时间
    private String outReportTime;   //上井时间

    private String positionDesc;    //位置描述

    public String getPositionDesc() {
        return positionDesc;
    }

    public void setPositionDesc(String positionDesc) {
        this.positionDesc = positionDesc;
    }

    public int getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(int peopleId) {
        this.peopleId = peopleId;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEnrollTime() {
        return enrollTime;
    }

    public void setEnrollTime(String enrollTime) {
        this.enrollTime = enrollTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptFullName() {
        return deptFullName;
    }

    public void setDeptFullName(String deptFullName) {
        this.deptFullName = deptFullName;
    }

    public String getDeptAddress() {
        return deptAddress;
    }

    public void setDeptAddress(String deptAddress) {
        this.deptAddress = deptAddress;
    }

    public String getDeptPhone() {
        return deptPhone;
    }

    public void setDeptPhone(String deptPhone) {
        this.deptPhone = deptPhone;
    }

    public String getDeptInfo() {
        return deptInfo;
    }

    public void setDeptInfo(String deptInfo) {
        this.deptInfo = deptInfo;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getWorkTypeName() {
        return workTypeName;
    }

    public void setWorkTypeName(String workTypeName) {
        this.workTypeName = workTypeName;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getFirstReportTime() {
        return firstReportTime;
    }

    public void setFirstReportTime(String firstReportTime) {
        this.firstReportTime = firstReportTime;
    }

    public String getLastReportTime() {
        return lastReportTime;
    }

    public void setLastReportTime(String lastReportTime) {
        this.lastReportTime = lastReportTime;
    }

    public String getInMineTime() {
        return inMineTime;
    }

    public void setInMineTime(String inMineTime) {
        this.inMineTime = inMineTime;
    }

    public String getInReportTime() {
        return inReportTime;
    }

    public void setInReportTime(String inReportTime) {
        this.inReportTime = inReportTime;
    }

    public String getOutReportTime() {
        return outReportTime;
    }

    public void setOutReportTime(String outReportTime) {
        this.outReportTime = outReportTime;
    }
}
