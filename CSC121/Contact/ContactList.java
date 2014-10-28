
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ContactList {
    
    public Contact[] myContacts;
    public static final int MAX = 100;
    private int numContacts;
    
    public ContactList()
    {
        myContacts = new Contact[MAX];
        numContacts = 0;
    }
    
    public void addContact(String name, String number, String email)
    {
        Contact c = new Contact(name, number, email);
        myContacts[numContacts] = c;
        numContacts++;
    }
    
    public void deleteContact(String name)
    {
        
    }
    
    public void displayContacts()
    {
        int i;
        for(i=0; i < myContacts.length; i++)
        {
            Contact c = myContacts[i];
            System.out.println("Name: " + c.getName());
            System.out.println("Number: " + c.getNumber());
            System.out.println("Email: " + c.getEmail());
            System.out.println("------------------------------------");
        }
    }
    
    
}
