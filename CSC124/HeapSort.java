import java.util.Random;


public class HeapSort {
	int size ;
	public void minHeapify(int A[], int i)
	{ 
		int smallest;
	    int size = A.length-1  ;
		int l = 2 * i; 
		int r = l + 1;
		
		if (l <= size && A[l] < A[i])
		{
		   smallest = l;
		}
		else
		{
		   smallest = i;	
		}
		
		if( (r <= size) && (A[r] < A[i]))
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
	
	
	public void buildMinHeap(int A[])
	{
		
		size =	A.length;
		for(int i = (size/2); i>=1; i--){
			minHeapify(A,i);
		}
	}
	
	
	public void heapsort(int[] A)
	{ 
		buildMinHeap(A); 
		int size =	A.length ;
		for(int i = size -1; i >= 2; i--)
		{ 
		   int temp = A[1];
		   A[1] = A[i];
		   A[i] = temp; 
		   size = size -1;
		   
		   minHeapify(A,1);  
		}
		
	}

 
public static void main (String[] args) {
	 
	    HeapSort test = new HeapSort();
		Random ran = new Random();
		int size = 10;
		int test1[] = new int [size];
		
		System.out.println("PALLEGA, DIOFEL S. ");
		System.out.println("HEAP SORT PROCESS\n");
		
		
		System.out.println("Random:"); 
		for(int i = 0; i < size; i++) {
			test1[i] = ran.nextInt(100);
			System.out.print(" " +test1[i]);
		}
		
		long start1 = System.nanoTime();
		test.heapsort(test1);
		long end1 = System.nanoTime();
		long total1 = end1 - start1;

		System.out.println("\n\nSorted Random:");
		printelements(test1);
		System.out.println("\nTime: " + total1 + " ns");
		
		long start2 = System.nanoTime();
		test.heapsort(test1);
		long end2 = System.nanoTime();
		long total2 = end2 - start2;

		System.out.println("\nSorted Ascending:");
		printelements(test1);
		System.out.println("\nTime: " + total2 + " ns");
		
		int b[] = new int [size];
		int j = 0;
		
		System.out.println("");
		System.out.println("Descending");
		for(int i = test1.length-1; i >= 0; i--) {
			b[j] = test1[i];
			System.out.print(" "+ b[j]);
			j++;
			
		}
		
		 
		System.out.println("");  
		System.out.println("\nSorted Descending:");
		
		   
		long start3 = System.nanoTime();
		test.heapsort(b);
		long end3= System.nanoTime();
		long total3 = end3 - start3;
		  
		printelements(b);
 
		System.out.println("\nTime: " + total3 + " ns"); 
		//System.out.println(b.length+" nth element = " + b[b.length - 1]); 
		
	}
	
	public static void printelements (int[] array) 
	{ 
		
		for(int i = 0; i < array.length; i++) 
		{
			System.out.print(" " + array[i]);
		}
		
	}
	
}
