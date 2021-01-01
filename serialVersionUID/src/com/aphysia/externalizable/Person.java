package com.aphysia.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Person implements Externalizable {
    public int age;
    public transient String name;
    public int score;

    public Person() {
    }

    public Person(int age, String name, int score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        /*
         * 指定序列化时候写入的属性。这里不写入score
         */
        out.writeObject(age);
        out.writeObject(name);
        out.writeObject(score);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        /*
         * 指定序列化时候写入的属性。这里仍然不写入年龄
         */
        this.age = (int)in.readObject();
        this.name = (String)in.readObject();
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
