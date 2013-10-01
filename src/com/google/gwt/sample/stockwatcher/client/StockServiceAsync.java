package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.core.client.GWT;

public interface StockServiceAsync {
	public void addStock(String symbol, AsyncCallback<Void> async);
	public void removeStock(String symbol, AsyncCallback<Void> callback);
	public void getStocks(AsyncCallback<String[]> callback);
}
	