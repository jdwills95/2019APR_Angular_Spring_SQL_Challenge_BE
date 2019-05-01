package com.javainuse.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.javainuse.model.Employee;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "employee")

public class Employee {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
	@Column(name = "FIRST_NAME")
    private String fname;
	@Column(name = "LAST_NAME")
    private String lname;
	@Column(name = "ADDRESS")
    private String street;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	@Column(name = "ZIP")
	private String zip;
	@Column(name = "CELL_PHONE")
	private String cellPhone;
	@Column(name = "HOME_PHONE")
	private String homePhone;
	@Column(name = "EMAIL")
	private String email;
	
	public Employee() {
	}

	public String getfName() {
		return fname;
	}

	public void setfName(String fname) {
		this.fname = fname;
	}

	public String getlName() {
		return lname;
	}

	public void setlName(String lname) {
		this.lname = lname;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getCellphone() {
		return cellPhone;
	}

	public void setCellphone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	
	public String getHomephone() {
		return homePhone;
	}

	public void setHomephone(String homePhone) {
		this.homePhone = homePhone;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Long getEmpId() {
		return id;
	}

	public void setEmpId(Long id) {
		this.id = id;
	}
}
