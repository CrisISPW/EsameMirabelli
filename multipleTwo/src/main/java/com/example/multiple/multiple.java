package com.example.multiple;

import java.util.Scanner;
import static java.lang.System.*;



public class Multiple {
    public static void main(String[] args){

        Scanner reader = new Scanner(in);
        out.print("Enter a number:");
        int num1 = reader.nextInt();

        if ((num1 % 2) == 0) {
            out.print("Yes, " + num1 + " is a Multiple of 2");
        } else {
            out.print("No, " + num1 + " is not a Multiple of 2");

        }
        reader.close();


    }


}
