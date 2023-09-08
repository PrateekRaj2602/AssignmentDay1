package com.amdocs.commonality.ddu.learning.standalone.model;
import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class EmployeeSkillset {
	private String empId;
	private List<String> requiredSkills = new ArrayList<>();
	private List<String> actualSkills = new ArrayList<>();
	@Override
	public String toString() {
		return "EmployeeSkillset [empId=" + empId + ", requiredSkills=" + requiredSkills + ", actualSkills="
				+ actualSkills + "]";
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public List<String> getRequiredSkills() {
		return requiredSkills;
	}
	public void setRequiredSkills(List<String> requiredSkills) {
		this.requiredSkills = requiredSkills;
	}
	public List<String> getActualSkills() {
		return actualSkills;
	}
	public void setActualSkills(List<String> actualSkills) {
		this.actualSkills = actualSkills;
	}

}
