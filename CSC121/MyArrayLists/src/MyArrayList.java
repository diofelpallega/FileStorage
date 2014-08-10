/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MyArrayList implements MyList {

    private static final int DEFAULT_CAPACITY = 10;
    private static final int NOT_FOUND = -1;
    
    private Object[] theItems;
    private int theSize;
    
    public MyArrayList(){
        doClear();
    }

    private void doClear() {
        theSize = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }
    
    @Override
    public void add(int index, Object element) {
        if( theItems.length == size() ) {
            ensureCapacity( size() * 2 + 1 );
        }
          for(int i = theSize; i > index ; i--)
          {
        	      theItems[i] = theItems[i-1];
          }
          theItems[index] = element;
          theSize ++;
          
    }

    @Override
    public boolean add(Object o) {
        add(size(), o);
        return true;
    }

    @Override
    public void clear() {
        doClear();
    }

    @Override
    public boolean contains(Object o) {
        boolean ans = false;
        for(int i=0; i<size(); i++){
            if(theItems[i].equals(o)){
                ans = true;
                break;
            }
        }
        return ans;
    }

    @Override
    public Object get(int index) {
        if((index < 0) || (index > size())){
            throw new ArrayIndexOutOfBoundsException();
        }
        return theItems[index];
    }

    @Override
    public int indexOf(Object o) {
        int index = -1;
		
        for(int i = 0 ; i < theSize ; i++)
        {
        	if (o.equals(theItems[i]) )
        	{
        		index = i;
        		break;
        	}
        	
        }
		
        return index;
    }

    @Override
    public boolean isEmpty() {
        return theSize == 0;
    }

    @Override
    public Object remove(int index) {
        for(int i = theSize ; i < index ; i++)
        {
        	theItems[i] = theItems[i+1];
        }
       theSize --;
	   return theItems;
	   
    }

    @Override
    public boolean remove(Object x) {
        int index = indexOf(x);
        remove(index);
        return true;
    }

    @Override
    public Object set(int index, Object element) {
        if( (index < 0) || (index >= size()) ) {
            throw new ArrayIndexOutOfBoundsException( );
        }
        Object old = theItems[index];
        theItems[index] = element;
        return old;
    }

    @Override
    public int size() {
        return theSize;
    }

    @Override
    public MyArrayList subList(int fromIndex, int toIndex) 
    {
    	MyArrayList sublist = new MyArrayList();
       for(int i = fromIndex; i <= toIndex ;  i++)
       {
    	  sublist.add(theItems[i]);
       }
      return sublist;
    }

    private void ensureCapacity(int newCapacity) {
        if( newCapacity < theSize ) {
            return;
        }

        Object[] old = theItems;
        theItems = new Object[newCapacity];
        for( int i = 0; i < size( ); i++ ) {
            theItems[ i ] = old[ i ];
        }
    }

    

    
}

