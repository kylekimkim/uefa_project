package com.uefa.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="member")
public class MemberVo {
	@Id
	private String id;
	private String pw;
	private String name;
	private String phone;
	private String email;
	private String address;
	private String address_detail;
	@Column(nullable = true, insertable = false, updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date signup_time;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birth;
	private byte grade;
	private String myteam;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress_detail() {
		return address_detail;
	}
	public void setAddress_detail(String address_detail) {
		this.address_detail = address_detail;
	}
	public Date getSignup_time() {
		return signup_time;
	}
	public void setSignup_time(Date signup_time) {
		this.signup_time = signup_time;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public byte getGrade() {
		return grade;
	}
	public void setGrade(byte grade) {
		this.grade = grade;
	}
	public String getMyteam() {
		return myteam;
	}
	public void setMyteam(String myteam) {
		this.myteam = myteam;
	}
	@Override
	public String toString() {
		return "MemberVo={\"id\":\"" + id + "\", \"pw\":\"" + pw + "\", \"name\":\"" + name + "\", \"phone\":\"" + phone
				+ "\", \"email\":\"" + email + "\", \"address\":\"" + address + "\", \"address_detail\":\""
				+ address_detail + "\", \"signup_time\":\"" + signup_time + "\", \"birth\":\"" + birth
				+ "\", \"grade\":\"" + grade + "\", \"myteam\":\"" + myteam + "\"}";
	}
	
	
}
