package Week05CodingAssignment;

//Step 3a: Creating a class AsteriskLogger implementing the Logger interface
class AsteriskLogger implements Logger {
 
// Step 4a: Implementing the log method for AsteriskLogger
 @Override
 public void log(String message) {
     System.out.println("***" + message + "***");
     System.out.println();
 }

 // Step 4b: Implementing the error method for AsteriskLogger
 @Override
 public void error(String message) {
     System.out.println("*********************************");
     System.out.println("***Error: " + message + "***");
     System.out.println("*********************************");
     System.out.println();
 }
}