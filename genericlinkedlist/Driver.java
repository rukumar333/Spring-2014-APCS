public class Driver{
    public static void main(String[] args){
	MyLinkedList<Integer> mll = new MyLinkedList<Integer>();
	Integer one = new Integer(1);
	Integer two = new Integer(2);
	Integer three = new Integer(3);
	mll.add(one,0);
	mll.add(two,1);
	mll.add(three,2);
	mll.remove(1);
	System.out.println(mll);
	// System.out.println(mll.get(10)); 
	// mll.add("Hello", 100);
	System.out.println(mll.get(1));
	System.out.println(mll.length());
	System.out.println(mll.find(one));
    }
}
