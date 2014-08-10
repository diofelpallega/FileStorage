//Pallega,Diofel S.
//CSC 124 cs.1
import java.util.Random;


public class MergeSort {

	public void Merge(int[] A, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] L = new int[n1]; 
		int[] R = new int[n2]; 
		
		for(int i=0;i<n1;i++) {
			L[i] = A[p+i];
		}
		for(int j=0;j<n2;j++) {
			R[j] = A[q+j+1];
		}
		  
       int i = 0;
       int j = 0;
      
       for(int k = p; k <= r; k++){

    	   if(i >= L.length && j < R.length) {
    		   A[k] = R[j];
    		   j++;
    	   	}
    	   else if(j >= R.length && i < L.length) {
    		   A[k] = L[i];
    		   i++;
    	   }
    	   else if(L[i] <= R[j]) {
    		   A[k] = L[i];
    		   i++;
				} 
    	   else {
    		   A[k] = R[j];
    		   j++;
    	   	}
		
		}
	}
	
	
	
	public void MergeSort(int[] A, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			MergeSort(A, p, q);
			MergeSort(A, q+1, r);
			Merge(A, p, q, r);
		}
		
	}


public static void main (String[] args) {
	
	
		MergeSort test = new MergeSort();
		Random ran = new Random();
		int size = 10;
		int test1[] = new int [size];
		
                System.out.println("PALLEGA,DIOFEL S.");
		System.out.println("Merge Sort Process\n");
		
		
		System.out.println("Random:"); 
		for(int i = 0; i < size; i++) {
			test1[i] = ran.nextInt(100);
			System.out.print(" " +test1[i]);
		}
		
		long start1 = System.currentTimeMillis();
		test.MergeSort(test1, 0, size-1);
		long end1 = System.currentTimeMillis();
		long total1 = end1 - start1;

		System.out.println("\n\nSorted Random:");
		printelements(test1);
		System.out.println("\nTime: " + total1 + " ms");
		
		long start2 = System.currentTimeMillis();
		test.MergeSort(test1, 0, size-1);
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
		test.MergeSort(test1, 0, size-1);
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
