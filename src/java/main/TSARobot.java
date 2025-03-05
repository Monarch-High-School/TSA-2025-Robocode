/**
 * Use this template to set up your very own Robocode Robot!
 * @author
 * @version 1.0
 * @since 2025-03
 */

import robocode.*;

public class TSARobot extends Robot {
    /**
     * Every Robot needs a run() method to define its behavior.
     * This is a super basic robot. 
     */
    public void run() {
            // run forever or until you DIE
        while (true) {
                // moves the robot foreward 100 pixels
            ahead(100);
                // spin the gun around 360 degrees (right - clockwise)
                // the robot scanner is mounted on the gun
            turnGunRight(360);
                // move backward 100 pixels
            back(100);
                // spin the gun around 360 degrees (right - clockwise)
            turnGunRight(360);
        }
    }

    /**
     * This is an event handler. Basically, whenever the Robot
     * encounters a robot, do the things in the event handler.
     */
    public void onScannedRobot(ScannedRobotEvent e) {
            // fires a bullet with power 1
        fire(1);
    }
}