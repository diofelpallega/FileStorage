	//Pallega , Diofel S.
	//CSC 121 
	//SORTING
public class Sort { 
	long timehelper=0;
	public void bubbleSort ( int ar [] ){ 
        //time = 1395769
		System.out.println("This is the sorted array for Bubble Sort");
        Long time = System.nanoTime(); 
      for (int i = (ar.length-1);i >= 0; i--){
        
    	  for (int j = 1; j<= i; j++) 
      
          if(ar[ j-1] > ar[j]){
               int temp = ar[j-1];
               ar[j-1]= ar[j];
               ar[j] = temp;
          }
          long time2 = System.nanoTime();
    		for(int x = 0; x < ar.length;  x++ ){
    	        System.out.print(ar[x]+" ");
    	    }
    		time2 = System.nanoTime() - time2;
    		timehelper = timehelper + time2; 
    		System.out.println("");
      }
      System.out.print(" ===> " );
      for(int x = 0; x < ar.length;  x++ ){
           System.out.print(ar[x]+" ");
       }
     System.out.println();
     System.out.println();
     time = System.nanoTime()- time - timehelper;
     System.out.println("Total time in nanoseconds of Execution : " + time );
     System.out.println();
     timehelper = 0;         
     }
	
	
	void  selectionSort(int ar[])
	{//time= 1133128
		System.out.println("This is the sorted array for Selection Sort");
		Long time = System.nanoTime();
	        
	int i ;
	for(i = 0 ; i < ar.length -1; i++)
	{
	int min = i ;
	for (int j = i+1; j < ar.length ; j++)
	if(ar[j] < ar[ min ] )
	min = j ;
	int temp = ar[ i ] ;
	ar [ i ] = ar[ min ] ;
	ar[min] = temp ;
	long time5 = System.nanoTime();
	for(int x = 0; x < ar.length;  x++ ){
        System.out.print(ar[x]+" ");
    }
	time5 = System.nanoTime() - time5;
	timehelper = timehelper + time5;
	System.out.println("");
	}
    System.out.print(" ===> " );
    for(int x = 0; x < ar.length; x++ ){
        System.out.print( ar[x]+ " ");
    }
	   System.out.println();
	     System.out.println();
	     time = System.nanoTime()- time - timehelper;
	     System.out.println("Total time in nanoseconds of Execution : " + time  );
	     System.out.println();
	     timehelper = 0;
	}

	//
	void   insertionSort(int ar[] )
	{	// time = 1107472
		System.out.println("This is the sorted array for Insertion Sort");
		Long time = System.nanoTime();
	for(int i=1; i < ar.length ; i++)
	{
	
	int index = ar[i] ;
	int j = i ;
	while ( j > 0 && ar[j-1] > index)
	{
	ar[j ] = ar[j-1];
	j--;
	
	} 
	ar[ j ] = index ;  
	long time4 = System.nanoTime();
	for(int x = 0; x < ar.length;  x++ ){
        System.out.print(ar[x]+" ");
    }
	time4 = System.nanoTime() - time4;
	timehelper = timehelper + time4;
	
	System.out.println("");
	}
    System.out.print(" ===> " );
    for(int x = 0; x < ar.length;  x++ ){
        System.out.print(ar[x]+" ");
    }
  System.out.println();
  System.out.println();
  time = System.nanoTime()- time - timehelper;
  System.out.println("Total time in nanoseconds of Execution : " + time );
  System.out.println();
  timehelper = 0;       

	
	}

}
