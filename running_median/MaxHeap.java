import java.io.*;
import java.util.*;

public class MaxHeap{

    private int length;
    private int[] heap;

    public MaxHeap(){
	heap = new int[1000000];
	length = 0;
    }

    public MaxHeap(int[] arr){
	heap = arr;
	heapify();
	length = arr.length;
    }

    public void heapify(){
	for(int i = 0; i < heap.length; i ++){
	    pushUp(i);
	}
    }

    public void add(int i){
	if(length == heap.length){
	    this.grow();
	}
	heap[length] = i;
	pushUp(length);
	length ++;
    }

    public int remove(){
	int num = heap[0];
	heap[0] = heap[length - 1];
	heap[length - 1] = 0;
	pushDown(0,length - 2);
	length --;
	if(length == heap.length / 4){
	    this.shrink();
	}
	return num;
    }


    public void pushUp(int index){
	if(heap[(index - 1)/ 2] <= heap[index] && index != 0){
	    int k = heap[index];
	    heap[index] = heap[(index - 1) / 2];
	    heap[(index - 1) / 2] = k;
	    pushUp((index - 1) / 2);
	}
    }


    //left child is index * 2 + 1
    //right child is index * 2 + 2
    public void pushDown(int index, int last){
	int num = heap[index];
	if(index * 2 + 1 <= last){ // checks if the children indexes are within the bounds of the array
	    if(index * 2 + 2 > last && heap[index * 2 + 1] >= num){ // checks if parent has only one child and child is greater than parent
		// System.out.println("CASE 1: " + index);
		heap[index] = heap[index * 2 + 1];
		heap[index * 2 + 1] = num;
		// System.out.println(Arrays.toString(arr));
	    }else{
		if(heap[index * 2 + 1] >= heap[index * 2 + 2] && heap[index * 2 + 1] >= num){ //check for left child
		    // System.out.println("CASE 2: " + index);
		    heap[index] = heap[index * 2 + 1];
		    heap[index * 2 + 1] = num;
		    // System.out.println(Arrays.toString(arr));
		    pushDown(index * 2 + 1, last);
		}else{
		    if(heap[index * 2 + 1] <= heap[index * 2 + 2] && heap[index * 2 + 2] >= num && index * 2 + 2 <= last){ //check for right child	    
			// System.out.println("CASE 3: " + index);
			heap[index] = heap[index * 2 + 2];
			heap[index * 2 + 2] = num;
			// System.out.println(Arrays.toString(arr));
			pushDown(index * 2 + 2, last);
		    }
		}
	    }
	}       
    }

    public void grow(){
	int[] temp = new int[heap.length * 2];
	for(int i = 0; i < heap.length; i++){
	    temp[i] = heap[i];
	}
	heap = temp;
    }

    public void shrink(){
	int[] temp = new int[heap.length / 2];
	for(int i = 0; i < length; i++){
	    temp[i] = heap[i];
	}
	heap = temp;
    }

    public int getMax(){
	return heap[0];
    }

    public int getLength(){
	return length;
    }

    public String toString(){
	return toString(0);
    }

    public String toString(int i){
	if(i >= length){
	    return "";
	}
	if(length == 1){
	    return heap[i]+"";
	}
	int left = i * 2 + 1;
	int right = i * 2 + 2;

	if(left < length && right < length){
	    String s = "";
	    s = heap[left] + " < " + heap[i] + " > " + heap[right] + "\n";
	    return s + toString(left) + toString(right);
	}

	if(left >= length && right < length){
	    String s = "";
	    s = heap[i] + " > " + heap[right] + "\n";
	    return s + toString(right);
	}

	if(left < length && right >= length){
	    String s = "";
	    s = heap[left] + " < " + heap[i] + "\n";
	    return s + toString(left);
	}

	return "";
    }

    public String getArrayString(){
	return Arrays.toString(heap);
    }

    public int[] getArray(){
	return heap;
    }

}
