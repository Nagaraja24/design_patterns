package com.dp.chainofresponsibility;

public class OrcOfficer extends RequestHandler {

	public OrcOfficer(RequestHandler handler) {
		super(handler);

	}

	@Override
	public void handleRequest(Request theRequest) {
		if (theRequest.getRequestType().equals(RequestType.TORTURE_PRISONER)) {
			printHandling(theRequest);
			theRequest.markHandle();
		}

		super.handleRequest(theRequest);
	}

	@Override
	public String toString() {
		return "Orc Officer";
	}

}
