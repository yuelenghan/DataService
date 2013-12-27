package com.ghtn.vo;

/**
 * User: Administrator
 * Date: 13-12-27
 * Time: 下午4:29
 */
public class KqRecordVO {
    private int rjid;   //序号
    private String kqpnumber;   //考勤人员id
    private String kqpname;   //考勤人员id
    private String downtime;    //入井时间
    private String uptime;  //升井时间
    private String kqtime; //归属日期
    private String kqbenci; //归属班次
    private Integer kqtype; //类型
    private String kqtypeDesc; //类型描述
    private Integer datafrom;   //数据来源
    private String datafromDesc;    //数据来源描述
    private String kqdept;  //归属单位
    private Integer worktime; //工作时间(分), 可能为空

    public int getRjid() {
        return rjid;
    }

    public void setRjid(int rjid) {
        this.rjid = rjid;
    }

    public String getKqpnumber() {
        return kqpnumber;
    }

    public void setKqpnumber(String kqpnumber) {
        this.kqpnumber = kqpnumber;
    }

    public String getKqpname() {
        return kqpname;
    }

    public void setKqpname(String kqpname) {
        this.kqpname = kqpname;
    }

    public String getDowntime() {
        return downtime;
    }

    public void setDowntime(String downtime) {
        this.downtime = downtime;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public String getKqtime() {
        return kqtime;
    }

    public void setKqtime(String kqtime) {
        this.kqtime = kqtime;
    }

    public String getKqbenci() {
        return kqbenci;
    }

    public void setKqbenci(String kqbenci) {
        this.kqbenci = kqbenci;
    }

    public Integer getKqtype() {
        return kqtype;
    }

    public void setKqtype(Integer kqtype) {
        this.kqtype = kqtype;
    }

    public String getKqtypeDesc() {
        return kqtypeDesc;
    }

    public void setKqtypeDesc(String kqtypeDesc) {
        this.kqtypeDesc = kqtypeDesc;
    }

    public Integer getDatafrom() {
        return datafrom;
    }

    public void setDatafrom(Integer datafrom) {
        this.datafrom = datafrom;
    }

    public String getDatafromDesc() {
        return datafromDesc;
    }

    public void setDatafromDesc(String datafromDesc) {
        this.datafromDesc = datafromDesc;
    }

    public String getKqdept() {
        return kqdept;
    }

    public void setKqdept(String kqdept) {
        this.kqdept = kqdept;
    }

    public Integer getWorktime() {
        return worktime;
    }

    public void setWorktime(Integer worktime) {
        this.worktime = worktime;
    }
}
