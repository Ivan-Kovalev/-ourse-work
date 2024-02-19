package course_work1;

import java.nio.file.FileSystemLoopException;

public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Даша", 1, 10_000);
        employeeBook.addEmployee("Паша", 1, 20_000);
        employeeBook.addEmployee("Маша", 2, 30_000);
        employeeBook.addEmployee("Саша", 2, 40_000);
        employeeBook.addEmployee("Гриша", 3, 50_000);

        employeeBook.addEmployee("Наташа", 3, 60_000);
        employeeBook.addEmployee("Гоша", 4, 70_000);
        employeeBook.addEmployee("Алеша", 4, 80_000);
        employeeBook.addEmployee("Дима", 5, 90_000);
        employeeBook.addEmployee("Толя", 5, 100_000);

        employeeBook.printEmployees();
        System.out.println("Затраты на зп: " + employeeBook.calculateTotalSalary());
        System.out.println("------------------------------");

        employeeBook.findMinSalary();
        employeeBook.findMaxSalary();
        System.out.println("Средняя зп: " + employeeBook.averageSalary());
        System.out.println("------------------------------");

        employeeBook.printNameEmployees();
        System.out.println("------------------------------");

        employeeBook.indexSalary(5);
        employeeBook.findMinSalaryForDep(3);
        employeeBook.findMaxSalaryForDep(4);
        System.out.println("Cредняя зп 5 отдела: " + employeeBook.averageSalaryForDep(5));
        System.out.println("------------------------------");

        employeeBook.indexSalaryForDep(2, 10);
        employeeBook.printEmployeesForDep(2);
        System.out.println("------------------------------");

        employeeBook.printSalaryLessThan(50_000);
        System.out.println("------------------------------");

        employeeBook.printSalaryMoreThan(70_000);
        System.out.println("------------------------------");

        employeeBook.removeEmployee("Даша");
        employeeBook.getEmployeeForID("Даша");
        System.out.println("------------------------------");

        employeeBook.addEmployee("Ян", 1, 33_222);

        employeeBook.printEmployees();

    }

}