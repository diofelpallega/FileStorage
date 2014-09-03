 
//AUTHOR: PALLEGA, DIOFEL S.

public class ArrayStack implements Stack{
	
	
	
	public static final int CAPACITY = 1000;
	public int capacity;
	Object S[];
	int top = -1;

	public ArrayStack()
	{
		this(CAPACITY);
		
	}

	public ArrayStack(int c)
	{
		capacity = c;
		S = new Object[capacity];
		
	}

       
	public int size()
	{
		
            return top + 1;
		
	}

	public boolean isEmpty()
	{
		
            if(top == -1)
                return true;
            else
                return false;
		
	}
	
	public Object top()
	{
		
		if (isEmpty()) 
			throw new StackException("Stack empty.");
		return S[top];
	}

	public Object pop()
	{
		
		Object item;
		if (isEmpty())
			throw new StackException("Stack underflow.");
                else{
                   item = S[top--];
                   
                   }
		return item;
		
	}
	
	public void push(Object item)
	{
		
		if (size()==capacity)
			throw new StackException("Stack overflow.");
		top++;
                S[top] = item;
		
	}
}