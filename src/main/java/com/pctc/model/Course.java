package com.pctc.model;

import java.util.Date;

public class Course {
    private Long cId;//课程id

    private Long cInsid;//机构代号

    private String cName;//课程名

    private String cCreateBy;//创建者

    private Date cCreateTime;//创建时间

    private String cModifyBy;//修改者

    private Date cModifyTime;//修改时间

    private Boolean cDelete;//删除标记，0标识未删除，1标识已删除

    private Integer cVersion;//版本号

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