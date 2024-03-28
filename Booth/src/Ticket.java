import java.util.InputMismatchException;

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
        totalTickets = 0;
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

    public void setDate(String month, String day, String year)
    {   
        if(month.length() == 2 && day.length() == 2 && year.length() == 2)
        {
            try
            {
                if(Integer.valueOf(month) > 0 && Integer.valueOf(month) < 13)
                {
                    if(Integer.valueOf(day) > 0 && Integer.valueOf(day) < 32)
                    {
                        if(Integer.valueOf(year) > 0)
                        {
                            this.ticketDate = month+"/"+day+"/"+year;
                        }
                        else
                        {
                            throw new InputMismatchException();
                        }
                    }
                    else
                    {
                        throw new InputMismatchException();
                    }
                }
                else
                {
                    throw new InputMismatchException();
                }
            }
            catch(InputMismatchException ex)
            {
                ex.getMessage();
            }
        }
        else
        {
            throw new InputMismatchException();
        }
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

    /**
     * This Method Finds The Differences Between Dates Of Ticket Events 
     * This Is Mainly Meant For compareTo Method But Easier To Build On A Seperate Method And May Be Used For Other Purposes As Well
     * @param otherTicket
     * @return returns the int number for compareTo to use
     */
    public int checkDateDifferences(Ticket otherTicket)
    {
        if(Integer.valueOf(this.getDate().substring(6, this.getDate().length()-1)) > Integer.valueOf(otherTicket.getDate().substring(6, otherTicket.getDate().length()-1)))
        {
            return 1;
        }
        else if(Integer.valueOf(this.getDate().substring(6, this.getDate().length()-1)) == Integer.valueOf(otherTicket.getDate().substring(6, otherTicket.getDate().length()-1)))
        {
            if(Integer.valueOf(this.getDate().substring(0, 2)) > Integer.valueOf(otherTicket.getDate().substring(0,2)))
            {
                return 1;
            }
            else if(Integer.valueOf(this.getDate().substring(0,2)) == Integer.valueOf(otherTicket.getDate().substring(0,2)))
            {
                if(Integer.valueOf(this.getDate().substring(3, 5)) > Integer.valueOf(otherTicket.getDate().substring(3,5)))
                {
                    return 1;
                }
                else if(Integer.valueOf(this.getDate().substring(3,5)) == Integer.valueOf(otherTicket.getDate().substring(3,5)))
                {
                    return 0;
                }
                else
                {
                    return -1;
                }
            }
            else
            {
                return -1;
            }
        }
        else
        {
            return -1;
        }
    }

    public int compareTo(Ticket otherTicket)
    {
        return checkDateDifferences(otherTicket);
    }

    public String toString()
    {
        return "Event: " + ticketEvent + " Venue: " + ticketVenue + " Date: " + ticketDate + " Time: " + ticketTime + " Price: " + ticketPrice;
    }
}