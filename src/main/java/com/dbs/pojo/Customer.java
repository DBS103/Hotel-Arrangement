package com.dbs.pojo;

public class Customer {
	
	private Integer clientno;
	private String cname;
	private String cidentity;
	private String csex;
	private String cpnum;
	
	private String ctext;
	
	
	public Integer getClientno() {
		return clientno;
	}


	public void setClientno(Integer clientno) {
		this.clientno = clientno;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getCidentity() {
		return cidentity;
	}


	public void setCidentity(String cidentity) {
		this.cidentity = cidentity;
	}


	public String getCsex() {
		return csex;
	}


	public void setCsex(String csex) {
		this.csex = csex;
	}


	public String getCpnum() {
		return cpnum;
	}


	public void setCpnum(String cpnum) {
		this.cpnum = cpnum;
	}


	public String getCtext() {
		return ctext;
	}


	public void setCtext(String ctext) {
		this.ctext = ctext;
	}


	@Override
	public String toString() {
		return "Customer [clientno=" + clientno + ", cname=" + cname + ", cidentity=" + cidentity
				+ ", cpnum=" + cpnum + ", csex=" + csex + ", ctext=" + ctext + "]";
	}
	
	

}
