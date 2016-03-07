import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private static final int CELL_SIZE = 20;
    private static final int WORLD_WIDTH = 40; //in cell
    private static final int WORLD_HEIGHT = 30; //in cell

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WORLD_WIDTH, WORLD_HEIGHT, CELL_SIZE);
        Greenfoot.setSpeed(60);
        
        Player player = new Player();
        addObject(player, WORLD_WIDTH/2, WORLD_HEIGHT-1);
        
        Car car1 = new Car();
        addObject(car1, WORLD_WIDTH/2, WORLD_HEIGHT/2);
        Truck truck1 = new Truck();
        addObject(truck1, WORLD_WIDTH/2, WORLD_HEIGHT/2 + 5);    
        Train train1 = new Train();
        addObject(train1, WORLD_WIDTH/2, WORLD_HEIGHT/2 - 5);    
    }
    public void win()
    {
        //GreenfootImage winText = new GreenfootImage("YOU WIN", 12, null, null, null);
        showText("YOU WIN!", WORLD_WIDTH/2, WORLD_HEIGHT/2); 
        Greenfoot.stop();
    }
    public void lose()
    {
        showText("YOU LOSE!", WORLD_WIDTH/2, WORLD_HEIGHT/2); 
        Greenfoot.stop();
    }
}
