package com.piashraful;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(12,"pIash", 29);
        Student student2 = new Student();
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.roll);
        System.out.println(student1.age);
        System.out.println(student1.name);
        System.out.println(student1.roll);

    }
}
