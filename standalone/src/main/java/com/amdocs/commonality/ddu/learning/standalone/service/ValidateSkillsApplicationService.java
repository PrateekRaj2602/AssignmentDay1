package com.amdocs.commonality.ddu.learning.standalone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.commonality.ddu.learning.standalone.model.EmployeeMissingSkillSet;
import com.amdocs.commonality.ddu.learning.standalone.model.EmployeeSkillset;

@Service
public class ValidateSkillsApplicationService {
	@Autowired
	EmployeeMissingSkillSet ems;
	
	public EmployeeMissingSkillSet validateSkills(EmployeeSkillset es) {
		ems.setEmpId(es.getEmpId());
		es.getRequiredSkills().removeIf(skill -> es.getActualSkills().stream().anyMatch(skill2 -> skill2.equalsIgnoreCase(skill)));
		ems.setMissingSkills(es.getRequiredSkills());
		return ems;
	}
	
}
