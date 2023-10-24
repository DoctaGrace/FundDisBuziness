package GoFundMeApp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Dominic Rosch-Grace and Robert Fedor
 * @version 10/20/2023
 * 
 * Client class to read user input and communicate with server
 */
public class FDBClient {
    
    public static void main(String[] args) throws IOException {
        String sentence = "";
	String serverResponse;
        
        //Greet user
        System.out.println("Welcome to FundDisBuziness!");
        
        //Explain each command
        System.out.println("The following are the different commands you may run:\n");

        //newev info
        System.out.println("newev - Creates a new event. This command requires an event name, amount to raise, and deadline.");
        System.out.println("Each provided parameter should be seperated by a '-' symbol. Target amount values should be of the format: '1000.00' and date values should be of the format 'MM/DD/YYYY'.");
        System.out.println("Example: newev - New Fundraising Event Name - 1000.00 - 09/22/2054.\n");

	//disev info
        System.out.println("disev - Displays every past or current event instance.");
        System.out.println("This command can be ran by simply entering 'disev'.\n");
        
        //funev info
        System.out.println("funev - Funds an existing event instance. This command requires the event name as well as the amount to be donated. The formatting rules of the newev parameters apply to this command, as well.");
        System.out.println("Example: funev - Existing Fundraising Event Name - 2500.00\n");
        
        //evinfo info
        System.out.println("evinfo - Displays the target amount, remaining amount, and deadline of an existing event.");
        System.out.println("This command requires an event name to be passed as a parameter.");
        System.out.println("Example: evinfo - Existing Fundraising Event Name.\n");
        
        //exit info
        System.out.println("Exit - enter 'exit' at any point to terminate your session.\n");
        
        //Process user input so long as they don't enter 'exit'
        while (!sentence.equals("exit")) {
            
            //BufferedReader object to read user input
            BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
            
            //Socket to connect to localhost and port 6789
            Socket clientSocket = new Socket("localhost", 6789); //127.0.0.1

            //DataOutputStream object to store information to be sent to server
            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
            
            //BufferedReader object to store information returned from server
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            //Read in user input initially
            sentence = inFromUser.readLine();
            
            //Write command to outToServer
            outToServer.writeBytes(sentence + '\n');

            //Read line sent from server
            serverResponse = inFromServer.readLine();
            
            System.out.println(serverResponse);

            //Close client socket
            clientSocket.close();
        }
    }
}


