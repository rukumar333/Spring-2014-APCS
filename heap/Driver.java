import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	int[] b = new int[50];
	Random r = new Random();
	for(int i = 0; i < b.length; i ++){
	    b[i] = r.nextInt(40);
	}
	int[] a = {9,4,0,-3,1,16,11,18};
	System.out.println(Arrays.toString(b));
	// HeapSort.heapify(b);
	// System.out.println(Arrays.toString(b));
	// int[] b = {9,4,0,-3,1,16,11,18,19};
	// System.out.println(Arrays.toString(b));
	HeapSort.heapSort(b);
	System.out.println(Arrays.toString(b));
    }
}
