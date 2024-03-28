import java.util.Scanner;
import java.util.InputMismatchException;

public class AdminPage
{
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        while(true)
        {   
            System.out.println("Administrator Control Panel");
            System.out.println("\t[1] Add A New Ticket Event");
            System.out.println("\t[2] Remove A Ticket Event");
            System.out.println("\t[3] Make A Change To A Ticket Event");
            System.out.print("Input: ");
            switch (getInputInteger())
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    continue;
            }
        }
    }

    public static int getInputInteger()
    {
        try
        {
            int value = input.nextInt();
            return value;
        }
        catch(InputMismatchException ex)
        {
            ex.getMessage();
            return -1;
        }
    }
}