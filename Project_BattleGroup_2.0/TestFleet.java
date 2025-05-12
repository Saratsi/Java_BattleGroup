import java.io.IOException;

public class TestFleet
{
    public static void main(String args[])
    {
        Fleet myFleet;
        
        myFleet = new Fleet("ZEUS");
        myFleet.printFleetDetails();
        
        //Wait for an ENTER to proceed
        System.out.println("Press Enter to continue...");
        try
        {
            int key = System.in.read();
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
    }
}