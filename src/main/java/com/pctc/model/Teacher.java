package com.pctc.model;

import java.util.Date;

public class Teacher {
    private Long tId;//��ʦid

    private Long tInsid;//����id

    private String tUsername;//�û���

    private String tPassword;//����

    private String tCreateBy;//������

    private Date tCreateTime;//����ʱ��

    private String tModifyBy;//�޸���

    private Date tModifyTime;//�޸�ʱ��

    private Boolean tDelete;//ɾ����ǣ�1��ʾ��ɾ�� ��0��ʾδɾ��

    private Integer tVersion;//�汾��

    private Integer tPermissionNo;//Ȩ��

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