import java.io.*;
import java.util.*;

public class Sorts{

    //with Strings
    /*
    public static void msort(ArrayList<String> L){
    	if(L.size() != 1){
    	    ArrayList<String> part1 = new ArrayList<String>(L.size()/2);
    	    ArrayList<String> part2 = new ArrayList<String>(L.size() - (L.size()/2));
    	    copy(L,0,L.size()/2,part1);
    	    copy(L,part1.size(),L.size() - L.size()/2,part2);
    	    msort(part1);
    	    msort(part2);
    	    copy(sort(part1,part2),0,L.size(),L);
    	}
    }

    public static String name(){
    	return "Kumar,Rushil";
    }

    public static void copy(ArrayList<String> from,int startindex,int endindex, ArrayList<String> to){
    	if(to.size() == 0){
    	    for(int i = startindex; i - startindex < endindex; i ++){
    		to.add(i - startindex, from.get(i));
    	    }
    	}else{
    	    for(int i = startindex; i - startindex < endindex; i ++){
    		to.set(i - startindex, from.get(i));
    	    }	    
    	}
    }

    public static ArrayList<String> sort (ArrayList<String> a, ArrayList<String> b){
    	ArrayList<String> result = new ArrayList<String>(a.size()+ b.size());
    	while(a.size() > 0 || b.size() > 0){
    	    if(a.size() == 0){
    		while(b.size() > 0){
    		    result.add(b.remove(0));
    		}
    	    }
    	    if(b.size() == 0){
    		while(a.size() > 0){
    		    result.add(a.remove(0));
    		}    	    
    	    }
    	    if(a.size() > 0 && b.size() > 0){
    		if(a.get(0).compareToIgnoreCase(b.get(0)) < 0){
    		    result.add(a.remove(0));
    		}else{
    		    result.add(b.remove(0));
    		}
    	    }
    	}
    	return result;
    }
    */

    //with any object
    
    public static <T extends Comparable<T>> void msort(ArrayList<T> L){
	if(L.size() != 1){
	    ArrayList<T> part1 = new ArrayList<T>(L.size()/2);
	    ArrayList<T> part2 = new ArrayList<T>(L.size() - (L.size()/2));
	    copy(L,0,L.size()/2,part1);
	    copy(L,part1.size(),L.size() - L.size()/2,part2);
	    msort(part1);
	    msort(part2);
	    copy(sort(part1,part2),0,L.size(),L);
	}
    }

    public static <T extends Comparable<T>> void copy(ArrayList<T> from,int startindex,int endindex, ArrayList<T> to){
	if(to.size() == 0){
	    for(int i = startindex; i - startindex < endindex; i ++){
		to.add(i - startindex, from.get(i));
	    }
	}else{
	    for(int i = startindex; i - startindex < endindex; i ++){
		to.set(i - startindex, from.get(i));
	    }	    
	}
    }

    public static <T extends Comparable<T>> ArrayList<T> sort (ArrayList<T> a, ArrayList<T> b){
    	ArrayList<T> result = new ArrayList<T>(a.size()+ b.size());
    	while(a.size() > 0 || b.size() > 0){
    	    if(a.size() == 0){
		while(b.size() > 0){
    		    result.add(b.remove(0));
    		}
    	    }
    	    if(b.size() == 0){
		while(a.size() > 0){
    		    result.add(a.remove(0));
    		}    	    
    	    }
    	    if(a.size() > 0 && b.size() > 0){
    		if(a.get(0).compareTo(b.get(0)) < 0){
    		    result.add(a.remove(0));
    		}else{
    		    result.add(b.remove(0));
    		}
    	    }
    	}
    	return result;
    }
    
    public static void main(String[] args){
    	// Random r = new Random();
    	// ArrayList<String> wordList = new ArrayList<String>();
    	// try {
    	//     Scanner sc = new Scanner(new File("dictionary"));
    	//     while (sc.hasNext()) {
    	// 	String s = sc.next();
    	// 	wordList.add(s);
    	//     }
    	// } catch (FileNotFoundException e) {
    	//     System.out.println("Can't open dictionary - exiting");
    	//     System.exit(0);
    	// }


    	// ArrayList<String> words = new ArrayList<String>();
    	// for(int i = 0; i < 10; i ++){
    	//     words.add(wordList.get(r.nextInt(wordList.size())));
    	// }

    	// ArrayList<String> words2 = new ArrayList<String>();
    	// for(int i = 0; i < 10; i ++){
    	//     words2.add(wordList.get(r.nextInt(wordList.size())));
    	// }
        // Sorts m = new Sorts();
    	// System.out.println(Arrays.toString(words.toArray()));
    	// m.msort(words);
    	// System.out.println(Arrays.toString(words.toArray()));

	//People sort

 	ArrayList<Person> L= new ArrayList<Person>();
	L.add(new Person("Ben"));
	L.add(new Person("Dave"));
	L.add(new Person("Amy"));
	L.add(new Person("Liz"));
	L.add(new Person("Portnoy"));
	L.add(new Person("Wolf"));
	L.add(new Person("Zed"));
	L.add(new Person("Xin"));
	L.add(new Person("Smith"));
	L.add(new Person("Will"));
	L.add(new Person("Ed"));
	L.add(new Person("Eddie"));
	L.add(new Person("Aaron"));
	L.add(new Person("Cary"));
	Sorts.msort(L);
	System.out.println(L);
    }
    
}
