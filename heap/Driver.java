import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	HeapSort hp = new HeapSort();
	int[] a = {9,4,0,-3,1,16,11,18};
	System.out.println(Arrays.toString(a));
	hp.heapify(a);
	System.out.println(Arrays.toString(a));
    }
}