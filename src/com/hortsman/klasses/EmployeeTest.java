package com.hortsman.klasses;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee staff[] = new Employee[3];
        staff[0] = new Employee("Danil Lazar", 40000, 1990, 3, 15);
        staff[1] = new Employee("Yuri Luzhin", 50000, 1989, 10, 1);
        staff[2] = new Employee("Sergey Onishenko", 75000, 1987, 12, 15);


        for (Employee e : staff) {
            e.raiseSalary(5);
        }
        for (Employee e : staff) {
           System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
           //System.out.println(e);
        }

    }
}