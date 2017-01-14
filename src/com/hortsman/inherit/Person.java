package com.hortsman.inherit;

public abstract class Person {
    private String name;
    public Person (String n){
        name=n;
    }
    public abstract String getDescription();

    public String getName() {
        return name;
    }
}
