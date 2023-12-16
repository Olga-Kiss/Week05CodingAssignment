package Week05CodingAssignment;

//Step 6: Creating a class named App with a main method
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
// Instantiating instances of each logger class
     Logger asteriskLogger = new AsteriskLogger();
     Logger spacedLogger = new SpacedLogger();

// Testing methods on both instances with Strings of my choice
     asteriskLogger.log("Hi");
     asteriskLogger.error("It's an error, sorry");

     spacedLogger.log("Bye");
     spacedLogger.error("Something went wrong");
 }
}