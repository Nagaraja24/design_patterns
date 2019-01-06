package com.dp.chainofresponsibility;

public class OrcCommander extends RequestHandler {

	public OrcCommander(RequestHandler handler) {
		super(handler);

	}

	@Override
	public void handleRequest(Request theRequest) {
		if (theRequest.getRequestType().equals(RequestType.DEFEND_CASTLE)) {
			printHandling(theRequest);
			theRequest.markHandle();
		}

		super.handleRequest(theRequest);
	}

	@Override
	public String toString() {
		return "Orc Commander";
	}

}
