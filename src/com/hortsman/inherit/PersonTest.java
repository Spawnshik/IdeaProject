package com.hortsman.inherit;

import com.hortsman.klasses.Employee;

public class PersonTest {
    public static void main(String[] args) {
        Person people[] = new Person[2];
        people[0] = new Employee("Danil Lazarev", 50000, 1989, 10, 1);
        people[1] = new Student("Pasha Gusev", "computer science");
        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
