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

    public int fibItr(int n){
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

    public String hail(int x){
	String hailnums = "";
	int n = x;
	if(x == 1){
	    count ++;
	    return "1";
	}else{
	    if(x % 2 == 0){
		count ++;
		hailnums = hailnums + x + "," + hail(n/2);
		return hailnums;
	    }
	    if(x % 2 == 1){
		count ++;
		hailnums = hailnums + x + "," + hail(3 * n  + 1);
		return hailnums;
	    }
	}
	return "Error";
    }

    public int hailLen(int x){
	count = 0;
	hail(x);
	int k = count;
	count = 0;
	return k;
    }

    public int longestHail(int x){
	if (x == 1){
	    return 1;
	}else{
	    if(hailLen(x) > hailLen(longestHail(x - 1))){
		return x;
	    }else{
		return longestHail(x - 1);
	    }
	}
    }

    public static void main(String[]args){
	Recursion r = new Recursion();				    
	// System.out.println(r.factorial(3));
	// System.out.println(r.factorial(4));
	// System.out.println(r.factorial(5));
	// System.out.println(r.factorial(6));
	// System.out.println(r.factorial(7));
	// System.out.println(r.fib(45));
	// System.out.println(r.fibItr(45));

	// System.out.println(r.hail(1));
	// System.out.println(r.hail(2));
	// System.out.println(r.hail(3));
	// System.out.println(r.hail(4));
	// System.out.println(r.hail(5));

    	// System.out.println(r.hailLen(1));
    	// System.out.println(r.hailLen(2));
    	// System.out.println(r.hailLen(3));
    	// System.out.println(r.hailLen(4));
    	// System.out.println(r.hailLen(5));

    	System.out.println(r.longestHail(1));
    	System.out.println(r.longestHail(2));
    	System.out.println(r.longestHail(3));
    	System.out.println(r.longestHail(4));
    	System.out.println(r.longestHail(5));	
    	System.out.println(r.longestHail(6));	
    	System.out.println(r.longestHail(7));	
    }
}
