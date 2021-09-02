package com.TestProgram;

// A final class should NOT be inherited by any other class. Values with final can NOT be overridden.

/*

~~ In regard to a class ~~
Public classes are accessible for all classes

Private classes are only accessible within the declared class

default is accessible in the sae package aka no modifier specified

protected classes are only accessible in the same package and subclasses.

final classes cannot be inherited by other classes

abstract classes cannot be used to create objects

~~ In regard to attribute and methods ~~
final attributes and methods cannot be overridden or modified.

static attributes and methods belong to the class, rather than an object

abstract can only be used in an abstract class, and can only be used on methods.

transient attributes and methods are skipped when serializing the object containing them.

synchronized methods can only be accessed by one thread at a time.

volatile the value of an attribute is not cached thread-locally, and is always read from the "main memory".
 */


// Example of a final class
final class javaInformation {

}

/*
~~ Importing ~~

import java.util.Scanner;
 */

/*
        ~~ Inheriting attributes ~~

   A class can inherit attributes and methods from another class.

   Example below
 */

class Car extends Vehicle {
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
// You can not extend/access from a class that is "final" modified.