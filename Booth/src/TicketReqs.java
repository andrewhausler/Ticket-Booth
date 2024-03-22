public interface TicketReqs
{
    /**
     * Adds A Ticket To The List Of Other Available Ticket Events
     */
    public void addTicketEvent();

    /**
     * Removes An Active Ticket 
     * This Is Mainly Used For When Sold Out Or Date Has Past By
     * This Should Not Be Used For Mistakes In A Ticket Information And Needed To Remove A False Ticket From The Site
     * Before Adding A Ticket Must Check Specs Thoroughly
     */
    public void removeTicketEvent();

    /**
     * Helps Find The Specific Ticket You Are In Search For 
     */
    public Ticket findTicketEvent(String ticketEventName);

    /**
     * Should Be Used Everytime You Add A New Event Call The Collection.Sort
     * All Will Be Sorted By Expiration
     */
    public void sortTickets();
}