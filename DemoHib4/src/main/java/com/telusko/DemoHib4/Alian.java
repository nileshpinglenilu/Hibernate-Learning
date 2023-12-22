package com.telusko.DemoHib4;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Alian 
{
	@Id
	private int aid;
	private String sname;
	@OneToMany(mappedBy = "alian", fetch = FetchType.EAGER)
	private Collection<Laptop> laps = new ArrayList<Laptop>();
	
	public Collection<Laptop> getLaps() {
		return laps;
	}
	public void setLaps(Collection<Laptop> laps) {
		this.laps = laps;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Alian [aid=" + aid + ", sname=" + sname + ", laps=" + laps + "]";
	}

}
