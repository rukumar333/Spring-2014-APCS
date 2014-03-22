import java.io.*;
import java.util.*;

public class MyLinkedList{

    private Node buffer;
    private Node head;
    private Node last;
    private int length;

    public MyLinkedList(){
	buffer = new Node("");
	head = buffer.getNext();
    }

    public boolean checkInBounds(int pos){
	if(pos < 0 || pos > length - 1){
	    return false;
	}else{
	    return true;
	}
    }

    public Node getNode(int pos){
	if(!checkInBounds(pos)){
	    throw new IndexOutOfBoundsException("Position is out of the bounds of the list");
	}
	Node temp = buffer;
	for(int i = 0; i < pos + 1; i ++){
	    temp = temp.getNext();
	}
	return temp;
    }

    public void add(String s, int pos){
	if(pos < 0 || pos > length){
	    throw new IndexOutOfBoundsException("Position is out of the bounds of the list");
	}
	Node n = new Node(s);
	Node first = getNode(pos - 1);
	Node second = first.getNext();
	n.setNext(second);
	first.setNext(n);
	length++;
    }

    public String get(int pos){
	if(!checkInBounds(pos)){
	    throw new IndexOutOfBoundsException("Position is out of the bounds of the list");
	}
	return getNode(pos).toString();
    }

    public void set(String s, int pos){
	if(!checkInBounds(pos)){
	    throw new IndexOutOfBoundsException("Position is out of the bounds of the list");
	}
	getNode(pos).setData(s);
    }

    public void remove(int pos){
	if(!checkInBounds(pos)){
	    throw new IndexOutOfBoundsException("Position is out of the bounds of the list");
	}
	Node one = getNode(pos - 1);
	Node two = one.getNext();
	Node three = two.getNext();
	one.setNext(three);
	length --;
    }
 
    public int find(String s){
	Node temp = buffer;
	for(int i = 0; i < length; i ++){
	    temp = temp.getNext();
	    if(temp.getData() == s){
		return i;
	    }
	}
	return -10;
    }

    public int length(){
	return length;
    }

    public String toString(){
	String s = "[";
	Node temp = buffer;
	for(int i = 0; i < length; i ++){
	    temp = temp.getNext();
	    s = s + temp.getData + " ";
	}
	s = s + "]";      
    }

}
