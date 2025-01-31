package java8;

@FunctionalInterface
public interface MyFunctionalInterface {
    void print(String msg); // abstract method

    default void m1(){
        System.out.println("Default Method");
    }
    static void m2(){
        System.out.println("Static Method");
    }
}

