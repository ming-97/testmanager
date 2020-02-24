package com.pctc.model;

import java.util.Date;

public class QuestionCourseChapter {
    private Long qccId;

    private Long qccCcid;

    private String qccQbid;

    private Long qccInsid;

    private String qccCreateBy;

    private Date qccCreateTime;

    private String qccModifyBy;

    private Date qccModifyTime;

    private Boolean qccDelete;

    private Integer qccVersion;

    public Long getQccId() {
        return qccId;
    }

    public void setQccId(Long qccId) {
        this.qccId = qccId;
    }

    public Long getQccCcid() {
        return qccCcid;
    }

    public void setQccCcid(Long qccCcid) {
        this.qccCcid = qccCcid;
    }

    public String getQccQbid() {
        return qccQbid;
    }

    public void setQccQbid(String qccQbid) {
        this.qccQbid = qccQbid == null ? null : qccQbid.trim();
    }

    public Long getQccInsid() {
        return qccInsid;
    }

    public void setQccInsid(Long qccInsid) {
        this.qccInsid = qccInsid;
    }

    public String getQccCreateBy() {
        return qccCreateBy;
    }

    public void setQccCreateBy(String qccCreateBy) {
        this.qccCreateBy = qccCreateBy == null ? null : qccCreateBy.trim();
    }

    public Date getQccCreateTime() {
        return qccCreateTime;
    }

    public void setQccCreateTime(Date qccCreateTime) {
        this.qccCreateTime = qccCreateTime;
    }

    public String getQccModifyBy() {
        return qccModifyBy;
    }

    public void setQccModifyBy(String qccModifyBy) {
        this.qccModifyBy = qccModifyBy == null ? null : qccModifyBy.trim();
    }

    public Date getQccModifyTime() {
        return qccModifyTime;
    }

    public void setQccModifyTime(Date qccModifyTime) {
        this.qccModifyTime = qccModifyTime;
    }

    public Boolean getQccDelete() {
        return qccDelete;
    }

    public void setQccDelete(Boolean qccDelete) {
        this.qccDelete = qccDelete;
    }

    public Integer getQccVersion() {
        return qccVersion;
    }

    public void setQccVersion(Integer qccVersion) {
        this.qccVersion = qccVersion;
    }
}