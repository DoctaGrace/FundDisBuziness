package GoFundMeApp.Server;

/**
 * 
 * @authors Dominic Rosch-Grace and Robert Fedor
 * @version 10/17/2023
 * 
 * Class containing logic for an event instance
 */
public class Event {
    
    //Instance variables
    String event_name;
    double target_amount;
    String deadline;
    
    //Event constructor
    public Event(String event_name, double target_amount, String deadline) {
        this.event_name = event_name;
        this.target_amount = target_amount;
        this.deadline = deadline;
    }
    
    
    
    //Setters
    
    /**
     * 
     * @param event_name 
     */
    public void setEventName(String event_name) {
        this.event_name = event_name;
    }
    
    /**
     * 
     * @param target_amount 
     */
    public void setTargetAmount(double target_amount) {
        this.target_amount = target_amount;
    }
    
    /**
     * 
     * @param deadline 
     */
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
    
    //Getters
    
    /**
     * 
     * @return event_name
     */
    public String getEventName() {
        return event_name;
    }
    
    /**
     * 
     * @return target_amount
     */
    public double getTargetAmount() {
        return target_amount;
    }
    
    /**
     * 
     * @return deadline
     */
    public String getDeadline() {
        return deadline;
    }
    
}
