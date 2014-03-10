import java.io.*;
import java.util.*;

public class Person implements Comparable<Person>{

    public String name;

    public String toString(){
	return name;
    }

    public Person (String s){
	name = s;
    }

    public int compareTo(Person other){
	int result = 0;
	if(other instanceof Person){
	    result = this.toString().compareToIgnoreCase(other.toString());
	}
	return result;
    }

}