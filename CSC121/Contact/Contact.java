/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Contact {
    
    //Each contact stores the name, phone number, and email address
    private String name;
    private String number;
    private String email;
    
    /**
     * Constructor for objects of class Contact
     * 
     * @param name    name of Contact 
     * @param number  phone number of contact
     * @param email   email address of contact
     */
    public Contact(String name, String number, String email)
    {
        this.name = name;
        this.number = number;
        this.email = email;
    }
    
    /**
     * Get the name of the contact
     * 
     * @return  name of the contact
     * 
     */    
    public String getName()
    {
        return name;
    }
    
    /**
     * Get the number of the contact
     * 
     * @return  number of the contact
     * 
     */ 
    public String getNumber()
    {
        return number;
    }
    
    /**
     * Get the email of the contact
     * 
     * @return  email of the contact
     * 
     */ 
    public String getEmail()
    {
        return email;
    }
    
    
    /**
     * Set the name of the contact
     * 
     * @param  name of the contact
     * 
     */ 
    public void setName(String name)
    {
        this.name = name;
    }
    
     /**
     * Set the number of the contact
     * 
     * @param  number of the contact
     * 
     */ 
    public void setNumber(String number)
    {
        this.number = number;
    }
    
     /**
     * Set the email of the contact
     * 
     * @param  email of the contact
     * 
     */ 
    public void setEmail(String email)
    {
        this.email = email;
    }
    
}
