/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 *
 * @author Pallega
 */
public class InfixToPostfix {
    
    public static void main(String[] args) throws FileNotFoundException
    {
    	 
    	System.out.println("OWNED:PALLEGA,DIOFEL S.   ");
    	System.out.println("Project: INFIX TO POSTFIX EVALUATOR");
    	System.out.println("  ");
    	
    	int z = 0;
    	int spaces = 0;
    	LinkedStack st3 = new LinkedStack();
    	int numberOfSpaces = 1;
    	String space = String.format("%"+ numberOfSpaces +"s", " ");
        LinkedStack st = new LinkedStack();
        LinkedStack st2 = new LinkedStack();
        String outputString = "";
        Scanner sc = new Scanner(System.in); 

       	System.out.println("PLEASE INPUT YOUR INFIX EXPRESSION");

       while(sc.hasNext())
        { 

             String expression = sc.nextLine();
			  
			
             
			  boolean fI = false;
		      System.out.println("ITS POSTFIX EXPRESSION IS:");
			  
		      
		      
		      
			      for(int i = 0;i < expression.length()  ;	i++){
                  char token = expression.charAt(i)  ;
 
                  if(token == ')' ){ 
                	 
                   for(int a = st.numElements; a >= 1 ; a--)
                   {
                	   if(isLP((char) st.top())){
                	st.pop();
                	st3.pop();
                	   
                     break;
                
                	   }else
                		   {
                		   outputString += st3.pop() ;
                           outputString += space;
                           spaces ++;
                		   System.out.print( st.pop() + space);
                			   
                		   }
                		  
                	   }
                	    
                   }
             
                  
                  
               /*     =====================================================  */   
                    if(token == '('){
                	 
                	  st.push(token);
                	  st3.push(token);
                  }
                  
                  else if( !isOperator(token) && (!isWhite(token)) && (token != ')') && (token != '(')  )
                  {
                	  
                	 if(i != (expression.length() -1)){
                		 if( isInteger2( expression.charAt(i+1) )){
                   		  System.out.print(token);
                             outputString += Character.toString(token);
                             spaces ++;
                             
                              
                             if(i == (expression.length()-1)){
                                     while(!st.isEmpty()){
                                   	  
                                    	     outputString += st3.pop();
                                    	     outputString += space;
                                             System.out.print( st.pop() + space);
                                            spaces ++;
                                     }
                             }
                   	  }
                		  
                   	  else{
                   		  
                   	  System.out.print(token + space);
                         outputString += Character.toString(token);
                         outputString += space;
                         spaces ++;
                          
                         if(i == (expression.length()-1)){
                                 while(!st.isEmpty()){
                               	  outputString += st3.pop();
                               	  outputString += space;
                               	  spaces ++;
                                  System.out.print(  st.pop() + space);
                                 }
                                 }
                         
                		 }
                		 
                		 
                	 }
                		 
                	 
                	  
                	  else{
                	  System.out.print( token + space);
                      outputString += Character.toString(token);
                      outputString += space;
                      spaces ++;
                       
                      if(i == (expression.length()-1)){
                              while(!st.isEmpty()){
                            	  outputString += st3.pop();
                            	  outputString += space;
                                      System.out.print( st.pop() + space );
                                      spaces ++;
                                   }
                              }
                      }
                 }
                    //------------------------------------------------------------------------
                  else{
                      if( fI && (token != ')') && (!isWhite(token))){
                    	  
                    	  
                    	  if(st.size() != 0){
                    		  
                    		  if(pMin(token) && pMin((char)st.top())){
                    			  outputString += st3.pop();
                        	      outputString += space;
                        	      spaces ++;
                                  st3.push(token);  
                                  
                                  System.out.print(st.pop() + space);
                                  st.push(token);
                                  
                                  if(i == (expression.length()-1)){
                                          while(!st.isEmpty()){
                                                  outputString += st3.pop();
                                                  outputString += space;
                                                  System.out.print(st.pop()+ space);
                                                  spaces ++;
                                          }
                                         
                                  }  
                                  }
                    		  else if(mDiv(token) && mDiv((char)st.top()) ){
                            	  
                            	      outputString += st3.pop();
                            	      outputString += space;
                            	      spaces ++;
                                      st3.push(token);  
                                      
                                      System.out.print(st.pop() + space);
                                      st.push(token);
                                      
                                      if(i == (expression.length()-1)){
                                              while(!st.isEmpty()){
                                                      outputString += st3.pop();
                                                      outputString += space;
                                                      System.out.print(st.pop()+ space);
                                                      spaces ++;
                                              }
                                             
                                      }  
                              }else   if(pMin(token) && mDiv((char)st.top())){
                            	  outputString += st3.pop();
                            	  outputString += space;
                            	  spaces ++;
                            	  st3.push(token);
                                  System.out.print(st.pop() + space);
                                  st.push(token);
                                      if(i == (expression.length()-1)){
                                              while(!st.isEmpty()){
                                                      outputString += st3.pop();
                                                      outputString += space;
                                                      System.out.print(st.pop()+ space);
                                                      spaces ++;
                                              }
                                              
                                      } 
                              }   
                              else if(mDiv(token) && pMin((char)st.top())){
                            	  
                                      st.push(token);
                                      st3.push(token);
                                    
                                      if(i == (expression.length()-1)){
                                              while(!st.isEmpty()){
                                                      outputString += st3.pop();
                                                      outputString += space;
                                                      System.out.print(st.pop() + space);
                                                      spaces ++;
                                              }
                                             
                                      }  
                              }
                              
                              else if(i == (expression.length()-1)){
                                      while(!st.isEmpty()){
                                              outputString += st3.pop();
                                              outputString += space;
                                              System.out.print( st.pop() + space);
                                              spaces ++;
                                      }
                    	           }
                              
                              else if(isOperator(token) && (token != ')')){
          
                            	  st.push(token);
                            	  st3.push(token);
                              }
                    	 

                    	  
                    		    
                    		
                        }
                       
                          else {//if size() == 0
                		  if(  isOperator(token) && (token != ')')){ 
                			  st.push(token);
                			  st3.push(token);
                			 
                		  } else{  
                    	      st.push(token);
                    	      st3.push(token);
                			  }
                         if(i == (expression.length()-1) && (token != ')')){
                                      while(!st.isEmpty()){
                                    	  
                                              outputString += st3.pop();
                                              outputString += space;
                                              System.out.print(st.pop() + space);
                                              spaces ++;
                                      }
                                    }  
                                }
                    	       }
                    	 
                             
                           }
                    
                  fI = true;
                 
			      } 
			      
			

					      
					      if(st.size() != 0){
					    	  
					      for(int a = 0 ; a <= st.size() ; a++)
					      {
					    	  if(isLP((char) st.top()) )
					    	  {
					    		  
					    		  st.pop();
					    		  
					    	  }
					    	  if(isLP((char) st3.top()))
					    	  {
					    		  st3.pop();
					    	  }
					    	  else{
					    	  outputString += st3.pop();
					    	  outputString += space;
					    	  System.out.print(st.pop() + space);
					    	  spaces ++;
					    	  }
					      }
					     
					      }
		 
		                 
		    
			      

			         
			         int temp = 0;
			          for(int n = 0; n < (outputString.length()-spaces ) ; n++){ 
			        	String[] con = outputString.split(" ");
			              if(isInteger(con[n]) == true){
			            	   
			                  st2.push(Integer.parseInt(con[n]));
			              }
			              else if(isOperator1(con[n]) == true){

						         int temp1 = (int) st2.pop();
			                     Integer i = (Integer) st2.pop();
			                
			                  if(con[n].equals("+")){
			                	  temp = i + temp1;
			                      st2.push(temp);
			                  } else if(con[n].equals("-")){
			                      temp = i - temp1;
			                      st2.push(temp);
			                  } else if(con[n].equals("*")){
			                      temp = i * temp1;
			                      st2.push(temp);
			                  } else if(con[n].equals("/")){
			                      temp = i / temp;
			                      st2.push(temp);
			                  }       
			                  
			                  if(st2.size() == 0){
			                      st2.push(i);
			                  }
			              }
			              
			              else{
			            	  
			                  System.out.println("Please enter a valid postfix expression.");
			                  break;
			              }
			          }
			          System.out.println("  ");
			          System.out.println("And it's equivalent to " + "[" +temp+"]");
			          System.out.println(" ");
			          System.out.println("YOU CAN STILL INPUT YOUR INFIX EXPRESSION:");
			          outputString = "";
			          spaces = 0;
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
                      return true;
              case (')'):
            	      return true;
              
              default:
                      return false;
      }
}  
  
   
  
  public static boolean check(char op){
      switch(op){
              case ('('):  
                      return true;
             
              case (')'): 
            	      return true;
           
            	    	
              default:
                      return false;
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
  
  public static boolean isWhite(char op){
    
      
      if (Character.isWhitespace(op)) {
	      return true;
	    }else{
	      return false;
	    }
      }
	
	  

  private static boolean isInteger(String in){
      try{
          int x = Integer.parseInt(in);
          return true;
      }

      catch(NumberFormatException error){
          return false;
      }
  }
  
  private static boolean isInteger2(char in){
      try{
    	  String temp = Character.toString(in);
          int x = Integer.parseInt(temp);
          return true;
      }

      catch(NumberFormatException error){
          return false;
      }
  }

private static boolean isOperator1(String in){
        String[] op = {"+", "-", "*", "/"};
        for (int i = 0; i < op.length; i++){
            if(in.equals(op[i])){;
                return true;
            }
        }
        return false;
    }


  
}
  
