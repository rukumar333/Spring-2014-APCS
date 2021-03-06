public class Tree{
    
    public class Node{

	private int data;
	private Node left;
	private Node right;


	public Node(int input){
	    data = input;
	    left = null;
	    right = null;
	}

	public Node getLeft(){
	    return left;
	}

	public Node getRight(){
	    return right;
	}

	public int getData(){
	    return data;
	}

	public void setData(int input){
	    data = input;
	}   

	public void setLeft(Node n){
	    left = n;
	}

	public void setRight(Node n){
	    right = n;
	}

	public String toString(){
	    return data + "";
	}
    }

    private Node head;

    public Tree(){
	head = null;
    }

    public String name(){
	return "Kumar,Rushil";
    }

    public void insert(int data){
	if(head == null){
	    head = new Node(data);
	}else{
	    insert(data, head);
	}
    }	
     
    public void insert(int data, Node n){
	Node temp = new Node(data);
	if(n.getData() >= data){
	    if(n.getLeft() == null){
		n.setLeft(temp);
	    }else{
		insert(data, n.getLeft());
	    }
	}else{
	    if(n.getRight() == null){
		n.setRight(temp);
	    }else{
		insert(data, n.getRight());
	    }
	}
    }


    public Node find(int target){
	return find(target, head);
    }

    public Node find(int target, Node n){
	if(n == null){
	    return null;
	}
	if(n.getData() == target){
	    return n;
	}
	if(n.getData() > target){
	    return find(target, n.getLeft());
	}
	if(n.getData() < target){
	    return find(target, n.getRight());
	}
	return null;
    }
    /*    
    public Node findParent(int target){
	return find(target, head);
    }

    public Node findParent(int target, Node n){
	if(n == null){
	    return null;
	}

	if(n == head){
	    return null;
	}

	left = n.getLeft();
	right = n.getRight();
	if(left.getData() == target)
    }
    */
    /*
    public boolean remove(int target){
	Node temp = find(target);
	if(temp == null){
	    return false;
	}
	if(temp.getLeft() == null && temp.getRight() == null){
	    temp = null;
	    return true;
	}

	if(temp.getLeft() == null){
	    temp.setData(temp.getRight().getData());
	    temp.setRight(temp.getRight().getRight());
	    return true;
	    // temp = temp.getRight();
	    // System.out.println(temp + " Test");
	    // return true;
	}
	if(temp.getRight() == null){
	    temp.setData(temp.getLeft().getData());
	    temp.setLeft(temp.getLeft().getLeft());
	    return true;
	    // temp = temp.getLeft();
	    // System.out.println(temp + " Test");
	    // return true;
	}
	Node tip = temp.getLeft();
	while(tip.getRight() != null){
	    tip = tip.getRight();
	}
	remove(tip.getData());
	temp.setData(tip.getData());
	return false;
    }
    */

    public boolean hasTwoChildren(Node n){
	return n.getLeft() != null && n.getRight() != null;
    }

    public boolean hasChildren(Node n){
	return n.getLeft() != null || n.getRight() != null;
    }

    public boolean hasNoChildren(Node n){
	return n.getLeft() == null && n.getRight() == null;
    }

    public boolean remove(int target){
	boolean t = false;
	boolean left = false;
	boolean right = false;
	Node parent = head;
	Node child = head;

	//this is the first part where we NEED the parent
	while(hasChildren(parent)){             //loop will exit if parent does not have two children
	    System.out.println(parent);
	    if(parent.getLeft() != null && parent.getLeft().getData() == target){ // loop will exit if left has target data
		child = parent.getLeft();
	        left = true;
		break;	     
	    }
	    if(parent.getRight() != null && parent.getRight().getData() == target){// loop will exit if right has target data
		child = parent.getRight();
		right = true;
		break;
	    }
	    if(target > parent.getData() && parent.getRight() != null){
		parent = parent.getRight();
	    }else{
		if(target <= parent.getData() && parent.getLeft() != null){
		    parent = parent.getLeft();
		}
	    }
	}
	if(left){ //checks if a child has target value                  
	    if(hasNoChildren(child)){  // base case if target node has no children
		parent.setLeft(null);
		return true;
	    }
	    if(child.getLeft() != null){ // base case if target node has one child
		parent.setLeft(child.getLeft());
		return true;
	    }
	    if(child.getRight() != null){
		parent.setLeft(child.getRight());
		return true;
	    }
	}
	if(right){
	    if(hasNoChildren(child)){  // base case if target node has no children
		parent.setRight(null);
		return true;
	    }
	    if(child.getLeft() != null){ // base case if target node has one child
		parent.setRight(child.getLeft());
		return true;
	    }
	    if(child.getRight() != null){
		parent.setRight(child.getRight());
		return true;
	    }		
	}
	Node temp = find(target);
	if(temp != null){
	    Node tip = temp.getLeft();
	    while(tip.getRight() != null){
		tip = tip.getRight();
	    }
	    remove(tip.getData());
	    temp.setData(tip.getData());
	    return true;
	}
	return false;
    }

    public String toString(){
	return toString(head);
    }

    public String toString(Node n){
	if(n == null){
	    return "";
	}

	Node left = n.getLeft();
	Node right = n.getRight();

	if(left != null && right != null){
	    String s = "";
	    s = left + "<" + n + ">" + right + "\n";
	    return s + toString(n.getLeft()) + toString(n.getRight());
	}

	if(left == null && right != null){
	    String s = "";
	    s = n + ">" + right + "\n";
	    return s + toString(n.getRight());
	}

	if(left != null && right == null){
	    String s = "";
	    s = left + "<" + n + "\n";
	    return s + toString(n.getLeft());
	}

	// if(left == null && right == null){
	//     return n.toString() + "\n";
	// }
	return "";
    }

    public static void main(String[] args){
	Tree t = new Tree();
	System.out.println(t);
	t.insert(50);
	t.insert(100);
	t.insert(25);
	t.insert(44);
	t.insert(10);
	t.insert(80);
	t.insert(75);
	t.insert(150);
	System.out.println(t);
	t.remove(50);
	System.out.println(t);
	// System.out.println(t.getHead().getData());
	// System.out.println(t.getHead().getRight().getData());
	// System.out.println(t.getHead().getLeft().getData());
	// System.out.println(t.find(10));
	// System.out.println(t.find(100));
    }
}



