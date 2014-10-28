/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 *
 * @author Admin
 */
public class ContactListDriver {
    
    public static void main(String[] args) throws FileNotFoundException
    {
        ContactList cList = new ContactList();
        File in = new File("MyContacts.txt");
        Scanner sc = new Scanner(in);
        int option;
        char again = 'n';
        
        while(sc.hasNext())
        {
            //read one line from text file
            String entry = sc.nextLine();
			//System.out.println(entry);
            String[] con = entry.split("\\s+");
			//System.out.println(con[0] + " " + con[1] + " " + con[2]);
            cList.addContact(con[0], con[1], con[2]);
        }
        
        Scanner userIn = new Scanner(System.in);
        do{
            displayOptions();            
            option = userIn.nextInt();
            
            switch(option)
            {
                case 1:
                    //add contact
                    String name = null;
                    String number = null;
                    String email = null;
                    System.out.println(" Name > ");
                    name = userIn.next();
                    
                    System.out.println(" Number > ");
                    number = userIn.next();
                    
                    System.out.println(" Email Address > ");
                    email = userIn.next();
                    
                    cList.addContact(name, number, email);
                    
                case 2:
                    //delete contact
                    System.out.println("Contact Name > ");
                    name = userIn.next();
                    
                    cList.deleteContact(name);
                    
                    
                case 3:
                    //display contact
                    cList.displayContacts();
                case 4: 
                	 PrintWriter out = new PrintWriter(" End");
                	 int a = 0 ;
                	 for(a = 0; a < cList.myContacts.length;a++)
                	 { out.println(cList.myContacts[a]);
                	 out.println( cList.myContacts[a].getName() +' '+cList.myContacts[a].getNumber()+' '+cList.myContacts[a].getEmail());
                	 }
            }
                        
            //Ask user if he wants to exit
        }while(option != 4); 
      
    }

    private static void displayOptions() {
        System.out.println("(1) Add");
        System.out.println("(2) Delete");
        System.out.println("(3) Show Contacts");
        System.out.println("(4) Exit");
    }
    
   
    
}
