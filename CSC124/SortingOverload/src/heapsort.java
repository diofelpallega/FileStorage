//DIOFEL S. PALLEGA
//CSC124

public class heapsort 
{
	int size ;  
	
	public void minHeapify(int[] A, int i)
	{ 
		
		int l = 2 * i; 
		int r = l + 1;
		int smallest =i ;
	
		if (l <= size  && A[l] > A[i])
		{
		   smallest = l;
		} 
		 
		if( r <= size && A[r] > A[smallest])
		{
			smallest = r;
		}
		
		if(smallest != i)
		{
			int temp = A[i];
			A[i] = A[smallest];
			A[smallest] = temp;
			minHeapify(A,smallest);
			
		}
	}
	
	
	public void buildMinHeap(int[] A)
	{ 
		size =	A.length-1;
		
		for(int i = (size/2); i>=0; i--)
		{
			minHeapify(A,i);
		}
		
	}
	
	
	public void heapsorter(int[] A)
	{  
		buildMinHeap(A);   
		
		for(int i = size ; i >=0; i--)    
		{ 
			
		   int temp = A[0];
		   A[0] = A[i];
		   A[i] = temp; 
		   size = size -1; 
		   minHeapify(A,0); 
		   
		} 
	}
}