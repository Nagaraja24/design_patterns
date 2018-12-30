package com.dp.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

	private Internet internet = new RealInternet();
	private static List<String> bannedSites;

	static {
		bannedSites = new ArrayList<>();
		bannedSites.add("abc.com");
		bannedSites.add("pqr.com");
	}

	@Override
	public void connectTo(String serverAddress) throws Exception {

		if (bannedSites.contains(serverAddress.toLowerCase())) {
			throw new Exception("Access Denied");

		}

		internet.connectTo(serverAddress);

	}

}
