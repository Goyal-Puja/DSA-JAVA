package exception;

public class ThrowExample {
    public static void validateAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Age must be 18 and above.");
        }
        System.out.println("Valid Age.");
    }
    public static void main(String[] args){
        validateAge(16);
    }
}


// In Java, throw and throws are used for exception handling but serve different purposes.

// throw keyword :-
// -- used to throw an exception manually.
// -- it is followed by an instance of an exception.
// -- typically used inside a method or block

