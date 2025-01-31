package java8;

@FunctionalInterface
interface ShapeInterface {
    void draw();
}

class RectangleC implements  ShapeInterface {

    @Override
    public void draw() {
       System.out.println("Draw method called");
    }
}

public class FunctionalInterfaceLambdaExpression {
    public static void main(String[] args){
        ShapeInterface rectanglec = () -> System.out.println("Draw method called using lambda");
        rectanglec.draw();

    }
}
