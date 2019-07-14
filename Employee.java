package com.test;

public class Employee {
private Integer eid;
private String name;
private Double salary;
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((eid == null) ? 0 : eid.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((salary == null) ? 0 : salary.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (eid == null) {
		if (other.eid != null)
			return false;
	} else if (!eid.equals(other.eid))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (salary == null) {
		if (other.salary != null)
			return false;
	} else if (!salary.equals(other.salary))
		return false;
	return true;
}
public Employee() {
}
public Employee(Integer eid, String name, Double salary) {
	super();
	this.eid = eid;
	this.name = name;
	this.salary = salary;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
