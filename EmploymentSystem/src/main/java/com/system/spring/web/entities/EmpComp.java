package com.system.spring.web.entities;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public enum Type {
    Salary,
    Bonus,
    Commission,
    Allowance,
    Adjustment;
}


@Entity
@Table(name = "empComp")
public class EmpComp{
	  @Id
	  private int UID;
	
	  @Column(columnDefinition = "ENUM('Salary', 'Bonus', 'Commission', 'Allowance', 'Adjustment')")
	  @Enumerated(EnumType.STRING)
	  private Type type;
    
	  private int amt;
	  private String description;
	  private Date date;
	  


	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		UID = uID;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "EmpComp [UID=" + UID + ", type=" + type + ", amt=" + amt + ", description=" + description + ", date="
				+ date + "]";
	}
	
	
	

    
}
