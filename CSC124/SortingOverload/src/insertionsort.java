//DIOFEL S. PALLEGA
//CSC124

public class insertionsort 
{
 
	public	void insertion(int[] ar)
	{
	 
		 
		for(int j=1; j < ar.length ; j++)
		{
		
			int key = ar[j] ;
			int i = j -1 ;
		
			while ( i >= 0 && ar[i] > key)
			{
				ar[i + 1] = ar[i];
				i = i-1;
		
			} 
			
		ar[ i + 1] = key ;  
	  
	    } 
		
	 }
	
}