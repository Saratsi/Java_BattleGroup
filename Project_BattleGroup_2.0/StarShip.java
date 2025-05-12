public class StarShip
{
    private String name;
    private int speed, firePower;
    
    public StarShip(String name, int speed , int firePower)
    {
        this.name = name;
        this.speed = speed;
        this.firePower = firePower;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getSpeed()
    {
        return speed;
    }
     public int getFirePower()
    {
        return firePower;
    }
    
    public void printShipDetails()
    {
        System.out.println("The name of this StarShip is: "+ getName() + "\nits speed is: " + getSpeed() + "\nits firepower is: " +getFirePower() + ".\n");
    }
}
