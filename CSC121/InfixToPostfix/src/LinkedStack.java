 

public class LinkedStack implements Stack{
	
	public Node top;
	public int numElements = 0;

	public int size(){
            return numElements;
		//code here
	}
	
	public boolean isEmpty(){
            if(numElements == 0){
                return true;
            }else{
                return false;
            }
		//code here
	}
	
	public Object top(){
	 if(isEmpty()){
			throw new StackException("Stack empty.");
		}
		else{
		return top.info;
		}
		 
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
		//code here
		
		return temp.info;
	}
	
	public void push(Object item){
         if (isEmpty()){ 
             Node p = new Node(item, null);
         top = p;
         }else {
             Node p = new Node(item, top.link);
             p.link = top;
             top = p;
         }
            
         numElements++;
		//code here	
	}
	
	public static class Node {
        public Object info;
        public Node   link;
        
        public Node( Object d, Node l)
        {
            info = d; 
            link = l; 
        }               
    }
}