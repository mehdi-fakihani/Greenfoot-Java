import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Train here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Train extends Vehicle
{
    private final double TRAIN_SPEED = 3;
    private final int MAX_DELAY = 100;
    private int delay = 0;
    
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Train()
    {
        setSpeed(TRAIN_SPEED);
        setImage("train.png");
    }
}
