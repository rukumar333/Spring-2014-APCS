public class Driver{
    public static void main(String[] args){
	MyLinkedList mll = new MyLinkedList();
	mll.add("Rushil",0);
	mll.add("Kumar",1);
	System.out.println(mll);
	// System.out.println(mll.get(10)); 
	// mll.add("Hello", 100);
	System.out.println(mll.get(1));
	System.out.println(mll.length());
	System.out.println(mll.find("Kumar"));
    }
}

