package com.sekou;


public class Stack {
	
	private Node top;

    public void push(Node newNode) {
        // your implementation here
    	this.top = newNode;
    }
    public Node pop() {
    	
        // your implementation here
    	this.top = null;
    	return this.top;
    }
    public Node peek() {
    	
        // your implementation here
    	return this.top;
    	
    }

}
