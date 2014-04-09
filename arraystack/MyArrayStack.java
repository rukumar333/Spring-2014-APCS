import java.io.*;
import java.util.*;

public class MyArrayStack<T>{

    T[] list = (T[])new Object[100];
    int head;
    boolean start = true;
    
    public MyArrayStack(){
	head = 0;
    }

    public boolean empty(){
	if(head >= 1){
	    return list[1] == null;
	}else{
	    return true;
	}
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
	list[head] = null;
	head --;
	if(head == list.length / 4){
	    this.shrink();
	}
	return temp;
    }

    public T push(T item){
	head ++;
	if(head == list.length - 1){
	    this.grow();
	}
	list[head] = item;
	return item; 
    }

    public int search(T item){
	for(int i = 1; i < head + 1; i++){
	    if(list[i] == item){
		return head + 1 - i;
	    }
	}
	return -1;
    }

    public void grow(){
	T[] temp = (T[])new Object[list.length * 2];
	for(int i = 1; i < head + 1; i++){
	    temp[i] = list[i];
	}
	list = temp;
    }

    public void shrink(){
	T[] temp = (T[])new Object[list.length / 2];
	for(int i = 1; i < head + 1; i++){
	    temp[i] = list[i];
	}
	list = temp;
    }

    public String toString(){
	String result = "";
	if(this.empty()){
	    return "";
	}
	for(int i = head; i >= 1; i--){
	    result = result + list[i].toString() + ", ";
	}
	if(!this.empty()){
	    result = result + "]";      
	    result = result.replaceAll(", ]","");
	}
	return result;

    }
    
}
