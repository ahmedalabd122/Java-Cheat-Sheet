package com.example;


// import  java.lang.Math;

// You can import a specific method from a class by using the following syntax:
import static java.lang.Math.abs;

//In Java, each public class must be defined in its own file with the same name as the class. Therefore, you need to move the 
//MethodsAndFunctions class to its own file named MethodsAndFunctions.java.
public class MethodsAndFunctions {
    // funtions are defined using the following syntax:
    // <access modifier> <return type> <function name>(<parameters>) { <function body> }
    // The return type is the type of the value that the function returns. If the function does not return a value, the return type is void.
    // The parameters are the values that the function accepts as input. If the function does not accept any input, the parentheses are empty.

    // static means that the function belongs to the class itself, not to any particular instance of the class.
    // This means that you can call the function without creating an instance of the class.
    public static void printHello() {
        System.out.println("Hello, World!");
    }

    // printHello(); // This will cause an error because the printHello function is not called from within another function.
    // To call the printHello function, you need to call it from within the main function.

    static int min(int a, int b, int c){
        int min =a; 
        if(a<b && a<c){
            min = a;
            return min;
        }else if(b<a && b<c){
            min = b;
            return min;
        }else{
            min = c;
            return min;
        }
    }

    // variable-length argument lists
    // You can define a function that accepts a variable number of arguments by using an ellipsis (...) after the type of the last parameter.
    // The variable-length argument list is treated as an array of the specified type.
    static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // The main function is the entry point of a Java program.
    // The main function must be defined with the following signature:
    public static void main(String[] args){
        int a = sum(1,2,3,4,5);


        // built in methods in Java
        // The Math class in Java provides a set of built-in methods for performing mathematical operations.
        // The Math.abs method returns the absolute value of a number.
        // imported Math class and used the abs method or you don't need to import it just call the static methods directly
        Math.abs(a);
        // or I can import the method only and use it like this import static java.lang.Math.abs;
        abs(a);
    }


    // method overloading
    // You can define multiple functions with the same name but different parameter lists. This is called method overloading.
    // Overloading allows different methods to have the same name,
    // but different signetures where the signature can differ by
    // the number of input parameters or type of input parameters or both.
    // Overloading is related to compile-time (or static) polymorphism.
    // The following example defines two functions with the same name but different parameter lists:
    
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b , int c) {
        return a + b;
    }


}
