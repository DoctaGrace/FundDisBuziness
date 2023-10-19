package GoFundMeApp.Client;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * @authors Dominic Rosch-Grace and Robert Fedor
 * @version 10/17/2023
 * 
 * Client class to communicate with server
 */
public class Client {


    
    //Client constructor
    public Client(String host, int port) {
     
        
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        //Create client instance
        Client cli = new Client("localhost", 6789);
        selectUserOperation();
        
        
        
    }
    

    /**
     * 
     * @param opCode 
     * 
     * Allows user to select the action they wish to perform
     */
    public static void selectUserOperation() {
    
        System.out.println("Welcome to FundDisBuziness! How would you like to proceed?");
        System.out.println("Enter an integer corresponding to the following actions...");
        
        System.out.println("1 - Create new event");
        System.out.println("2 - List existing events");
        
        
        Scanner scan = new Scanner(System.in);
        
        
        while(!scan.hasNextInt()) {
            System.out.println("Invalid input! Please try again...\n");
            System.out.println("1 - Create new event");
            System.out.println("2 - List existing events");
            scan.next();
        }
        
        
        int opCode = scan.nextInt();
        
        if (opCode > 2 || opCode < 1) {
            while (opCode > 2 || opCode < 1) {
                System.out.println("Invalid input! Please try again...");
                System.out.println("1 - Create new event");
                System.out.println("2 - List existing events");
                scan.next();
            }
            opCode = scan.nextInt();
        }
        
        if (opCode == 1) {
        
        } else if (opCode == 2) {
        
        } else {
        
        }
    }
    
   
    
    
    
    
   
}
