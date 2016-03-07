import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    private final double CAR_SPEED = 2;
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Car()
    {
        super.setSpeed(CAR_SPEED);
    }
    public void act() 
    {
        super.move();
        checkCollision();
        if(super.isOffWorld())//If actor is overbound it's replace to mirror image
            resetPositionVehicle();
    }
}
