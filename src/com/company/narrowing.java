package com.company;

public class narrowing {
    public static void main(String[] args) {
        double dble = 123.45;
        short shrt = (short)dble;
        System.out.println(shrt);
//        System.out.println((short) dble);
    }
}
