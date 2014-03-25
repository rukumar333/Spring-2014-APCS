import java.io.*;
import java.util.*;

public class Node<T>{

    private T data;
    private Node<T> next;


    public Node(T input){
	data = input;
	next = new Node<T>();
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
