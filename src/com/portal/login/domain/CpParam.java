package com.portal.login.domain;

public class CpParam {
    private Long seqNo;

    private String productCode;

    private String paramCnname;

    private String paramEnname;

    private String paramValue;

    private String readFlag;

    private String description;

    public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getParamCnname() {
        return paramCnname;
    }

    public void setParamCnname(String paramCnname) {
        this.paramCnname = paramCnname == null ? null : paramCnname.trim();
    }

    public String getParamEnname() {
        return paramEnname;
    }

    public void setParamEnname(String paramEnname) {
        this.paramEnname = paramEnname == null ? null : paramEnname.trim();
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    public String getReadFlag() {
        return readFlag;
    }

    public void setReadFlag(String readFlag) {
        this.readFlag = readFlag == null ? null : readFlag.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}