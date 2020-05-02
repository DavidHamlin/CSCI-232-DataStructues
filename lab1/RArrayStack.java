package lab1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RArrayStack<E> implements Iterable<E> {
	private E[]a;
    private int N;       // number of items in stack

    
    // create an empty stack with given capacity
    public RArrayStack(int capacity) {
        a =  (E[]) new Object[capacity];
        
    }

    public boolean isEmpty() {  
        return N == 0;                    
    }
    
    //resize creates a placeholder stack with double the length.
    //it then iterates through and clones the original,
    //and then copies the original to the length of the new one.
    public void resize(int size) {

         E[] tempStack = (E[]) new Object[size];
         for (int i = 0; i < a.length; i++) {
             tempStack[i] = a[i];
         }
         a = tempStack;
    }
    
    public boolean isFull() {  
        return N == a.length;             
    }
      	
    public void push(E item) {
    //if statement to check if its full, and if it is, then it resizes it.
    	if(isFull()) {
    		resize(a.length*2);
    	}
        a[N++] = (E) item; 
    }
    
    public E pop() {  
        return a[--N];                    
    }
    
    public E peek() {
        return a[N-1];                    
    }
    
    public Iterator<E> iterator() { 
        return (Iterator<E>) new ReverseArrayIterator(); 
    }

    public class ReverseArrayIterator implements Iterator<E> {
        private int i = N-1;

        public boolean hasNext() {
            return i >= 0;
        }

        public E next() { 
            if (!hasNext()) throw new NoSuchElementException();
            return a[i--];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }	
    }
    
}
    
    
    
    
