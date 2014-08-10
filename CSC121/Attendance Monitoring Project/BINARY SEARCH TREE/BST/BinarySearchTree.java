 
                    
/**
 *
 * @author Diofel Pallega
 * @param <E>
 */ 
                // AUTHOR : DIOFEL S. PALLEGA  //
public class BinarySearchTree <E extends Comparable<? super E>> {
    public BinaryNode<E> root;
    
    public BinarySearchTree(){
    root = null;
    }
    public BinarySearchTree(E rootItem){
    root = new BinaryNode<E>(rootItem, null, null);
    }
    
    
     private BinaryNode<E> find(E x, BinaryNode<E> t) {
        while(t != null){
            if(x.compareTo(t.element) < 0){
                t = t.left;
            }
            else if(x.compareTo(t.element) > 0){
                t = t.right;
            }
            else
                return t;
        }
        return null;
    }
    
    private E elementAt(BinaryNode<E> t){
        return t == null ? null : t.element;
    }
//------------------------------------------------------- //   
      public E find(E x){
           return elementAt(find(x, root)); 
    }
    
      public BinaryNode<E> findMin(BinaryNode<E> x){
        if (x == null){
        	return x;
        }
        else if(x.left != null){
        	return findMin(x.left); 
        
        }
        return x;
     }
      
  //--------------------------------------------------------------------//
      public BinaryNode<E> removeMin (BinaryNode<E> x){
          x.element = findMin(x.left).element;
          x = (x.right != null) ? x.right : x.left;
          
          return x;
      }
    
 
//PRINTING THE TABLE ---------------------------------------------------------------//
       public void printTable(){
    	   if(root == null){
    		   System.out.println("Cannot Print Table it's <EMPTY>");
    	   }
    	   else{
           System.out.println("\n");
           System.out.println("\t     Node Data\t      L.Child\t      R.Child");
          printTable(root);
    	   }
       }
       
     public void printTable(BinaryNode<E> t){
            if(t.left != null && t.right != null){
                System.out.println("------------------------------------------------------------");
                System.out.println("\t\t"+t.element+"\t\t"+t.left.element+"\t\t"+t.right.element); 
                printTable(t.left);
                printTable(t.right);
            }
            if(t.left != null && t.right == null){
                System.out.println("-----------------------------------------------------------");
                System.out.println("\t\t"+t.element+"\t\t"+t.left.element+"\t\t"+"NULL");
                printTable(t.left);
             }
            if(t.right !=null && t.left == null){
            	System.out.println("------------------------------------------------------------");
            	System.out.println("\t\t"+t.element+"\t\t"+"NULL"+"\t\t"+t.right.element);
            	printTable(t.right);
            }
            if(t.right == null && t.left == null){
            	System.out.println("--------------------------------------------------------------");
            	System.out.println("\t\t"+t.element+"\t\t"+"NULL"+"\t\t"+"NULL");
            	System.out.println(" ");
            }
    
     }
      
    //---------------------------------------------------------------------------------------//
        @SuppressWarnings("hiding")
		public class BinaryNode<E>{  
        private E element;
        private BinaryNode<E> left;
        private BinaryNode<E> right;
        public BinaryNode(E e,
                 BinaryNode<E> lt,
                 BinaryNode<E> rt){
            element = e;
            left = lt;
            right = rt;
           }
       
        }
     

//----------------------------------------------------------
        public void insert(E x) {
            root = insert(x, root);
        }
        
        private BinaryNode<E> insert(E x, BinaryNode<E> t){
            if(t == null){
                t = new  BinaryNode<E>(x, null, null);
                System.out.println(x+" is inserted ");
            }
            else if(x.compareTo(t.element)<0){
                t.left = insert(x, t.left);
            }
            else if(x.compareTo(t.element)>0)
                t.right = insert(x, t.right);
            return t;
        }
      
         public void remove(E x){
            root = remove(x, root);
            System.out.println(" "+x+" is removed");
        }
  //------------------------------------------------------      
   private BinaryNode<E> remove(E x, BinaryNode<E> t){
             if(t == null)
                System.out.print(x);
             else if(x.compareTo(t.element)<0){
                 t.left = remove(x, t.left);
             }else if (x.equals(t.element)) {
                 // if x is t, then remove t while change t with the min of the right child
                        // but if right of t is empty , return t.left
                      if (t.right == null){
                    	  return t.left;
                      }
                      
                 // if t right has a lot of subtrees, record the minimum value of right at helper
                BinaryNode<E> helper =  findMin(t.right);
                 // change the value of t with the smallest leaf(helper) of the right of t
                 t.element =  helper.element ;

                 // and  remove tmp.element then return the value of t with element of helper
                 t.right =  remove(helper.element, t.right) ;
                 return t;
                 
              }
             else if(x.compareTo(t.element)>0){
                 t.right = remove(x, t.right);
             }
             else if ( t.right != null)
             {
             t.element = findMin(t.right).element;
             t.right = removeMin(t.right);
             }
            	 else
             
                 t = (t.left != null) ? t.left : t.right;
             return t;
         }
         
 //------------------------------------------------------------

   public boolean isEmpty(){ 
   System.out.println("");
   System.out.print("IS EMPTY :");
   System.out.printf("%b\n", root==null);
   return root==null;
   }
       
 //TREE TRAVERSAL//

int i=0;
   public void printPreOrder(BinaryNode<E> t){
	  if(i == 0){

			System.out.print("ITS PREORDER:");	
	  }
	   if(root == null){
		   
		   System.out.println("Cannot Print PreOrder <EMPTY ROOT>");
		   
	   }
	   else {   
		  
		   if(t.element!= null ){
         System.out.print(t.element);
         System.out.print(" ");
         i ++ ;
         }
	   
	     if(t.left != null){
             printPreOrder(t.left);
             i++;
	     }
	    if(t.right != null){
             printPreOrder(t.right);
             i++;
	    }
	    i =0;
 
   }
   }


public class BinaryTree{
public BinaryNode<E> root;
public BinaryTree(){
root = null;
}


public BinaryTree(E rootItem){
root = new BinaryNode<E>(rootItem, null, null);
}
public boolean isEmpty(){
return root==null;
}
  
}
 
 

 

}

 