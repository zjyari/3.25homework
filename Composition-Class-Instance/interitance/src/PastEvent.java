import java.time.LocalDate;

public class PastEvent {
    
    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    private String paymentDetails;
    public static final double EventCost= 10000;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String PointOfContact;
    private int totalParticipants;
    private int totalEventDays;
    
    

   

    public PastEvent(String eventID, String eventName, String eventLocation, String pointOfContact,
            int totalParticipants, int totalEventDays) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        PointOfContact = pointOfContact;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getPointOfContact() {
        return PointOfContact;
    }

    public void setPointOfContact(String pointOfContact) {
        PointOfContact = pointOfContact;
    }

    public int getTotalParticipants() {
        return totalParticipants;
    }

    public void setTotalParticipants(int totalParticipants) {
        this.totalParticipants = totalParticipants;
    }

    public int getTotalEventDays() {
        return totalEventDays;
    }

    public void setTotalEventDays(int totalEventDays) {
        this.totalEventDays = totalEventDays;
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
