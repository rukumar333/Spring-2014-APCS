import java.io.*;
import java.util.*;

public class Driver{
    
    public static void main(String[] args){
	MyQueue<String> queue = new MyQueue<String>();
	System.out.println(queue.peek());
	queue.add("Hello");
	System.out.println(queue.poll());
	queue.add("Goodbye");
	queue.add("world");
	System.out.println(queue.peek());
	System.out.println(queue);

    }

}
