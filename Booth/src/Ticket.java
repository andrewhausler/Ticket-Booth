public class Ticket implements Comparable<Ticket>
{
    private String ticketEvent;
    private String ticketVenue;
    private String ticketDate;
    private String ticketTime;
    private int ticketPrice;
    private int totalTickets;
    
    public Ticket()
    {
        ticketEvent = "";
        ticketVenue = "";
        ticketDate = "";
        ticketTime = "";
        ticketPrice = 0;
        totalTickets = 500;
    }

    public Ticket(String ticketEvent, String ticketVenue, String ticketDate, String ticketTime, int ticketPrice)
    {
        this.ticketEvent = ticketEvent;
        this.ticketVenue = ticketVenue;
        this.ticketDate = ticketDate;
        this.ticketTime = ticketTime;
        this.ticketPrice = ticketPrice;
        totalTickets = 500;
    }

    public String getEvent()
    {
        return ticketEvent;
    }

    public void setEvent(String ticketEvent)
    {
        this.ticketEvent = ticketEvent;
    }

    public String getVenue()
    {
        return ticketVenue;
    }

    public void setVenue(String ticketVenue)
    {
        this.ticketVenue = ticketVenue;
    }

    public String getDate()
    {
        return ticketDate;
    }

    public void setDate(String ticketDate)
    {
        this.ticketDate = ticketDate;
    }

    public String getTime()
    {
        return ticketTime;
    }

    public void setTime(String ticketTime)
    {
        this.ticketTime = ticketTime;
    }

    public int getPrice()
    {
        return ticketPrice;
    }

    public void setPrice(int ticketPrice)
    {
        this.ticketPrice = ticketPrice;
    }

    public int getTotalTicketsRemaining()
    {
        return totalTickets;
    }

    public void purchasedTicket()
    {
        totalTickets = totalTickets - 1;
    }

    public int checkDateDifferences(Ticket otherTicket);

    public int compareTo(Ticket otherTicket);

    public String toString()
    {
        return "Event: " + ticketEvent + " Venue: " + ticketVenue + " Date: " + ticketDate + " Time: " + ticketTime + " Price: " + ticketPrice;
    }
}