package com.ghtn.vo;

/**
 * User: Administrator
 * Date: 13-12-27
 * Time: 下午3:42
 */
public class SwinputVO {

    private int swinputid;  //三违id
    private String remarks; //描述
    private String pctime;  //排查时间
    private String banci;   //排查班次
    private Integer jctype; //检查类型
    private String jctypeDesc; //检查描述
    private String islearn; //是否进班
    private String status;  //状态
    private String swpname; //三违人员
    private String pcpname; //排查人员
    private String placename;   //地点
    private String swcontent;   //三违依据
    private String typename;    //类型
    private String levelname;   //级别(性质)
    private String maindeptname;    //单位
    private String zrkqname;    //责任科区
    private String zyname;  //专业
    private String isfine;  //是否罚款
    private String pcpnameNow;  //排查人姓名集合

    public int getSwinputid() {
        return swinputid;
    }

    public void setSwinputid(int swinputid) {
        this.swinputid = swinputid;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPctime() {
        return pctime;
    }

    public void setPctime(String pctime) {
        this.pctime = pctime;
    }

    public String getBanci() {
        return banci;
    }

    public void setBanci(String banci) {
        this.banci = banci;
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

    public String getIslearn() {
        return islearn;
    }

    public void setIslearn(String islearn) {
        this.islearn = islearn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSwpname() {
        return swpname;
    }

    public void setSwpname(String swpname) {
        this.swpname = swpname;
    }

    public String getPcpname() {
        return pcpname;
    }

    public void setPcpname(String pcpname) {
        this.pcpname = pcpname;
    }

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    public String getSwcontent() {
        return swcontent;
    }

    public void setSwcontent(String swcontent) {
        this.swcontent = swcontent;
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

    public String getZrkqname() {
        return zrkqname;
    }

    public void setZrkqname(String zrkqname) {
        this.zrkqname = zrkqname;
    }

    public String getZyname() {
        return zyname;
    }

    public void setZyname(String zyname) {
        this.zyname = zyname;
    }

    public String getIsfine() {
        return isfine;
    }

    public void setIsfine(String isfine) {
        this.isfine = isfine;
    }

    public String getPcpnameNow() {
        return pcpnameNow;
    }

    public void setPcpnameNow(String pcpnameNow) {
        this.pcpnameNow = pcpnameNow;
    }
}
