package com.aphysia.transienttest;

import java.io.Serializable;

class Teacher implements Serializable {
    public int age;

    public transient School school;
    public Teacher(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", school=" + school +
                '}';
    }
}