package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // Primitive data types
        dataTypes();
        // Declarative data types
        declarativeDataTypes();
        // Basic operators and expressions (Arithmetic)
        arithmeticOperators();
        // Scanner input and output
        scanInputPrintOutput();
        // control Flow Statements (Conditional Statements) (Selection Statements)
        selectionStatements();
    }

    public static void dataTypes() {
        // Primitive data types
        byte b = 1; // -128 to 127
        short s = 2; // -32,768 to 32,767
        int x = 3; // -2^31 to 2^31 - 1 32bit integer
        long l = 4; // -2^63 to 2^63 - 1 64bit integer
        float f = 5.0f; // 32-bit floating point max 7 digets after the decimal point
        double d = 6.0; // 64-bit floating point max 15 digets after the decimal point
        char c = 'a'; // 16-bit Unicode character
        boolean bool = true; // true or false
        int binaryToDecimal = 0b101; // binary literal

        // Data type.MAX_VALUE => maximum value of the data type
        // Data type.MIN_VALUE => minimum value of the data type
        // Object data types
        String str = "Hello, World!"; // String of characters
        Integer i = 7; // Integer object
        Double db = 8.0; // Double object
        Character ch = 'b'; // Character object
        Boolean bl = false; // Boolean object
        Float fl = 9.0f; // Float object    

        // widening primitive conversions
        byte by = 10;
        short sh = by;
        int in = sh;
        long lo = in;
        float floa = lo;
        double dou = floa;

        // narrowing primitive conversions
        double doubl = 10.5;
        float flo = (float) doubl;
        long lon = (long) flo;
        int inte = (int) lon;
        short sho = (short) inte;
        byte byt = (byte) sho;
    }

    private static void declarativeDataTypes() {
        // Declarative data types
        // Array
        int[] arr = {1, 2, 3, 4, 5}; // Array of integers
        String[] strArr = {"Hello", "World"}; // Array of strings
        // Multi-dimensional array
        int[][] multiArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // 2D array
        // List
        List<Integer> list = new ArrayList<>(); // List of integers
        list.add(1);
        list.add(2);
        list.add(3);
        // Set
        Set<Integer> set = new HashSet<>(); // Set of integers
        set.add(1);
        set.add(2);
        set.add(3);
        // Map
        Map<Integer, String> map = new HashMap<>(); // Map of integers and strings
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        // Queue
        Queue<Integer> queue = new LinkedList<>(); // Queue of integers
        queue.add(1);
        queue.add(2);
        queue.add(3);
        // Stack
        Stack<Integer> stack = new Stack<>(); // Stack of integers
        stack.push(1);
        stack.push(2);
        stack.push(3);
    }

    private static void arithmeticOperators() {
        // Basic operators and expressions (Arithmetic)
        int a = 10;
        int b = 20;
        // Addition
        int sum = a + b; // 30
        // Subtraction
        int diff = a - b; // -10
        // Multiplication
        int prod = a * b; // 200
        // Division
        int div = b / a; // 2
        // Modulus
        int mod = b % a; // 0
        // Increment
        a++; // 11
        // Decrement
        b--; // 19
        // Compound assignment
        a += 5; // 15
        b -= 5; // 15
        a *= 2; // 20
        b /= 2; // 10
        a %= 3; // 2
        // Precedence and associativity
        int result = 10 + 20 * 30; // 610
        int result2 = (10 + 20) * 30; // 900

        // Unary operators
        int x = 10;
        int y = -x; // -10
        int z = +x; // 10
        // prefix / pre-increment and pre-decrement
        int w = ++x; // 11
        int v = --x; // 10
        // postfix / post-increment and post-decrement
        int u = x++; // 10
        int t = x--; // 11

        // operators return data types
        int i = 10;
        int j = 20;
        int k = i + j; // 30
        double d = i + j; // 30.0
        // if there any data type of the operands is double, the result will be double
        double c = i / j; // 0.5
        double e = (double) i / j; // 0.5

        // Type casting 
        int n = 10;
        double m = (double) n; // 10.0 

        System.out.println((float) n / m);  // converts the n data type for just the line and after the line it will be the same data type

        double o = 10.5;
        int p = (int) o; // 10

    }

    private static void scanInputPrintOutput() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        /*
            ***Scanner class methods***
         * 
         * nextByte() => reads the next byte value
         * nextInt() => reads the next integer value
         * nextLong() => reads the next long value
         * nextFloat() => reads the next float value
         * nextDouble() => reads the next double value
         * next() => reads the next string value
         * nextLine() => reads the next line
         * hasNext() => returns true if there is another token in the input
         * hasNextInt() => returns true if the next token is an integer
         * hasNextLong() => returns true if the next token is a long
         * hasNextFloat() => returns true if the next token is a float
         * hasNextDouble() => returns true if the next token is a double
         * hasNextLine() => returns true if there is another line in the input
         * hasNextByte() => returns true if the next token is a byte
         * hasNextBoolean() => returns true if the next token is a boolean
         * useDelimiter() => sets the delimiter pattern
         * findInLine() => scans the next occurrence of the specified pattern
         * findWithinHorizon() => scans the next occurrence of the specified pattern
         * skip() => skips the specified pattern
         * reset() => resets the scanner
         * match() => returns the match result
         * findWithinHorizon() => scans the next occurrence of the specified pattern
         * close() => closes the scanner
         */
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        in.close(); // close the scanner

        // print formating %d => integer, %f => float, %s => strin
        // %.2f => float with 2 decimal points
        /*
         * d: decimal integer (byte, short, int, long)
         * f: floating-point number (float, double)
         * cC: character Capital C will uppercase the letter
         * sS: String Capital S will uppercase all the letters in the string
         * n: newline
         */
        System.out.printf("The value of n is %d and m is %d%n", n, m);

        // input String and output String
        // next() => reads the next string value and stop reading at the first space
        // nextLine() => reads the next line and stop reading at the end of the line
        String str = in.next();
        System.out.println(str);
        str = in.nextLine();
        System.out.println(str);

        // input single character
        char ch = in.next().charAt(0);
        System.out.println(ch);
    }

    private static void selectionStatements() {
        // if - if else - else - if else if
        // relational operators ==, !=, >, <, >=, <=
        // logical operators &&, ||, !

        int a = 10;
        int b = 20;

        if (a == b); // empty statement it will not do anything because ; ended the statement and the if statement is empty
        if (a == b) {
            // anything in the {} will be executed to excute a single statement no need for {}
        }
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is equal to b");
        }

        // inline if else statement
        String result = (a > b) ? "a is greater than b" : "a is less than b";

        // instanceof operator => checks if an object is an instance of a class => data type
        String str = "Hello, World!";
        if (str instanceof String) {
            System.out.println("str is a string");
        }

        // switch statement
        int day = 3;
        switch (day) { // switch statement can be used with byte, short, int, char, String, enum and wrapper classes of the above data types
            // doesn't accept float or double if you pass any case with float or double it will not compile
            // or if you make a condition like this (5/2) => 2.5 it will neglect the decimal point and take the integer value as the case value
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("WorkDay");
                break;
            case 6:
            case 7:
                System.out.println("WeekEnd");
                break;
            default:
                System.out.println("Invalid day");
        }

        // another way to use the switch statement
        switch (day) {
            case 1, 2, 3, 4, 5 ->
                System.out.println("WorkDay");
            case 6, 7 ->
                System.out.println("WeekEnd");
            default ->
                System.out.println("Invalid day");
        }

        
    }

}
