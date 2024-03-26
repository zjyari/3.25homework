public class MusicConcertEvent extends Event{
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private double MusicConcertEventCost;

    public double getMusicConcertEventCost() {
        return MusicConcertEventCost;
    }
    public void setMusicConcertEventCost(double musicConcertEventCost) {
        MusicConcertEventCost = musicConcertEventCost;
    }
    public MusicConcertEvent() {
        
    }
    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String PointOfContact,
            double eventCost, int totalParticipants, int totalEventDays, boolean merchandiseRequired,
            double merchandiseCost) {
        super(eventID, eventName, eventLocation, PointOfContact ,totalParticipants, totalEventDays);
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
        
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
    public void setMerchandiseCost(double merchandiseCost) {
        this.merchandiseCost = merchandiseCost;
    }
    
    
    @Override
    public void calculateEventCost(){
        
        if(merchandiseRequired){
            MusicConcertEventCost +=getMerchandiseCost()*super.getTotalParticipants()+super.getEventCost();
        }
        
    }
    @Override
    public String toString() {
        return "MusicConcertEvent [merchandiseRequired=" + merchandiseRequired + ", merchandiseCost=" + merchandiseCost
                 + "]";
    }

    
}
