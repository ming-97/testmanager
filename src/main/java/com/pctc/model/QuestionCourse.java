package com.pctc.model;

import java.util.Date;

public class QuestionCourse {
    private Long qcId;

    private Long qcCid;

    private String qcQbid;

    private Long qcInsid;

    private String qcCreateBy;

    private Date qcCreateTime;

    private String qcModifyBy;

    private Date qcModifyTime;

    private Boolean qcDelete;

    private Integer qcVersion;

    public Long getQcId() {
        return qcId;
    }

    public void setQcId(Long qcId) {
        this.qcId = qcId;
    }

    public Long getQcCid() {
        return qcCid;
    }

    public void setQcCid(Long qcCid) {
        this.qcCid = qcCid;
    }

    public String getQcQbid() {
        return qcQbid;
    }

    public void setQcQbid(String qcQbid) {
        this.qcQbid = qcQbid == null ? null : qcQbid.trim();
    }

    public Long getQcInsid() {
        return qcInsid;
    }

    public void setQcInsid(Long qcInsid) {
        this.qcInsid = qcInsid;
    }

    public String getQcCreateBy() {
        return qcCreateBy;
    }

    public void setQcCreateBy(String qcCreateBy) {
        this.qcCreateBy = qcCreateBy == null ? null : qcCreateBy.trim();
    }

    public Date getQcCreateTime() {
        return qcCreateTime;
    }

    public void setQcCreateTime(Date qcCreateTime) {
        this.qcCreateTime = qcCreateTime;
    }

    public String getQcModifyBy() {
        return qcModifyBy;
    }

    public void setQcModifyBy(String qcModifyBy) {
        this.qcModifyBy = qcModifyBy == null ? null : qcModifyBy.trim();
    }

    public Date getQcModifyTime() {
        return qcModifyTime;
    }

    public void setQcModifyTime(Date qcModifyTime) {
        this.qcModifyTime = qcModifyTime;
    }

    public Boolean getQcDelete() {
        return qcDelete;
    }

    public void setQcDelete(Boolean qcDelete) {
        this.qcDelete = qcDelete;
    }

    public Integer getQcVersion() {
        return qcVersion;
    }

    public void setQcVersion(Integer qcVersion) {
        this.qcVersion = qcVersion;
    }

	@Override
	public String toString() {
		return "QuestionCourse [qcId=" + qcId + ", qcCid=" + qcCid + ", qcQbid=" + qcQbid + ", qcInsid=" + qcInsid
				+ ", qcCreateBy=" + qcCreateBy + ", qcCreateTime=" + qcCreateTime + ", qcModifyBy=" + qcModifyBy
				+ ", qcModifyTime=" + qcModifyTime + ", qcDelete=" + qcDelete + ", qcVersion=" + qcVersion + "]";
	}
    
    
    
}