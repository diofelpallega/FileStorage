//Pallega,Diofel S.
//CSC 124 cs.1
import java.util.ArrayList;
import java.util.Random;

 
//Algorithm
   
public class computer {
    int i,n,m,s;
    public	void getrightdominant(int[] ar){

      System.out.println("\n");
   	  System.out.println("The right dominant elements: ");

    	ArrayList<Integer> dominantadder = new ArrayList<Integer>();

  
    
    	 for(i = 0; i< ar.length; i++){
    		 
    		 n = ar[i];
    		   if(i == ar.length -1){
    			   dominantadder.add(n);  
    		   }
    		   for( m = i + 1;m<ar.length;m++){
    			   
    			   if((m!= ar.length) && (n < ar[m]) ){
    				   break;
    			   }
    			  
    			   if(m == ar.length -1){
    				   dominantadder.add(n);  
    			   }
    		   } 
    	 }
    	
//         
//    	 for (int v = 0; v < testa.length; v++) {
//    	 
//	    		  System.out.print(" "+testa[v] + " " );
//    		}
//    	
    	 for (int j=0; j<dominantadder.size(); j++)
    	 {
         
    	 System.out.print( dominantadder.get(j) + " ");
    	 }
         System.out.println();
        
//    	 for (int i=0; i<dominantadder.length; i++)
//    	 {
//    	 value1[i] = value2.get(i);
//    	 System.out.println("value1 [" + i + " ] = " + value1[i]);
//    	 } 
    }   
    

    public static void main(String[] args){
 
         int m = 10;
         int test1[] = new int[m] ;

 		System.out.println("PALLEGA, DIOFEL S. ");
 		System.out.println("Getting Right Dominants PROCESS\n");
         

 		computer test = new computer();
 		Random ran = new Random();
 		int size = 10; 
 		 
 		
 		System.out.println("Random Array:"); 
 		for(int i = 0; i < size; i++) {
 			test1[i] = ran.nextInt(100);
 			System.out.print(" " +test1[i]);
 		}
 		
 		long start1 = System.currentTimeMillis();
 		test.getrightdominant(test1);
 		long end1 = System.currentTimeMillis();
 		long total1 = end1 - start1;

 		System.out.println("\n\n  Random :");
 		printelements(test1);
 		System.out.println("\nTime: " + total1 + " ms");
 		
 		long start5 = System.currentTimeMillis();
 		test.getrightdominant(test1);
 		long end5 = System.currentTimeMillis();
 		long total5 = end5 - start5;

 		System.out.println("\n Ascending:");
 		printelements(test1); 
 		test.getrightdominant(test1);
 		System.out.println("\nTime: " + total5 + " ms");
 		
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
 		
 		   
 		long start3 = System.currentTimeMillis();
 		test.getrightdominant(test1);
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
 
