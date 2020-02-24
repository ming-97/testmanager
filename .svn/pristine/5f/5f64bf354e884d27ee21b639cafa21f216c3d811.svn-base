package com.pctc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pctc.dao.InstitutionsMapper;
import com.pctc.model.Institutions;
import com.pctc.model.InstitutionsExample;
import com.pctc.service.InstitutionsService;


@Service("institutionService")
@Transactional
public class InstitutionsServiceImpl implements InstitutionsService {

	@Autowired
	private InstitutionsMapper institutionsMapper;
	
	
	//查询所有机构
	@Transactional(readOnly=true)
	public List<Institutions> selectAllInstitutions(InstitutionsExample example) {
		List<Institutions> list=institutionsMapper.selectByExample(example);
		return list;
	}

}
