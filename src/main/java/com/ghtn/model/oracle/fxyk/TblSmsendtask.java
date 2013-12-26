package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@javax.persistence.Table(name = "TBL_SMSENDTASK", schema = "SEP3", catalog = "")
public class TblSmsendtask {
    private BigDecimal smsid;

    @Id
    @javax.persistence.Column(name = "SMSID", nullable = false, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getSmsid() {
        return smsid;
    }

    public void setSmsid(BigDecimal smsid) {
        this.smsid = smsid;
    }

    private String creatorid;

    @Basic
    @javax.persistence.Column(name = "CREATORID", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid;
    }

    private String taskname;

    @Basic
    @javax.persistence.Column(name = "TASKNAME", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    private BigDecimal smsendednum;

    @Basic
    @javax.persistence.Column(name = "SMSENDEDNUM", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getSmsendednum() {
        return smsendednum;
    }

    public void setSmsendednum(BigDecimal smsendednum) {
        this.smsendednum = smsendednum;
    }

    private String operationtype;

    @Basic
    @javax.persistence.Column(name = "OPERATIONTYPE", nullable = true, insertable = true, updatable = true, length = 10, precision = 0)
    public String getOperationtype() {
        return operationtype;
    }

    public void setOperationtype(String operationtype) {
        this.operationtype = operationtype;
    }

    private BigDecimal suboperationtype;

    @Basic
    @javax.persistence.Column(name = "SUBOPERATIONTYPE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getSuboperationtype() {
        return suboperationtype;
    }

    public void setSuboperationtype(BigDecimal suboperationtype) {
        this.suboperationtype = suboperationtype;
    }

    private BigDecimal sendtype;

    @Basic
    @javax.persistence.Column(name = "SENDTYPE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getSendtype() {
        return sendtype;
    }

    public void setSendtype(BigDecimal sendtype) {
        this.sendtype = sendtype;
    }

    private String orgaddr;

    @Basic
    @javax.persistence.Column(name = "ORGADDR", nullable = true, insertable = true, updatable = true, length = 50, precision = 0)
    public String getOrgaddr() {
        return orgaddr;
    }

    public void setOrgaddr(String orgaddr) {
        this.orgaddr = orgaddr;
    }

    private String destaddr;

    @Basic
    @javax.persistence.Column(name = "DESTADDR", nullable = true, insertable = true, updatable = true, length = 15, precision = 0)
    public String getDestaddr() {
        return destaddr;
    }

    public void setDestaddr(String destaddr) {
        this.destaddr = destaddr;
    }

    private String smContent;

    @Basic
    @javax.persistence.Column(name = "SM_CONTENT", nullable = true, insertable = true, updatable = true, length = 500, precision = 0)
    public String getSmContent() {
        return smContent;
    }

    public void setSmContent(String smContent) {
        this.smContent = smContent;
    }

    private Timestamp sendtime;

    @Basic
    @javax.persistence.Column(name = "SENDTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getSendtime() {
        return sendtime;
    }

    public void setSendtime(Timestamp sendtime) {
        this.sendtime = sendtime;
    }

    private BigDecimal needstatereport;

    @Basic
    @javax.persistence.Column(name = "NEEDSTATEREPORT", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getNeedstatereport() {
        return needstatereport;
    }

    public void setNeedstatereport(BigDecimal needstatereport) {
        this.needstatereport = needstatereport;
    }

    private String serviceid;

    @Basic
    @javax.persistence.Column(name = "SERVICEID", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid;
    }

    private String feetype;

    @Basic
    @javax.persistence.Column(name = "FEETYPE", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public String getFeetype() {
        return feetype;
    }

    public void setFeetype(String feetype) {
        this.feetype = feetype;
    }

    private BigDecimal feecode;

    @Basic
    @javax.persistence.Column(name = "FEECODE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getFeecode() {
        return feecode;
    }

    public void setFeecode(BigDecimal feecode) {
        this.feecode = feecode;
    }

    private String msgid;

    @Basic
    @javax.persistence.Column(name = "MSGID", nullable = true, insertable = true, updatable = true, length = 20, precision = 0)
    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    private BigDecimal smtype;

    @Basic
    @javax.persistence.Column(name = "SMTYPE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getSmtype() {
        return smtype;
    }

    public void setSmtype(BigDecimal smtype) {
        this.smtype = smtype;
    }

    private BigDecimal messageid;

    @Basic
    @javax.persistence.Column(name = "MESSAGEID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getMessageid() {
        return messageid;
    }

    public void setMessageid(BigDecimal messageid) {
        this.messageid = messageid;
    }

    private BigDecimal destaddrtype;

    @Basic
    @javax.persistence.Column(name = "DESTADDRTYPE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getDestaddrtype() {
        return destaddrtype;
    }

    public void setDestaddrtype(BigDecimal destaddrtype) {
        this.destaddrtype = destaddrtype;
    }

    private Timestamp subtime;

    @Basic
    @javax.persistence.Column(name = "SUBTIME", nullable = true, insertable = true, updatable = true, length = 7, precision = 0)
    public Timestamp getSubtime() {
        return subtime;
    }

    public void setSubtime(Timestamp subtime) {
        this.subtime = subtime;
    }

    private BigDecimal taskstatus;

    @Basic
    @javax.persistence.Column(name = "TASKSTATUS", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getTaskstatus() {
        return taskstatus;
    }

    public void setTaskstatus(BigDecimal taskstatus) {
        this.taskstatus = taskstatus;
    }

    private BigDecimal sendlevel;

    @Basic
    @javax.persistence.Column(name = "SENDLEVEL", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getSendlevel() {
        return sendlevel;
    }

    public void setSendlevel(BigDecimal sendlevel) {
        this.sendlevel = sendlevel;
    }

    private BigDecimal sendstate;

    @Basic
    @javax.persistence.Column(name = "SENDSTATE", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getSendstate() {
        return sendstate;
    }

    public void setSendstate(BigDecimal sendstate) {
        this.sendstate = sendstate;
    }

    private BigDecimal trytimes;

    @Basic
    @javax.persistence.Column(name = "TRYTIMES", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getTrytimes() {
        return trytimes;
    }

    public void setTrytimes(BigDecimal trytimes) {
        this.trytimes = trytimes;
    }

    private BigDecimal count;

    @Basic
    @javax.persistence.Column(name = "COUNT", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    private BigDecimal successid;

    @Basic
    @javax.persistence.Column(name = "SUCCESSID", nullable = true, insertable = true, updatable = true, length = 0, precision = -127)
    public BigDecimal getSuccessid() {
        return successid;
    }

    public void setSuccessid(BigDecimal successid) {
        this.successid = successid;
    }

    private String reserve1;

    @Basic
    @javax.persistence.Column(name = "RESERVE1", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    private String reserve2;

    @Basic
    @javax.persistence.Column(name = "RESERVE2", nullable = true, insertable = true, updatable = true, length = 5, precision = 0)
    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblSmsendtask that = (TblSmsendtask) o;

        if (count != null ? !count.equals(that.count) : that.count != null) return false;
        if (creatorid != null ? !creatorid.equals(that.creatorid) : that.creatorid != null) return false;
        if (destaddr != null ? !destaddr.equals(that.destaddr) : that.destaddr != null) return false;
        if (destaddrtype != null ? !destaddrtype.equals(that.destaddrtype) : that.destaddrtype != null) return false;
        if (feecode != null ? !feecode.equals(that.feecode) : that.feecode != null) return false;
        if (feetype != null ? !feetype.equals(that.feetype) : that.feetype != null) return false;
        if (messageid != null ? !messageid.equals(that.messageid) : that.messageid != null) return false;
        if (msgid != null ? !msgid.equals(that.msgid) : that.msgid != null) return false;
        if (needstatereport != null ? !needstatereport.equals(that.needstatereport) : that.needstatereport != null)
            return false;
        if (operationtype != null ? !operationtype.equals(that.operationtype) : that.operationtype != null)
            return false;
        if (orgaddr != null ? !orgaddr.equals(that.orgaddr) : that.orgaddr != null) return false;
        if (reserve1 != null ? !reserve1.equals(that.reserve1) : that.reserve1 != null) return false;
        if (reserve2 != null ? !reserve2.equals(that.reserve2) : that.reserve2 != null) return false;
        if (sendlevel != null ? !sendlevel.equals(that.sendlevel) : that.sendlevel != null) return false;
        if (sendstate != null ? !sendstate.equals(that.sendstate) : that.sendstate != null) return false;
        if (sendtime != null ? !sendtime.equals(that.sendtime) : that.sendtime != null) return false;
        if (sendtype != null ? !sendtype.equals(that.sendtype) : that.sendtype != null) return false;
        if (serviceid != null ? !serviceid.equals(that.serviceid) : that.serviceid != null) return false;
        if (smContent != null ? !smContent.equals(that.smContent) : that.smContent != null) return false;
        if (smsendednum != null ? !smsendednum.equals(that.smsendednum) : that.smsendednum != null) return false;
        if (smsid != null ? !smsid.equals(that.smsid) : that.smsid != null) return false;
        if (smtype != null ? !smtype.equals(that.smtype) : that.smtype != null) return false;
        if (suboperationtype != null ? !suboperationtype.equals(that.suboperationtype) : that.suboperationtype != null)
            return false;
        if (subtime != null ? !subtime.equals(that.subtime) : that.subtime != null) return false;
        if (successid != null ? !successid.equals(that.successid) : that.successid != null) return false;
        if (taskname != null ? !taskname.equals(that.taskname) : that.taskname != null) return false;
        if (taskstatus != null ? !taskstatus.equals(that.taskstatus) : that.taskstatus != null) return false;
        if (trytimes != null ? !trytimes.equals(that.trytimes) : that.trytimes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = smsid != null ? smsid.hashCode() : 0;
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (taskname != null ? taskname.hashCode() : 0);
        result = 31 * result + (smsendednum != null ? smsendednum.hashCode() : 0);
        result = 31 * result + (operationtype != null ? operationtype.hashCode() : 0);
        result = 31 * result + (suboperationtype != null ? suboperationtype.hashCode() : 0);
        result = 31 * result + (sendtype != null ? sendtype.hashCode() : 0);
        result = 31 * result + (orgaddr != null ? orgaddr.hashCode() : 0);
        result = 31 * result + (destaddr != null ? destaddr.hashCode() : 0);
        result = 31 * result + (smContent != null ? smContent.hashCode() : 0);
        result = 31 * result + (sendtime != null ? sendtime.hashCode() : 0);
        result = 31 * result + (needstatereport != null ? needstatereport.hashCode() : 0);
        result = 31 * result + (serviceid != null ? serviceid.hashCode() : 0);
        result = 31 * result + (feetype != null ? feetype.hashCode() : 0);
        result = 31 * result + (feecode != null ? feecode.hashCode() : 0);
        result = 31 * result + (msgid != null ? msgid.hashCode() : 0);
        result = 31 * result + (smtype != null ? smtype.hashCode() : 0);
        result = 31 * result + (messageid != null ? messageid.hashCode() : 0);
        result = 31 * result + (destaddrtype != null ? destaddrtype.hashCode() : 0);
        result = 31 * result + (subtime != null ? subtime.hashCode() : 0);
        result = 31 * result + (taskstatus != null ? taskstatus.hashCode() : 0);
        result = 31 * result + (sendlevel != null ? sendlevel.hashCode() : 0);
        result = 31 * result + (sendstate != null ? sendstate.hashCode() : 0);
        result = 31 * result + (trytimes != null ? trytimes.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (successid != null ? successid.hashCode() : 0);
        result = 31 * result + (reserve1 != null ? reserve1.hashCode() : 0);
        result = 31 * result + (reserve2 != null ? reserve2.hashCode() : 0);
        return result;
    }
}
