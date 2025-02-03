package exception;

import java.io.IOException;

public class ThrowsExample {

    public static void readFile() throws IOException {
        throw new IOException("File not found.");
    }

    public static void main(String[] args){
        try{
            readFile();
        } catch (IOException e){
            System.out.println("Exception Caught : " + e.getMessage());
        }
    }
}

// throws keyword : -

// -- used in the method signature to declare exception.
// -- Declares an exception that a method may throw.
// -- The calling method must handle it using try-catch or propagate it.




