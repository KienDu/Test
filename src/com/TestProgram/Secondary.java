package com.TestProgram;

import java.util.Locale;

public class Secondary {

   public static String doThis(){
       return "Hello World";
   }

   public static int addNumbers(int a, int b){
       int newNumber = a+b;
       return newNumber;
    }

    public static void charIndex(){
       String localTxt = "Hello World!";
       System.out.println(localTxt.indexOf("e"));
    }


    // Ternary Operator, changes depending on the condition
    public static void ternaryOperator(){
       int time = 20;
       String result = (time < 18)? "Good Day": "Good Evening.";
       System.out.println(result);
    }


    // Else if statements
    public static void elseifStatement(){
       int x = 50;
       int y = 50;
       if(x == y){
           System.out.println("1");
       }else if (x > y){
           System.out.println("2");
       }else{
           System.out.println("3");
       }
    }

    // Changes output depending on the current Value, with a default option if neither are correct
    public static void switchCase(){
       int day = 2;
       switch(day){
           case 1:
               System.out.println("Saturday");
               break;
           case 2:
               System.out.println("Sunday");
               break;
           default:
               System.out.println("Weekday");
       }
    }

    // Types of while Loops
    public static void whileLoop(){
       int i = 1;
       while(i < 6){
           System.out.println(i);
           i++;
       }

       do{
           System.out.println(i);
           i++;
       }
       while(i < 6);
    }

    // For loops
    public static void forLoops(){
       for(int i = 1; i < 6; i++){
           if (i == 4){
               // continues onto the next value, in other words, skips this iteration
               continue;
           }
           if (i == 5){
               // break, stops the loop
               break;
           }
           System.out.println(i);
       }
        // Using For loops with an array
       String[] cars = {"Volvo", "BMW", "Ford"};
       for (String i : cars){
           System.out.println(i);
       }
    }

    // Creating and utilizing Arrays
    public static void arrayExample(){
       String[] list = {"OneItem", "TwoItem", "ThreeItem"};
       // Items in array start at 0, the statement below is calling the Second item in the list.
       System.out.println(list[1]);
       // Replacing/Changing the item at the specified index.
       list[0] = "RealItem";
       // Returns the number of elements in the array
       System.out.println(list.length);
       /*
       Below is VERY KEY and NEW (To me/us), TWO-DIMENSIONAL ARRAY which is...

       Data stored in row and columns, similar to Excel Files.

       Open link below for more information v
       https://www.tutorialgateway.org/two-dimensional-array-in-java/#:~:text=In%20Java%20Two%20Dimensional%20Array%2C%20data%20stored%20in%20row%20and,use%20the%20One%20Dimensional%20Array.&text=Two%20Dimensional%20Array%20in%20Java%20is,form%20of%20Multi%2DDimensional%20Array.
        */

        int[][] myNumbers = {{1,2,3,4}, {5,6,7,8}};
    }

    // Utilizing Methods and calling them.
    static void myMethod(int i){
       System.out.println("I just got executed!");

       if (i < 20){
           System.out.println("Less than 20");
       }else if(i == 20){
           System.out.println("20");
       }else{
           System.out.println("Greater than 20");
       }
    }

    public static void main(String[] args){
       myMethod(20);
    }

    // Exception, how to use and create them.
    void exceptionExample(){
       try{
           // tries to execute this chunk first.
           int[] myNumbers = {1,2,3};
           System.out.println(myNumbers[10]);
       }catch(Exception e){
           // occurs only when try does not work
           System.out.println("Something went wrong.");
           System.out.println(e);
       }finally{
           // "finally" executes regardless of the result
           System.out.println("The 'try catch' is finished.");
       }
    }
}

// Creating and utilizing a class
// Currently not a public class, since it needs to be in a different Java class

class MyClass{
    int x = 5;

    public static String executeThis(String str){
        System.out.println(str);
        return str.toLowerCase();
    }

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        // Classes are similar to MODULES in Lua
        System.out.println(myObj.x);
        System.out.println(myObj.executeThis("Hello"));
    }
}