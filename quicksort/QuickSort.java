import java.io.*;
import java.util.*;

public class QuickSort{

    //    private int focus = -1;

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
	    return quickselect(L,k,left,focus-1);
	}else{
	    return quickselect(L,k,focus+1, right);
	}
    }

    public void quicksort(int[] L,int left, int right){

	int focus = partition(L,left,right);
	if(left-right < 1){
	    return;
	}
	// if(checkEqual(L,left,k)){
	//     return L[left];
	// }
	quicksort(L,left,focus-1);
	quicksort(L,focus+1, right);
    }

    public void quicksort(int[] L){
	quicksort(L,0,L.length-1);
    }

    public int partition(int[] L, int left, int right){
	if(left == right){
	    return left;
	}
	Random r = new Random();
	int[] temp = new int[L.length];
	copy(L,temp);
	int index = r.nextInt(right - left) + left;
	//System.out.println("This is the partition index: " + index + " from " + left + " to " + right);
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

    public void copy(int[]from, int[]to){
	for(int i = 0; i < from.length; i ++){
	    to[i] = from[i];
	}
    }


    //attempt to get rid of the infinite loop
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
    public static void main(String[] args){
	Random r = new Random();
	int [] rand = new int [10];
	for (int i = 0; i < rand.length; i ++){
	    rand[i]=r.nextInt(20+1);
	}
	// int[]rand = {1, 14, 9, 8, 13, 8, 4, 18, 18, 18};
	int[] rand2 = new int[rand.length];
        QuickSort q = new QuickSort();
	MergeSort m = new MergeSort();
	q.copy(rand,rand2);
	System.out.println("This is the initial array \n" + Arrays.toString(rand));	
	m.msort(rand2);
       	System.out.println("This is the sorted array using msort\n" + Arrays.toString(rand2)); 
	// q.quicksort(rand);
       	// System.out.println("This is the sorted array using quicksort\n" + Arrays.toString(rand)); 
	// System.out.println("This is the 6th lowest number: " + q.quickselect(rand, 5));
	// System.out.println(Arrays.toString(rand));
	// int k = q.partition(rand,4,7);
	// System.out.println(k);
    }

}
