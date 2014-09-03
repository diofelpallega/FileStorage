  
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public interface Queue {
    void enqueue(Object item) throws QueueException;
    Object dequeue() throws QueueException;
}

class QueueException extends RuntimeException{
    public QueueException(String err){
        super(err);
    }
}