package com.ghtn.vo;

/**
 * User: Administrator
 * Date: 14-3-5
 * Time: 下午4:33
 */
public class GpxxSummaryVO {

    private String maindeptname;
    private String zrpersonname;
    private String gpdate;
    private String gpbanci;
    private String httype;

    public String getHttypeDesc() {
        return httypeDesc;
    }

    public void setHttypeDesc(String httypeDesc) {
        this.httypeDesc = httypeDesc;
    }

    public String getHttype() {
        return httype;
    }

    public void setHttype(String httype) {
        this.httype = httype;
    }

    public String getGpbanci() {
        return gpbanci;
    }

    public void setGpbanci(String gpbanci) {
        this.gpbanci = gpbanci;
    }

    public String getGpdate() {
        return gpdate;
    }

    public void setGpdate(String gpdate) {
        this.gpdate = gpdate;
    }

    public String getZrpersonname() {
        return zrpersonname;
    }

    public void setZrpersonname(String zrpersonname) {
        this.zrpersonname = zrpersonname;
    }

    public String getMaindeptname() {
        return maindeptname;
    }

    public void setMaindeptname(String maindeptname) {
        this.maindeptname = maindeptname;
    }

    private String httypeDesc;

}
