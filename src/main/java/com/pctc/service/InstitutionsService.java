package com.pctc.service;

import java.util.List;

import com.pctc.model.Institutions;
import com.pctc.model.InstitutionsExample;

/**
 * 
 * @author zw
 *
 */
public interface InstitutionsService {

	//查询所有机构
	public List<Institutions> selectAllInstitutions(InstitutionsExample example);
}
