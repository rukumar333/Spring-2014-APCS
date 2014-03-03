import java.io.*;
import java.util.*;

public class MergeSort{

    public void copy(int[] from,int startindex, int[] to){
	for(int i = startindex; i - startindex < to.length; i ++){
	    to[i] = from[i - startindex];
	}
    }

    public void msort(int[] a){
	int[] part1 = new int[a.length/2];
	int[] part2 = new int[a.length - (a.length/2)];
    }

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
	m.copy(c,0,a);
	System.out.println(Arrays.toString(a));
    }
}
