package com.example.oop;

public class OOP {
    // Object Oriented Programming
    // Object: instance of a class
    // Class: blueprint for objects
    // Objects have states and behaviors
    // States: fields/attributes/data/properties
    // Behaviors: methods/functions/operations/actions
    // setter: set the value of a field
    // getter: get the value of a field

    // class gives me a blueprint for creating objects
    // class is a template for objects
    // class is a user-defined data type
    // class is a reference data type
    // class is a collection of fields and methods
    // class is a collection of similar object
    public static void main(String[] args) {
        Car obj = new Car(null, null, 0, null, 0);
        Car obj2 = new Car(obj);

        Student student1 = new Student(0, null, 0);
        Student student2 = new Student(0, null, 0);
        Student.count = 10;
        Student student3 = new Student(0, null, 0);

        System.out.println(student1.no);
        System.out.println(student2.no);
        System.out.println(student3.no);

    }

}
