package oops;

class Programmer{
    private String name;
    private int age;
    Programmer(){

    }
    Programmer(String name, int age){
        this.name = name;
        this.age = age;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setAge(int age){
        this.age = age;
    }

    int getAge(){
        return age;
    }


}
public class ClassAndObject {
    public static void main(String[] args){
        Programmer programmer = new Programmer("Puja", 25);
        System.out.println(programmer.getName());
        System.out.println(programmer.getAge());

    }
}
