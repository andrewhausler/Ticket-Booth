import java.util.ArrayList;

public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private ArrayList<Ticket> myTicketHistory;
    private Card myCard;

    public Person(String firstName, String lastName, int age, String phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        myTicketHistory = new ArrayList<Ticket>();
        myCard = null;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public class Card
    {
        private String cardNumber;
        private String expiryDate;
        private String cvvNumber;
        
        public Card(String cardNumber, String expiryDate, String cvvNumber)
        {
            this.cardNumber = cardNumber;
            this.expiryDate = expiryDate;
            this.cvvNumber = cvvNumber;
        }

        public String getCardNumber()
        {
            return cardNumber;
        }

        public void setCardNumber(String cardNumber)
        {
            this.cardNumber = cardNumber;
        }

        public String getExpiryDate()
        {
            return expiryDate;
        }

        public void setExpiryDate(String expiryDate)
        {
            this.expiryDate = expiryDate;
        }

        public String getCvvNumber()
        {
            return cvvNumber;
        }

        public void setCvvNumber(String cvvNumber)
        {
            this.cvvNumber = cvvNumber;
        }

        public String toString()
        {
            return "Card Number: " + cardNumber + " Expiry Date: " + expiryDate + " CVV: " + cvvNumber;
        }
    }

    public String toString()
    {
        return "First Name: " + firstName + " Last Name: " + lastName + " Age: " + age + " Phone Number: " + phoneNumber;
    }
}