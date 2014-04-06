import java.io.*;
import java.util.*;

public class MyStack<T>{

    public class Node<T>{

	private T data;

	public Node(T input){
	    data = input;
	}

	public T getData(){
	    return data;
	}

	public void setData(T input){
	    data = input;
	}   

	public String toString(){
	    return data.toString();
	}

    }
    //end of Node


    Node[] list = new Node[100];
    int head;
    
    public MyStack(){
	// list = new Node[100];
	head = 0;
    }

    public boolean empty(){
	return list[head] == null;
    }

    public T peak(){
	if (this.empty()){
	    throw new EmptyStackException();
	}else{
	    return list[head].getData();
	}
    }

    public T pop(){
	T temp = this.peak();
	head --;
	return temp;
    }

    public T push(T item){
	Node<T> temp = new Node<T>(item);
	head ++;
	list[head] = temp;
	return item;
    }

    public int search(T item){
	for(int i = 0; i < head + 1; i++){
	    if(list[i].getData() == item){
		return i;
	    }
	}
	return -1;
    }

}
