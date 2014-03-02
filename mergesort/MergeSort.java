import java.io.*;
import java.util.*;

public class MergeSort{

    // public int[] merge (int[]a;int[]b){
    public int[] sort (int[]a,int[]b){

	int track = 0;
	int btrack = 0;
	int atrack = 0;
	int[] result = new int[a.length + b.length];
	while(atrack < a.length || btrack < b.length){
	    if(atrack == a.length){
		for(int k = 0; k + btrack < b.length; k ++){
		    result[track] = b[k + btrack];
		    track ++;
		    btrack ++;
		}
	    }
	    if(btrack == b.length){
		for(int k = 0; k + atrack < a.length; k ++){
		    result[track] = a[k + atrack];
		    track ++;
		    atrack ++;
		}
	    }
	    if(atrack < a.length && btrack < b.length){
		if(a[atrack] < b[btrack]){
		    result[track] = a[atrack];
		    atrack ++;
		}else{
		    result[track] = b[btrack];
		    btrack ++;
		}
		track ++;
	    }
	}
	return result;
    }

    public static void main(String[] args){
	int[] a = {1,3,5,10,12};
	int[] b = {2,8,9,10,100};
        MergeSort m = new MergeSort();
	int[] c = m.sort(a,b);
	System.out.println(Arrays.toString(c));
    }
}
