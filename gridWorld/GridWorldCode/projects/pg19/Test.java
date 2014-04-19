import info.gridworld.grid.*;

public class Test{
    
    public static void main(String[] args){
	Location loc1 = new Location(4, 3);
	Location loc2 = new Location(3, 4);
	Location loc3 = loc2.getAdjacentLocation(Location.SOUTH);
	int dir = loc1.getDirectionToward(new Location(6, 5));
	System.out.println(dir);
    }
}
