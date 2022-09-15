package com.example.multiple;

import java.util.Scanner;



public class multiple {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = reader.nextInt();

        if ((num1 % 2) == 0) {
            System.out.println("Yes, " + num1 + " is a multiple of 2");
        } else {
            System.out.println("No, " + num1 + " is not a multiple of 2");

        }
        reader.close();


    }


}
