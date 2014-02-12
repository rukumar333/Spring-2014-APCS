import java.io.*;
import java.util.*;

public class Recursion{

    private int count = 0;

    public int factorial(int n){
	int result = n;
	if(n == 0){
	    return 1;
	}else{
	    result = n * factorial(n - 1);
	}
	return result;
    }

    public int fib(int n){
	int result = n;
	if(n == 0){
	    return 0;
	}

	if(n == 1){
	    return 1;
	}

	if(n > 1){
	    result = fib(n-1) + fib(n-2);
	}
	return result;
    }

    public int fibltr(int n){
	return fibHelp(0,1,n);
    }

    public int fibHelp(int selast, int last, int num){
	if(num == 0){
	    return selast;
	}else{
	    int x = selast;
	    selast = last;
	    last = selast + x;
	    num --;
	    return fibHelp(selast,last,num);
	}
    }

    public void hail(int x){
	int n = x;
	if(x == 1){
	    System.out.println(x);
	}else{
	    if(x % 2 == 0){
		System.out.println(x);
		hail(n/2);
	    }
	    if(x % 2 == 1){
		System.out.println(x);
		hail(3 * n + 1);
	    }
	}
    }

    public int hailln(){

    }

    public static void main(String[]args){
	Recursion r = new Recursion();				    
	// System.out.println(r.factorial(3));
	// System.out.println(r.factorial(4));
	// System.out.println(r.factorial(5));
	// System.out.println(r.factorial(6));
	// System.out.println(r.factorial(7));
	// System.out.println(r.fib(45));
	// System.out.println(r.fibltr(45));
	r.hail(19);
    }
}
