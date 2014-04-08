import java.io.*;
import java.util.*;

public class Calculator{

    //+,-,*,/,quit
    private Scanner sc;
    private boolean on = true;
    private MyStack<Double> stack = new MyStack<Double>();


    public void run(){
    	while(true){
	    sc = new Scanner(System.in);
    	    System.out.print(">>>");
    	    String s = sc.next(); 

	    if(s.equals("+")){
		this.add();
	    }

	    if(s.equals("-")){
		this.subtract();
	    }

	    if(s.equals("*")){
		this.multiply();
	    }

	    if(s.equals("/")){
		this.divide();
	    }

	    if(s.equals("quit")){
		System.exit(0);
	    }

	    if(s.equals("p")){
		System.out.println(stack.toString());
	    }

	    try{
		Double d = new Double(Double.parseDouble(s));
		stack.push(d);
	    }catch(Exception E){
	    }

    	}
    }
	


    public void quit(){
	on = false;
    }

    public void clear(){
	stack = new MyStack<Double>();
    }

    public void add(){
	if(stack.empty()){
	    System.out.println("Error: No nums inputted /n");
	}else{
	    Double a = new Double(0.0);
	    Double b = new Double(0.0);
	    try{
		b = stack.pop();
		a = stack.pop();
		double sum = a.doubleValue() + b.doubleValue();
		Double result = new Double(sum);
		stack.push(result);
		System.out.println("" + result);
	    }catch(EmptyStackException e){
		double sum = 0 + a.doubleValue();
		Double result = new Double(sum);
		stack.push(result);
		System.out.println("" + result);
	    }
	}
    }

    public void subtract(){
	if(stack.empty()){
	    System.out.println("Error: No nums inputted /n");
	}else{
	    Double a = new Double(0.0);
	    Double b = new Double(0.0);
	    try{
		b = stack.pop();
		a = stack.pop();
		double difference = a.doubleValue() - b.doubleValue();
		Double result = new Double(difference);
		stack.push(result);
		System.out.println("" + result);
	    }catch(EmptyStackException e){
		double difference = 0 - a.doubleValue();
		Double result = new Double(difference);
		stack.push(result);
		System.out.println("" + result);
	    }	
	}
    }

    public void multiply(){
	if(stack.empty()){
	    System.out.println("Error: No nums inputted /n");
	}else{
	    Double a = new Double(0.0);
	    Double b = new Double(0.0);
	    try{
		b = stack.pop();
		a = stack.pop();
		double product = a.doubleValue() * b.doubleValue();
		Double result = new Double(product);
		stack.push(result);
		System.out.println("" + result);
	    }catch(EmptyStackException e){
		double product = 0 * a.doubleValue();
		Double result = new Double(product);
		stack.push(result);
		System.out.println("" + result);
	    }
	}
    }

    public void divide(){
	if(stack.empty()){
	    System.out.println("Error: No nums inputted /n");
	}else{
	    Double a = new Double(0.0);
	    Double b = new Double(0.0);
	    try{
		b = stack.pop();
		a = stack.pop();
		if(b.doubleValue() != 0.0){
		    double quotient = a.doubleValue() / b.doubleValue();
		    Double result = new Double(quotient);
		    stack.push(result);
		    System.out.println("" + result);
		}else{
		    System.out.println("Error: Dividing by 0");
		    this.clear();
		}
	    }catch(EmptyStackException e){
		if(a.doubleValue() != 0.0){
		    double quotient = 0 / a.doubleValue();
		    Double result = new Double(quotient);
		    stack.push(result);
		    System.out.println("" + result);
		}else{
		    System.out.println("Error: Dividing by 0");
		    this.clear();
		}

	    }
	}
    }
}
