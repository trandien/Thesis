package Model;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

public class User extends ActionSupport implements Serializable{
	private String user_id;
	private String password;
	private String name;
	private String email;

	public User() {
		super();
	}

	public User(String user_id, String password, String name, String email) {
		super();
		this.user_id = user_id;
		this.password = password;
		this.name = name;
		this.email = email;
	}

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

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String execute() {
		return SUCCESS;
	}
}
