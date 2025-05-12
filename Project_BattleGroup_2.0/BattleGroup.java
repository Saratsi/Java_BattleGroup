import java.util.Random;

public class BattleGroup
{
    private static final int TOP_SPEED = 100, MAX_FIREPOWER = 1000, MAX_NUMBER_OF_STARSHIPS = 10;
    private static Random random = new Random();
    private String name;
    private StarShip ships[];
    private int speed, firePower;
    private static int numOfBattleGroups = 0;
    
    public BattleGroup(String name,int resources)
    {
        int spd=0, firp=0;
        this.name = name;
        
        ships=new StarShip[ resources/(random.nextInt(MAX_NUMBER_OF_STARSHIPS) + 1) ];
        
        for(int i=0; i<ships.length; i++)
        {
            ships[i] = new StarShip(getName() + "-" + i,random.nextInt(TOP_SPEED),random.nextInt(MAX_FIREPOWER));
            spd += ships[i].getSpeed();
            firp += ships[i].getFirePower();
        }
        this.speed = (int)spd/ships.length;
        this.firePower = firp;
    }
    
    public void printGroupDetails()
    {
        System.out.println("\n**************************************\n");
        System.out.println("The name of this Group is:(" + getName() + ") and it consists of the following StarShips:");
        
        for(int i=0; i<ships.length; i++)
        ships[i].printShipDetails();
        System.out.println("\n**************************************\n");
    }
    
    String getName()
    {
        return name;
    }
}