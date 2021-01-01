package com.aphysia.transienttest;

import com.aphysia.normal.Student;

import java.io.*;

public class SerialTest {
    public static void main(String[] args) {
        serial();
        deserial();
    }

    private static void serial(){
        try {
            Teacher teacher = new Teacher(9);
            teacher.school = new School("东方小学");
            FileOutputStream fileOutputStream = new FileOutputStream("Teacher.txt");
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(teacher);
            objectOutputStream.flush();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void deserial() {
        try {
            FileInputStream fis = new FileInputStream("Teacher.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Teacher teacher = (Teacher) ois.readObject();
            ois.close();
            System.out.println(teacher.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
