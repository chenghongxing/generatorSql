package com.portal.login.domain;

public class LoanType {
    private Long seqNo;

    private String instuCde;

    private String typCde;

    private String typDesc;

    private String typGrp;

    private String sence;

    private String sts;

    private String lastChgUsr;

    private String lastChgDate;

    public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }

    public String getInstuCde() {
        return instuCde;
    }

    public void setInstuCde(String instuCde) {
        this.instuCde = instuCde == null ? null : instuCde.trim();
    }

    public String getTypCde() {
        return typCde;
    }

    public void setTypCde(String typCde) {
        this.typCde = typCde == null ? null : typCde.trim();
    }

    public String getTypDesc() {
        return typDesc;
    }

    public void setTypDesc(String typDesc) {
        this.typDesc = typDesc == null ? null : typDesc.trim();
    }

    public String getTypGrp() {
        return typGrp;
    }

    public void setTypGrp(String typGrp) {
        this.typGrp = typGrp == null ? null : typGrp.trim();
    }

    public String getSence() {
        return sence;
    }

    public void setSence(String sence) {
        this.sence = sence == null ? null : sence.trim();
    }

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts == null ? null : sts.trim();
    }

    public String getLastChgUsr() {
        return lastChgUsr;
    }

    public void setLastChgUsr(String lastChgUsr) {
        this.lastChgUsr = lastChgUsr == null ? null : lastChgUsr.trim();
    }

    public String getLastChgDate() {
        return lastChgDate;
    }

    public void setLastChgDate(String lastChgDate) {
        this.lastChgDate = lastChgDate == null ? null : lastChgDate.trim();
    }
}