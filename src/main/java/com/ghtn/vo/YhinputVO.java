package com.ghtn.vo;

/**
 * User: Administrator
 * Date: 13-12-27
 * Time: 上午10:31
 */
public class YhinputVO {

    private int yhputinid; //隐患编号
    private String banci;   //排查班次
    private String pctime;  //排查时间
    private String remarks; //隐患描述
    private String status;  //状态
    private Integer jctype; //检查类型
    private String jctypeDesc;  //检查类型描述
    private String xqdate;  //整改期限日期
    private String xqbanci; //整改期限班次
    private String zrdeptname;  //责任单位
    private String placename;   //地点
    private String yhcontent;   //隐患依据
    private String zrpername;   //责任人
    private String typename;    //专业
    private String levelname;   //级别
    private String maindeptname;    //单位
    private String yqcs;    //逾期次数
    private String isfine;  //是否罚款

    public int getYhputinid() {
        return yhputinid;
    }

    public void setYhputinid(int yhputinid) {
        this.yhputinid = yhputinid;
    }

    public String getBanci() {
        return banci;
    }

    public void setBanci(String banci) {
        this.banci = banci;
    }

    public String getPctime() {
        return pctime;
    }

    public void setPctime(String pctime) {
        this.pctime = pctime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getJctype() {
        return jctype;
    }

    public void setJctype(Integer jctype) {
        this.jctype = jctype;
    }

    public String getJctypeDesc() {
        return jctypeDesc;
    }

    public void setJctypeDesc(String jctypeDesc) {
        this.jctypeDesc = jctypeDesc;
    }

    public String getXqdate() {
        return xqdate;
    }

    public void setXqdate(String xqdate) {
        this.xqdate = xqdate;
    }

    public String getXqbanci() {
        return xqbanci;
    }

    public void setXqbanci(String xqbanci) {
        this.xqbanci = xqbanci;
    }

    public String getZrdeptname() {
        return zrdeptname;
    }

    public void setZrdeptname(String zrdeptname) {
        this.zrdeptname = zrdeptname;
    }

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    public String getYhcontent() {
        return yhcontent;
    }

    public void setYhcontent(String yhcontent) {
        this.yhcontent = yhcontent;
    }

    public String getZrpername() {
        return zrpername;
    }

    public void setZrpername(String zrpername) {
        this.zrpername = zrpername;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getLevelname() {
        return levelname;
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname;
    }

    public String getMaindeptname() {
        return maindeptname;
    }

    public void setMaindeptname(String maindeptname) {
        this.maindeptname = maindeptname;
    }

    public String getYqcs() {
        return yqcs;
    }

    public void setYqcs(String yqcs) {
        this.yqcs = yqcs;
    }

    public String getIsfine() {
        return isfine;
    }

    public void setIsfine(String isfine) {
        this.isfine = isfine;
    }
}
