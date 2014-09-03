 /**
 *
 * @author Admin
 */
 

public interface Stack {
    public int size(); /* returns the size of the stack */
    public boolean isEmpty(); /* checks if empty */
    public Object top() throws StackException;
    public Object pop() throws StackException;
    public void push(Object item) throws StackException;
}

class StackException extends RuntimeException{
    public StackException(String err){
        super(err);
    }
}