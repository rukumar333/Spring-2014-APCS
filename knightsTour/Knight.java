import java.io.*;
import java.util.*;

public class Knight{
    
    public int[][] board;
    int count, xcor, ycor, size;
    public boolean solved = false;

    public String toString(){
	String result = "";
	for(int i = 0; i < board.length; i++){
	    for(int k = 0; k < board.length; k++){
		result = result + board[i][k] + " ";
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
	    if(board[x][y]==0);
	    return true;
	}else{
	    return false;
	}
    }

    public void solve(){
	solve(xcor, ycor);
    }

    public void solve(int x, int y){
	count ++;
	board[x][y] = count;

	if(count == size * size){
	    solved = true;
	}

	if(solved == false){

	    if(inBounds(x + 1, y + 2)){
		solve(x + 1, y + 2);
	    }

	    if(inBounds(x + 1, y - 2)){
		solve(x + 1, y - 2);
	    }

	    if(inBounds(x - 1, y + 2)){
		solve(x - 1, y + 2);
	    }

	    if(inBounds(x - 1, y - 2)){
		solve(x - 1, y - 2);
	    }

	    if(inBounds(x + 2, y + 1)){
		solve(x + 2, y + 1);
	    }

	    if(inBounds(x + 2, y - 1)){
		solve(x + 2, y - 1);
	    }

	    if(inBounds(x - 2, y + 1)){
		solve(x - 2, y + 1);
	    }

	    if(inBounds(x - 2, y - 1)){
		solve(x - 2, y - 1);
	    }

	}

    }

}
