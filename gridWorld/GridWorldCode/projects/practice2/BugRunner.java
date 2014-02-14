import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.*;
import info.gridworld.world.*;


import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BugRunner
{
    public static void main(String[] args)
    {
	//CircleBug
        // ActorWorld world = new ActorWorld();
	// world.setGrid(new UnboundedGrid());
        // CircleBug alice = new CircleBug(6);
        // alice.setColor(Color.ORANGE);
        // CircleBug bob = new CircleBug(3);
        // world.add(new Location(7, 8), alice);
        // world.add(new Location(5, 5), bob);
        // world.show();

	//SpiralBug
        // ActorWorld world = new ActorWorld();
	// world.setGrid(new UnboundedGrid());
        // SpiralBug alice = new SpiralBug(6);
        // alice.setColor(Color.ORANGE);
        // SpiralBug bob = new SpiralBug(3);
        // world.add(new Location(7, 8), alice);
        // world.add(new Location(5, 5), bob);
        // world.show();
        ActorWorld world = new ActorWorld();
	world.setGrid(new UnboundedGrid());
        SpiralBug alice = new SpiralBug(6);
        alice.setColor(Color.ORANGE);
        SpiralBug bob = new SpiralBug(3);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}
