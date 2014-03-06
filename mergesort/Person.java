import java.io.*;
import java.util.*;

public class Person implements Comparable{

    public String name;

    public String toString(){
	return name;
    }

    public Person (String s){
	name = s;
    }

    public int compareTo(Object other){
	int result = 0;
	if(other instanceof Person){
	    result = this.toString().compareToIgnoreCase(other.toString());
	}
	return result;
    }

}