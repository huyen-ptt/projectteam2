package model;

import java.sql.Timestamp;

public class UserModel {
	private int id;
	private String username;
	private String password;
	private String name;
	private int phone;
	private Timestamp createdTime;

	public UserModel() {
		// Mặc định constructor
	}
	
	public UserModel(String username, String password, String name, int phone) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}

	public UserModel(int id, String username, String password, String name, int phone, Timestamp createdTime) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.createdTime = createdTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", phone=" + phone + ", createdTime=" + createdTime + ", getId()=" + getId() + ", getUsername()="
				+ getUsername() + ", getPassword()=" + getPassword() + ", getName()=" + getName() + ", getPhone()="
				+ getPhone() + ", getCreatedTime()=" + getCreatedTime() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
