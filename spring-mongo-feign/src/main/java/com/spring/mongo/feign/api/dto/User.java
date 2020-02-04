package com.spring.mongo.feign.api.dto;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class User {

	
	  @Id
	  public ObjectId id;
	  String username;
	  String password;
	
	// String userType;
	 int role;
//	 
//	public User(ObjectId id, String password, String userName, String userType, String role) {
//		
//		this.id = id;
//		this.password = password;
//		this.userName = userName;
//		this.userType = userType;
//		this.role = role;
//	}
	 
	public String getId() {
		return id.toHexString();
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



//	public String getUserType() {
//		return userType;
//	}
//
//	public void setUserType(String userType) {
//		this.userType = userType;
//	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

//	@Override
//	public String toString() {
//		return "User [id=" + id + ", password=" + password + ", userName=" + userName + ", userType=" + userType
//				+ ", role=" + role + "]";
//	}
	
	
	
	 
}
