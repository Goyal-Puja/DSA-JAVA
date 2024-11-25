//import design_snake_ladder_game.Dice;
//
//abstract class Animal {
//    void speak(){
//        System.out.println("Animal is Speaking");
//    }
//}
//
//class Dog extends Animal {
//    @Override
//    public void speak() { // Override the speak method from Animal interface
//        System.out.println("Dog Speaking");
//    }
//}
//
//class Solution {
//    public static void main(String[] args) {
//        Animal animal = new Dog();
//        animal.speak(); // Output: Dog Speaking
//
//    }
//}

class Addition{

    private int a;
    private int b;

    Addition(){

    }
    Addition(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int add(int a, int b){
        return a+b;
    }

    public float add(float a, float b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args){
     Addition addition = new Addition();
     System.out.print(addition.add(2.0, 3.0));
    }
}











