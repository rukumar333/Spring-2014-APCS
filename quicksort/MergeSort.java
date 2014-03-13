import java.io.*;
import java.util.*;

public class MergeSort{

    public void copy(int[] from,int startindex, int[] to){
	for(int i = startindex; i - startindex < to.length; i ++){
	    to[i - startindex] = from[i];
	}
    }

    public void msort(int[] a){
	if(a.length != 1){
	    int[] part1 = new int[a.length/2];
	    int[] part2 = new int[a.length - (a.length/2)];
	    copy(a,0,part1);
	    copy(a,part1.length,part2);
	    msort(part1);
	    msort(part2);
	    copy(sort(part1,part2),0,a);
	}
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
	Random r = new Random();
	int [] rand = new int [100];
	for (int i = 0; i < rand.length; i ++){
	    rand[i]=r.nextInt(20);
	}
        MergeSort m = new MergeSort();
	System.out.println(Arrays.toString(rand));
	m.msort(rand);
	System.out.println(Arrays.toString(rand));
    }
}
