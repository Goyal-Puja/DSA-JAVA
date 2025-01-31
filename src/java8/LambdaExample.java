package java8;

interface Shape {
    void draw();
}

class Rectangle implements  Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle class : draw() method");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square class : draw() method");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle class : draw() method...");
    }
}
public class LambdaExample {
    public static void main(String[] args){
        Shape rectangle = () -> System.out.println("Rectangle class : draw() method");  // lambda expression
       // rectangle.draw();
        Shape square = () -> System.out.println("Square class : draw() method");
        //square.draw();
        Shape circle = () -> System.out.println("Circle class : draw() method");
        //circle.draw();
        print(rectangle);
        print(square);
        print(circle);
    }
    private static void print(Shape shape){   // here we are passing lambda expression as a parameter
        shape.draw();
    }
}
