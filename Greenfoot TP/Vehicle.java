import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Vehicle extends Actor
{ 
    private double speed;
    private int x;
    private int y;
    public final void move()
    {
        setLocation((int)Math.round(getX() + speed), getY());
    }
    public void setSpeed(double speed)
    {
        this.speed = speed;
    }
    public double getSpeed()
    {
        return speed;
    }
    public final boolean isOffWorld() 
    {
        return ( (getX() <= 1) || (getY() <= 1) || (getX() >= (getWorld().getWidth()-1)) || (getY() >= (getWorld().getHeight()-1)) );
    }
    public final void resetPositionVehicle()
    {
        int x = getX();
        int newX = getWorld().getWidth() - (x==0 ? 1 : x);
        
        setLocation(newX, getY());
    }
    public void checkCollision()
    {
        if (null != getOneIntersectingObject(Player.class))
        {
            Greenfoot.stop();
        }
    }
}
