//PALLEGA, DIOFEL S.
//CSC 124 cs.1

package quicksorting;

import java.util.Random;

public class quicksorting 
  {
      
	//quicksort function
	public void quicksort(int[] A,int p,int r)
	{
		
		if (p < r)
		{
		   
		   int q = partition(A, p, r);
		   quicksort(A, p, q - 1);
		   quicksort(A, q + 1, r);
		   
		}
		
	}
	
	//partition function with return type int
	public int partition(int[] A, int p, int r)
	{ 
		
		int x = A[r];
		int i = p - 1;
		
		for (int j = p; j <  r  ; j++)
		{
			
			if ( A[j] <= x)
			{ 
			    
			    i = i + 1;
				int o = A[i];
				A[i] = A[j];
				A[j] = o; 
				
				
			}
			 
			
		}
		
		//saving exchange value 
		int v = A[i + 1]; 
		
		//exchanging A[i] <-> A[r]
		A[i + 1] = A[r];
		A[r] = v;
		 
		return (i + 1);
	}
	
 


public static void main (String[] args) {
	 
		quicksorting test = new quicksorting();
		Random ran = new Random();
		int size = 4;
		int test1[] = new int [size];
		
		System.out.println("PALLEGA, DIOFEL S. ");
		System.out.println("QUICK SORT PROCESS\n");
		
		
		System.out.println("Random:"); 
		for(int i = 0; i < size; i++) {
			test1[i] = ran.nextInt(100);
			System.out.print(" " +test1[i]);
		}
		
		long start1 = System.currentTimeMillis();
		test.quicksort(test1, 0, size - 1);
		long end1 = System.currentTimeMillis();
		long total1 = end1 - start1;

		System.out.println("\n\nSorted Random:");
		printelements(test1);
		System.out.println("\nTime: " + total1 + " ms");
		
		long start2 = System.currentTimeMillis();
		test.quicksort(test1, 0, size - 1);
		long end2 = System.currentTimeMillis();
		long total2 = end2 - start2;

		System.out.println("\nSorted Ascending:");
		printelements(test1);
		System.out.println("\nTime: " + total2 + " ms");
		
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
		
		   
		long start3 = System.currentTimeMillis();
		test.quicksort(test1, 0, size - 1);
		long end3= System.currentTimeMillis();
		long total3 = end3 - start3;
		  
		printelements(test1);
		System.out.println("\nTime: " + total3 + " ms");
		
		
	}
	
	public static void printelements (int[] array) 
	{ 
		
		for(int i = 0; i < array.length; i++) 
		{
			System.out.print(" " + array[i]);
		}
		
	}
	
  }