import java.io.*;
import java.util.*;

public class Node{

    private String data;
    private Node next;

    public Node(String s){
	data = s;
	next = null;
    }

    public Node getNext(){
	return next;
    }

    public String getData(){
	return data;
    }

    public void setData(String s){
	data = s;
    }   

    public void setNext(Node n){
	next = n;
    }
    public String toString(){
	return data;
    }

}