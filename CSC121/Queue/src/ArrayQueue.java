 

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ArrayQueue implements Queue{
    
    Object Q[];
    int n = 100 ; /* size of the queue, default 100 */
    int front = 0; /* front and rear set to 0 initially */
    int rear = 0;

    
    
    /* Create a queue of default size 100 */
    ArrayQueue(){
    	
        Q = new Object[100];
    }
    
    
    
    /* Create a queue of the given size */
    ArrayQueue(int size){
    	
        n = size;
        Q = new Object[n];
    }

    /* Inserts an item onto the queue */
    public void enqueue(Object item) throws QueueException{
    	
        n++;
        rear++;
        Q[rear] = item;
       	
    }
    
    /* Deletes an item from the queue*/
    public Object dequeue() throws QueueException {
    	
	    n--;
        front++;
        return Q[front];
		
    }
    /* Moves the items to make room at the â€œrear-sideâ€� for
        future insertions */
    void moveQueue() throws QueueException{
    	
        if (front==0) 
            throw new QueueException("Inserting into a full queue");
        for(int i=front; i<n; i++)
            Q[i-front] = Q[i];
        rear = rear - front;
        front = 0;
    }
}