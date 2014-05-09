import java.io.*;
import java.util.*;

public class HeapSort{

    public void heapify(int[] arr){
	for(int i = 0; i < arr.length; i ++){
	    pushUp(arr,i);
	}
    }

    public void pushUp(int[] arr, int index){
	if(arr[(index - 1)/ 2] < arr[index] && index != 0){
	    int k = arr[index];
	    arr[index] = arr[(index - 1) / 2];
	    arr[(index - 1) / 2] = k;
	    pushUp(arr, (index - 1) / 2);
	}
    }

    public void pushDown(int[] arr, int index){
    }


}