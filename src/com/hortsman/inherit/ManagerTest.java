package com.hortsman.inherit;

import com.hortsman.klasses.Employee;

import java.util.ArrayList;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Evgenij Lagytin", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        ArrayList<Employee> staff = new ArrayList<>(1);
        staff.add(boss);
        staff.add(new Employee("Yuri Luzhin", 50000, 1989, 10, 1));
        staff.add(new Employee("Sergey Onishenko", 75000, 1987, 12, 15));

        for (Employee e : staff) {
            //System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
            System.out.println(e);
        }
    }
}
