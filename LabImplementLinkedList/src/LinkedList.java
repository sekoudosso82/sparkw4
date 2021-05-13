
public class LinkedList {
	Node head;
	    
	 // utility methods
    public void add() {  
        //Create a new node  
        Node newNode = new Node();  
        while ( newNode != null) {
        	this.head.next = newNode;	
        }
    }  

}
