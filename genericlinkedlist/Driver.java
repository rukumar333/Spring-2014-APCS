public class Driver{
    public static void main(String[] args){
	MyLinkedList<String> mll = new MyLinkedList<String>();
	String one = "Hello";
	String two = "Rushil";
	String three = "Kumar";
	mll.add(one);
	mll.add(two);
	mll.add(three);
	mll.remove(1);
	System.out.println(mll);
	mll.add(one);
	System.out.println(mll);
	mll.add(three,3);
	System.out.println(mll);
	mll.remove(0);
	System.out.println(mll);
	mll.set(3,two);
	System.out.println(mll);
	// System.out.println(mll.get(10)); 
	// mll.add("Hello", 100);
	System.out.println(mll.get(0));
	System.out.println(mll.length());
	System.out.println(mll.find(one));
    }
}
