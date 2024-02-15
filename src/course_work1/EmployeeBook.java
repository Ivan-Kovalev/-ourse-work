package course_work1;

public class EmployeeBook {

    private static final Employee[] employees = new Employee[10];

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
        int min = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        for (Employee employee1 : employees) {
            if (employee1 != null && employee1.getSalary() == min) {
                System.out.println("Сотрудник " + employee1.getName() + " получил меньше всех - " + employee1.getSalary() + " рублей");
            }
        }
    }

    public void findMaxSalary() {
        int max = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        for (Employee employee1 : employees) {
            if (employee1 != null && employee1.getSalary() == max) {
                System.out.println("Сотрудник " + employee1.getName() + " получил больше всех - " + employee1.getSalary() + " рублей");
            }
        }
    }

    public int averageSalary() {
        int averageSalary;
        int i = 0;
        int j = 0;
        while (i < employees.length) {
            if (employees[i] != null) {
                i++;
            }
            i++;
            j++;
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
        int min = calculateTotalSalary();
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

    public int averageSalaryForDep(int department) {
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
                System.out.println(employee.getCounterID() + ") " + employee.getName() + ". З/п составила: " + employee.getSalary() + " рублей.");
            }
        }
    }

    public void printSalaryLessThan(int number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < number) {
                System.out.println(employee.getCounterID() + ") " + employee.getName() + ". З/п составила: " + employee.getSalary() + " рублей.");
            }
        }
    }

    public void printSalaryMoreThan(int number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > number) {
                System.out.println(employee.getCounterID() + ") " + employee.getName() + ". З/п составила: " + employee.getSalary() + " рублей.");
            }
        }
    }

    public void addEmployee(String name, int department, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee newEmployee = new Employee(name, department, salary);
                employees[i] = newEmployee;
                return;
            }
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getCounterID() == id) {
                System.out.println("Сотрудник " + employees[i].getName() + " удален");
                employees[i] = null;
            }
        }
    }

    public void getEmployeeForID(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getCounterID() == id) {
                System.out.println(employee);
            }
        }
    }
}
