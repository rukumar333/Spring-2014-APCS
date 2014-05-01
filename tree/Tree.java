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

}
