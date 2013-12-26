package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:56
 */
@Entity
public class Nswpersistence {
    private int swinputid;
    private String swpname;
    private String pcpname;
    private String placename;
    private String inputpername;

    @Id
    @Column(name = "SWINPUTID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    public int getSwinputid() {
        return swinputid;
    }

    public void setSwinputid(int swinputid) {
        this.swinputid = swinputid;
    }

    @Basic
    @Column(name = "SWPNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getSwpname() {
        return swpname;
    }

    public void setSwpname(String swpname) {
        this.swpname = swpname;
    }

    @Basic
    @Column(name = "PCPNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getPcpname() {
        return pcpname;
    }

    public void setPcpname(String pcpname) {
        this.pcpname = pcpname;
    }

    @Basic
    @Column(name = "PLACENAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    @Basic
    @Column(name = "INPUTPERNAME", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getInputpername() {
        return inputpername;
    }

    public void setInputpername(String inputpername) {
        this.inputpername = inputpername;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nswpersistence that = (Nswpersistence) o;

        if (swinputid != that.swinputid) return false;
        if (inputpername != null ? !inputpername.equals(that.inputpername) : that.inputpername != null) return false;
        if (pcpname != null ? !pcpname.equals(that.pcpname) : that.pcpname != null) return false;
        if (placename != null ? !placename.equals(that.placename) : that.placename != null) return false;
        if (swpname != null ? !swpname.equals(that.swpname) : that.swpname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = swinputid;
        result = 31 * result + (swpname != null ? swpname.hashCode() : 0);
        result = 31 * result + (pcpname != null ? pcpname.hashCode() : 0);
        result = 31 * result + (placename != null ? placename.hashCode() : 0);
        result = 31 * result + (inputpername != null ? inputpername.hashCode() : 0);
        return result;
    }
}
