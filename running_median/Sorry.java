import java.io.*;
import java.util.*;

public class Sorry{

    public void test1(Random r){
	RunningMedian rm = new RunningMedian();
	for(int i = 0; i < 30; i ++){
	    int k = r.nextInt(50);
	    rm.add(k);
	    double d = rm.median();
	    System.out.println("Added " + k + ", median is " + d);
	}
    }

    public void test2(Random r){
	int test = 1;
	RunningMedian rm = new RunningMedian();
	for(int i = 0; i < 30; i ++){
	    int k = r.nextInt(50);
	    rm.add(k);
	    double d = rm.median();
	    if(i == 5){
		i = 1;
		rm.remove();
	    }
	    System.out.println("Added " + k + ", median is " + d);
	}
    }

    public static void main(String[] args){
	Sorry sry = new Sorry();
	Random r = new Random(40);
	sry.test1(r);
    }

}