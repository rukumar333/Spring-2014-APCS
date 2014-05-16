import java.io.*;
import java.util.*;

 public class HeapSort{

    public static void heapify(int[] arr){
	for(int i = 0; i < arr.length; i ++){
	    pushUp(arr,i);
	}
    }

    public static  void heapSort(int[] arr){
	heapify(arr);
	// System.out.println(Arrays.toString(arr));
	heapSort(arr, arr.length - 1);
	// int k = arr[0];
	// arr[0] = arr[arr.length - 1];
	// arr[arr.length - 1] = k;
	// System.out.println(Arrays.toString(arr));
	// pushDown(arr, 0, arr.length - 2);
    }

    public static void heapSort(int[] arr, int last){
	if(last > 0){
	    // System.out.println("This is before the switch \n"+Arrays.toString(arr));
	    int k = arr[0];
	    arr[0] = arr[last];
	    arr[last] = k;
	    // System.out.println("This is after the switch \n"+Arrays.toString(arr) + "\n");
	    pushDown(arr, 0, last - 1);
	    heapSort(arr, last - 1);
	}
    }

    public static void pushUp(int[] arr, int index){
	if(arr[(index - 1)/ 2] <= arr[index] && index != 0){
	    int k = arr[index];
	    arr[index] = arr[(index - 1) / 2];
	    arr[(index - 1) / 2] = k;
	    pushUp(arr, (index - 1) / 2);
	}
    }


    //left child is index * 2 + 1
    //right child is index * 2 + 2
    public static void pushDown(int[] arr, int index, int last){
	int num = arr[index];
	if(index * 2 + 1 <= last){ // checks if the children indexes are within the bounds of the array
	    if(index * 2 + 2 > last && arr[index * 2 + 1] >= num){ // checks if parent has only one child and child is greater than parent
		// System.out.println("CASE 1: " + index);
		arr[index] = arr[index * 2 + 1];
		arr[index * 2 + 1] = num;
		// System.out.println(Arrays.toString(arr));
	    }else{
		if(arr[index * 2 + 1] >= arr[index * 2 + 2] && arr[index * 2 + 1] >= num){ //check for left child
		    // System.out.println("CASE 2: " + index);
		    arr[index] = arr[index * 2 + 1];
		    arr[index * 2 + 1] = num;
		    // System.out.println(Arrays.toString(arr));
		    pushDown(arr, index * 2 + 1, last);
		}else{
		    if(arr[index * 2 + 1] <= arr[index * 2 + 2] && arr[index * 2 + 2] >= num && index * 2 + 2 <= last){ //check for right child	    
			// System.out.println("CASE 3: " + index);
			arr[index] = arr[index * 2 + 2];
			arr[index * 2 + 2] = num;
			// System.out.println(Arrays.toString(arr));
			pushDown(arr, index * 2 + 2, last);
		    }
		}
	    }
	}       
    }


}
