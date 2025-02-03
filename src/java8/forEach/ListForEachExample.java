package java8.forEach;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return this.name + " , " + this.age;
    }
}
public class ListForEachExample {
    public static void main(String[] args){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Puja", 27));
        personList.add(new Person("Muskan", 22));
        personList.add(new Person("Dhara", 26));
        personList.add(new Person("Ankit", 18));

        // without Java8
        for(Person person : personList){
            System.out.println(person);
        }
        // using Java8 feature
        personList.stream().forEach((person) -> System.out.println(person));
    }
}
