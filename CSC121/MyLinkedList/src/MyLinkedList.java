
/**
 *
 * @author Admin
 */
public class MyLinkedList{
    
    private int theSize;
    private Node beginMarker;
    private Node endMarker;
    
    public MyLinkedList()
    {
        doClear();
    }
    
    private void doClear(){
        beginMarker = new Node ( null, null, null );
        endMarker = new Node( null, beginMarker, null );
        beginMarker.next = endMarker;
        theSize = 0;
    }

    public void add(int index, Object element) {
        addBefore(getNode(index), element);
       
    }

    public boolean add(Object o) {
        add(size(), o);
        return true;
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
     
    	  p.prev.next = p.next;
    	  p.next.prev = p.prev;
    	  p = p.next;
          theSize--; 
     	return true;
    }
     
    
    
    public boolean remove(Object o) {
        int index = indexOf(o);
        remove(index);        
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

    public MyLinkedList subList(int fromIndex, int toIndex) {
    	
    	MyLinkedList sublist = new MyLinkedList();
        for(int i = fromIndex; i <= toIndex ;  i++)
        {
     	  sublist.add(getNode(i).data);
        }
       return sublist;
     }

    

    private Node getNode(int index) {
        Node p;
        if(index < size() / 2 ){
        	  p = beginMarker.next;
        	  for(int i=0;i<(index);i++)
        		   p = p.next;
        } else{
        	p = endMarker;
        	for(int i = size(); i > (index) ; i--){
        		p = p.prev;
        		
        	}
        }
        
        return p;
        
    }

    private void addBefore(Node p, Object element) {
        
 	    Node newNode = new Node(element, p.prev,p);
 	    newNode.prev.next = newNode;
 	    p.prev = newNode;
 	    theSize++;
 	    
    }
    
    private static class Node {
        public Object data;
        public Node   prev;
        public Node   next;
        
        public Node( Object d, Node p, Node n )
        {
            data = d; 
            prev = p; 
            next = n;
        }               
    }
    
}
