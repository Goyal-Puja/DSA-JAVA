package comparable;

import java.util.*;

class Person implements Comparable<Person>{
    private int id;
    private String name;
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return name;
    }
    @Override
    public int compareTo(Person o) {     // single sorting sequence
        return Integer.compare(this.id, o.id);
    }
}
public class Solution {
    public static void main(String[] args) {

        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(new Person(1, "puja"));
        personList.add(new Person(5, "xyz"));
        personList.add(new Person(2, "abc"));

        Collections.sort(personList);
        for (Person p : personList) {
            System.out.println(p.getId() + "--->" + p.getName());
        }

//        Collections.sort(personList, new NameComparator());     // multiple sorting sequence
//        for (Person p : personList){
//            System.out.println(p.getId()+"-->"+p.getName());
//        }
    }
}
