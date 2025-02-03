package exception;

class InvalidAgeException extends Exception {
// constructor to pass the error message to the parent class
    public InvalidAgeException(String message){
        super(message);
    }
}

public class UserDefinedExceptionExample {
    public static void validateAge(int age) throws InvalidAgeException {
      if(age < 0){
          throw new InvalidAgeException("Invalid age: " + age + ". Age must be between 0 and 150");
      }
      System.out.println("Age is valid " +age);
    }

    public static void main(String[] args){
        try {
            validateAge(-5);
        } catch (InvalidAgeException e){
            System.out.println("Caught Exception " + e.getMessage());
        }

        try {
                 validateAge(25);
        } catch (InvalidAgeException e){
               System.out.println("Caught Exception " + e.getMessage());
        }
    }
}

// Exception : -
// 1. system-defined exception ---- These are exception that are predefined in the java
// language and can be thrown automatically by the jvm when an error occurs.

// divided into two categories :
   // checked exception : IOException, SQLException, FileNotFoundException
// unchecked exception : NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException

// 2. User-Defined Exception
// These are exceptions created by the developer to handle specific error.
// we can create our own exception class by extending either Exception ( for checked exception or compile time exception ) or
// RunTimeException ( for unchecked exception )
