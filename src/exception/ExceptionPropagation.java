package exception;

public class ExceptionPropagation {

    public static void methodA(){
        int res = 10/0;
    }
    public static void methodB(){
        methodA();
    }
    public static void methodC(){
        methodB();
    }

    public static void main(String[] args){
        try {
            methodC();
        } catch (ArithmeticException e){
            System.out.println("Exception caught in " + e.getMessage());
        }
    }
}

// Propagation in exception handling means passing an exception from one method to another w
// without handling it immediately. when a method does not catch an exception, it is passed
// to the calling method until it is handled or causes the program to crash.

// if the exception is not caught using a try-catch block, it propagates up the call stack until it reaches the JVM.
// if no suitable exception handler is found, the program terminates abnormally, and the JVM
// prints the exception stack trace.