package com.system.spring.web.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;



@Entity
@Table(name = "employees",
uniqueConstraints={ @UniqueConstraint(columnNames = {"fname", "mname","lname","dob"}) })
public class Employees {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private int UID;
	  
	  @NotBlank(message = "First Name is mandatory")
	  private String fname;
	  private String mname;
	  @NotBlank(message = "Last Name is mandatory")
	  private String lname;
	  @NotBlank(message = "Date of Birth is mandatory")
	  private Date dob;
	  @NotBlank(message = "Position is mandatory")
	  private String position;
	  
	 
	  public Employees(){}
	  
	  public Employees (String fname, String mname, String lname, Date dob, String position) {
		  setFname(fname);
		  setMname(mname);
		  setLname(lname);
		  setDob(dob);
		  setPosition(position);
	  }
	  
	  public Employees (String fname, String lname, Date dob, String position) {
		  setFname(fname);
		  setLname(lname);
		  setDob(dob);
		  setPosition(position);
	  }
	  
	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		UID = uID;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	

	
	
	  
}
