import java.io.*;
import java.util.*;

public class DoubleLL<E>{
    
    //this is all code for the node class
    private class Node<E>{
	E data;
	Node<E> next,prev;

	public Node(E d){
	    this.setData(d);
	}

	public String toString(){
	    return data.toString();
	}

	public void setData(E d){
	    data = d;
	}

	public E getData(){
	    return data;
	}

	public void setNext(Node<E> n){
	    next = n;
	}

	public Node<E> getNext(){
	    return next;
	}

	public void setPrev(Node<E> p){
	    prev = p;
	}

	public Node<E> getPrev(){
	    return prev;
	}

    }
    //this is where the code for the node class ends

    private Node<E> current;
    private Node<E> first;

    public void insert(E d){
	Node<E> n = new Node<E>(d);
	if(current==null){
	    current = n;
	    first = n;
	    current.setNext(first);
	    first.setPrev(current);
	}else{
	    n.setNext(current.getNext());
	    n.setPrev(current);
	    current.setNext(n);
	    current = current.getNext();
	    if(current.getNext()==first){
		first.setPrev(current);
	    }
	}
    }

    public Node<E> getCurrent(){
	return current;
    }

    public void forward(){
	if(current.getNext() != null){
	    current = current.getNext();
	}
    }

    public void back(){
	if(current.getPrev() != null){
	    current = current.getPrev();
	}
    }

    public void getCurrentP(){
    	System.out.println("Previous data: " + current.getPrev().toString());
    }
    public void getCurrentD(){
    	System.out.println("Current data: " +current);
    }

    public String toString(){
	Node<E> tmp = current;
	if(tmp == null){
	    return "";
	}
	if(first == current){
	    return first.getData().toString();
	}
	while(tmp != first){
	    tmp = tmp.getPrev();
	    // System.out.println(tmp);
	}
	String s = "";
	while(tmp != first.getPrev()){
	    s = s + tmp.getData() + " ";
	    tmp = tmp.getNext();
	}
	s = s + tmp.getData() + " ";
	tmp = tmp.getNext();
	return s;
    }
    public static void main(String[] args){
	DoubleLL<String> L = new DoubleLL <String>();
	System.out.println(L);
	L.insert("hello");
	System.out.println(L);
	L.insert("world");
	System.out.println(L);
	L.insert("three");
	System.out.println(L);
	//First test up to here
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.insert("inserted");
	System.out.println(L);
	System.out.println(L.getCurrent());
	
	//then test again to here
    }
}
