package com.hortsman.klasses;

import com.hortsman.inherit.Person;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Employee extends Person {
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        super(n);
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (getClass() != otherObject.getClass()) {
            return false;
        }
        Employee other = (Employee) otherObject;
        return getName().equals(other.getName()) && salary == other.salary && hireDay.equals(other.hireDay);
    }
    public int hashCode(){
        return Objects.hash(getName(),salary,hireDay);
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                " salary=" + salary +
                ", hireDay=" + hireDay +
                ']';
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
class Test {
    public static void main(String[] args) {
        Employee e =new Employee("tesrt",22,44,15,22);
        System.out.println(e.getClass().getName()+" "+e.getName());

    }
}
