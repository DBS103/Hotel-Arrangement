package com.dbs.pojo;

public class Employee {
	private int empno;
	private String deptno;
	private String ename;
	private String epswd;
	private String esex;
	private String epnum;
	private String text;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEpswd() {
		return epswd;
	}
	public void setEpswd(String epswd) {
		this.epswd = epswd;
	}
	public String getEsex() {
		return esex;
	}
	public void setEsex(String esex) {
		this.esex = esex;
	}
	public String getEpnum() {
		return epnum;
	}
	public void setEpnum(String epnum) {
		this.epnum = epnum;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", deptno=" + deptno + ", ename=" + ename + ", epswd=" + epswd + ", esex="
				+ esex + ", epnum=" + epnum + ", text=" + text + "]";
	}
	
	

}
