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
        super.setSpeed(TRAIN_SPEED);
    }
    public void act() 
    {
            super.move();
            checkCollision();
            //If actor is overbound it's replace to mirror image after a moment
            if(super.isOffWorld()){
                if(delay <= 0) {
                    removeVehicle();
                    delay = MAX_DELAY;
                }
                else{
                    delay --;
                }
            }
    } 
}
