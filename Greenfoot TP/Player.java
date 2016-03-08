import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.World;
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
        setImage("player.png");
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
                move(15);
            }
            
            if(Greenfoot.isKeyDown("left"))
            {
                setRotation(180);
                move(15);
            }
            
            if(Greenfoot.isKeyDown("up"))
            {
                setRotation(270);
                move(15);
            }
            
            delay = 20;
        }
        
        else
            delay--;
    }
}
