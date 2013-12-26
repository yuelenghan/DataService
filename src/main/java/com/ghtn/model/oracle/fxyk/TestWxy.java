package com.ghtn.model.oracle.fxyk;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User: Administrator
 * Date: 13-12-26
 * Time: 上午10:57
 */
@Entity
@Table(name = "TEST_WXY", schema = "SEP3", catalog = "")
public class TestWxy {
    private String id;
    private String identificationunit;
    private String worktask;
    private String workingsequence;
    private String showsequence;
    private String dangersource;
    private String risktype;
    private String riskresult;
    private String accidenttype;
    private String frequency;
    private String loss;
    private String fxdj;

    @Basic
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "IDENTIFICATIONUNIT", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getIdentificationunit() {
        return identificationunit;
    }

    public void setIdentificationunit(String identificationunit) {
        this.identificationunit = identificationunit;
    }

    @Basic
    @Column(name = "WORKTASK", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getWorktask() {
        return worktask;
    }

    public void setWorktask(String worktask) {
        this.worktask = worktask;
    }

    @Basic
    @Column(name = "WORKINGSEQUENCE", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getWorkingsequence() {
        return workingsequence;
    }

    public void setWorkingsequence(String workingsequence) {
        this.workingsequence = workingsequence;
    }

    @Basic
    @Column(name = "SHOWSEQUENCE", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getShowsequence() {
        return showsequence;
    }

    public void setShowsequence(String showsequence) {
        this.showsequence = showsequence;
    }

    @Basic
    @Column(name = "DANGERSOURCE", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getDangersource() {
        return dangersource;
    }

    public void setDangersource(String dangersource) {
        this.dangersource = dangersource;
    }

    @Basic
    @Column(name = "RISKTYPE", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getRisktype() {
        return risktype;
    }

    public void setRisktype(String risktype) {
        this.risktype = risktype;
    }

    @Basic
    @Column(name = "RISKRESULT", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getRiskresult() {
        return riskresult;
    }

    public void setRiskresult(String riskresult) {
        this.riskresult = riskresult;
    }

    @Basic
    @Column(name = "ACCIDENTTYPE", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getAccidenttype() {
        return accidenttype;
    }

    public void setAccidenttype(String accidenttype) {
        this.accidenttype = accidenttype;
    }

    @Basic
    @Column(name = "FREQUENCY", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @Basic
    @Column(name = "LOSS", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getLoss() {
        return loss;
    }

    public void setLoss(String loss) {
        this.loss = loss;
    }

    @Basic
    @Column(name = "FXDJ", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    public String getFxdj() {
        return fxdj;
    }

    public void setFxdj(String fxdj) {
        this.fxdj = fxdj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestWxy testWxy = (TestWxy) o;

        if (accidenttype != null ? !accidenttype.equals(testWxy.accidenttype) : testWxy.accidenttype != null)
            return false;
        if (dangersource != null ? !dangersource.equals(testWxy.dangersource) : testWxy.dangersource != null)
            return false;
        if (frequency != null ? !frequency.equals(testWxy.frequency) : testWxy.frequency != null) return false;
        if (fxdj != null ? !fxdj.equals(testWxy.fxdj) : testWxy.fxdj != null) return false;
        if (id != null ? !id.equals(testWxy.id) : testWxy.id != null) return false;
        if (identificationunit != null ? !identificationunit.equals(testWxy.identificationunit) : testWxy.identificationunit != null)
            return false;
        if (loss != null ? !loss.equals(testWxy.loss) : testWxy.loss != null) return false;
        if (riskresult != null ? !riskresult.equals(testWxy.riskresult) : testWxy.riskresult != null) return false;
        if (risktype != null ? !risktype.equals(testWxy.risktype) : testWxy.risktype != null) return false;
        if (showsequence != null ? !showsequence.equals(testWxy.showsequence) : testWxy.showsequence != null)
            return false;
        if (workingsequence != null ? !workingsequence.equals(testWxy.workingsequence) : testWxy.workingsequence != null)
            return false;
        if (worktask != null ? !worktask.equals(testWxy.worktask) : testWxy.worktask != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (identificationunit != null ? identificationunit.hashCode() : 0);
        result = 31 * result + (worktask != null ? worktask.hashCode() : 0);
        result = 31 * result + (workingsequence != null ? workingsequence.hashCode() : 0);
        result = 31 * result + (showsequence != null ? showsequence.hashCode() : 0);
        result = 31 * result + (dangersource != null ? dangersource.hashCode() : 0);
        result = 31 * result + (risktype != null ? risktype.hashCode() : 0);
        result = 31 * result + (riskresult != null ? riskresult.hashCode() : 0);
        result = 31 * result + (accidenttype != null ? accidenttype.hashCode() : 0);
        result = 31 * result + (frequency != null ? frequency.hashCode() : 0);
        result = 31 * result + (loss != null ? loss.hashCode() : 0);
        result = 31 * result + (fxdj != null ? fxdj.hashCode() : 0);
        return result;
    }
}
