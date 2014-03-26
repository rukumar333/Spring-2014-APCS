import java.util.*;
import java.io.*;

public class MyLLIterator <T> implements Iterator<T>{

    private MyLinkedList mll;
    private Node<T> current;
    
    public MyLLIterator(MyLinkedList<T> enter){
	current = enter.getNode(-1);
    }

    public boolean hasNext(){
	if(current.getNext() == null){
	    return false;
	}else{
	    return true;
	}
    }

    public T next(){
	if(hasNext()){
	    current = current.getNext();
	    return current.getData();
	}else{
	    throw new NoSuchElementException();
	}
    }

    public void remove(){
	throw new UnsupportedOperationException();
    }

}
