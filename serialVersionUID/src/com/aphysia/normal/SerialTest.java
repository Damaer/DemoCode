package com.aphysia.normal;

import java.io.*;

public class SerialTest {
    public static void main(String[] args) {
        deserial();
    }

    private static void getSerialUID(){
        ObjectStreamClass c = ObjectStreamClass.lookup(Student.class);
        long serialID = c.getSerialVersionUID();
        System.out.println(serialID);
    }

    private static void serial(){
        Student student = new Student(9,"Mike");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Student.txt");
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.flush();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void deserial() {
        try {
            FileInputStream fis = new FileInputStream("Student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student student = (Student) ois.readObject();
            ois.close();
            System.out.println(student.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
