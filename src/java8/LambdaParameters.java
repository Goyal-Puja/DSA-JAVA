package java8;

interface Addable {
    int addition(int a, int b);
}

class AddableImpl implements Addable {

    @Override
    public int addition(int a, int b) {
        return ( a + b );
    }
}

public class LambdaParameters {    // lambda expression with parameters
    public static void main(String[] args){
        Addable addable = (int a, int b) -> ( a + b );

        Addable addable1 = (int a, int b) -> {           // lambda expression with multiple statements
            int c = a + b;
            return c;
        };

       int result = addable.addition(2,3);
       System.out.println(result);
    }
}
