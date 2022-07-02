package com.nikhil.example;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Nikhil");

        // Wrapper Classes
        // A Wrapper Class encloses in the Java Programming, is one of those eight classes provided in java .lang package to provide object methods for eight primitive types.
        // All the primitive wrapper classes in java are immutable.

        // A Wrapper class wraps (encloses) around a data type and gives it objects reference.

        // Wrapper Class - Boolean, Byte, Character, Integer, Long, Short, Float, Double
        // Primitive Class - boolean, int, long, short, double, float, int, short

        // 1. Constructor
        Integer number = new Integer("1");

        System.out.println("The number is: " + number);

        Float floatNumber = new Float("55.0f");

        System.out.println("The floatNumber is : " + floatNumber);

        //2. Provide another way of creating wrapper object :  valueOf
        Integer oneNumber = Integer.valueOf("1");

        System.out.println("The number is: " + oneNumber);

        // Auto-Boxing
        Integer nineC = 9;
        Integer nineD = 9;

        System.out.println(nineC == nineD); // Same object is used from memory...Integer.valueOf

        // Constructors
        Integer nineObj1 = new Integer(9);
        Integer nineObj2 = new Integer(9);

        System.out.println(nineObj1 == nineObj2); // Two new objects are created hence false

        // Casting : When we want to convert one data type to another:
        // Storing small values in large containers

        int value = 100;
        long num = value; // Implicit Casting

        float floatNum = value;

        // Explicit Casting:
        // Explicit Casting is done through code. Storing larger values into smaller ones.

        long longNum = 25687;
        int intNum = (int)longNum;

        System.out.println(intNum);


    }
}
