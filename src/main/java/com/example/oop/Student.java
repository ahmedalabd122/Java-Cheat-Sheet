package com.example.oop;

public class Student {

    int no;
    String name;
    static int count = 1;
    static String college = "Tanta";
    double gpa;

    Student(int no, String name, double gpa) {
        this.no = count;
        count++;
        this.name = name;
        this.gpa = gpa;
    } 

}
