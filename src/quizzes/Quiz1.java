/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quizzes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

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
        RobotSE joe = new RobotSE(kw, 4, 1, Direction.EAST);
    }
}
