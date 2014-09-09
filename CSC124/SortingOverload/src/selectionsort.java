
//DIOFEL S. PALLEGA
//CSC124

public class selectionsort 
{
  

	public  void selection(int[] ar)
	{
 
		int i,j,n, minj,minx; 
		n = ar.length ;
		for(i=0; i < n-1 ; i++)
		{
			minj = i;
			minx = ar[i];
	
			for(j = i+1; j < n ; j++)
			{ 
				if(ar[j] < minx)
				{
					
					minj = j;
					minx = ar[j];
					ar[minj] = ar[i];
					ar[i] = minx;
			    
				}  
			} 
		} 
   } 
}