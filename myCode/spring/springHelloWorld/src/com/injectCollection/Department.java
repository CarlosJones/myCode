package com.injectCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Department {
	private String name;
	private String[] empName;
	private List<Employee> empList;
	private Set<Employee> empSet;
	private Map<String,Employee> empMap;
	private Properties properties;
	public String getName() {
		return name;
	}
	public String[] getEmpName() {
		return empName;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public Set<Employee> getEmpSet() {
		return empSet;
	}
	public Map<String, Employee> getEmpMap() {
		return empMap;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmpName(String[] empName) {
		this.empName = empName;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public void setEmpSet(Set<Employee> empSet) {
		this.empSet = empSet;
	}
	public void setEmpMap(Map<String, Employee> empMap) {
		this.empMap = empMap;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
