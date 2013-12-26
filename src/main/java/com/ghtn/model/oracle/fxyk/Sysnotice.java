package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
public class Sysnotice {
    private int nid;
    private String ntitle;
    private String nmessage;
    private String nfilename;
    private String nfileaddress;
    private String eperid;
    private String edeptid;
    private Timestamp edate;
    private String pperid;
    private String pdeptid;
    private Timestamp pdate;
    private String nstatus;

    @Id
    @Column(name = "NID", nullable = false, insertable = true, updatable = true, length = 9, precision = 0)
    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    @Basic
    @Column(name = "NTITLE", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }

    @Basic
    @Column(name = "NMESSAGE", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getNmessage() {
        return nmessage;
    }

    public void setNmessage(String nmessage) {
        this.nmessage = nmessage;
    }

    @Basic
    @Column(name = "NFILENAME", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    public String getNfilename() {
        return nfilename;
    }

    public void setNfilename(String nfilename) {
        this.nfilename = nfilename;
    }

    @Basic
    @Column(name = "NFILEADDRESS", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getNfileaddress() {
        return nfileaddress;
    }

    public void setNfileaddress(String nfileaddress) {
        this.nfileaddress = nfileaddress;
    }

    @Basic
    @Column(name = "EPERID", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getEperid() {
        return eperid;
    }

    public void setEperid(String eperid) {
        this.eperid = eperid;
    }

    @Basic
    @Column(name = "EDEPTID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getEdeptid() {
        return edeptid;
    }

    public void setEdeptid(String edeptid) {
        this.edeptid = edeptid;
    }

    @Basic
    @Column(name = "EDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getEdate() {
        return edate;
    }

    public void setEdate(Timestamp edate) {
        this.edate = edate;
    }

    @Basic
    @Column(name = "PPERID", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getPperid() {
        return pperid;
    }

    public void setPperid(String pperid) {
        this.pperid = pperid;
    }

    @Basic
    @Column(name = "PDEPTID", nullable = true, insertable = true, updatable = true, length = 9, precision = 0)
    public String getPdeptid() {
        return pdeptid;
    }

    public void setPdeptid(String pdeptid) {
        this.pdeptid = pdeptid;
    }

    @Basic
    @Column(name = "PDATE", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getPdate() {
        return pdate;
    }

    public void setPdate(Timestamp pdate) {
        this.pdate = pdate;
    }

    @Basic
    @Column(name = "NSTATUS", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getNstatus() {
        return nstatus;
    }

    public void setNstatus(String nstatus) {
        this.nstatus = nstatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sysnotice sysnotice = (Sysnotice) o;

        if (nid != sysnotice.nid) return false;
        if (edate != null ? !edate.equals(sysnotice.edate) : sysnotice.edate != null) return false;
        if (edeptid != null ? !edeptid.equals(sysnotice.edeptid) : sysnotice.edeptid != null) return false;
        if (eperid != null ? !eperid.equals(sysnotice.eperid) : sysnotice.eperid != null) return false;
        if (nfileaddress != null ? !nfileaddress.equals(sysnotice.nfileaddress) : sysnotice.nfileaddress != null)
            return false;
        if (nfilename != null ? !nfilename.equals(sysnotice.nfilename) : sysnotice.nfilename != null) return false;
        if (nmessage != null ? !nmessage.equals(sysnotice.nmessage) : sysnotice.nmessage != null) return false;
        if (nstatus != null ? !nstatus.equals(sysnotice.nstatus) : sysnotice.nstatus != null) return false;
        if (ntitle != null ? !ntitle.equals(sysnotice.ntitle) : sysnotice.ntitle != null) return false;
        if (pdate != null ? !pdate.equals(sysnotice.pdate) : sysnotice.pdate != null) return false;
        if (pdeptid != null ? !pdeptid.equals(sysnotice.pdeptid) : sysnotice.pdeptid != null) return false;
        if (pperid != null ? !pperid.equals(sysnotice.pperid) : sysnotice.pperid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nid;
        result = 31 * result + (ntitle != null ? ntitle.hashCode() : 0);
        result = 31 * result + (nmessage != null ? nmessage.hashCode() : 0);
        result = 31 * result + (nfilename != null ? nfilename.hashCode() : 0);
        result = 31 * result + (nfileaddress != null ? nfileaddress.hashCode() : 0);
        result = 31 * result + (eperid != null ? eperid.hashCode() : 0);
        result = 31 * result + (edeptid != null ? edeptid.hashCode() : 0);
        result = 31 * result + (edate != null ? edate.hashCode() : 0);
        result = 31 * result + (pperid != null ? pperid.hashCode() : 0);
        result = 31 * result + (pdeptid != null ? pdeptid.hashCode() : 0);
        result = 31 * result + (pdate != null ? pdate.hashCode() : 0);
        result = 31 * result + (nstatus != null ? nstatus.hashCode() : 0);
        return result;
    }
}
