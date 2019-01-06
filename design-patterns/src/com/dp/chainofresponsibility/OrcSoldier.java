package com.dp.chainofresponsibility;

public class OrcSoldier extends RequestHandler {

	public OrcSoldier(RequestHandler handler) {
		super(handler);

	}

	@Override
	public void handleRequest(Request theRequest) {
		if (theRequest.getRequestType().equals(RequestType.COLLECT_TAX)) {
			printHandling(theRequest);
			theRequest.markHandle();
		}

		super.handleRequest(theRequest);
	}

	@Override
	public String toString() {
		return "Orc Soldier";
	}

}
