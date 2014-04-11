import java.io.*;
import java.util.*;

public class MyQueue<T>{
    
    //Node class    
    public class Node<T>{

	private T data;
	private Node<T> next;


	public Node(T input){
	    data = input;
	    next = null;
	}

	public Node<T> getNext(){
	    return next;
	}

	public T getData(){
	    return data;
	}

	public void setData(T input){
	    data = input;
	}   

	public void setNext(Node<T> n){
	    next = n;
	}
	public String toString(){
	    return data.toString();
	}

    }
    //end of Node

    private Node<T> first;
    private Node<T> head;

    public MyQueue(){
	head = null;
	first = null;
    }

    public boolean add(T item){
	if(first == null ){
	    first = new Node<T>(item);
	    head = first;
	    return true;
	}
	if(item != null){
	    Node<T> tmp = new Node<T>(item);
	    head.setNext(tmp);
	    head = head.getNext();
	    return true;
	}else{
	    return false;
	}
    }

    public T poll(){
	if(!this.empty()){
	    T result = first.getData();
	    first = first.getNext();
	    return result;
	}else{
	    return null;
	}
    }

    public T peek(){
	if(!this.empty()){
	    T result = first.getData();
	    return result;
	}else{
	    return null;
	}	    
    }

    public boolean empty(){
	return first == null;
    }

    public String toString(){
	String result = "";
	Node<T> temp = first;
	while(temp != null){
	    result = result + temp.toString() + ", ";
	    temp = temp.getNext();
	}
	if(!this.empty()){
	    result = result + "]";      
	    result = result.replaceAll(", ]","");
	}
	return result;
	
    }

}
