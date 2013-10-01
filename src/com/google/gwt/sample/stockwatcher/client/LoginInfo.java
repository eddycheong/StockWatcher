package com.google.gwt.sample.stockwatcher.client;

import java.io.Serializable;

public class LoginInfo implements Serializable{
	
	private boolean loggedIn = false;
	private String loginURL;
	private String logoutURL;
	private String emailAddress;
	private String nickName;
	
	public boolean isLoggedIn() {
		return loggedIn;
	}
	
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	
	public String getLoginURL() {
		return loginURL;
	}
	
	public void setLoginURL(String loginURL) {
		this.loginURL = loginURL;
	}
	
	public String getLogoutURL() {
		return logoutURL;
	}
	
	public void setLogoutURL(String logoutURL) {
		this.logoutURL = logoutURL;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
}
