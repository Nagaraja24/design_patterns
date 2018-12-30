package com.dp.proxy;

public class Client {

	public static void main(String[] args) throws Exception {

		Internet internet = new ProxyInternet();

		internet.connectTo("google.com");

		internet.connectTo("abc.com");
	}

}
