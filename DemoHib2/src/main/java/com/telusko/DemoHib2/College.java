package com.telusko.DemoHib2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CollegeTable")
public class College 
{
	@Id
	private int id;
	private String College;
	private FullName name;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public FullName getName() {
		return name;
	}

	public void setName(FullName name) {
		this.name = name;
	}

	public String getCollege() {
		return College;
	}

	public void setCollege(String college) {
		College = college;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", College=" + College + "]";
	}
	
}
