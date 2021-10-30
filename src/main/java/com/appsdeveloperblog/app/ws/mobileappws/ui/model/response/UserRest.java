package com.appsdeveloperblog.app.ws.mobileappws.ui.model.response;

public class UserRest {// trả về đối tượng cho browser, trả lên cho lời gọi api
	private String userId; //không phải là id ở dưới database
	private String firstName;
	private String lastName;
	private String email;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
