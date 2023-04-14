package hw.hw_6;

import java.util.Objects;

/**
 * Employee
 */
public class Employee {
    private int age;
    private String firstName;
    private String lastName;
    private double salary;

    Employee(int age, String firstName, String lastName, double salary) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    Employee(int age, String firstName, String lastName) {
        this(age, firstName, lastName, 10.0);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee employee) {
            return firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", age: " + age + " years old, salary: " + salary
                + " dollars/hour";
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean olderThan(Employee e) {
        if (this.age > e.age) {
            return true;
        }
        return false;
    }

    public void uprade(double salary) {
        this.salary += salary;
    }
}