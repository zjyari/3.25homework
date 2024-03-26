public class MusicConcertEvent  
{
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private double MusicConcertEventCost;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String PointOfContact;
    private int totalParticipants;
    private int totalEventDays;
    private CalculateEventCostClass calculateEventCostObject;

    public double getMusicConcertEventCost() {
        return MusicConcertEventCost;
    }
    public void setMusicConcertEventCost(double musicConcertEventCost) {
        MusicConcertEventCost = musicConcertEventCost;
    }
    public MusicConcertEvent() {
        
    }
    public String getEventID() {
        return eventID;
    }
    public String getEventName() {
        return eventName;
    }
    public String getEventLocation() {
        return eventLocation;
    }
    public String getPointOfContact() {
        return PointOfContact;
    }
    public int getTotalParticipants() {
        return totalParticipants;
    }
    public int getTotalEventDays() {
        return totalEventDays;
    }
    public CalculateEventCostClass getCalculateEventCostObject() {
        return calculateEventCostObject;
    }
    public boolean isMerchandiseRequired() {
        return merchandiseRequired;
    }
    public void setMerchandiseRequired(boolean merchandiseRequired) {
        this.merchandiseRequired = merchandiseRequired;
    }
    public double getMerchandiseCost() {
        return merchandiseCost;
    }
    public MusicConcertEvent(
            String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants,
            int totalEventDays,boolean merchandiseRequired, double merchandiseCost) {
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        PointOfContact = pointOfContact;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;
        this.calculateEventCostObject = new CalculateEventCostClass();
    }
    public void setMerchandiseCost(double merchandiseCost) {
        this.merchandiseCost = merchandiseCost;
    }
    
    
    
    public double calculateEventCost(){
        if(merchandiseRequired){
            MusicConcertEventCost=calculateEventCostObject.calcualteEventCost()+0.3*calculateEventCostObject.calcualteEventCost()+totalParticipants*merchandiseCost;
        }
        return MusicConcertEventCost;
    }
    @Override
    public String toString() {
        return "MusicConcertEvent [merchandiseRequired=" + merchandiseRequired + ", merchandiseCost=" + merchandiseCost
                 + "]";
    }

    
}
