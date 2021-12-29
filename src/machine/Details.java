package machine;

import java.util.Date;

public class Details {
	
	public String name;
	public String email;
	public Date date;
	
	public Details() {
		 
	}
	
	public Details(String name, String email) {
		this.name = name;
		this.email = email;
		this.date = new Date();
	}
	
	@Override
	public String toString() {
		return "Details [name=" + name + ", email=" + email + ", date=" + date + "]";
	}
	
	//getters and setters
	/*
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	*/

}
