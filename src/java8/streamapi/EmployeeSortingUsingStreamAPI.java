package java8.streamapi;
import java.util.*;
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
                -> o2.getSalary() - o1.getSalary()).collect(Collectors.toList());  // collect method is basically used to create a separate list to store
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


        // employee with minimum salary
        Optional<Employee> minSalaryEmployee = getEmployees().stream()
                .min(Comparator.comparingInt(emp -> emp.getSalary()));
        minSalaryEmployee.ifPresent(employee ->
                System.out.println("Employee with the lowest salary" + employee.getName() + " with salary "+ employee.getSalary())
        );

        // increase the employee salary with the incremented amount
        int incrementSalary = 1000;
        List<Employee> employeesWithIncrementedSalary = getEmployees().stream().peek(employee -> employee.setSalary(employee.getSalary() + incrementSalary)).collect(Collectors.toList());

        // create a map where employee names are the keys and salaries are the values
        Map<String, Integer> nameSalaryMap = getEmployees().stream()
                .collect(Collectors.toMap(employee -> employee.getName() , employee -> employee.getSalary()));

        System.out.println(nameSalaryMap);

        // combine all employee names into a single string
        String combinedNames = getEmployees().stream()
                .map(emp -> emp.getName())
                .collect(Collectors.joining(", "));

        System.out.println(combinedNames);

        // to find the employee whose name start with specific letter
        char startingLetter = 'A';
        List<String> filteredEmployees = getEmployees().stream()
                .filter(employee -> employee.getName().startsWith(String.valueOf(startingLetter)))
                .map(employee -> employee.getName())
                .collect(Collectors.toList());

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
