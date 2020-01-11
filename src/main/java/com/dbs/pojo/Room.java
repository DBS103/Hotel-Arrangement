package com.dbs.pojo;

public class Room {

	private int roomid;
	private String typeid;
	private String rcondition;
	private String rtext;
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public String getTypeid() {
		return typeid;
	}
	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}
	public String getRcondition() {
		return rcondition;
	}
	public void setRcondition(String rcondition) {
		this.rcondition = rcondition;
	}
	public String getRtext() {
		return rtext;
	}
	public void setRtext(String rtext) {
		this.rtext = rtext;
	}
	@Override
	public String toString() {
		return "Room [roomid=" + roomid + ", typeid=" + typeid + ", rcondition=" + rcondition + ", rtext=" + rtext
				+ "]";
	}
	
}
