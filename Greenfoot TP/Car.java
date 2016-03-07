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
        /*if(getNbrRoadVehicle()<getRoadVehicleMax())//Create only if number create < number max
        {*/
            setSpeed(CAR_SPEED);
            setImage("images/car.png");
            //setNbrRoadVehicle(getNbrRoadVehicle() + 1);
        //}
    }
}
