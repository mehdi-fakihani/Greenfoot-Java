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
        if(getNbrRoadVehicle()<getRoadVehicleMax())//Create only if number create < number max
        {
            super.setSpeed(CAR_SPEED);
            setNbrRoadVehicle(getNbrRoadVehicle() + 1);
        }
    }
    public void act() 
    {
        super.move();
        checkCollision();
        if(super.isOffWorld())//If actor is overbound it's replace to mirror image
        {    
            removeVehicle();
            setNbrRoadVehicle(getNbrRoadVehicle() - 1);//Decrement number of Vehicule on the road
            Car car = new Car();// recreate new Car
        }   
    }
}
