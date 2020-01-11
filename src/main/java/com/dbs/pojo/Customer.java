package com.dbs.pojo;

public class Customer {
	
	private Integer clientno;
	private String cname;
	private String cidentity;
	private String cpnum;
	private String csex;
	private String ctext;
	
	public String getIdentity() {
		return cidentity;
	}
	public void setIdentity(String cidentity) {
		this.cidentity = cidentity;
	}
	public String getSex() {
		return csex;
	}
	public void setSex(String csex) {
		this.csex = csex;
	}
	public String getText() {
		return ctext;
	}
	public void setText(String ctext) {
		this.ctext = ctext;
	}
	public Integer getId() {
		return clientno;
	}
	public void setId(Integer clientno) {
		this.clientno = clientno;
	}
	public String getUsername() {
		return cname;
	}
	public void setUsername(String cname) {
		this.cname = cname;
	}
	
	public String getPhone() {
		return cpnum;
	}
	public void setPhone(String cpnum) {
		this.cpnum = cpnum;
	}
	@Override
	public String toString() {
		return "Customer [clientno=" + clientno + ", cname=" + cname + ", cidentity=" + cidentity
				+ ", cpnum=" + cpnum + ", csex=" + csex + ", ctext=" + ctext + "]";
	}
	
	

}
