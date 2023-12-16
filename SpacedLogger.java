package Week05CodingAssignment;

																																														
//Step 3b: Creating a class SpacedLogger implementing the Logger interface
class SpacedLogger implements Logger {
 
// Step 5a: Implementing the log method for SpacedLogger
 @Override
 public void log(String message) {
// Adding a space between each character
     String spacedMessage = String.join(" ", message.split(""));
     System.out.println(spacedMessage);
     System.out.println();
 }

// Step 5b: Implementing the error method for SpacedLogger
 @Override
 public void error(String message) {
// Adding a space between each character, preceded by "ERROR: "
     String spacedErrorMessage = String.join(" ", ("ERROR: " + message).split(""));
     System.out.println(spacedErrorMessage);
     System.out.println();
 }
}