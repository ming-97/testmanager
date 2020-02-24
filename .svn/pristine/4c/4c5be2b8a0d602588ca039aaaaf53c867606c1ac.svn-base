package com.pctc.model;

import java.util.Date;
/**
 * 每日一练实体类
 * @author zks
 *@date 2019-10-16
 *@version 0.1
 */
import java.util.List;
public class QuestionDaily {
    private Long qdId;//id

    private String qdQbid;//题目id

    private Long qdInsid;//机构代号

    private String qdCreateBy;//创建者

    private Date qdCreateTime;//创建者

    private String qdModifyBy;//修改者

    private Date qdModifyTime;//修改时间

    private Boolean qdDelete;//删除标记

    private Integer qdVersion;//版本号

    public Long getQdId() {
        return qdId;
    }

    public void setQdId(Long qdId) {
        this.qdId = qdId;
    }

    public String getQdQbid() {
        return qdQbid;
    }

    public void setQdQbid(String qdQbid) {
        this.qdQbid = qdQbid == null ? null : qdQbid.trim();
    }

    public Long getQdInsid() {
        return qdInsid;
    }

    public void setQdInsid(Long qdInsid) {
        this.qdInsid = qdInsid;
    }

    public String getQdCreateBy() {
        return qdCreateBy;
    }

    public void setQdCreateBy(String qdCreateBy) {
        this.qdCreateBy = qdCreateBy == null ? null : qdCreateBy.trim();
    }

    public Date getQdCreateTime() {
        return qdCreateTime;
    }

    public void setQdCreateTime(Date qdCreateTime) {
        this.qdCreateTime = qdCreateTime;
    }

    public String getQdModifyBy() {
        return qdModifyBy;
    }

    public void setQdModifyBy(String qdModifyBy) {
        this.qdModifyBy = qdModifyBy == null ? null : qdModifyBy.trim();
    }

    public Date getQdModifyTime() {
        return qdModifyTime;
    }

    public void setQdModifyTime(Date qdModifyTime) {
        this.qdModifyTime = qdModifyTime;
    }

    public Boolean getQdDelete() {
        return qdDelete;
    }

    public void setQdDelete(Boolean qdDelete) {
        this.qdDelete = qdDelete;
    }

    public Integer getQdVersion() {
        return qdVersion;
    }

    public void setQdVersion(Integer qdVersion) {
        this.qdVersion = qdVersion;
    }






	@Override
	public String toString() {
		return "QuestionDaily [qdId=" + qdId + ", qdQbid=" + qdQbid + ", qdInsid=" + qdInsid + ", qdCreateBy="
				+ qdCreateBy + ", qdCreateTime=" + qdCreateTime + ", qdModifyBy=" + qdModifyBy + ", qdModifyTime="
				+ qdModifyTime + ", qdDelete=" + qdDelete + ", qdVersion=" + qdVersion + ", questionBankList="
				+ questionBankList + "]";
	}




	//多表连接，处理一对多
	private List<QuestionBnak> questionBankList;

	public List<QuestionBnak> getQuestionBankList() {
		return questionBankList;
	}

	public void setQuestionBankList(List<QuestionBnak> questionBankList) {
		this.questionBankList = questionBankList;
	}
	
	

	
	
    
    
}