package com.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(schema = "APP", name = "SIGNUP")

public class Signup {
@Id
@Column(name = "USER_ID")
private String userId;
@Column(name = "USER_NAME")
private String userName;
@Column(name = "FIRST_NAME")
private String firstName;
@Column(name = "LAST_NAME")
private String lastName;

 @Column(name = "CITY")
private String city;
@Column(name = "STATE")
private String state;

 @Column(name = "EMAIL")
private String email;

 @Column(name = "PHONE")
private String phone;
public String getUserId() {
return userId;
}
public void setUserId(String userId) {
this.userId = userId;
}
public String getUserName() {
return userName;
}
public void setUserName(String userName) {
this.userName=userName;
}
public String getFirstName() {
return firstName;
}
public void setFirstname(String firstName) {
this.firstName = firstName;
}
public String getLastName() {
return lastName;
}
public void setLastName(String lastName) {
this.lastName = lastName;
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
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public String getPhone() {
return phone;
}
public void setPhone(String phone) {
this.phone = phone;
}

}