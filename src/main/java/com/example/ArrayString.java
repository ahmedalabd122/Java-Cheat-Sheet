package com.example;

public class ArrayString {

    public static void main(String[] args) {
        // String is a Class in Java
        // Strings in Java are objects that represent sequences of characters.
        // Strings are immutable, which means that their values cannot be changed after they are created.
        // To create a new string, you can use the following syntax:
        String str = "Hello, World!";
        // You can also create a string by using the new keyword and the String constructor:
        String str2 = new String("Hello, World!");
        // You can concatenate strings by using the + operator:
        String str3 = "Hello, " + "World!";
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        // Strings with the same value are stored in the same memory location in Java.
        // This is known as string interning.
        // To compare strings by value, you should use the equals method instead of the == operator.
        // The == operator compares the memory addresses of the strings, not their values.
        String s1 = "Hello, World!";
        String s2 = "Hello, World!";
        boolean areEqual = s1 == s2; // true
        boolean areEqual2 = s1.equals(s2); // true
        // BUT if you create a string using the new keyword, it will not be interned:
        String s3 = new String("Hello, World!");
        String s4 = new String("Hello, World!");
        boolean areEqual3 = s3 == s4; // false
        boolean areEqual4 = s3.equals(s4); // true
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

        int n = 68;
        String strn = String.valueOf(n); // "68" => converts the integer to a string value 68 refers to the ASCII value of D
        // ORRRRRR
        strn = n + "";

        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
        // You can access the characters of a string by using the charAt method:
        char ch = str.charAt(0);
        // You can compare strings by using the equals method:
        boolean isEqual = str.equals(str2);
        // You can convert a string to uppercase or lowercase by using the toUpperCase and toLowerCase methods:
        String upper = str.toUpperCase();  // "HELLO, WORLD!"
        String lower = str.toLowerCase(); // "hello, world!"
        // You can find the length of a string by using the length method:
        int len = str.length(); // 13
        // You can find the index of a character or substring in a string by using the indexOf method:
        int index = str.indexOf("World"); // 7
        // You can extract a substring from a string by using the substring method:
        String sub = str.substring(7); // "World!"
        // You can split a string into an array of substrings by using the split method:
        String[] parts = str.split(","); // ["Hello", " World!"]
        // You can replace a character or substring in a string by using the replace method:
        String replaced = str.replace("World", "Java"); // "Hello, Java!"
        // You can remove leading and trailing whitespace from a string by using the trim method:
        String trimmed = "  Hello, World!  ".trim(); // "Hello, World!"
        // You can check if a string contains a specific sequence of characters:
        boolean contains = str.contains("World"); // true
        // You can check if a string starts with a specific prefix:
        boolean startsWith = str.startsWith("Hello"); // true
        // You can check if a string ends with a specific suffix:
        boolean endsWith = str.endsWith("!"); // true
        // You can convert other data types to string using valueOf:
        String numStr = String.valueOf(42); // "42"
        // You can check if a string is empty:
        boolean isEmpty = "".isEmpty(); // true
        // You can join multiple strings with a delimiter:
        String joined = String.join("-", "Java", "is", "cool"); // "Java-is-cool"
        // You can replace first occurrence of a substring:
        String replaceFirst = "hello hello".replaceFirst("hello", "hi"); // "hi hello"
        // You can check if two strings are equal ignoring case:
        boolean equalIgnoreCase = "Hello".equalsIgnoreCase("hello"); // true
        // You can get a character array from string:
        char[] chars = str.toCharArray();
        // You can find last occurrence of a character or substring:
        int lastIndex = "hello hello".lastIndexOf("hello"); // 6
        // You can compare strings lexicographically:
        int compareTo = str.compareTo("Hello, World!"); // 0
        // You can compare strings lexicographically, ignoring case differences:
        int compareToIgnoreCase = str.compareToIgnoreCase("hello, world!"); // 0
        // You can check if a string matches a regular expression:
        boolean matches = str.matches("Hello, World!"); // true
        // You can repeat a string multiple times:
        String repeated = "abc".repeat(3); // "abcabcabc"
        // You can strip leading and trailing whitespace from a string:
        String stripped = "  Hello, World!  ".strip(); // "Hello, World!"
        // You can strip leading whitespace from a string:
        String stripLeading = "  Hello, World!  ".stripLeading(); // "Hello, World!  "
        // You can strip trailing whitespace from a string:
        String stripTrailing = "  Hello, World!  ".stripTrailing(); // "  Hello, World!"
        // You can check if a string is blank (empty or contains only whitespace):
        boolean isBlank = "   ".isBlank(); // true
        // You can get a stream of code points from a string:
        str.codePoints().forEach(System.out::println); // 72 101 108 108 111 44 32 87 111 114 108 100 33
        // You can get a stream of characters from a string:
        str.chars().forEach(chs -> System.out.print((char) chs)); // "Hello, World!"

    }
}
