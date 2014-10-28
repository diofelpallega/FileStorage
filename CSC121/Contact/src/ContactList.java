
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
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

        
    	int i;
    	int o;
    	 for(i=0; i < numContacts; i++)
         {
            
    		 if (name.equals(myContacts[i].getName()))
    		 {
    			 for(o = i;i < numContacts;i++)
    			 {
    			   myContacts[o] = myContacts[o+1];
    				 
    			 }
    			 
    		 }
    		 numContacts--;
         }
    	
    	
    }
    
    public void displayContacts()
    {
        int i;
        for(i=0; i < numContacts; i++)
        {
            Contact c = myContacts[i];
            System.out.println("Name: " + c.getName());
            System.out.println("Number: " + c.getNumber());
            System.out.println("Email: " + c.getEmail());
            System.out.println("------------------------------------");
        }
    }
    
    
}
