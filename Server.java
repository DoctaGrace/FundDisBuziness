package GoFundMeApp.Server;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @authors Dominic Rosch-Grace and Robert Fedor
 * @version 10/17/2023
 * 
 * Server class to accept communications from client
 */
public class Server {
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //Hashmap to store event instances
        Map<Integer, Event> eventStructure = new HashMap<>() {};
    
        //Populate hashmap with event instances stored in local text file
        try (BufferedReader reader = new BufferedReader(new FileReader("src\\events.txt"))) {
            String line;
            int eventKey = 1;
            //Read each line of text file
            while ((line = reader.readLine()) != null) {
                
                //Attach elements of event line to variables using "-" as delimiter
                String[] event_elements = line.split("-");
                String event_name = event_elements[0].trim();
                String target_amount = event_elements[1].trim();
                String deadline = event_elements[2].trim();
                
                //Create new event instance using the collected information and place into hashmap
                eventStructure.put(eventKey, new Event(event_name, (Double.parseDouble(target_amount)), deadline));
                
                //Increment event key
                eventKey++;
            }
            
            //Display each element of eventStructure hashmap
            for (Map.Entry<Integer, Event> event : eventStructure.entrySet()) {
                System.out.println(event.getKey() + ": " + event.getValue().event_name);
            }
        } catch (Exception ex) {
            System.out.println("There was an issue loading existing events!");
            ex.printStackTrace();
        }
    }
    
    
    
}
