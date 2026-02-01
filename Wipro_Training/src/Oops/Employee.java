package Oops;
import java.util.*;
public class Employee {
	private int empid;
	private String empname;
	private int empaccno;
	
	public int getEmpdid() {
		return empid;
	}
	public void setEmpid(int newEmpid) {
		this.empid=newEmpid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String newEmpname) {
		this.empname=newEmpname;
	}
	public int getEmpaccno() {
		return empaccno;
	}
	public void setEmpaccno(int newEmpaccno) {
		this.empaccno=newEmpaccno;
	}
	public String toString() {
		return "ID: "+ empid + "|| NAME: " + empname + "|| ACC NO: " + empaccno;
	}
}
