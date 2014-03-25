public class Driver{
    public static void main(String[] args){
	MyLinkedList<String> mll = new MyLinkedList<String>();
	String one = "Hello";
	String two = "Rushil";
	String three = "Kumar";
	mll.add(one,0);
	mll.add(two,1);
	mll.add(three,2);
	System.out.println(mll.getHead());
	// mll.remove(1);
	System.out.println(mll);
	// System.out.println(mll.get(10)); 
	// mll.add("Hello", 100);
	System.out.println(mll.get(0));
	System.out.println(mll.length());
	System.out.println(mll.find(one));
    }
}
