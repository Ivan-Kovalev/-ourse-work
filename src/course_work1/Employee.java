package course_work1;

import java.util.Objects;

public class Employee {
    //поля класса
    private String name;
    private int department;
    private int salary;

    //счетчик
    private static int id;
    private int counterID;

    //конструктор
    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        id++;
        this.counterID = id;
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

    public int getCounterID() {
        return counterID;
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
        return department == employee.department && salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary);
    }

    @Override
    public String toString() {
        return counterID + ") " + name + " из " + department + " отдела. З/п составила: " + salary + " рублей.";
    }
}
