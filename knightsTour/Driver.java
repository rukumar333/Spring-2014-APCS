import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[]args){
	long time, start;
        try{
            //this grabs the number when you run the command 'java Drive 5'
            int size = Integer.parseInt(args[0]);
            Knight t=new Knight(size);
	    start = System.currentTimeMillis();
            t.solve();//this prints the coordinate version of the solution
	    time = System.currentTimeMillis() - start;
            System.out.println(t);//this prints the board
	    System.out.println("Run time = " + time + " milliseconds");

        }catch(Exception e){
            //this means you didn't have a number after the command!
            e.printStackTrace();
            System.out.println("Correct usage:\njava Drive n\n where n is a positive integer.");
        }
    }
}
