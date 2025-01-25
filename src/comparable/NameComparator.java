package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 class Employee implements Comparator<Employee> {
    private String name;
    private String salary;

    Employee(String name, String salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.salary.compareTo(o2.salary);
    }
}

//public class NewComparator {
//     public static void main(String[] args){
//         ArrayList<Employee> personList = new ArrayList<Employee>();
//         personList.add(new Employee( "puja", "1000"));
//         personList.add(new Employee( "xyz", "2000"));
//         personList.add(new Employee( "abc", "500"));
//
//
//     }
//}
