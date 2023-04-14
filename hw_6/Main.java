package hw.hw_6;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(18, "Egor", "Titov", 10);
        Employee employee2 = new Employee(22, "Igor", "Ivanov");
        Employee employee3 = new Employee(18, "Egor", "Titov", 10);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee2.equals(employee3)); // false
        System.out.println(employee1.equals(employee3)); // true
        System.out.println(employee1.hashCode());
        System.out.println(employee1.getFullName()); // Egor Titov
        System.out.println(employee1.olderThan(employee2)); // false
        System.out.println(employee2);
        employee2.uprade(5);
        System.out.println(employee2);

    }
}
