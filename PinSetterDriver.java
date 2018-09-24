import kareltherobot.*;
/**
 * Write a description of class NasaBotDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PinSetterDriver implements Directions
{
    public static void main(String args[])
    {
        PinSetter karel = new PinSetter(1,5,North, 10);
        karel.setPins();
    }
    static
    {
    	World.reset();	
    	//World.readWorld("name of world file-must be in project folder");
    	World.setDelay(5);
    	World.setVisible(true);    	
    }
    
}
