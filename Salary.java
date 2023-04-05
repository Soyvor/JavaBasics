import java.util.*;
class Member {
    String name;
    int age;
    String phone;
    String address;
    double salary;
    
    public Member(String name, int age, String phone, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }
    
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
    
    public Employee(String name, int age, String phone, String address, double salary, String specialization) {
        super(name, age, phone, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;
    
    public Manager(String name, int age, String phone, String address, double salary, String department) {
        super(name, age, phone, address, salary);
        this.department = department;
    }
}

public class Salary {
    public static void main(String[] args) {
        Employee employee = new Employee("Bhushan Zope", 31, "1234567891", "pashan", 300000, "Software Engineering");
        Manager manager = new Manager("Ketan Kotecha", 43, "7878787878", "Akurdi", 100000, "Engineering");
        
        System.out.println("Employee:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone: " + employee.phone);
        System.out.println("Address: " + employee.address);
        System.out.println("Specialization: " + employee.specialization);
        employee.printSalary();
        
        System.out.println("\nManager:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone: " + manager.phone);
        System.out.println("Address: " + manager.address);
        System.out.println("Department: " + manager.department);
        manager.printSalary();
    }
}
