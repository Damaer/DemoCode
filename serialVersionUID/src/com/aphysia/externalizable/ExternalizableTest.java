package com.aphysia.externalizable;

import com.aphysia.transienttest.School;

import java.io.*;

public class ExternalizableTest {
    public static void main(String[] args) {
        serial();
        deserial();
    }

    private static void serial(){
        try {
            Person person = new Person(9,"Sam",98);
            FileOutputStream fileOutputStream = new FileOutputStream("person.txt");
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
            objectOutputStream.flush();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void deserial() {
        try {
            FileInputStream fis = new FileInputStream("person.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person person = (Person) ois.readObject();
            ois.close();
            System.out.println(person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
