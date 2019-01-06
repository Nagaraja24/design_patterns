package com.dp.chainofresponsibility;

public abstract class RequestHandler {

	private RequestHandler next;

	public RequestHandler(RequestHandler next) {
		this.next = next;
	}

	public void handleRequest(Request theRequest) {
		if (next != null) {
			next.handleRequest(theRequest);
		}

	}

	protected void printHandling(Request theRequest) {
		System.out.println(this + " handling request " + theRequest);
	}

	@Override
	public abstract String toString();

}
