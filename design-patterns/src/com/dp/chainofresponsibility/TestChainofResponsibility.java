package com.dp.chainofresponsibility;

/**
 * 
 * In plain words:
 * 
 * It helps building a chain of objects. Request enters from one end and keeps
 * going from object to object till it finds the suitable handler.
 * 
 * Wikipedia says:
 * 
 * In object-oriented design, the chain-of-responsibility pattern is a design
 * pattern consisting of a source of command objects and a series of processing
 * objects. Each processing object contains logic that defines the types of
 * command objects that it can handle; the rest are passed to the next
 * processing object in the chain.
 * 
 * Use Chain of Responsibility when:
 * 
 * more than one object may handle a request, and the handler isn't known a
 * priori. The handler should be ascertained automatically you want to issue a
 * request to one of several objects without specifying the receiver explicitly
 * the set of objects that can handle a request should be specified dynamically
 * 
 * 
 * Real world examples:
 * 
 * java.util.logging.Logger#log() 
 * Apache Commons Chain
 * javax.servlet.Filter#doFilter()
 * 
 * 
 * @author nagaraj
 *
 */
public class TestChainofResponsibility {

	public static void main(String[] args) {

		OrcKing king = new OrcKing();
		king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
		king.makeRequest(new Request(RequestType.TORTURE_PRISONER, " torture prisoner"));
		king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));

	}

}
