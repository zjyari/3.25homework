public class ConferenceEvent  
{
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;
    private double conferenceEventCost;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String PointOfContact;
    private int totalParticipants;
    private int totalEventDays;
    private CalculateEventCostClass calculateEventCostObject;

    

    public double getBreakfastCost(){
        return breakfastCost;
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

    public String getEventPointOfContact() {
        return PointOfContact;
    }

    public void setEventPointOfContact(String PointOfContact) {
        this.PointOfContact = PointOfContact;
    }

    public void setBreakfastCost(double breakfastCost){
        this.breakfastCost = breakfastCost;
    }

    public double getLunchCost(){
        return lunchCost;
    }

    public void setLunchCost(double lunchCost){
        this.lunchCost = lunchCost;
    }

    public double getDinnerCost(){
        return dinnerCost;
    }

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String PointOfContact, int totalParticipants, int totalEventDays, 
    double breakfastCost, double lunchCost, double dinnerCost){
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.PointOfContact = PointOfContact;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
        this.breakfastCost = breakfastCost;
        this.lunchCost = lunchCost;
        this.dinnerCost = dinnerCost;
        this.calculateEventCostObject =new CalculateEventCostClass();
    }


    
    public double calculateEventCost(){
        conferenceEventCost = calculateEventCostObject.calcualteEventCost()+((breakfastCost + lunchCost + dinnerCost) * getTotalParticipants() * getTotalEventDays());
        conferenceEventCost =0.3*calculateEventCostObject.calcualteEventCost()+conferenceEventCost;
        return conferenceEventCost;

    }


    @Override
    public String toString(){
        return "Conference Event details: " + "\n" +
        "Event ID: " + getEventID() + "\n" +
        "Event Name: " + getEventName() + "\n" +
        "Event Location: " + getEventLocation() + "\n" +
        "Total participants: " + getTotalParticipants() + "\n" +
        "Total Conference Cost: " + conferenceEventCost;
    } 
        
}

    
