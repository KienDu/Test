package com.TestProgram;

public class Main {

    public static void main(String[] args) {
        String secondary = Secondary.doThis();
        for(int i = 0; i < 2; i++){
            System.out.println(secondary.toLowerCase());
        }

        toCall("SomeString");
        otherMethod();
        double exampleDouble = .1;
        System.out.println((int)exampleDouble);
        System.out.println(concatStrings("Hello", " World!"));
    }

    public static String concatStrings(String s, String d){
       return s.concat(d);
    }

    public static void toCall(String s){
        System.out.println(s.toUpperCase());
    }

    public static void otherMethod(){
        int addedNumber = Secondary.addNumbers(1,2);
        if(addedNumber == (1+2)){
            System.out.println(addedNumber);
            System.out.println("It works!");
        }
    }
}
