import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Random r = new Random();
	RunningMedian rm = new RunningMedian();
	for(int i = 0; i < 11; i++){
	    rm.add(r.nextInt(50));
	}
	for(int i = 0; i < 12; i++){
	    rm.remove();
	}
	System.out.println(rm);
	System.out.println(rm.median());
	System.out.println("This is the removed item: " + rm.remove());
	System.out.println(rm);
	System.out.println(rm.median());
    }
}
