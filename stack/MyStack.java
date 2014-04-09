import java.io.*;
import java.util.*;

public class MyStack<T>{

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

    private Node<T> head;
    private int length;

    public MyStack(){
	head = null;
	length = 0;
    }

    public boolean empty(){
	return head == null;
    }

    public T peak(){
	if (this.empty()){
	    throw new EmptyStackException();
	}else{
	    return head.getData();
	}
    }

    public T pop(){
	T temp = this.peak();
	head = head.getNext();
	length --;
	return temp;
    }

    public T push(T item){
	Node<T> temp = new Node<T>(item);
	temp.setNext(head);
	head = temp;
	length ++;
	return item;
    }

    public int search(T item){
	Node<T> temp = head;
	int pos = 1;
	while(temp != null){
	    if(temp.getData() == item){
		return pos;
	    }
	    temp = temp.getNext();
	    pos ++;
	}
	return -1;
    }

    public String toString(){
	String result = "";
	Node<T> temp = head;
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
