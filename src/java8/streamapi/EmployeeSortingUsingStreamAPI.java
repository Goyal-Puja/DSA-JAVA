package java8.streamapi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private int salary;
    private int age;

    public Employee(int id, String name, int salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return "Employee " + "[ " + this.id + " " + this.name + " " + this.salary + " ]";
    }
}

public class EmployeeSortingUsingStreamAPI {
    public static void main(String[] args){
        // sort employee by salary in ascending order

        List<Employee> employeeSortedList = getEmployees().stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return  (o1.getSalary() - o2.getSalary());
            }
        }).collect(Collectors.toList());
        System.out.println(employeeSortedList);

        //using lambda expression ( in descending order )
        List<Employee> employeeList = getEmployees().stream().sorted((Employee o1, Employee o2)
                -> o2.getSalary() - o1.getSalary()).collect(Collectors.toList());
        System.out.println(employeeList);

        // ascending order
        List<Employee> employeeAscList = getEmployees().stream().sorted((Comparator.comparingLong(Employee::getSalary))).collect(Collectors.toList());
        System.out.println(employeeAscList);

        //descending order
        List<Employee> employeeDescList = getEmployees().stream().sorted((Comparator.comparingLong(Employee::getSalary).reversed())).collect(Collectors.toList());
        System.out.println(employeeDescList);


        // sort employee by their age using stream api ( in ascending order )
        List<Employee> sortedEmployeeByAge = getEmployees().stream().sorted((Employee o1, Employee o2) -> o1.getAge() - o2.getAge()).collect(Collectors.toList());
        System.out.println(sortedEmployeeByAge);

        // using comparator
        getEmployees().stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        });
    }

    private static List<Employee> getEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Puja Goyal", 120000, 27));
        employeeList.add(new Employee(2, "Dhara GOyal", 220000, 26));
        employeeList.add(new Employee(3, "Muskan Goyal", 300000, 21));
        employeeList.add(new Employee(4, "Ankit Goyal", 10000000, 18));
        return employeeList;
    }
}
