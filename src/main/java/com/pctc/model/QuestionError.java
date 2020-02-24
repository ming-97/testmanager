package com.pctc.model;

import java.util.Date;

public class QuestionError {
    private Long qeId;

    private Long qeSid;

    private Long qeQpid;

    private Long qeInsid;

    private String qeCreateBy;

    private Date qeCreateTime;

    private String qeModifyBy;

    private String qeModifyTime;

    private Boolean qeDelete;

    private Integer qeVersion;

    public Long getQeId() {
        return qeId;
    }

    public void setQeId(Long qeId) {
        this.qeId = qeId;
    }

    public Long getQeSid() {
        return qeSid;
    }

    public void setQeSid(Long qeSid) {
        this.qeSid = qeSid;
    }

    public Long getQeQpid() {
        return qeQpid;
    }

    public void setQeQpid(Long qeQpid) {
        this.qeQpid = qeQpid;
    }

    public Long getQeInsid() {
        return qeInsid;
    }

    public void setQeInsid(Long qeInsid) {
        this.qeInsid = qeInsid;
    }

    public String getQeCreateBy() {
        return qeCreateBy;
    }

    public void setQeCreateBy(String qeCreateBy) {
        this.qeCreateBy = qeCreateBy == null ? null : qeCreateBy.trim();
    }

    public Date getQeCreateTime() {
        return qeCreateTime;
    }

    public void setQeCreateTime(Date qeCreateTime) {
        this.qeCreateTime = qeCreateTime;
    }

    public String getQeModifyBy() {
        return qeModifyBy;
    }

    public void setQeModifyBy(String qeModifyBy) {
        this.qeModifyBy = qeModifyBy == null ? null : qeModifyBy.trim();
    }

    public String getQeModifyTime() {
        return qeModifyTime;
    }

    public void setQeModifyTime(String qeModifyTime) {
        this.qeModifyTime = qeModifyTime == null ? null : qeModifyTime.trim();
    }

    public Boolean getQeDelete() {
        return qeDelete;
    }

    public void setQeDelete(Boolean qeDelete) {
        this.qeDelete = qeDelete;
    }

    public Integer getQeVersion() {
        return qeVersion;
    }

    public void setQeVersion(Integer qeVersion) {
        this.qeVersion = qeVersion;
    }

	@Override
	public String toString() {
		return "QuestionError [qeId=" + qeId + ", qeSid=" + qeSid + ", qeQpid=" + qeQpid + ", qeInsid=" + qeInsid
				+ ", qeCreateBy=" + qeCreateBy + ", qeCreateTime=" + qeCreateTime + ", qeModifyBy=" + qeModifyBy
				+ ", qeModifyTime=" + qeModifyTime + ", qeDelete=" + qeDelete + ", qeVersion=" + qeVersion + "]";
	}
    
    
    
}