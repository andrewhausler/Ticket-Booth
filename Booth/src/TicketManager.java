import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketManager implements TicketReqs<Ticket>
{
    private ArrayList<Ticket> availableTickets;
    private Scanner input;

    public TicketManager()
    {
        availableTickets = new ArrayList<Ticket>();
        input = new Scanner(System.in);
    }

    public void addNewTicketEvent()
    {
        Ticket newTicket = new Ticket();
        System.out.print("Name Of Event: ");
        newTicket.setEvent(input.nextLine());
        System.out.print("Venue Of Event: ");
        newTicket.setVenue(input.nextLine());
        setTicketDate(newTicket);

    }

    public void setTicketDate(Ticket newTicket)
    {
        System.out.println("Date Of Event: ");
        System.out.print("\tMonth: ");
        String month = input.nextLine();
        System.out.print("\tDay: ");
        String day = input.nextLine();
        System.out.print("\tYear: ");
        String year = input.nextLine();
        try
        {
            newTicket.setDate(month, day, year);
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Format Is Incorrect! | MM/DD/YY");
            setTicketDate(newTicket);
        }
    }

    public Ticket removeTicketEvent(String ticketEvent)
    {
        Ticket temp = null;
        for(int i=0; i<availableTickets.size(); i++)
        {
            if(ticketEvent.equals(availableTickets.get(i).getEvent()))
            {
                temp = availableTickets.get(i);
                availableTickets.remove(i);
                return temp;
            }
        }
        return null;
    }

    public Ticket findTicketEvent(String ticketEventName)
    {
        for(int i=0; i<availableTickets.size(); i++)
        {
            if(ticketEventName.equals(availableTickets.get(i).getEvent()))
            {
                return availableTickets.get(i);
            }
        }
        return null;
    }

    public void sortTickets()
    {
        Collections.sort(availableTickets);
    }

}