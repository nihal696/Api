package com.Spring.Apiss.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CricketManagement {
	@Id
	private int jerseyNo;
	private String name;
	private String country;
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public CricketManagement(int jerseyNo, String name, String country) {
		super();
		this.jerseyNo = jerseyNo;
		this.name = name;
		this.country = country;
	}
	public CricketManagement() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CricketManagement [jerseyNo=" + jerseyNo + ", name=" + name + ", country=" + country + "]";
	}
	
}
	
	