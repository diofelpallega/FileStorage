// PALLEGA , DIOFEL S.
public class driver{

	 public static void main(String[] args){
     
	 Sort d = new Sort();
	 int test1[] = {31,91,41,71,11,81,51,21,61,1};
	 int test2[] = {31,91,41,71,11,81,51,21,61,1};
	 int test3[] = {31,91,41,71,11,81,51,21,61,1};
//	 for(int i = 0 ; i > test.length; i++){
//		 System.out.print(test[i]);	 
//	 }
	 
	 System.out.println("Driver's sample list of numbers to be sorted");
	 System.out.println(test1[0] +" "+ " "+test1[1] +" "+ test1[2] +" "+ test1[3] + 
			            " "+test1[4] +" "+ test1[5] +" "+ test1[6] +" "+ test1[7]
			            +" "+ test1[8] +" "+ test1[9]);
     System.out.println("");
     d.bubbleSort(test1); 
	 d.insertionSort(test2);
	 d.selectionSort(test3);
	 }

	
}
