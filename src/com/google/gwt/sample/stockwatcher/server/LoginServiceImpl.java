package com.google.gwt.sample.stockwatcher.server;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import com.google.gwt.sample.stockwatcher.client.LoginInfo;
import com.google.gwt.sample.stockwatcher.client.LoginService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class LoginServiceImpl extends RemoteServiceServlet implements LoginService{

	public LoginInfo login(String requestURL) {
		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();
		LoginInfo loginInfo = new LoginInfo();
		
		if(user != null) {
			loginInfo.setLoggedIn(true);
			loginInfo.setEmailAddress(user.getEmail());
			loginInfo.setNickName(user.getNickname());
			loginInfo.setLogoutURL(userService.createLogoutURL(requestURL));
		} else {
			loginInfo.setLoggedIn(false);
			loginInfo.setLoginURL(userService.createLoginURL(requestURL));
		}
		
		return loginInfo;
	}

}
