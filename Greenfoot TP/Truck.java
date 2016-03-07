import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Truck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Truck extends Vehicle
{
    private double TRUCK_SPEED = 1;   
    
    public Truck()
    {
        //if(getNbrRoadVehicle()<getRoadVehicleMax())//Create only if number create < number max
        //{
            setSpeed(TRUCK_SPEED);
            setImage("images/truck.png");
            //setNbrRoadVehicle(getNbrRoadVehicle() + 1);
        //}
    }    
}
