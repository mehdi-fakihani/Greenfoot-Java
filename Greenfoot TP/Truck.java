import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Truck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Truck extends Vehicle
{
    private final double TruckSpeed = 1;   
    
    public Truck()
    {
        super.setSpeed(TruckSpeed);
    }    
    
    /**
     * Act - do whatever the Truck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.move();
        checkCollision();
        if(super.isOffWorld())//If actor is overbound it's replace to mirror image
            resetPositionVehicle();
    }
}
