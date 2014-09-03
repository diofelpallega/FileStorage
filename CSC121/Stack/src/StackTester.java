 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author PALLEGA, DIOFEL S.
 */
public class StackTester {
    public static void main(String[] args)
    {
        ArrayStack as = new ArrayStack(100);
        System.out.println("Array Stack \n========================== ");
        as.push("Rene");
        as.push("Daniel");
        as.push("Lizzy");
        as.push("Novo");
        System.out.println(as.pop());
        System.out.println(as.pop());
        as.push("Cy");
        as.push("Darlene");
        System.out.println(as.pop());
        System.out.println(as.pop());
        
        
        
        LinkedStack ls = new LinkedStack();
        System.out.println("\n\nLinked Stack \n========================== ");
        ls.push("Rene");
        ls.push("Daniel");
        ls.push("Lizzy");
        ls.push("Novo");
        System.out.println(ls.pop());
        System.out.println(ls.pop());
        System.out.println(ls.pop());
        ls.push("Cy");
        ls.push("Darlene");
        System.out.println(ls.pop());
        System.out.println(ls.pop());
        System.out.println(ls.pop());
    }
}