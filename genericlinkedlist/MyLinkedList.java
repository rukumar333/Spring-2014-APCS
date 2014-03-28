import java.io.*;
import java.util.*;

public class MyLinkedList<T> implements Iterable<T>{

    private Node<T> buffer;
    private Node<T> head;
    private Node<T> last;
    private int length = 0;

    public MyLinkedList(){
	buffer = new Node<T>(null);
	buffer.setNext(new Node<T>(null));
	head = buffer.getNext();
	last = buffer.getNext();
    }

    public String name(){
	return "Kumar, Rushil";
    }

    public Iterator<T> iterator(){
	return new MyLLIterator<T>(this);
    }

    public boolean checkInBounds(int pos){
	if(pos < 0 || pos > length - 1){
	    return false;
	}else{
	    return true;
	}
    }
    
    public Node<T> getNode(int pos){
	if(pos < -1 || pos > length - 1){
	    throw new IndexOutOfBoundsException("Position is out of the bounds of the list");
	}
	Node<T> temp = head;
	for(int i = 0; i < pos + 1; i ++){
	    temp = temp.getNext();
	}
	return temp;
    }

    public void add(T input){
	last.setNext(new Node<T>(input));
	last = last.getNext();
	length ++;
    }

    public void add(T input, int pos){
	if(pos == length){
	    this.add(input);
	}
	if(pos < 0 || pos > length){
	    throw new IndexOutOfBoundsException("Position is out of the bounds of the list");
	}
	Node<T> n = new Node<T>(input);
	Node<T> first = getNode(pos - 1);
	Node<T> second = first.getNext();
	n.setNext(second);
	first.setNext(n);
	if(pos == length){
	    last = n;
	}
	length++;
    }

    public T get(int pos){
	if(!checkInBounds(pos)){
	    throw new IndexOutOfBoundsException("Position is out of the bounds of the list");
	}
	return getNode(pos).getData();
    }

    public void set(int pos, T input){
	if(!checkInBounds(pos)){
	    throw new IndexOutOfBoundsException("Position is out of the bounds of the list");
	}
	getNode(pos).setData(input);
    }

    public void remove(int pos){
	if(!checkInBounds(pos)){
	    throw new IndexOutOfBoundsException("Position is out of the bounds of the list");
	}
	Node<T> one = getNode(pos - 1);
	Node<T> two = one.getNext();
	Node<T> three = two.getNext();
	one.setNext(three);
	if(pos == length - 1){
	    last = one;
	}
	length --;
    }
 
    public int find(T data){
	Node<T> temp = buffer;
	for(int i = 0; i < length; i ++){
	    temp = temp.getNext();
	    if(temp.getData() == data){
		return i;
	    }
	}
	return -10;
    }

    public int length(){
	return length;
    }

    public int size(){
	return length;
    }

    public String toString(){
	String s = "[";
	Node temp = head;
	for(int i = 0; i < length; i ++){
	    temp = temp.getNext();
	    s = s + temp.getData() + ", ";
	}
	s = s + "]";      
	s = s.replaceAll(", ]","]");
	return s;
    }

}
