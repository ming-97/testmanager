package com.pctc.model;

import java.util.Date;

public class CourseChapter {
    private Long ccId;

    private Long ccCid;

    private Long ccInsid;

    private String ccName;

    private String ccCreateBy;

    private Date ccCreateTime;

    private String ccModifyBy;

    private Date ccModifyTime;

    private Boolean ccDelete;

    private Integer ccVersion;

    public Long getCcId() {
        return ccId;
    }

    public void setCcId(Long ccId) {
        this.ccId = ccId;
    }

    public Long getCcCid() {
        return ccCid;
    }

    public void setCcCid(Long ccCid) {
        this.ccCid = ccCid;
    }

    public Long getCcInsid() {
        return ccInsid;
    }

    public void setCcInsid(Long ccInsid) {
        this.ccInsid = ccInsid;
    }

    public String getCcName() {
        return ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName == null ? null : ccName.trim();
    }

    public String getCcCreateBy() {
        return ccCreateBy;
    }

    public void setCcCreateBy(String ccCreateBy) {
        this.ccCreateBy = ccCreateBy == null ? null : ccCreateBy.trim();
    }

    public Date getCcCreateTime() {
        return ccCreateTime;
    }

    public void setCcCreateTime(Date ccCreateTime) {
        this.ccCreateTime = ccCreateTime;
    }

    public String getCcModifyBy() {
        return ccModifyBy;
    }

    public void setCcModifyBy(String ccModifyBy) {
        this.ccModifyBy = ccModifyBy == null ? null : ccModifyBy.trim();
    }

    public Date getCcModifyTime() {
        return ccModifyTime;
    }

    public void setCcModifyTime(Date ccModifyTime) {
        this.ccModifyTime = ccModifyTime;
    }

    public Boolean getCcDelete() {
        return ccDelete;
    }

    public void setCcDelete(Boolean ccDelete) {
        this.ccDelete = ccDelete;
    }

    public Integer getCcVersion() {
        return ccVersion;
    }

    public void setCcVersion(Integer ccVersion) {
        this.ccVersion = ccVersion;
    }
}