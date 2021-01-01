package com.aphysia.normal;

import java.io.*;
import java.util.*;
import java.util.function.Consumer;

public class SerialTest {
    Vector<String> myVector = new Vector<>();
    public static void main(String[] args) {
        serial();
        deserial();

    }

    public void test(){
        Vector<String> myVector = new Vector<>();

        // 第一种
        for(String item:myVector){
            System.out.println(item);
        }
        // 第二种
        myVector.forEach(item-> System.out.println(item));
        myVector.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // 第三种
        for(int index = 0;index<myVector.size();index++){
            System.out.println(myVector.get(index));
        }

        // 第四种
        Iterator<String> iterator = myVector.iterator();
        while(iterator.hasNext()){
            System.out.println((String)iterator.next());
        }

        // 第五种
        Enumeration<String> enumeration = myVector.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement().toString());
        }
    }

    private static void getSerialUID(){
        ObjectStreamClass c = ObjectStreamClass.lookup(Student.class);
        long serialID = c.getSerialVersionUID();
        System.out.println(serialID);
    }

    private static void serial(){
        Student student = new Student(9,"Mike");
        Vector<Student> studentList = new Vector<>();
        studentList.add(student);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Student.txt");
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(studentList);
            objectOutputStream.flush();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void deserial() {
        try {
            FileInputStream fis = new FileInputStream("Student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Vector<Student> students = (Vector<Student>) ois.readObject();
            ois.close();
            System.out.println(students);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
