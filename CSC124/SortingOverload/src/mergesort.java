//DIOFEL S. PALLEGA
//CSC124

public class mergesort 
{

	public void Merge(int[] A, int p, int q, int r) 
	{
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] L = new int[n1]; 
		int[] R = new int[n2]; 
		
		for(int i=0;i<n1;i++) 
		{
			L[i] = A[p+i];
		}
		
		for(int j=0;j<n2;j++) 
		{
			R[j] = A[q+j+1];
		}
		  
       int i = 0;
       int j = 0;
      
       for(int k = p; k <= r; k++)
       {

    	   if(i >= L.length && j < R.length)
    	    {
    		   A[k] = R[j];
    		   j++;
    	   	}
    	   
    	   else if(j >= R.length && i < L.length) 
    	   {
    		   A[k] = L[i];
    		   i++;
    	   }
    	   
    	   else if(L[i] <= R[j]) 
    	   		{
    		   		A[k] = L[i];
    		   		i++;
				} 
    	   
    	   else 
    	   {
    		   A[k] = R[j];
    		   j++;
    	   	}
		
		}
	}
	
	
	
	public void MergeSort(int[] A, int p, int r) 
	{
		if (p < r) 
		{
			int q = (p + r) / 2;
			MergeSort(A, p, q);
			MergeSort(A, q+1, r);
			Merge(A, p, q, r);
		}
		
	}
}