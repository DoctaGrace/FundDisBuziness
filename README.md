# FundDisBuziness
Demonstrating Java-based multithreading, synchronization, and TCPs with a simple funding platform.

This file walks end users through the download and compilation process, as well as the logic for using the platform.

Prerequisites - 
  JDK (Java Development Kit)
  NetBeans IDE

Getting Started - 
  Download ZIP -
    Navigate to the GitHub repository webpage.
    Click on the 'Code' button.
    Choose 'Download ZIP'.
    Extract the downloaded ZIP file to a directory of your choice.

After obtaining the project files, import it into NetBeans.

Importing the Project into NetBeans - 
  Open NetBeans IDE on your computer.
  Go to File -> Open Project.
  Navigate to the directory where the project files are located.
  Select the project folder and click Open Project.

Compilation - 
  Compile the project by selecting the 'Run' option at top of the screen. Then, select 'clean and build', or simply 'build'. 

Running the Program -
  First, right click on the Java class 'FDBServer'. This will activate the project's server. 
  Then, right click on the 'FDBClient' class to begin a session as a user. 
    Since this project supports multithreading, multiple clients can be active.

Program Functions -
  As a simple event funding platform, this program enables users to view or fund existing events, as well as create new ones. 
  We use a command line interface to process user input.

Using the Platform - 
  Upon running the 'FDBClient' class, users will be presented with a host of command options. Below are commands and their corresponding explanations.
  
  newev - Creates a new event. This command requires an event name, amount to raise, and deadline.
  Each provided parameter should be seperated by a '-' symbol. Target amount values should be of the format: '1000.00' and date values should be of the format 'MM/DD/YYYY'.
  Example: newev - New Fundraising Event Name - 1000.00 - 09/22/2054.

  disev - Displays every past or current event instance.
  This command can be ran by simply entering 'disev'.

  funev - Funds an existing event instance. This command requires the event name as well as the amount to be donated. The formatting rules of the newev parameters apply to this command, as well.
  Example: funev - Existing Fundraising Event Name - 2500.00

  evinfo - Displays the target amount, remaining amount, and deadline of an existing event.
  This command requires an event name to be passed as a parameter.
  Example: evinfo - Existing Fundraising Event Name.

  Exit - enter 'exit' at any point to terminate your session.

Closing the Program -
  Once all client sessions have been terminated via the 'exit' command, be sure to cancel the running of the 'FDBServer' class. 
