import kareltherobot.*;
/**
 * Write a description of class Pinsetter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PinSetter extends UrRobot
{
	/**
	 * Constructor for objects of class Pinsetter
	 */
	public PinSetter(int st, int ave, Direction dir, int beeps)
	{
		super (1,5, North, 10);
	}
	
	public void setPins()
	{
	    move();
	    putBeeper();
	    turnLeft();
	    move();
	    turnRight();
	    move();
	    putBeeper();
	    turnRight();
	    move();
	    move();
	    putBeeper();
	    move();
	    turnLeft();
	    move();
	    putBeeper();
	    turnLeft();
	    move();
	    move();
	    putBeeper();
	    move();
	    move();
	    putBeeper();
	    move(); 
	    turnRight();
	    move();
	    turnRight();
	    putBeeper();
	    move();
	    move();
	    putBeeper();
	    move();
	    move();
	    putBeeper();
	    move();
	    move();
	    putBeeper();
	    turnLeft();
	    move();
	    turnLeft();
	    move();
	    move();
	    move();
	    turnLeft();
	    
	    
	}
	public void turnRight()
	{
	    turnLeft();
	    turnLeft();
	    turnLeft();
	    
	}
	   

}
