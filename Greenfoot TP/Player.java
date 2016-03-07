import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int delay = 0;
    
    public Player()
    {
        super();
        setRotation(270);
    }
    
    
    public void act() 
    {
        checkInput();
        if(getY() == 0)
            ((MyWorld)getWorld()).win();
    }
    
    public void checkInput()
    {
        if(delay == 0)
        {
            if(Greenfoot.isKeyDown("right"))
            {
                setRotation(0);
                move(1);
            }
            
            if(Greenfoot.isKeyDown("left"))
            {
                setRotation(180);
                move(1);
            }
            
            if(Greenfoot.isKeyDown("up"))
            {
                setRotation(270);
                move(1);
            }
            
            delay = 20;
        }
        
        else
            delay--;
    }
}
