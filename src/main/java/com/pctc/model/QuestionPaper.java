package com.pctc.model;

import java.util.Date;
/**
 * 答题信息实体
 * @author zks
 * @date 2019-10-16
 * @version 0.1
 *
 */

public class QuestionPaper {
    private Long qpId;

    private Long qpSid;

    private Long qpQbid;

    private Long qpInsid;

    private String qpAnswer;

    private String qpName;

    private String qpCreateBy;

    private Date qpCreateTime;

    private String qpModifyBy;

    private Date qpModifyTime;

    private Boolean qpDelete;

    private Integer qpVersion;

    public Long getQpId() {
        return qpId;
    }

    public void setQpId(Long qpId) {
        this.qpId = qpId;
    }

    public Long getQpSid() {
        return qpSid;
    }

    public void setQpSid(Long qpSid) {
        this.qpSid = qpSid;
    }

    public Long getQpQbid() {
        return qpQbid;
    }

    public void setQpQbid(Long qpQbid) {
        this.qpQbid = qpQbid;
    }

    public Long getQpInsid() {
        return qpInsid;
    }

    public void setQpInsid(Long qpInsid) {
        this.qpInsid = qpInsid;
    }

    public String getQpAnswer() {
        return qpAnswer;
    }

    public void setQpAnswer(String qpAnswer) {
        this.qpAnswer = qpAnswer == null ? null : qpAnswer.trim();
    }

    public String getQpName() {
        return qpName;
    }

    public void setQpName(String qpName) {
        this.qpName = qpName == null ? null : qpName.trim();
    }

    public String getQpCreateBy() {
        return qpCreateBy;
    }

    public void setQpCreateBy(String qpCreateBy) {
        this.qpCreateBy = qpCreateBy == null ? null : qpCreateBy.trim();
    }

    public Date getQpCreateTime() {
        return qpCreateTime;
    }

    public void setQpCreateTime(Date qpCreateTime) {
        this.qpCreateTime = qpCreateTime;
    }

    public String getQpModifyBy() {
        return qpModifyBy;
    }

    public void setQpModifyBy(String qpModifyBy) {
        this.qpModifyBy = qpModifyBy == null ? null : qpModifyBy.trim();
    }

    public Date getQpModifyTime() {
        return qpModifyTime;
    }

    public void setQpModifyTime(Date qpModifyTime) {
        this.qpModifyTime = qpModifyTime;
    }

    public Boolean getQpDelete() {
        return qpDelete;
    }

    public void setQpDelete(Boolean qpDelete) {
        this.qpDelete = qpDelete;
    }

    public Integer getQpVersion() {
        return qpVersion;
    }

    public void setQpVersion(Integer qpVersion) {
        this.qpVersion = qpVersion;
    }

	@Override
	public String toString() {
		return "QuestionPaper [qpId=" + qpId + ", qpSid=" + qpSid + ", qpQbid=" + qpQbid + ", qpInsid=" + qpInsid
				+ ", qpAnswer=" + qpAnswer + ", qpName=" + qpName + ", qpCreateBy=" + qpCreateBy + ", qpCreateTime="
				+ qpCreateTime + ", qpModifyBy=" + qpModifyBy + ", qpModifyTime=" + qpModifyTime + ", qpDelete="
				+ qpDelete + ", qpVersion=" + qpVersion + "]";
	}
    
    
    
    
}
