import java.io.*;
import java.util.*;

public class Sorry{

    public void test1(Random r, int size){
	RunningMedian rm = new RunningMedian();
	for(int i = 0; i < size; i ++){
	    int k = r.nextInt(100);
	    rm.add(k);
	    double d = rm.median();
	    System.out.println("added: " + k + ", median is: " + d + "  " + rm.getSortedArray());
	}
    }

    public void test2(Random r, int size){
	Random rand = new Random();
	int test = 1;
	RunningMedian rm = new RunningMedian();
	for(int i = 0; i < size; i ++){
	    int k = r.nextInt(100);
	    double x;
	    rm.add(k);
	    double d = rm.median();
	    test = r.nextInt(5);
	    System.out.println("added: " + k + ", median is: " + d + "  " + rm.getSortedArray());
	    if(test == 0){
		x = rm.remove();
		d = rm.median();
		System.out.println("removed median is " + x + ".   " + rm.getSortedArray() + "  new median is: " + d);
	    }
	}
    }

    public static void main(String[] args){
	Sorry sry = new Sorry();
	int size = Integer.parseInt(args[0]);
	System.out.println("\nTEST 1:\n");
	for(int i = 1; i < args.length; i ++){
	    int seed = Integer.parseInt(args[i]);
	    Random r = new Random(seed);
	    sry.test1(r,size);
	    System.out.println();
	}
	System.out.println("\nTEST 2:\n");
	for(int i = 1; i < args.length; i ++){
	    int seed = Integer.parseInt(args[i]);
	    Random r = new Random(seed);
	    sry.test2(r,size);
	    System.out.println();
	}
    }

}
