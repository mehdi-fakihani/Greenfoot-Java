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
    /*private static int nbrRoadVehicle = 0;
    private static final int NBR_ROAD_VEHICLE_MAX = 4;*/
    
    public void act() 
    {
        move();
        checkCollision();
        if(isAtEdge())//If actor is overbound it's replace to mirror image
        {    
            /*removeVehicle();
            setNbrRoadVehicle(getNbrRoadVehicle() - 1);//Decrement number of Vehicule on the road*/
            resetPositionVehicle();
        }   
    }
    public final void resetPositionVehicle()
    {
     int x = getX();
     int newX = getWorld().getWidth() - (x==0 ? 1 : x);
     setLocation(newX, getY());
    }
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
    public final void removeVehicle()//All object over bound is delete
    {
        ((MyWorld)getWorld()).removeObject(this);
    }
    public void checkCollision()
    {
        if (null != getOneIntersectingObject(Player.class))
            ((MyWorld)getWorld()).lose();
    }
    /*public static int getNbrRoadVehicle()
    {
        return nbrRoadVehicle;
    }
    public static void setNbrRoadVehicle(int nbrVehicle)
    {
        nbrRoadVehicle = nbrVehicle;
    }
    public static int getRoadVehicleMax()
    {
        return NBR_ROAD_VEHICLE_MAX;
    }*/
}
