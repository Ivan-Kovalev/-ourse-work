package course_work1;

import java.util.Objects;

public class Employee {
    //поля класса
    private int id;
    private String name;
    private int department;
    private int salary;

    //конструктор
    public Employee(int id, String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = id;
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

    public int getId() {
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
    public String toString() {
        return id + ") " + name + " из " + department + " отдела. З/п составила: " + salary + " рублей.";
    }
}
