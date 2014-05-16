import java.io.*;
import java.util.*;

public class RunningMedian{
    
    //**REMEMBER!!!!! Max heap has the SMALLER numbers
    // while Min Heap has the BIGGER numbers
    private MinHeap minh = new MinHeap();
    private MaxHeap maxh = new MaxHeap();
    private double median = 0;

    public String name(){
	return "Kumar, Rushil";
    }

    public void add(int i){
	boolean goMax = false;
	boolean goMin = false;
	if(maxh.getLength() == minh.getLength()){ //this checks if the two heaps are of the same length
	    if(i <  maxh.getMax()){               //this checks if number needs to be put in the max heap
		maxh.add(i);
		median = (double)maxh.getMax();
	    }else{                                //else the min heap
		minh.add(i);
		median = (double)minh.getMin();
	    }
	}else{                                    //the two heaps are NOT the same length anymore
	    if(maxh.getLength() > minh.getLength()){ //the max heap is larger than the min heap
		if(i > maxh.getMax()){            //the number needs to go in the min heap
		    minh.add(i);
		}else{
		    minh.add(maxh.remove());      //the number needs to go to the max heap but max heap is longer than the min heap
		    maxh.add(i);                 
		}
	    }else{                                //otherwise the min heap has to be longer than the max heap
		if(i < minh.getMin()){            //the number needs to go in the max heap
		    maxh.add(i);
		}else{
		    maxh.add(minh.remove());      //the number needs to go to the min heap but min heap is longer than the max heap
		    minh.add(i);
		}
	    }
	    median = ((double)maxh.getMax() + (double)minh.getMin()) / 2.0;   //at this point both heaps should be the same size so we need the average
	}
    }

    public double remove(){
	if(maxh.getLength() == 0 && minh.getLength() == 0){
	    throw new IllegalStateException();
	}
	double result;
	if(maxh.getLength() > minh.getLength()){
	    result = (double)maxh.remove();
	    median = ((double)maxh.getMax() + (double)minh.getMin()) / 2.0;
	    return result;
	}
	if(maxh.getLength() < minh.getLength()){
	    result = (double)minh.remove();
	    median = ((double)maxh.getMax() + (double)minh.getMin()) / 2.0;
	    return result;
	}else{
	    result = getMedian();
	    minh.remove();
	    maxh.remove();
	    median = ((double)maxh.getMax() + (double)minh.getMin()) / 2.0;
	    return result;
	}
    }

    public double getMedian(){  //not sure what was supposed to be the name of this method so i made both do the same thing
	if(maxh.getLength() == 0 && minh.getLength() == 0){
	    throw new IllegalStateException();
	}
	return median;
    }

    public double median(){
	if(maxh.getLength() == 0 && minh.getLength() == 0){
	    throw new IllegalStateException();
	}
	return median;
    }

    public String toString(){
	return "Max Heap: \n" + maxh + "\nMin Heap: \n" + minh;
    }

}
