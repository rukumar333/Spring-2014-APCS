import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
	
	MyStack<String> stack= new MyStack<String>();
	stack.push("Hello");
	stack.push("Goodbye");
	System.out.println(stack.search("Goodbye"));
	System.out.println(stack);
    }
}
