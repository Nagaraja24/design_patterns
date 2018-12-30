package com.dp.proxy;

public class RealInternet implements Internet {

	@Override
	public void connectTo(String serverAddress) throws Exception {
		System.out.println("Connecting to :" + serverAddress);
	}

}
