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
    private Node curleft;
    private Node curright;

    public Tree(){
	head = null;
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
}
