import java.io.*;
import java.util.*;

public class Recursion{

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

    public static void main(String[]args){
	Recursion r = new Recursion();				    
	// System.out.println(r.factorial(3));
	// System.out.println(r.factorial(4));
	// System.out.println(r.factorial(5));
	// System.out.println(r.factorial(6));
	// System.out.println(r.factorial(7));
	System.out.println(r.fib(45));
	System.out.println(r.fibltr(45));
    }
}
