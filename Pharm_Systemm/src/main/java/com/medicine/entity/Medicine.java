package com.medicine.entity;

public class Medicine {
	private int id;
	private String name;
	private String purpose;
	private String mg;
	
	
	
	
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getMg() {
		return mg;
	}
	public void setMg(String mg) {
		this.mg = mg;
	}
	@Override
	public String toString() {
		return "Medicine [id=" + id + ", name=" + name + ", purpose=" + purpose + ", mg=" + mg + "]";
	}
	
}
