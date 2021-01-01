package com.aphysia.normal;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 7488921480006384819L;
    public  int age;

    public String name;

    private int score;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
