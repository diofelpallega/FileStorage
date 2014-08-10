 
 // PALLEGA DIOFEL S.
// ATTENDANCE MONITORING PROJECT
import java.io.*;  
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner; 
 
public class Attendance { 
	
     static MyLinkedList mll = new MyLinkedList(); 
	  


	 private static Scanner students; 
	 private static Scanner scDates;
     private static Scanner scanStudents;
     private static Scanner Do;    
     private static Scanner check;
	private static Scanner Do1; 
	private static Scanner name;
    static BufferedReader inputStream3 = null;
	public static  void main(String[] args) throws IOException {
		
		File file2 = new File("Attendance Monitoring Project/src/readersy.txt");
		File file = new File("Attendance Monitoring Project/src/readerx.txt");
		 
		
	 
		 ArrayList<String> studentslate = new ArrayList<String>();  
         ArrayList<String> studentsabsent = new ArrayList<String>(); 
		 ArrayList<String> studentsinclass = new ArrayList<String>(); 
	     ArrayList<String> StudentsInClass = new ArrayList<String>();
        BufferedReader inputStream2 = null;
        PrintWriter writer2 = null;
		BufferedReader inputStream = null;
		PrintWriter writer1 =  null;

			try {
				writer2 = new PrintWriter(new FileWriter(file2,true));
				inputStream2 = new BufferedReader(new FileReader("Attendance Monitoring Project/src/readersy.txt"));
				writer1 =   new PrintWriter(new FileWriter(file,true));
				inputStream =   new BufferedReader(new FileReader("Attendance Monitoring Project/src/readerx.txt")); 
		
				
	if(mll.isEmpty()){ 
		String l = inputStream.readLine();
		//System.out.println("mao ni sya ang current l : " + l);
		System.out.println("----");
		
		while(l != null){
			 
	
			  
		 while(true){
			 String ahoy = inputStream2.readLine();
			 if(ahoy == null){
				// System.out.println("null");
				 break;
			 }
			 
			 else if(!ahoy.equals("Divide")){
			 StudentsInClass.add(ahoy);
			 studentsinclass.add(ahoy);
	      //  System.out.println("MUSULOD KO DRE");
			 
		        }
			 if(ahoy.equals("Divide")){
				// System.out.println("samot na dire part 1");
				 break;
			 }
		 }
		  //read the date on the txt file
		 String date  = inputStream.readLine(); 
		 String what = "no";
	 
	     // Getting inputs
	    
	     
	   while(true){
	          
	    	 String student = inputStream.readLine();
	    	  
	    	 if(student == null){
	    		 break;
	    	 }
	    	 if(!student.equals("Divide")){
	    	 studentslate.add(student); 
	    	  // System.out.println("MUSULOD KO DRE part 2");
	    	 }
	    	  what =  student;
	    	  if(what.equals("Divide")){
	    		//  System.out.println("samot na dire part 2");
	    		  break;
	    	  }
	    	 
	    	
	     }
	 
	   // print all the students that are present today  
	   

	//--------------------------------------------------------------------
	      while(true){
	    	 
	    	 String student1 = inputStream.readLine();
	    	 if(student1 == null){
	    		 break;
	    	 }
	    	 if(!student1.equals("Divide")){
	    	 studentsabsent.add(student1);
	    	// System.out.println("MUSULOD KO DRE part 3");
	    	 }
	    	 what =  student1;
	    	if(what.equals("Divide")){
	    	//	System.out.println("samot na dire part 3");
	    		break;
	    	}
	     } 
	      
	      
	//------------------------------------------------------------------------
	     //Store the Data in the list  
	      // save the values of the array in a new array
	      // so it will not be disturbed
 

	      ArrayList<String> studentsinclass1 = studentsinclass;
		  ArrayList<String> studentslate1 = studentslate;
		  ArrayList<String> studentsabsent1 =  studentsabsent;
	    //  System.out.println("is students in class1 empty" + studentsinclass1.isEmpty());
	    //  System.out.println("is studentspresent1 empty" + studentspresent1.isEmpty());
	     // System.out.println("is studentsabsent empty" + studentsabsent1.isEmpty());
	     mll.add(studentsinclass1,studentslate1,studentsabsent1,date);
	    
		 
	     l =  inputStream.readLine();
		 
       
	//----------------------------------------------------------------------------	 
	  
		 
		 
 
		   studentslate = new ArrayList<String>();  
           studentsabsent = new ArrayList<String>();	 
	} 
		   
			while(true){
				System.out.println(" Type the number of choice and hit enter");
				System.out.println(" [0] Show dates from the first day of class");
				System.out.println(" [1] To show list of students");
				System.out.println(" [2] To clear the list of students");
				System.out.println(" [3] Add data for today");
				System.out.println(" [4] terminate ");
				System.out.println(" [5] Show analysis");
				
				check = new Scanner(System.in);
				 String whats = check.nextLine();
		  
			 if(whats.equals("1")){
				 if(StudentsInClass.size()==0){
					 System.out.println("Your list is still empty ! Please add a data for today");
					 System.out.println();
				 }else{
				 System.out.println("Your list of students");
				 int v = 1;
				 for (int j=0; j<StudentsInClass.size(); j++) 
				 { 
	              
				 System.out.println(v+". " + StudentsInClass.get(j));
				  v++;
				 } 
				 }
			 }
			 if(whats.equals("2")){
				   clears(mll,studentsinclass); 
			        studentsinclass = new ArrayList<String>();	    	 
		            StudentsInClass = new ArrayList<String>();	  
			 }
			 if(whats.equals("3")){
				 break;
			 }
			 if(whats.equals("4")){
				 System.out.println("Thankyou for using Attendance Monitoring Project");
				 System.exit(0);
			 }
			 if(whats.equals("5")){
				 dataAnalysis();
			 }
			 if(whats.equals("0")){
				  seedates(mll);
			 }
			 else{
				 System.out.println("Please enter a number that are in the choices only");
			 }
			}
	}
	//-------------------------------------------------------------------------------
		    
	   studentslate.clear();  
	   studentsabsent.clear();  
	  
	   
	   if(mll.isEmpty()){
		   writer1.println("indicator");
	 System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");	   
     System.out.println(" | To fill your List Of Students                                                     | ");
	 System.out.println(" | Please input  all your students in class                                          | ");
	 System.out.println(" | By typing the name of the student then 'click enter', then the next name follows  | ");
	 System.out.println(" | (If done , type 'DONE' and click enter)                                           | ");
	 System.out.println(" ------------------------------------------------------------------------------------- ");	
	 System.out.println("Start here :");
	 while(true){
		 students = new Scanner(System.in);
		 String AllStudents = students.nextLine();
		 if(AllStudents.equals(null)){
			 break;
		 }
		 if(!AllStudents.equals("DONE")){
		 StudentsInClass.add(AllStudents);
		 studentsinclass.add(AllStudents);
		 writer2.println(AllStudents);
		 
	        }
		 if(AllStudents.equals("DONE")){
			 break;
		 }
	 }
	 writer2.println("Divide");
	 
	 System.out.println("Please enter the Date today:");	 
	   }else{
		    
	 System.out.println("Please enter the Date today:");	
	   } 
	   
	   
	 scDates = new Scanner(System.in);  
	 String date  = scDates.nextLine();
	 String what = "no";
	 writer1.println(date);
	
	 
	 while(true){
     // Getting inputs
     System.out.println("Please input the students that are late today :");
     System.out.println("Type DONE if done");
     
   while(true){
         
    	 scanStudents = new Scanner(System.in);
    	 String student = scanStudents.next();
    	if(student.equals("DONE")){
    		break;
    	}
    	 if(searchifexist(student,StudentsInClass) == true){
    		 
    	 
    	 if(student.equals(null)){
			 break;
		 }
    	 if(!student.equals("DONE")){
    	 studentslate.add(student);
    	 writer1.println(student);
    	
    	 }
    	  what =  student;
    	  if(what.equals("DONE")){
    		  break;
    	  }
    	 }else{
    		 System.out.println("*That name isn't in your LIST OF STUDENTS !!* ");
    		 System.out.println("These are the names that are only in your list");
    		 int v = 1;
			 for (int j=0; j<StudentsInClass.size(); j++) 
			 { 
              
			 System.out.println(v+". " + StudentsInClass.get(j));
			  v++;
			 } 
    		 System.out.println("*Please write the name again*");
    	 }
    	
     }
   writer1.println("Divide");
   // print all the students that are present today
   System.out.println("Students that are late today:");
   Iterator<String> it = studentslate.iterator( );
   int n = 1;
   while ( it.hasNext( ) ) {
	  
	 System.out.print(n+".");
  	 System.out.println( it.next( ) );
  	  n++;
  	 }
 
     System.out.println("Please input the students that are absent today :");
     System.out.println("Type DONE if done");

//--------------------------------------------------------------------
      while(true){
    	 scanStudents = new Scanner(System.in);
    	 String student1 = scanStudents.next();
    	 if(student1.equals("DONE")){
     		break;
     	}

    	 if(searchifexist(student1,StudentsInClass)) {
    		 
     	 if(student1.equals(null)){
			 break;
		 }
    	 if(!student1.equals("DONE")){
    	 studentsabsent.add(student1);
    	 writer1.println(student1);
    	 }
    	 what =  student1;
    	if(what.equals("DONE")){
    		break;
    	}
    	 }else{
    		 System.out.println("That name isn't in your LIST OF STUDENTS !! ");
    		 System.out.println("The students that are in your list are:");
    		 int v = 1;
			 for (int j=0; j<StudentsInClass.size(); j++) 
			 { 
              
			 System.out.println(v+". " + StudentsInClass.get(j));
			  v++;
			 } 
    		 System.out.println("Please write the name again");
    	 }
    	
     }
      writer1.println("Divide");
      writer1.println("indicator");
      
//------------------------------------------------------------------------
      //print all the students that are absent today
      System.out.println("Students that are absent today:");
      Iterator<String> it2 = studentsabsent.iterator( );
      int o = 1;
      while ( it2.hasNext( ) ) {
   	  
   	 System.out.print(o+".");
     	 System.out.println( it2.next( ) );
     	 o++;
     	 }
      
      
       
     mll.add(studentsinclass,studentslate,studentsabsent,date);
      
	 
       System.out.println("");
	   System.out.println("Do you want the Full attendance analysis of the students ? (YES / NO )"); 
	   System.out.println("YES or NO , after the analysis ... your data will be saved and this program will terminate");
	   Do = new Scanner(System.in);
	   String Do11 = Do.next();
	
	   //if the user chooses no
	   if(Do11.equals("No") || (Do11.equals("NO") || Do11.equals("no"))){
		    
		 
			   System.out.println("Do you want the data analysis of a certain student instead ? (YES/ NO) ");
			   System.out.println("YES or NO , after the analysis ... your data will be saved and this program will terminate");
					 
			   Do1 = new Scanner(System.in);
			   String Do2 = Do1.next();
			   
			   while(Do2.equals("YES")){
				       System.out.println();
				       System.out.println("Please input the name of the student, exactly the name you typed in your LIST OF STUDENTS");
				       name = new Scanner(System.in);
				       String name2 = name.next();
				     if(searchifexist(name2,StudentsInClass)){
				       search(name2);
				     }else{
				    	 System.out.println("That name isn't in your LIST OF STUDENTS !! ");
				    	 System.out.println("These are the students that are in your list");
				    	 int v = 1;
						 for (int j=0; j<StudentsInClass.size(); j++) 
						 { 
			              
						 System.out.println(v+". " + StudentsInClass.get(j));
						  v++;
						 } 
			    		 System.out.println("Please write the name again");
				     }
				     
				     System.out.println("Do you want the data analysis of a certain student again? (YES/NO)");
				     Do1 = new Scanner(System.in);
				     Do2 = Do1.next();
				     
				     if(Do2.equals("No")){
				    	 break;
				     }
			   }
			   System.out.println("Your data for this day has already been saved");
			   System.out.println("Thankyou for using Attendance Monitoring Project :D ");
			   break;
		   }
		   
	   else if(Do11.equals("YES") || (Do11.equals("yes"))){
		    
		         
	            
	            mll.process(mll.size());  
	            System.out.println("(Today's data has now been saved, THANKYOU FOR USING ATTENDANCE MONITORING PROJECT)");
	            break;
	   }
	   else{
		   break;
	   }
	   
	   
	   
	}
	 
//----------------------------------------------------------------------------	 
			 } finally {
		            if (inputStream != null) {
		                inputStream.close();
		            }
		            if (writer1 != null) {
		                writer1.close();
		            }
		            if(writer2 != null){
		            	writer2.close();
		            }
		            if(inputStream2 != null){
		            	inputStream2.close();
		            }
		        }	 

	
	
		
	
	
	 
	
	}
     
