import java.io.*;
import java.util.*;

public class Driver{
    
    public static void main(String[] args){
	
	MyArrayStack<Integer> astack = new MyArrayStack<Integer>();
	MyStack<Integer> stack = new MyStack<Integer>();
	Integer one = new Integer(1);
	Integer two = new Integer(2);
	Integer three = new Integer(3);
	Integer four = new Integer(4);
	Integer five = new Integer(5);

	long test1, k1, test2, k2;


	for(int i = 0; i < 10000000; i ++){
	    stack.push(one);
	    if(i == 5000000){
		stack.push(four);
	    }
	}
	test1 = System.currentTimeMillis();
	System.out.println(stack.search(four));
	k1 = System.currentTimeMillis() - test1;
	System.out.println("Time for stack: " + k1 + " milliseconds");
	// System.out.println(stack);


	for(int i = 0; i < 10000000; i ++){
	    astack.push(one);
	    if(i == 5000000){
		astack.push(four);
	    }
	}
	test2 = System.currentTimeMillis();
	System.out.println(astack.search(four));
	k2 = System.currentTimeMillis() - test2;
	System.out.println("Time for arraystack: " + k2 + " milliseconds");
	// System.out.println(astack);

    }

}
