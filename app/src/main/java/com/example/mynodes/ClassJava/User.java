package com.example.mynodes.ClassJava;

public class User{
    private String name;
    private String age;

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
