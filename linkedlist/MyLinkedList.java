import java.io.*;
import java.util.*;

public class MyLinkedList{

    private Node head;
    private Node last;

    public MyLinkedList(){
	head = null;
	last = head;
    }

    public void add(String s){
	last.setNext(new Node(s));
	last = last.getNext();
    }

    public void add(String s, int pos){

    }

    public String get(int pos){
	Node temp = head;
	for(int i = 0; i < this.length(); i++){
	    temp = temp.getNext();
	}
    }

    public void set(int pos, String s){

    }

    public void remove(int pos){

    }

    public int find(String s){

    }

    public int length(){

    }

    public String toString(){

    }

}