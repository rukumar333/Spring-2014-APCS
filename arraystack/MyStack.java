import java.io.*;
import java.util.*;

public class MyStack<T>{

    T[] list = (T[])new Object[100];
    int head;
    boolean start = true;
    
    public MyStack(){
	head = 0;
    }

    public boolean empty(){
	return list[head] == null;
    }

    public T peak(){
	if (this.empty()){
	    throw new EmptyStackException();
	}else{
	    return list[head];
	}
    }

    public T pop(){
	T temp = this.peak();
	head --;
	return temp;
    }

    public T push(T item){
	if(start){
	    list[head] = item;
	    start = false;
	    return item;
	}else{
	    head ++;
	    list[head] = item;
	    return item;
	}
    }

    public int search(T item){
	for(int i = 0; i < head + 1; i++){
	    if(list[i] == item){
		return i;
	    }
	}
	return -1;
    }

    public String toString(){
	String result = "";
	for(int i = 0; i < head + 1; i++){
	    result = result + list[i].toString() + ", ";
	}
	return result;

    }
    
}
