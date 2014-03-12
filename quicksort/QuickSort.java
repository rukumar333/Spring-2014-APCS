import java.io.*;
import java.util.*;

public class QuickSort{
	
    public int quickselect(int[] L, int k){
	return 0;
    }

    public int quickselect(int[] L, int k,int left, int right){
	return 0;
    }

    public int partition(int[] L, int left, int right){
	if(left == right){
	    return left;
	}
	Random r = new Random();
	int[] temp = new int[L.length];
	int index = r.nextInt(right - left) + left;
	System.out.println("This is the partition index: " + index);
	int begin = left;
	int end = right;


	for(int i = left;i < L.length; i ++){
	    if(L[i] < L[index] && i != index){
		temp[begin] = L[i];
		begin ++;
	    }
	    if(L[i] >= L[index] && i != index){
		temp[end] = L[i];
		end --;
	    }
	}
	temp[begin] = L[index];
	L = temp;
	System.out.println(Arrays.toString(temp));
	return begin;
    }

    public static void main(String[] args){
	Random r = new Random();
	int [] rand = new int [10];
	for (int i = 0; i < rand.length; i ++){
	    rand[i]=r.nextInt(20);
	}
        QuickSort q = new QuickSort();
	System.out.println(Arrays.toString(rand));	
	q.partition(rand,0,rand.length-1);
	System.out.println(Arrays.toString(rand));
    }

}
