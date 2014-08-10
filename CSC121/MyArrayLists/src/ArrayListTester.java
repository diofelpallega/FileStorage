/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ArrayListTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	 MyArrayList mal = new MyArrayList();
        mal.add("coke");
        mal.add("cream");
        mal.add("sundae");
        mal.add("cookies");
         System.out.println();
        printList(mal);
        mal.remove("coke");
        printList(mal);
        mal.add(0, "coke");
        printList(mal);
        mal.set(2, "twirl");
        mal.remove("cookies");
        printList(mal);
        mal.add("sundae");
        mal.add("cookies");
        mal.add("overload");
        mal.add("smoooothie");
        printList(mal);
        printList(mal.subList(3, 5)); 
    }

    private static void printList(MyArrayList lst){
        System.out.println("------------------");
        System.out.println(lst.size());
        for(int i=0; i < lst.size(); i++){
            System.out.println(lst.get(i));
        }
    }
}
