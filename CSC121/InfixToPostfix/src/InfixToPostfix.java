/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 *
 * @author Admin
 */
public class InfixToPostfix {
    
    public static void main(String[] args) throws FileNotFoundException
    {
        LinkedStack st = new LinkedStack();
        Scanner sc = new Scanner(System.in); 
 
        while(sc.hasNext())
        { 
            //read one line from text file
             String expression = sc.nextLine();
			  
			
             String outputString = "";
			  boolean fI = false;
			  
			  
			      for(int i = 0;i < expression.length() ;	i++){
                  char token = expression.charAt(i);
               
                  
                  if(token == ')' ){ 
                   for(int a = st.numElements; a >= 1 ; a--)
                   {
                	  
                	 
                	   if(isLP((char) st.top())){
                	        
                		   if(st.size() != 1)
                		   {
                			   System.out.println(st.pop());
                  		        
                  		  
                		   }
                		   else {
                		    
                		     System.out.println("Done");
                		   }
                	   }
                	    
                   }
             
                	  
                  }
                  
                  
               /*     =====================================================  */   
                    if(token == '('){
                	 
                	  st.push(token);
                  }
                   
                   if(!isOperator(token) ){
                	 
                	  System.out.print(token);
                      outputString += Character.toString(token);
                       
                      if(i == (expression.length()-1)){
                              while(!st.isEmpty()){
                                      outputString += st.pop();
                                     
                                      
                                  
                              }
                      }
                                       }
                  else{
                      if(fI){
                    	  
                    	if(mDiv(token) && pLow((char)st.top())){
                    		 
                    		 st.push(token);
               	    	  if(i == (expression.length() - 1)){
               	    		  while(!st.isEmpty()){
               	    			  outputString += st.pop();
               	    			   
               	    		  }
               	    		 
               	    	  }
                    	 
                    	  
                      } else if(pMin(token) && pLow((char)st.top())){
                    	 
                    	    	  
                    	    	  st.push(token);
                    	    	  if(i == (expression.length() - 1)){
                    	    		  while(!st.isEmpty()){
                    	    			  outputString += st.pop();
                    	    		  }
                    	    	  }
                    	    	   
                    	      }
                  else if(pMin(token) && pMin((char)st.top())){
                	 
                                      outputString += st.pop();
                                      st.push(token);
                                      if(i == (expression.length()-1)){
                                              while(!st.isEmpty()){
                                                      outputString += st.pop();
                                              }
                                              
                                      }  
                              }else if(mDiv(token) && mDiv((char)st.top())){
                                      outputString += st.pop();
                                      st.push(token);
                                      if(i == (expression.length()-1)){
                                              while(!st.isEmpty()){
                                                      outputString += st.pop();
                                              }
                                             
                                      }  
                              }else if(pMin(token) && mDiv((char)st.top())){
                                      outputString += st.pop();
                                      st.push(token);
                                      if(i == (expression.length()-1)){
                                              while(!st.isEmpty()){
                                                      outputString += st.pop();
                                              }
                                              
                                      } 
                              }else if(mDiv(token) && pMin((char)st.top())){
                                      st.push(token);
                                      if(i == (expression.length()-1)){
                                              while(!st.isEmpty()){
                                                      outputString += st.pop();
                                              }
                                             
                                      }  
                              }else{
                            	      st.push(token);
                                      outputString += Character.toString(token);
                                      if(i == (expression.length()-1)){
                                              while(!st.isEmpty()){
                                                      outputString += st.pop();
                                              }
                                      }
                                       
                              }
                      }
                              
                     
              }
                  fI = true;
                  System.out.println(outputString);
      }
    
}
        }         

    
    
    public static boolean isOperator(char op){
        switch(op){
        
                case '+':
                        return true;
                        
                case '-':
                        return true;
                case '/':
                        return true;
                case '*':
                        return true;
                case '^':
                        return true;
                case ')':
                	    return true;
                default:
                        return false;
        }
}

 
  
  
  public static boolean isLP(char op){
      switch(op){
              case ('('):
                      return false;
              
              default:
                      return true;
      }
}  
  
  
  
  public static boolean pLow(char op){
      switch(op){
              case ('('):
                      return true;
              
              default:
                      return false;
      }
}  
  

  public static boolean pMin(char op){
          switch(op){
                  case '+':
                          return true;
                  case '-':
                          return true;
                  default:
                          return false;
          }
  }

  public static boolean mDiv(char op){
          switch(op){
                  case '*':
                          return true;
                  case '/':
                          return true;
                  default:
                          return false;
        }
        
      
         
    
   
    }
}