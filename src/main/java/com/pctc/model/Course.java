package com.pctc.model;

import java.util.Date;

public class Course {
    private Long cId;//�γ�id

    private Long cInsid;//��������

    private String cName;//�γ���

    private String cCreateBy;//������

    private Date cCreateTime;//����ʱ��

    private String cModifyBy;//�޸���

    private Date cModifyTime;//�޸�ʱ��

    private Boolean cDelete;//ɾ����ǣ�0��ʶδɾ����1��ʶ��ɾ��

    private Integer cVersion;//�汾��

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public Long getcInsid() {
        return cInsid;
    }

    public void setcInsid(Long cInsid) {
        this.cInsid = cInsid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcCreateBy() {
        return cCreateBy;
    }

    public void setcCreateBy(String cCreateBy) {
        this.cCreateBy = cCreateBy == null ? null : cCreateBy.trim();
    }

    public Date getcCreateTime() {
        return cCreateTime;
    }

    public void setcCreateTime(Date cCreateTime) {
        this.cCreateTime = cCreateTime;
    }

    public String getcModifyBy() {
        return cModifyBy;
    }

    public void setcModifyBy(String cModifyBy) {
        this.cModifyBy = cModifyBy == null ? null : cModifyBy.trim();
    }

    public Date getcModifyTime() {
        return cModifyTime;
    }

    public void setcModifyTime(Date cModifyTime) {
        this.cModifyTime = cModifyTime;
    }

    public Boolean getcDelete() {
        return cDelete;
    }

    public void setcDelete(Boolean cDelete) {
        this.cDelete = cDelete;
    }

    public Integer getcVersion() {
        return cVersion;
    }

    public void setcVersion(Integer cVersion) {
        this.cVersion = cVersion;
    }
}