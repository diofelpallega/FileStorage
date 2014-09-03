//AUTHOR:PALLEGA,DIOFEL S. 

public class LinkedStack implements Stack{
	
	private Node top;
	private int numElements = 0;

	public int size(){
            return numElements;
		 
	}
	
	public boolean isEmpty(){
            if(numElements == 0){
                return true;
                
            }
            else{
                return false;
            }
		 
	}
	
	public Object top(){
		if (isEmpty())
			throw new StackException("Stack empty.");
		return top.info;
	}
	
	public Object pop(){
		Node temp;
		if (isEmpty())
			throw new StackException("Stack underflow.");
                else{
                    numElements--;
                    temp = top;
                    top = top.link;
                    
                }
		 
		
		return temp.info;
	}
	
	public void push(Object item){
         if (isEmpty()){ 
             Node p = new Node(item, null);
         top = p;
         }else{
             Node p = new Node(item, top); 
             top = p;
         }
            
         numElements++;
		 
	}
	
	private static class Node {
        public Object info;
        public Node   link;
        
        public Node( Object d, Node l)
        {
            info = d; 
            link = l; 
        }               
    }
}