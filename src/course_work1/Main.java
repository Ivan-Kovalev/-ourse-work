package course_work1;

import java.nio.file.FileSystemLoopException;

public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee(1,"Даша", 1, 10_000);
        employeeBook.addEmployee(2,"Паша", 1, 20_000);
        employeeBook.addEmployee(3,"Маша", 2, 30_000);
        employeeBook.addEmployee(4,"Саша", 2, 40_000);
        employeeBook.addEmployee(5,"Гриша", 3, 50_000);

        employeeBook.addEmployee(6,"Наташа", 3, 60_000);
        employeeBook.addEmployee(7,"Гоша", 4, 70_000);
        employeeBook.addEmployee(8,"Алеша", 4, 80_000);
        employeeBook.addEmployee(9,"Дима", 5, 90_000);
        employeeBook.addEmployee(10,"Толя", 5, 100_000);

        employeeBook.printEmployees();

        System.out.println("Затраты на зп: " + employeeBook.calculateTotalSalary());

        employeeBook.findMinSalary();
        employeeBook.findMaxSalary();

        System.out.println("Средняя зп: " + employeeBook.averageSalary());

        employeeBook.printNameEmployees();

        employeeBook.indexSalary(5);

        employeeBook.findMinSalaryForDep(3);
        employeeBook.findMaxSalaryForDep(4);

        System.out.println("Cредняя зп 5 отдела: " + employeeBook.averageSalaryForDep(5));

        employeeBook.indexSalaryForDep(2, 10);

        employeeBook.printEmployeesForDep(1);

        employeeBook.printSalaryLessThan(50_000);
        employeeBook.printSalaryMoreThan(70_000);

        employeeBook.removeEmployee(1);

        employeeBook.getEmployeeForID(1);

        employeeBook.addEmployee(1,"Ян", 1, 33_222);

        employeeBook.printEmployees();

    }

}