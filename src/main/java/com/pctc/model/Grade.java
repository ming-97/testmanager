package com.pctc.model;

import java.util.Date;

public class Grade {
    private Long gId;

    private Long gSid;

    private String gQpname;

    private Long gInsid;

    private Integer gGrade;

    private String gCreateBy;

    private Date gCreateTime;

    private String gModifyBy;

    private Date gModifyTime;

    private Boolean gDelete;

    private Integer gVersion;

    public Long getgId() {
        return gId;
    }

    public void setgId(Long gId) {
        this.gId = gId;
    }

    public Long getgSid() {
        return gSid;
    }

    public void setgSid(Long gSid) {
        this.gSid = gSid;
    }

    public String getgQpname() {
        return gQpname;
    }

    public void setgQpname(String gQpname) {
        this.gQpname = gQpname == null ? null : gQpname.trim();
    }

    public Long getgInsid() {
        return gInsid;
    }

    public void setgInsid(Long gInsid) {
        this.gInsid = gInsid;
    }

    public Integer getgGrade() {
        return gGrade;
    }

    public void setgGrade(Integer gGrade) {
        this.gGrade = gGrade;
    }

    public String getgCreateBy() {
        return gCreateBy;
    }

    public void setgCreateBy(String gCreateBy) {
        this.gCreateBy = gCreateBy == null ? null : gCreateBy.trim();
    }

    public Date getgCreateTime() {
        return gCreateTime;
    }

    public void setgCreateTime(Date gCreateTime) {
        this.gCreateTime = gCreateTime;
    }

    public String getgModifyBy() {
        return gModifyBy;
    }

    public void setgModifyBy(String gModifyBy) {
        this.gModifyBy = gModifyBy == null ? null : gModifyBy.trim();
    }

    public Date getgModifyTime() {
        return gModifyTime;
    }

    public void setgModifyTime(Date gModifyTime) {
        this.gModifyTime = gModifyTime;
    }

    public Boolean getgDelete() {
        return gDelete;
    }

    public void setgDelete(Boolean gDelete) {
        this.gDelete = gDelete;
    }

    public Integer getgVersion() {
        return gVersion;
    }

    public void setgVersion(Integer gVersion) {
        this.gVersion = gVersion;
    }

	@Override
	public String toString() {
		return "Grade [gId=" + gId + ", gSid=" + gSid + ", gQpname=" + gQpname + ", gInsid=" + gInsid + ", gGrade="
				+ gGrade + ", gCreateBy=" + gCreateBy + ", gCreateTime=" + gCreateTime + ", gModifyBy=" + gModifyBy
				+ ", gModifyTime=" + gModifyTime + ", gDelete=" + gDelete + ", gVersion=" + gVersion + "]";
	}
    
    
    
}