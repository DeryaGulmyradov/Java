package com.company;

public class typeConversion {
    public static void main(String[] args) {
        /*/
        /int to char
        char myChar = 'a';
        System.out.println((int) myChar);
        int myInt = 99;
        System.out.println((char)myInt );
        // narrowing
        int num1 = 10;
        float num2= 4.5f;
        System.out.println(num1*num2); //takes only wide one
        */
        //convert int to byte
        int myInt = 300;
        System.out.println((byte)myInt);
        System.out.println(myInt);
        double myDouble = 2.12345678990;
        System.out.println((float)myDouble);
        System.out.println(myDouble);
        String hello = "Hello";
        //System.out.println((char) hello);


    }
}
