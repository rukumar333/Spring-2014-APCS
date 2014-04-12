import java.io.*;
import java.util.*;

public class Driver{
    
    public static void main(String[] args){
	MyQueue<String> q = new MyQueue<String>();
	System.out.println(q.peek());
	q.enqueue("Hello");
	System.out.println(q.dequeue());
	q.enqueue("Goodbye");
	q.enqueue("world");
	System.out.println(q.peek());
	System.out.println(q);

    }

}
