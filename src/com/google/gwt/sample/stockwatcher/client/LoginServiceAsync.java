package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.core.client.GWT;

public interface LoginServiceAsync {

	public void login(String requestURL, AsyncCallback<LoginInfo> async);

}
