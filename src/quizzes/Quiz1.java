/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *pick stuff up along the hill, the drop it back down
 * @author laveh2107
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City kw = new City();
        
        //create robot
        RobotSE joe = new RobotSE(kw, 4, 0, Direction.EAST);
        
        //create the hill
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);
       
        //create things
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);
        
        //Move to the hill and pick thing on the way
        joe.move();
        joe.pickThing();
        
        //Move up the hill and pick up thing on the way
        joe.turnLeft();
        joe.move();
        joe.turnRight();
        joe.move();
        joe.pickThing();
        
        //Move up the hill and pick up thing on the way
        joe.turnLeft();
        joe.move();
        joe.turnRight();
        joe.move();
        joe.pickThing();
        
        //Move up the hill 
        joe.turnLeft();
        joe.move();
        joe.turnRight();
        
        //move to pick up last thing on top and start  ehading down
        joe.move();
        joe.pickThing();
        
        //drop things down the hill
        joe.move();
        joe.putThing();
        
        //down the step in hill and drop thing
        joe.move();
        joe.turnRight();
        joe.move();
        joe.turnLeft();
        joe.putThing();
        
        //down the step in hill and drop thing
        joe.move();
        joe.turnRight();
        joe.move();
        joe.turnLeft();
        joe.putThing();
        
        //down the step in hill and drop thing
        joe.move();
        joe.turnRight();
        joe.move();
        joe.turnLeft();
        
        //place thign at bottom of hill and move away from hill
        joe.putThing();
        joe.move();
       
        
        
        
    }
}
