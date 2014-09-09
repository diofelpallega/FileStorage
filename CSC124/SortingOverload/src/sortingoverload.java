  
//DIOFEL S. PALLEGA
//CSC124
//MidTerm Lab Exam
 
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
 
 
public class sortingoverload{
	 

public static void main(String[] args) throws FileNotFoundException {


		int size = 17835;
		int test1[] = new int [size];
		int test2[] = new int [size];
		int test3[] = new int [size];
		int test4[] = new int [size];
		int test5[] = new int [size];

		insertionsort insert = new insertionsort();
		selectionsort select  = new selectionsort();
		mergesort merge = new mergesort();
		heapsort heap = new heapsort();
		radixsort radix = new radixsort();



		Scanner textfile = new Scanner(new File("C:/Users/xdionie/Desktop/codes/SortingOverload/src/numbers20k.txt")); 
		Scanner textfile1 = new Scanner(new File("C:/Users/xdionie/Desktop/codes/SortingOverload/src/numbers20k1.txt")); 
		Scanner textfile2 = new Scanner(new File("C:/Users/xdionie/Desktop/codes/SortingOverload/src/numbers20k2.txt"));  
		Scanner textfile3 = new Scanner(new File("C:/Users/xdionie/Desktop/codes/SortingOverload/src/numbers20k3.txt"));
		Scanner textfile4 = new Scanner(new File("C:/Users/xdionie/Desktop/codes/SortingOverload/src/numbers20k4.txt")); 
		
		filereader(textfile,test1);
		filereader(textfile1,test2);
		filereader(textfile2,test3);
		filereader(textfile3,test4);
		filereader(textfile4,test5);
		
		//System.out.println("Random:"); 
		//for(int i = 0; i < size; i++) {
		//	test1[i] = ran.nextInt(100);
		//	System.out.print(" " +test1[i]);
		//}




		
		
		long insertstart1 = System.currentTimeMillis();
		insert.insertion(test1);
		long insertend1 = System.currentTimeMillis();
		long inserttotal1 = insertend1 - insertstart1;


		long selectstart1 = System.currentTimeMillis();
		select.selection(test2);
		long selectend1 = System.currentTimeMillis();
		long selecttotal1 = selectend1 - selectstart1;
		

		long mergestart1 = System.currentTimeMillis();
		merge.MergeSort(test3,0, size-1);
		long mergeend1 = System.currentTimeMillis();
		long mergetotal1 = mergeend1 - mergestart1;

		long heapstart1 = System.currentTimeMillis();
		heap.heapsorter(test4);
		long heapend1 = System.currentTimeMillis();
		long heaptotal1 = heapend1 - heapstart1;
		

		long radixstart1 = System.currentTimeMillis();
		radix.radixsorter(test5);
		long radixend1 = System.currentTimeMillis();
		long radixtotal1 = radixend1 - radixstart1;
		
		
		long insertstart2 = System.currentTimeMillis();
		insert.insertion(test1);
		long insertend2 = System.currentTimeMillis();
		long inserttotal2 = insertend2 - insertstart2;
		
		long selectstart2 = System.currentTimeMillis();
		select.selection(test2);
		long selectend2 = System.currentTimeMillis();
		long selecttotal2 = selectend2 - selectstart2;
		
		long mergestart2 = System.currentTimeMillis();
		merge.MergeSort(test3,0,size-1);
		long mergeend2 = System.currentTimeMillis();
		long mergetotal2 = mergeend2 - mergestart2;
		
		long heapstart2 = System.currentTimeMillis();
		heap.heapsorter(test4);
		long heapend2 = System.currentTimeMillis();
		long heaptotal2 = heapend2 - heapstart2;
		
		long radixstart2 = System.currentTimeMillis();
		radix.radixsorter(test5);
		long radixend2 = System.currentTimeMillis();
		long radixtotal2 = radixend2 - radixstart2;

		
		int b[] = new int [size];
		int j = 0;

		
	
		
		for(int i = test1.length-1; i >= 0; i--)
		{
			b[j] = test1[i];
			//System.out.print(" "+ b[j]);
			j++;
			
		}
		
		long insertstart3 = System.currentTimeMillis();
		insert.insertion(b);
		long insertend3 = System.currentTimeMillis();
		long inserttotal3 = insertend3 - insertstart3; 
		j =0;
		
		for(int i = test2.length-1; i >= 0; i--)
		{
			b[j] = test2[i];
			//System.out.print(" "+ b[j]);
			j++;
			
		}
		
		long selectstart3 = System.currentTimeMillis();
		select.selection(b);
		long selectend3 = System.currentTimeMillis();
		long selecttotal3 = selectend3 - selectstart3;
		
		j =0;
		for(int i = test3.length-1; i >= 0; i--)
		{
			b[j] = test3[i];
			//System.out.print(" "+ b[j]);
			j++;
			
		}
		
		long mergestart3 = System.currentTimeMillis();
		merge.MergeSort(b,0,size-1);
		long mergeend3 = System.currentTimeMillis();
		long mergetotal3 = mergeend3 - mergestart3;
		
		j =0;
		
		for(int i = test4.length-1; i >= 0; i--)
		{
			b[j] = test1[i];
			//System.out.print(" "+ b[j]);
			j++;
			
		}
		
		long heapstart3 = System.currentTimeMillis();
		heap.heapsorter(b);
		long heapend3 = System.currentTimeMillis();
		long heaptotal3 = heapend3 - heapstart3; 
		
		j =0;
		
		for(int i = test5.length-1; i >= 0; i--)
		{
			b[j] = test1[i];
			//System.out.print(" "+ b[j]);
			j++;
			
		}

		long radixstart3 = System.currentTimeMillis();
		radix.radixsorter(b);
		long radixend3 = System.currentTimeMillis();
		long radixtotal3 = radixend3 - radixstart3;
 
	 

		System.out.print("\n\n\tSorting numbers from file:\n");
	 
		
		System.out.println("\nInsertion Sort   : "+ inserttotal1 + " ms");
		System.out.println("Selection Sort   : "+ selecttotal1 + " ms");
		System.out.println("Merge Sort       : "+ mergetotal1 + " ms");
		System.out.println("Heap Sort        : "+ heaptotal1 + " ms");
		System.out.println("Radix Sort       : "+ radixtotal1 + " ms\n");
		 
		System.out.println("\tSorted Ascending  :");
		 
		System.out.println("\nInsertion Sort : "+ inserttotal2 + " ms");
		System.out.println("Selection Sort : "+ selecttotal2 + " ms");
		System.out.println("Merge Sort     : "+ mergetotal2 +  " ms");
		System.out.println("Heap Sort      : "+ heaptotal2 +   " ms");
		System.out.println("Radix Sort     : "+ radixtotal2 +  " ms\n");
		
		
		
		
		System.out.println("");
		System.out.print("\tSorted Descending :\n");
		
		System.out.println("\nInsertion Sort : "+ inserttotal3 + " ms");
		System.out.println("Selection Sort : "+ selecttotal3 + " ms");
		System.out.println("Merge Sort     : "+ mergetotal3 +  " ms");
		System.out.println("Heap Sort      : "+ heaptotal3 +   " ms");
		System.out.println("Radix Sort     : "+ radixtotal3 +  " ms");
		

}

public static void filereader(Scanner textfile, int[] array)     
{          
   
    for(int i = 0; i< array.length; i++)
    {

        int nextInt = textfile.nextInt(); 
    	array[i] = nextInt;
    	
    	
    }
    
   // System.out.println("numbers From txt.file:");
   // printelements(array);
   // System.out.println();
   
  }	 
   


public static void printelements (int[] array) 
{
	for(int i = 0; i < array.length; i++) 
		{
			System.out.print(" " + array[i]);
		} 
}

  


}


 