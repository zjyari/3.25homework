import java.time.LocalDate;

public class PastEvent extends Event{
    
    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    private String paymentDetails;
    public static final double EventCost= 10000;

    
    public PastEvent(String eventID, String eventName, String eventLocation, String pointOfContact,
            int totalParticipants, int totalEventDays) {
        super(eventID, eventName, eventLocation, pointOfContact, totalParticipants, totalEventDays);
        
    }

    public LocalDate getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(LocalDate eventStartDate) {
        this.eventStartDate = eventStartDate;
    }

    public LocalDate getEventEndDate() {
        return eventEndDate;
    }

    public void setEventEndDate(LocalDate eventEndDate) {
        this.eventEndDate = eventEndDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String status) {
        this.paymentStatus = status;
    }

    public boolean getRequiresExtension() {
        return requiresExtension;
    }

    public void setRequiresExtension(boolean requiresExtension) {
        this.requiresExtension = requiresExtension;
    }

    @Override
   public void calculateEventCost(){
        
        
    }

    public void setPaymentDetails(String paymentStatus, boolean requiresExtension) {
        this.paymentDetails = "The event cost was " +  EventCost + " and the payment status is " + paymentStatus + 
        "\n" + "The Customer requires extension?: " + requiresExtension;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

   

    @Override
    public String toString(){
        return "Conference Event details: " + "\n" +
        "Event ID: " + getEventID() + "\n" +
        "Event Name: " + getEventName() + "\n" +
        "Event Location: " + getEventLocation() + "\n" +
        "Event start date: "+getEventStartDate()+"\n"+"Event end date: "+getEventEndDate()+"\n"+
        "Total participants: " + getTotalParticipants() + "\n" +
        "The payment details are as follows: " + "\n" + 
        paymentDetails;
    }
    
}
