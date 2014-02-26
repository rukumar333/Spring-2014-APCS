import java.io.*;
import java.util.*;

public class Knight{
    
    ArrayList<String> steps = new ArrayList<String>();
    public int[][] board;
    int count, xcor, ycor, size;
    public boolean solved = false;

    public String toString(){
	String result = "";
	for(int i = 0; i < board.length; i++){
	    for(int k = 0; k < board.length; k++){
		result = result + board[i][k] + "\t";
	    }
	    result = result + "\n";
	}
	return result;
    }

    public Knight(int x){
	board = new int[x][x];
	ycor = 0;
	xcor = 0;
	count = 0;
	size = x;
    }

    public boolean inBounds(int x, int y){
	if (x < size && y < size && x >= 0 && y >= 0){
	    if(board[x][y]==0){
	    return true;
	    }
	}
	return false;
    }

    public void solve(){
	solve(xcor, ycor, 1);
    }

    public void solve(int x, int y, int n){
	board[x][y] = n;

	if(n == size * size){
	    solved = true;
	    System.out.println("Step " + n + ": (" + x + ", " + y + ")");
	}

	if(!solved){

	    if(inBounds(x + 1, y + 2)){
		solve(x + 1, y + 2, n + 1);
	    }

	    if(inBounds(x + 1, y - 2)){
		if(!solved){
		    solve(x + 1, y - 2, n + 1);
		}
	    }

	    if(inBounds(x - 1, y + 2)){
		if(!solved){
		    solve(x - 1, y + 2, n + 1);
		}
	    }

	    if(inBounds(x - 1, y - 2)){
		if(!solved){
		    solve(x - 1, y - 2, n + 1);
		}
	    }

	    if(inBounds(x + 2, y + 1)){
		if(!solved){
		    solve(x + 2, y + 1, n + 1);
		}
	    }

	    if(inBounds(x + 2, y - 1)){
		if(!solved){
		    solve(x + 2, y - 1, n + 1);
		}
	    }

	    if(inBounds(x - 2, y + 1)){
		if(!solved){
		    solve(x - 2, y + 1, n + 1);
		}
	    }

	    if(inBounds(x - 2, y - 1)){
		if(!solved){
		    solve(x - 2, y - 1, n + 1);
		}
	    }

	    if(!solved){
		board[x][y] = 0;
	    }else{
		System.out.println("Step " + n + ": (" + x + ", " + y + ")");
	    }
	}
    }

    // public void closeSolve(int x, int y, int n){
    // 	board[x][y] = n;

    // 	if(n == size * size){
    // 	    solved = true;
    // 	}

    // 	if(!solved){

    // 	    if(inBounds(x + 1, y + 2)){
    // 		solve(x + 1, y + 2, n + 1);
    // 	    }


    // 	    if(inBounds(x + 1, y - 2)){
    // 		if(!solved){
    // 		solve(x + 1, y - 2, n + 1);
    // 		}
    // 	    }

    // 	    if(inBounds(x - 1, y + 2)){
    // 		if(!solved){
    // 		solve(x - 1, y + 2, n + 1);
    // 		}
    // 	    }

    // 	    if(inBounds(x - 1, y - 2)){
    // 		if(!solved){
    // 		solve(x - 1, y - 2, n + 1);
    // 		}
    // 	    }

    // 	    if(inBounds(x + 2, y + 1)){
    // 		if(!solved){
    // 		solve(x + 2, y + 1, n + 1);
    // 		}
    // 	    }

    // 	    if(inBounds(x + 2, y - 1)){
    // 		if(!solved){
    // 		solve(x + 2, y - 1, n + 1);
    // 		}
    // 	    }

    // 	    if(inBounds(x - 2, y + 1)){
    // 		if(!solved){
    // 		    solve(x - 2, y + 1, n + 1);
    // 		}
    // 	    }

    // 	    if(inBounds(x - 2, y - 1)){
    // 		if(!solved){
    // 		solve(x - 2, y - 1, n + 1);
    // 		}
    // 	    }

    // 	    if(!solved){
    // 		board[x][y] = 0;
    // 	    }

    // 	}

    // }

}
