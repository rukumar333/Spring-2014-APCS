// package skeleton;

import javax.swing.JFrame;

public class Skeleton extends JFrame{
    
    public Skeleton(){
	add(new Board());
	setTitle("Skeleton");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(400,400);
	setLocationRelativeTo(null);
	setVisible(true);
	setResizable(false);
    }

    public static void main(String[] args){
	System.out.println(7/2);
	Skeleton s = new Skeleton();
    }

}

