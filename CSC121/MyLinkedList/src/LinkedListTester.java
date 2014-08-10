/**
 *
 * @author Admin
 */
public class LinkedListTester {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       MyLinkedList mll = new MyLinkedList();
        mll.add("Alonzo");
        mll.add("Jace");
        mll.add("Joaquin");
        mll.add("Altair");
        System.out.println();
        printList(mll);
        mll.remove("Alonzo");
        printList(mll);
        mll.add(0, "Alonzo");
        printList(mll);
        mll.set(2, "Verse");
        mll.remove("Altair");
        printList(mll);
        mll.add("Joaquin");
        mll.add("Altair");
        mll.add("Eithos");
        mll.add("Ezio");
        printList(mll);
        printList(mll.subList(3, 5));
    }

    private static void printList(MyLinkedList lst){
        System.out.println("------------------");
        System.out.println(lst.size());
        for(int i=0; i < lst.size(); i++){
            System.out.println(lst.get(i));
        }
    }
}
