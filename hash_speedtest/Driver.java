import java.util.*;

public class Driver{

    public static void main(String[] args){

	TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
	String s = "Hello";
	String s1 = "Goodbye";
	String s2 = "Rushil";
	Integer i = new Integer(10);
	Integer i1 = new Integer(15);
	Integer i2 = new Integer(120);
	tm.put(s,i);
	tm.put(s2,i2);
	tm.put(s1,i1);
	tm.put(s2,i1);
	System.out.println(tm);


    }
}