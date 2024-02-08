package com.Studententity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="Transport")

public class UserDtls {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="Name")
	private String fullname;
	private String Schoolname;
	private int Grade;
	private int DateOfJoin;
	private String gender;
	private int dob;
	private String address;
	private String City;
	private String State;
	private int ZipCode;
	private int PhoneNumber;
	private String email;
	private String password;
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getSchoolname() {
		return Schoolname;
	}
	public void setSchoolname(String schoolname) {
		Schoolname = schoolname;
	}
	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade) {
		Grade = grade;
	}
	public int getDateOfJoin() {
		return DateOfJoin;
	}
	public void setDateOfJoin(int dateOfJoin) {
		DateOfJoin = dateOfJoin;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getZipCode() {
		return ZipCode;
	}
	public void setZipCode(int zipCode) {
		ZipCode = zipCode;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDtls [fullname=" + fullname + ", Schoolname=" + Schoolname + ", Grade=" + Grade + ", DateOfJoin="
				+ DateOfJoin + ", gender=" + gender + ", dob=" + dob + ", address=" + address + ", City=" + City
				+ ", State=" + State + ", ZipCode=" + ZipCode + ", PhoneNumber=" + PhoneNumber + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	

}
