package com.example;

import java.util.Arrays;

public class ArrayInJava {

    public static void main(String[] args) {
        // Arrays in Java are objects that store multiple values of the same type.
        // The values in an array are called elements, and each element is accessed by its index.
        // The index of the first element in an array is 0, the index of the second element is 1, and so on.
        // The length of an array is the number of elements it contains.
        // You can create an array in Java using the following syntax:
        // <type>[] <name> = new <type>[<length>];
        // The type is the type of the elements in the array.
        // The name is the name of the array variable.
        // The length is the number of elements in the array.
        // For example, the following code creates an array of integers with a length of 5:
        int[] numbers1 = new int[5];
        // You can also initialize an array with values using the following syntax:
        // <type>[] <name> = {<value1>, <value2>, ...};
        // For example, the following code creates an array of integers with the values 1, 2, and 3:
        int[] numbers2 = {1, 2, 3};
        // OR
        int[] numbers3 = new int[]{1, 2, 3};
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        // You can access an element in an array using the following syntax:
        // <name>[<index>]
        // For example, the following code accesses the first element in the numbers array:
        int firstNumber = (int) numbers2[0];
        // You can change the value of an element in an array using the following syntax:
        // <name>[<index>] = <value>;
        // For example, the following code changes the value of the first element in the numbers array to 10:
        numbers2[0] = 10;
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        // you can define an array with a specific size and then assign values to it and it will take a default value depends on the type of the array
        // For example, the following code creates an array of integers with a length of 5:
        int[] numbers4 = new int[5];
        // The default value of an integer, double, float, long is 0,
        // The default value of a boolean is false,
        // The default value of a char is '\u0000' == null ,
        // The default value of a reference type is null.
        // THe default value of a string is null
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        // You can get the length of an array using the length property:
        // <name>.length
        // For example, the following code gets the length of the numbers array:
        int length = numbers2.length;
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        // You can iterate over the elements of an array using a for loop:
        // for (int i = 0; i < <name>.length; i++) {
        //     <statement>
        // }
        // For example, the following code prints the elements of the numbers array:
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
        // OR you can use the for-each loop to iterate over the elements of an array:
        // for (<type> <name> : <name>) {
        //     <statement>
        // }
        // For example, the following code prints the elements of the numbers array:
        for (int number : numbers2) {
            System.out.println(number);
        }
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        // sort an array
        // You can sort the elements of an array using the Arrays.sort method:
        // Arrays.sort(<name>);
        // For example, the following code sorts the elements of the numbers array:
        Arrays.sort(numbers2);
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        // array of characters
        // You can create an array of characters using the following syntax:
        // char[] <name> = {'a', 'b', 'c'};
        // For example, the following code creates an array of characters with the values 'a', 'b', and 'c':
        char[] characters = {'a', 'b', 'c'};
        // print the elements of the characters array
        for (char character : characters) {
            System.out.println(character);
        }
        // OR 
        System.out.println(characters);
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        // if you add numbers to char array it will add the ASCII value of the number
        // For example, the following code creates an array of characters with the values 'a', 'b', and 'c':
        char[] characters2 = {'a', 'b', 'c', 88, 89, 90};
        // print the elements of the characters array
        System.out.println(characters2); // it will print abcXYZ
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        // pass array to method as a parameter
        // You can pass an array to a method as a parameter:
        // <access modifier> <return type> <function name>(<type>[] <name>) {
        //     <statement>
        // }
        // For example, the following code defines a method that prints the elements of an array:
        printArray(numbers2);
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        // we can pass anonymous array to a method
        printArray(new int[]{1, 2, 3, 4, 5});
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        // we can return an array from a method
        // You can return an array from a method using the following syntax:
        // <access modifier> <return type>[] <function name>() {
        //     <statement>
        // }
        // For example, the following code defines a method that returns an array of integers:
        int[] numbers = getNumbers();
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        // call by reference
        // In Java, arrays are objects, and when you pass an array to a method, you are passing a reference to the array.
        // This means that any changes you make to the array inside the method will affect the original array.
        // For example, the following code defines a method that changes the value of an element in an array:
        changeArray(numbers2);
        // The changeArray method changes the value of the first element in the numbers array to 100.
        // When you print the elements of the numbers array after calling the changeArray method, you will see that the value of the first element has changed to 100.
        // Another example of call by reference
        int[] numbers5 = {1, 2, 3};
        int[] numbers6 = {4, 5, 6};
        numbers5 = numbers6;
        numbers6[0] = 100;
        System.out.println(numbers5[0]); // it will return 100 => because numbers5 and numbers6 are pointing to the same array in the memory
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        // multi-dimensional arrays
        // You can create a multi-dimensional array in Java using the following syntax:
        // <type>[][] <name> = new <type>[<rows>][<columns>];
        // For example, the following code creates a 2D array of integers with 2 rows and 3 columns:
        // you should specify the size of the first dimension only and the other one will be determined automatically
        int[][] matrix = new int[2][3];
        // You can also initialize a multi-dimensional array with values using the following syntax:
        // <type>[][] <name> = {{<value1>, <value2>, ...}, {<value1>, <value2>, ...}, ...};
        // For example, the following code creates a 2D array of integers with the values 1, 2, and 3 in the first row and 4, 5, and 6 in the second row:
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix3 = {{1, 2, 3}, {4, 5}, {6}};
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        // You can access an element in a multi-dimensional array using the following syntax:
        // <name>[<row>][<column>]
        // For example, the following code accesses the element in the first row and second column of the matrix array:
        int element = matrix[0][1];
        // You can iterate over the elements of a multi-dimensional array using nested for loops:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
        // for each loop to iterate over the elements of a multi-dimensional array
        for (int[] row : matrix) {
            for (int number : row) {
                System.out.println(number);
            }
        }
        // send 2d array to method as a parameter
        // You can pass a multi-dimensional array to a method as a parameter:
        // <access modifier> <return type> <function name>(<type>[][] <name>) {
        //     <statement>
        // }
        // For example, the following code defines a method that prints the elements of a 2D array:
        printMatrix(matrix2);

        // you can define a 3D,4D,.... array in Java using the following syntax:
        int[][][] matrix4 = new int[2][3][4];
        int[][][][] matrix5 = new int[2][3][4][5];
        int[][][][][] matrix6 = new int[2][3][4][5][6];

        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
    }

    // define a method that prints the elements of an array
    static void printArray(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }

    // define a method that returns an array of integers
    static int[] getNumbers() {
        return new int[]{1, 2, 3, 4, 5};
    }

    // define a method that changes the value of an element in an array
    static void changeArray(int[] array) {
        array[0] = 100;
    }

    // define a method that prints the elements of a 2D array
    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int number : row) {
                System.out.println(number);
            }
        }
    }

}
