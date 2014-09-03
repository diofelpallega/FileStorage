  

 
                // AUTHOR : DIOFEL S. PALLEGA  //
                       // CSC 121  //
                  // BINARY SEARCH TREE //
 
  public class BSTtester {
	  /**
	     * @param args the command line arguments
	     */
  public static void main(String[ ] args) throws Exception {
  BinarySearchTree<Integer> test = new BinarySearchTree<Integer>();  
              test.isEmpty();
			  test.insert(31);
	          test.printPreOrder(test.root); 
	          test.printTable();
			  test.insert(19);
	          test.printPreOrder(test.root); 
	          test.printTable();
			  test.insert(15);
	          test.printPreOrder(test.root); 
	          test.printTable();
			  test.insert(21);
	          test.printPreOrder(test.root); 
	          test.printTable();
			  test.insert(61);
	          test.printPreOrder(test.root); 
	          test.printTable();
			  test.insert(91);
	          test.printPreOrder(test.root); 
	          test.printTable();
			  test.insert(51);
	          test.printPreOrder(test.root); 
	          test.printTable();
			  test.insert(41);
	          test.printPreOrder(test.root); 
	          test.printTable();

	       
	          System.out.println(" Removing ");
	          test.remove(31);
	          test.printTable();
	          test.remove(41);
	          test.printTable();
	          test.remove(51);
	          test.printTable();
	          test.remove(19);
	          test.printTable();
	          test.remove(61);
	          test.printTable();
	          test.remove(21);
	          test.printTable();
	          test.remove(15);
	          test.printTable();
              test.remove(91);
              test.printTable();
              test.isEmpty();
	          
	         
}

	 
 }