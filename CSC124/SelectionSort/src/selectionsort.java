//Pallega,Diofel S.
//CSC 124 cs.1
import java.util.Random;


public class selectionsort {
  

	public  void selection(int[] ar){
 
		int i,j,n, minj,minx; 
		n = ar.length ;
		for(i=0; i < n-1 ; i++)
		{
			minj = i;
			minx = ar[i];
	
	for(j = i+1; j < n ; j++){
		if(ar[j] < minx){
			minj = j;
			minx = ar[j];
			ar[minj] = ar[i];
			ar[i] = minx;
		}
	}
	
	 
   } 
  }


public static void main (String[] args) {
	 
		selectionsort test = new selectionsort();
		Random ran = new Random();
		int size = 10;
		int test1[] = new int [size];
		
		System.out.println("PALLEGA, DIOFEL S. ");
		System.out.println("SELECTION SORT PROCESS\n");
		
		
		System.out.println("Random:"); 
		for(int i = 0; i < size; i++) {
			test1[i] = ran.nextInt(100);
			System.out.print(" " +test1[i]);
		}
		
		long start1 = System.currentTimeMillis();
		test.selection(test1);
		long end1 = System.currentTimeMillis();
		long total1 = end1 - start1;

		System.out.println("\n\nSorted Random:");
		printelements(test1);
		System.out.println("\nTime: " + total1 + " ms");
		
		long start2 = System.currentTimeMillis();
		test.selection(test1);
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
		test.selection(test1);
		long end3= System.currentTimeMillis();
		long total3 = end3 - start3;
		  
		printelements(test1);
		System.out.println("\nTime: " + total3 + " ms");
		
		
	}
	
	public static void printelements (int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		} 
	}
	      
	}
 
	
	





 
