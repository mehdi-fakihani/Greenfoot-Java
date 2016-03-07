import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Train here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Train extends Vehicle
{
    private final double trainSpeed = 7;
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Train()
    {
        super.setSpeed(trainSpeed);
    }
    public void act() 
    {
        super.move();
        if(super.isOffWorld())//If actor is overbound it's replace to mirror image
            resetPositionVehicle();
    } 
}