	 static Boolean  searchifexist(String pangalan,ArrayList<String> StudentsInClass){
	    	//System.out.println("mao ni si pangalan : " + pangalan);
	    	//System.out.println("is StudentsInClass empty ? " + StudentsInClass.isEmpty());
	     
	    	if (StudentsInClass.contains(pangalan)) {
	    	    return(true);
	    	} else {
	    	   return(false);
	    	} 
	    	} 

	 static void dataAnalysis(){
		 
         if(mll.isEmpty()){
         	System.out.println("The list is empty , Cannot make analysis");
         	System.out.println("Add a data for today");	
        	System.out.println();	 
         }
         else{
         System.out.println("------------------");
         
         mll.process(mll.size());
         printList(mll);
         }

}
	 static void dataAnalysis1(){
		 
		            if(mll.isEmpty()){
		            	System.out.println("The list is empty , Cannot make analysis");
		            	
		            	System.out.println("Add a data for today");	
		            	System.out.println();              
		            } 
		            else{
		            System.out.println("------------------");
		            
		            mll.process(mll.size());
		            printList(mll);
		            }
		   
	}
	 
           // print the dates of the NODE
	    private static void printList(MyLinkedList lst){
	    
	        
	        System.out.println("If start a class today, then today will be your " +lst.size()+"(rd/th/st/nd) day in this class");
	        System.out.println(); 
	    }
	    private static void search(String pangalan){
	    	
	    	mll.process2(mll.size() , pangalan);
	    }
	    
		
	   public static void clears(MyLinkedList sll,ArrayList<String> studentsinclass) throws IOException{
   	 FileOutputStream writer = new FileOutputStream("Attendance Monitoring Project/src/readersy.txt");
   	 writer.write((new String()).getBytes());
   	 writer.close();
   	 FileOutputStream writer3 = new FileOutputStream("Attendance Monitoring Project/src/readerx.txt");
   	 writer3.write((new String()).getBytes());
        writer3.close();
        System.out.println("*Done clearing your list, you can start a new list of students"); 
        mll.clear();
	   }
		    	
	   public static void seedates(MyLinkedList lst){
		   if(lst.size()-1 == -1){
			   System.out.println("no classes yet");
		   }
		   else{
		   int l = 1;
            System.out.println(lst.size()-1+" no. dates");
	        System.out.println("All Dates of classes in this class from the 1st day ");
	         for(int i=0; i < lst.size(); i++){
	          if(lst.get(i) != null)
	          System.out.println(l+". "+lst.get(i));
	          l++;
	         }
	         }
	         System.out.println();
		  }
}