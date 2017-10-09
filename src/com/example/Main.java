package com.example;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a String";
        System.out.println(myString);
        myString = myString + ", and this is more String";
        System.out.println(myString);
        myString = myString + " \u00A9 2017";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("Result = " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

        double doubleNumer = 120.47;
        lastString = lastString + doubleNumer;
        System.out.println(lastString);

    }
}
