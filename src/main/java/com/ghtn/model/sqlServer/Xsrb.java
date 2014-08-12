package com.ghtn.model.sqlServer;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by lihe on 14/8/11.
 */
@Entity
@Table(name = "xsrb")
public class Xsrb {

    private int id;
    private String yd_name;
    private String yd_content;
    private String yd_loginname;
    private Date yd_dt1;
    private Date yd_dt;
    private String yd_dw;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYd_name() {
        return yd_name;
    }

    public void setYd_name(String yd_name) {
        this.yd_name = yd_name;
    }

    public String getYd_content() {
        return yd_content;
    }

    public void setYd_content(String yd_content) {
        this.yd_content = yd_content;
    }

    public String getYd_loginname() {
        return yd_loginname;
    }

    public void setYd_loginname(String yd_loginname) {
        this.yd_loginname = yd_loginname;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getYd_dt1() {
        return yd_dt1;
    }

    public void setYd_dt1(Date yd_dt1) {
        this.yd_dt1 = yd_dt1;
    }

    @Temporal(TemporalType.TIMESTAMP)
    public Date getYd_dt() {
        return yd_dt;
    }

    public void setYd_dt(Date yd_dt) {
        this.yd_dt = yd_dt;
    }

    public String getYd_dw() {
        return yd_dw;
    }

    public void setYd_dw(String yd_dw) {
        this.yd_dw = yd_dw;
    }
}
