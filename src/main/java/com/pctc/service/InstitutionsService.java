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

	//��ѯ���л���
	public List<Institutions> selectAllInstitutions(InstitutionsExample example);
}
