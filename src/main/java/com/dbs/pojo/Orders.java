package com.dbs.pojo;



public class Orders {

	private String orderid;
	private int empno;
	private String clientno;
	private int roomid;
	private String otime;
	private int ocash;
	private String otext;
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getClientno() {
		return clientno;
	}
	public void setClientno(String clientno) {
		this.clientno = clientno;
	}
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public String getOtime() {
		return otime;
	}
	public void setOtime(String otime) {
		this.otime = otime;
	}
	public int getOcash() {
		return ocash;
	}
	public void setOcash(int ocash) {
		this.ocash = ocash;
	}
	public String getOtext() {
		return otext;
	}
	public void setOtext(String otext) {
		this.otext = otext;
	}
	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", empno=" + empno + ", clientno=" + clientno + ", roomid=" + roomid
				+ ", otime=" + otime + ", ocash=" + ocash + ", otext=" + otext + "]";
	}
	
	
}
