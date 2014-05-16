import java.io.*;
import java.util.*;

public class QuickSort{

    public int quickselect(int[] L, int k){
	int result = quickselect(L,k,0,L.length - 1);
	return result;
    }

    public int quickselect(int[] L, int k,int left, int right){
	int focus = partition(L,left,right);
	//System.out.println(Arrays.toString(L));
	//System.out.println("This is the focus " + focus);
	if(focus == k){
	    return L[k];
	}
	if(checkEqual(L,left,k)){
	    return L[left];
	}
	if(focus > k){
	    return quickselect(L,k,left,focus);
	}else{
	    return quickselect(L,k,focus, right);
	}
    }

    public void quicksort(int[] L,int left, int right){

	int focus = partition(L,left,right);
	// System.out.println(Arrays.toString(L));
	// System.out.println("This is the focus " + focus);
	if(right-left < 2){
	    return;
	}

	//this is to ensure the function does not go on in an infinite loop
	if(checkGreater(L,left,right)){
	    return;
	}

	// if(checkEqual(L,left,k)){
	//     return L[left];
	// }
	quicksort(L,left,focus);
	quicksort(L,focus, right);
    }

    public void quicksort(int[] L){
	quicksort(L,0,L.length-1);
    }

    //improved version of partition using Mr.K's algorithm
    public int partition(int[]L,int left,int right){
	if(left == right){
	    return left;
	}
	Random r = new Random();
	int index = r.nextInt(right - left) + left;
	int t = L[right];
	L[right] = L[index];
	L[index] = t;

	for(int i = left; i < right; i ++){
	    if(L[i] < L[right]){
		t = L[i];
		L[i] = L[left];
		L[left] = t;
		left ++;
	    }
	}

	t = L[right];
	L[right] = L[left];
	L[left] = t;
	return left;
    }

    //the original partition, it was very slow
    /*
    public int partition(int[] L, int left, int right){
    	if(left == right){
    	    return left;
    	}
    	Random r = new Random();
    	int[] temp = new int[L.length];
    	copy(L,temp);
    	int index = r.nextInt(right - left) + left;
    	// System.out.println("This is the partition index: " + index + " from " + left + " to " + right);
    	int begin = left;
    	int end = right;


    	for(int i = left;i < right + 1; i ++){
    	    int k = 0;
    	    if(L[i] < L[index] && i != index){
    		temp[begin] = L[i];
    		begin ++;
    	    }
    	    if(L[i] >= L[index] && i != index){
    		temp[end] = L[i];
    		end --;
    		if(L[i] == L[index]){
    		    k = -1;
    		}
    	    }
    	    if(L[i] == L[index] && i != index && k == 0){
    		temp[begin] = L[i];
    		begin ++;
    	    }

    	}
    	temp[begin] = L[index];
    	copy(temp,L);
    	return begin;
    }
    */

    public void copy(int[]from, int[]to){
	for(int i = 0; i < from.length; i ++){
	    to[i] = from[i];
	}
    }

    public boolean equalsTo(int[] a, int[] b){
	for(int i = 0; i < a.length; i ++){
	    if(a[i] != b[i])
		return false;
	}
	return true;
    }


    //gets rid of the infinite loop in the quickselect
    public boolean checkEqual(int[] L,int start, int end){
	int check = L[start];
	for(int i = start; i < end + 1;i ++ ){
	    if(check == L[i]){
	    }else{
		return false;
	    }
	}
	return true;
    }

    //gets rid of infinite loop in the sort
    public boolean checkGreater(int[] L, int start, int end){
	for(int i = start; i < end; i ++){
	    if(L[i] > L[i+1]){
		return false;
	    }
	}
	return true;
    }
    public static void main(String[] args){
	Random r = new Random();
	
	long start, t;

	//creat an array of random numbers
	int [] rand = new int [100000];
	for (int i = 0; i < rand.length; i ++){
	    rand[i]=r.nextInt(1000);
 	}
	// int[]rand = {1, 14, 9, 8, 13, 8, 4, 18, 18, 18};

	int[] rand2 = new int[rand.length];
        QuickSort q = new QuickSort();
	q.copy(rand,rand2);
	
	// System.out.println("This is the initial array \n" + Arrays.toString(rand));	
	start = System.currentTimeMillis();
	HeapSort.heapSort(rand2);
	t = System.currentTimeMillis() - start;
	System.out.println("Time for heapsort: " + t);
       	// System.out.println("This is the sorted array using heapsort\n" + Arrays.toString(rand2)); 

	start = System.currentTimeMillis();
	q.quicksort(rand);
	t = System.currentTimeMillis() - start;
	System.out.println("Time for quicksort: " + t);
       	// System.out.println("This is the sorted array using quicksort\n" + Arrays.toString(rand)); 

	// int check = r.nextInt(rand.length);
    	// System.out.println("This is the " + (check + 1) + "th lowest number: " + q.quickselect(rand, check));
    	// System.out.println(Arrays.toString(rand));
    	// int k = q.partition(rand,4,7);
    	// System.out.println(k);
    }

}
