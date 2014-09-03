 
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class LinkedQueue implements Queue {
    
    Node front= null; 
    Node rear=null;
    /* Create an empty queue */  
    LinkedQueue()
    {
    	front = null;
    	rear = null;
    }

    /* Create a queue with node n initially */
    LinkedQueue(Node n){
        front = n;
        rear = n;
    }

    /* Inserts an item onto the queue */
    public void enqueue(Object item) throws QueueException{
         if (front == null)
       { 
        front = new Node(item, rear);
        
        rear =front;
       }
       else{
      rear.next = new Node(item,null);
      rear = rear.next;
       }
      

	   
	   
    }
    
    /* Deletes an item from the queue */
    public Object dequeue() throws QueueException{
     Node p;
        p = front;
        front = front.next;
      
	
        return p.data;
	}
    
     private static class Node {
        public Object data;
        public Node   next;
        
        public Node( Object d, Node n )
        {
            data = d; 
            next = n;
        }      
    }
}