import java.io.*;
import java.util.*;

public class recursion{
    public String lastName(){
        return "Kumar";
    }
    public String firstName(){
        return "Rushil";
    }

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

    public int hailLen(int n){
	count = 0;
	hail(n);
	int k = count;
	count = 0;
	return k;
    }

    public int longestHail(int n){
	if (n == 1){
	    return 1;
	}else{
	    if(hailLen(n) > hailLen(longestHail(n - 1))){
		return n;
	    }else{
		return longestHail(n - 1);
	    }
	}
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


    public recursion(){
        /*leave alone*/
    }
}
