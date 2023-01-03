package com.ranaelle.user;

import java.util.Objects;
import java.util.UUID;

public class User {
    // User's attributes
    private String name;
    private int age;
    private UUID id;

    //no args- constructor
    public User() {
    }

    //parameterized constructor
    public User(String name, int age, UUID id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
     // getName method  returns user's name
    public String getName() {
        return name;
    }
    //setName method sets the user's name
    public void setName(String name) {
        this.name = name;
    }
     //getAge method returns the user's age
    public int getAge() {
        return age;
    }
    // setAge method sets the user's age
    public void setAge(int age) {
        this.age = age;
    }
     // getId method returns the user's ID
    public UUID getId() {
        return id;
    }
     //setID method sets the user's ID
    public void setId(UUID id) {
        this.id = id;
    }

    // toString method is used to output the user's attributes
   @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}'+
                "\n";
    }

    //equals and hashcode methods use to compare users objects
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }
}
