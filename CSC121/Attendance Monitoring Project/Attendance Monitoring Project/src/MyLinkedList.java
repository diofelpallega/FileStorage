import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

//PALLEGA DIOFEL S.
//ATTENDANCE MONITORING PROJECT
public class MyLinkedList{
    
   
	private int theSize;
    private Node beginMarker;
    private Node endMarker;
    
    public MyLinkedList()
    {
        doClear();
    }
    
    private void doClear(){
        beginMarker = new Node ( null,null,null, null,null, null );
        endMarker = new Node( null,null,null,null, beginMarker, null );
        beginMarker.next = endMarker;
        theSize = 0;
    }

    public void clear() {
        doClear();
    }

    public boolean contains(Object o) {
        return (indexOf(o) != -1) ;
    }

    public Object get(int index) {
        return getNode(index).data;
    }
    
    public int indexOf(Object o) {
        int index = -1;
        Node p = beginMarker.next;
        for(int i=0; i<size(); i++){
            if(p.data.equals(o)){
                index = i;
                break;
            }else{
                p = p.next;
            }
        }
        return index;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Object remove(int index) {
        Node p = getNode(index);
        p.next.prev = p.prev;
        p.prev.next = p.next;
        theSize--;
        return p;
    }
    
    public boolean remove(Object o) {
        int idx = indexOf(o);
        remove(idx);        
        return true;
    }

    public Object set(int index, Object element) {
        Node p = getNode(index);
        Object oldVal = p.data;
        p.data = element;
        return oldVal;
        
    }

    public int size() {
        return theSize;
    }
    
    void process2(int index , String name){
    	int e = 0;
        int o = 0;
            
        	 
        	System.out.println("     "+name+ " ... ");
        	System.out.println();
        	
        	System.out.println(".......");
            Node q = beginMarker.next;
            
            for(int i=0; i < index; i++){
 
                for(int c = 0; c < q.studentslate4.size();c++){ 
                	
            		if(name.equals(q.studentslate4.get(c))){ 
            			System.out.println("late last: "+q.data);
            		 	o++;
            		 	
            		      }
            	  
            			}
            
                
            	
        	     for(int c = 0; c < q.studentsabsent4.size();c++){ 
        	
        		if(name.equals(q.studentsabsent4.get(c))){ 
        			System.out.println("absent last: "+q.data);
        		 	e++;
        		      }
        	  
        			}
       
        	  q = q.next;
            	}
            if((index-e-1) == 0){
                
                System.out.println("Presence: "+1+" days "+"/"+1+" days");
                System.out.println("Total of "+ e + " absences");
                System.out.println();
                e=0;
     
                System.out.println("Total of "+ o+ " lates");
                System.out.println();
                o=0; 
                } else{
               System.out.println("Presence: "+(index-e-1)+" days "+"/"+(index-1) +" days");
               System.out.println("Total of "+ e + " absences");
               System.out.println();
               e=0;
    
               System.out.println("Total of "+ o+ " lates");
               System.out.println();
               o=0;   
                }     
    }
    void process(int index){
    	int e = 0;
    	int o = 0;
    	System.out.println("    *YOUR STUDENTS ATTENDANCE FULL ANALYSIS *           ");
        Node p = beginMarker.next;
        System.out.println();
        for(int b = 0;b< p.allstudents4.size(); b++){
        	String current = p.allstudents4.get(b);
        	System.out.println("       "+current+ " ... ");
        	System.out.println();
        	
        	System.out.println(".......");
            Node q = beginMarker.next;
        
            for(int i=0; i < index; i++){
          
            
        	for(int c = 0; c < q.studentsabsent4.size();c++){ 
        	
        		if(current.equals(q.studentsabsent4.get(c))){ 
        			System.out.println("absent last: "+q.data);
        		 	e++;
        		      }
        	  
        			}
      
        for(int c = 0; c < q.studentslate4.size();c++){ 
        	
    		if(current.equals(q.studentslate4.get(c))){ 
    			System.out.println("late last: "+q.data);
    		 	o++;
    		      }
    	  
    			}
   
        q = q.next;
        	}
             if((index-e-1) == 0){
             
             System.out.println("Presence: "+1+" days "+"/"+1+" days");
             System.out.println("Total of "+ e + " absences");
             System.out.println();
             e=0;
  
             System.out.println("Total of "+ o+ " lates");
             System.out.println();
             o=0; 
             } else{
            System.out.println("Presence: "+(index-e-1)+" days "+"/"+(index-1) +" days");
            System.out.println("Total of "+ e + " absences");
            System.out.println();
            e=0;
 
            System.out.println("Total of "+ o+ " lates");
            System.out.println();
            o=0;   
             }
    	}

        }
        
    //
    private Node getNode(int index) {
        Node p = beginMarker.next;
        for(int i = 0;i<index;i++)
            p = p.next;
        return p;
    }
    public boolean add( ArrayList<String> allstudents,ArrayList<String> studentslate,ArrayList<String> studentsabsent ,Object o) {
        add(size(), o, studentslate , studentsabsent,  allstudents);
        return true;
    }
    
    public void add(int index, Object element, ArrayList<String> studentslate1, ArrayList<String> studentsabsent1, ArrayList<String> allstudents1) {
        addBefore(getNode(index), element,studentslate1,studentsabsent1, allstudents1); 
    }

 

    private void addBefore(Node p, Object element, ArrayList<String> studentslate2, ArrayList<String> studentsabsent2, ArrayList<String> allstudents2) {
      Node s = new Node(element,studentslate2,studentsabsent2, allstudents2,p.prev,p); 
      p.prev.next = s;
      p.prev = s;
     
      theSize++;
       
    }
    

    
 private static class Node {
	    public  ArrayList<String> allstudents4;
	    public  ArrayList<String> studentslate4 ;
	    public  ArrayList<String> studentsabsent4  ;
        public Object data;
        public Node   prev;
        public Node   next;
         
        public Node( Object d, ArrayList<String> sl, ArrayList<String> sa,ArrayList<String> as, Node p, Node n )
        {
        	allstudents4 = as;
        	studentslate4 = sl;
        	studentsabsent4 = sa;
            data = d; 
            prev = p; 
            next = n;
        }               
    }
    
}