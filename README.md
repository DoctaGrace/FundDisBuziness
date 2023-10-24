Demonstrating Java-based multithreading, synchronization, and TCPs with a simple funding platform.

This file walks end users through the download and compilation process, as well as the logic for using the platform.

Prerequisites - JDK (Java Development Kit) and NetBeans IDE

Getting Started - Create a new Java class library. Within source packages, create a new package called 'GoFundMeApp'
From the GoFundMeApp package, copy the contents of each Java class and the events.txt file. The README does not need to be copied over.

Compilation - Compile the project by right-clicking on the project in the projects window and selecting 'clean and build'.

Running the Program - First, right click on the Java class 'FDBServer'. This will activate the project's server. Then, right click on the 'FDBClient' class to begin a session as a user. Since this project supports multithreading, multiple clients can be active.

Program Functions - As a simple event funding platform, this program enables users to view or fund existing events, as well as create new ones. We use a command line interface to process user input.

Using the Platform - Upon running the 'FDBClient' class, users will be presented with a host of command options. Below are commands and their corresponding explanations.

newev - Creates a new event. This command requires an event name, amount to raise, and deadline. Each provided parameter should be separated by a '-' symbol. Target amount values should be of the format: '1000.00' and date values should be of the format 'MM/DD/YYYY'. Example: newev - New Fundraising Event Name - 1000.00 - 09/22/2054.

disev - Displays every past or current event instance. This command can be ran by simply entering 'disev'.

funev - Funds an existing event instance. This command requires the event name as well as the amount to be donated. The formatting rules of the newev parameters apply to this command, as well. Example: funev - Existing Fundraising Event Name - 2500.00

evinfo - Displays the target amount, remaining amount, and deadline of an existing event. This command requires an event name to be passed as a parameter. Example: evinfo - Existing Fundraising Event Name.

Exit - enter 'exit' at any point to terminate your session.

Closing the Program - Once all client sessions have been terminated via the 'exit' command, be sure to cancel the running of the 'FDBServer' class.
