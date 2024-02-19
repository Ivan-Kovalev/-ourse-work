package course_work1;

import java.util.Objects;
import java.util.UUID;

public class Employee {
    //поля класса
    private String id;
    private String name;
    private int department;
    private int salary;

    //конструктор
    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = UUID.randomUUID().toString();
    }

    //геттеры и сеттеры + equals, hashCode, toString
    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return id + " - " + name + " из " + department + " отдела. З/п составила: " + salary + " рублей.";
    }
}
