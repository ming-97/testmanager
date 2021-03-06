package com.pctc.model;

import java.util.Date;

public class Teacher {
    private Long tId;//教师id

    private Long tInsid;//机构id

    private String tUsername;//用户名

    private String tPassword;//密码

    private String tCreateBy;//创建者

    private Date tCreateTime;//创建时间

    private String tModifyBy;//修改者

    private Date tModifyTime;//修改时间

    private Boolean tDelete;//删除标记，1表示已删除 ，0表示未删除

    private Integer tVersion;//版本号

    private Integer tPermissionNo;//权限

    public Long gettId() {
        return tId;
    }

    public void settId(Long tId) {
        this.tId = tId;
    }

    public Long gettInsid() {
        return tInsid;
    }

    public void settInsid(Long tInsid) {
        this.tInsid = tInsid;
    }

    public String gettUsername() {
        return tUsername;
    }

    public void settUsername(String tUsername) {
        this.tUsername = tUsername == null ? null : tUsername.trim();
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword == null ? null : tPassword.trim();
    }

    public String gettCreateBy() {
        return tCreateBy;
    }

    public void settCreateBy(String tCreateBy) {
        this.tCreateBy = tCreateBy == null ? null : tCreateBy.trim();
    }

    public Date gettCreateTime() {
        return tCreateTime;
    }

    public void settCreateTime(Date tCreateTime) {
        this.tCreateTime = tCreateTime;
    }

    public String gettModifyBy() {
        return tModifyBy;
    }

    public void settModifyBy(String tModifyBy) {
        this.tModifyBy = tModifyBy == null ? null : tModifyBy.trim();
    }

    public Date gettModifyTime() {
        return tModifyTime;
    }

    public void settModifyTime(Date tModifyTime) {
        this.tModifyTime = tModifyTime;
    }

    public Boolean gettDelete() {
        return tDelete;
    }

    public void settDelete(Boolean tDelete) {
        this.tDelete = tDelete;
    }

    public Integer gettVersion() {
        return tVersion;
    }

    public void settVersion(Integer tVersion) {
        this.tVersion = tVersion;
    }

    public Integer gettPermissionNo() {
        return tPermissionNo;
    }

    public void settPermissionNo(Integer tPermissionNo) {
        this.tPermissionNo = tPermissionNo;
    }

	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", tInsid=" + tInsid + ", tUsername=" + tUsername + ", tPassword=" + tPassword
				+ ", tCreateBy=" + tCreateBy + ", tCreateTime=" + tCreateTime + ", tModifyBy=" + tModifyBy
				+ ", tModifyTime=" + tModifyTime + ", tDelete=" + tDelete + ", tVersion=" + tVersion
				+ ", tPermissionNo=" + tPermissionNo + "]";
	}
    
    
    
}