package course_work1;

import java.util.Iterator;

public class EmployeeBook {

    private final Employee[] employees = new Employee[10];

    public void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public void findMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee minEmployee = null;
        for (Employee employee : employees) {
            if (minEmployee == null && employee != null) {
                minEmployee = employee;
            }
            if (employee != null && employee.getSalary() < min) {
                minEmployee = employee;
                min = employee.getSalary();
            }
        }
        System.out.println("Сотрудник " + minEmployee.getName() + " получил меньше всех - " + minEmployee.getSalary() + " рублей.");
    }

    public void findMaxSalary() {
        int max = 0;
        Employee maxEmployee = null;
        for (Employee employee : employees) {
            if (maxEmployee == null && employee != null) {
                maxEmployee = employee;
            }
            if (employee != null && employee.getSalary() > max) {
                maxEmployee = employee;
                max = employee.getSalary();
            }
        }
        System.out.println("Сотрудник " + maxEmployee.getName() + " получил больше всех - " + maxEmployee.getSalary() + " рублей");
    }

    public int averageSalary() {
        int averageSalary;
        int i = 0;
        int j = 0;
        while (i < employees.length) {
            if (employees[i] != null) {
                j++;
            }
            i++;
        }
        averageSalary = calculateTotalSalary() / j;
        return averageSalary;
    }

    public void printNameEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }

    public void indexSalary(int index) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + ((employee.getSalary() * index) / 100));
            }
        }
    }

    public void findMinSalaryForDep(int department) {
        int min = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min && employee.getDepartment() == department) {
                min = employee.getSalary();
            }
        }
        for (Employee employee1 : employees) {
            if (employee1 != null && employee1.getSalary() == min) {
                System.out.println("Сотрудник " + employee1.getName() + " получил меньше всех в " + department + " отделе - " + employee1.getSalary() + " рублей");
            }
        }
    }

    public void findMaxSalaryForDep(int department) {
        int max = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max && employee.getDepartment() == department) {
                max = employee.getSalary();
            }
        }
        for (Employee employee1 : employees) {
            if (employee1 != null && employee1.getSalary() == max) {
                System.out.println("Сотрудник " + employee1.getName() + " получил больше всех в " + department + " отделе - " + employee1.getSalary() + " рублей");
            }
        }
    }

    public int calculateTotalSalaryForDep(int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public double averageSalaryForDep(int department) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                count++;
            }
        }
        return calculateTotalSalaryForDep(department) / count;
    }

    public void indexSalaryForDep(int department, int index) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() + ((employee.getSalary() * index) / 100));
            }
        }
    }

    public void printEmployeesForDep(int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.getId() + ") " + employee.getName() + ". З/п составила: " + employee.getSalary() + " рублей.");
            }
        }
    }

    public void printSalaryLessThan(int number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < number) {
                System.out.println(employee.getId() + ") " + employee.getName() + ". З/п составила: " + employee.getSalary() + " рублей.");
            }
        }
    }

    public void printSalaryMoreThan(int number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > number) {
                System.out.println(employee.getId() + ") " + employee.getName() + ". З/п составила: " + employee.getSalary() + " рублей.");
            }
        }
    }

    public void addEmployee(int id, String name, int department, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee newEmployee = new Employee(id, name, department, salary);
                employees[i] = newEmployee;
                return;
            }
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                System.out.println("Сотрудник " + employees[i].getName() + " удален");
                employees[i] = null;
            }
        }
    }

    public void getEmployeeForID(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                System.out.println(employee);
            }
        }
    }
}
