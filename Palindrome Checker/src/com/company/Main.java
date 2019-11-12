package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String a, b ="";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string or a number");
        a = s.nextLine();
        a = a.replaceAll("[^a-zA-Z]+","").toLowerCase();
        int length = a.length();
        for (int i = length - 1; i >= 0; i--)
        b = b + a.charAt(i);

        if (a.equals(b))
            System.out.println("The string or number is a palindrome");
        else
            System.out.println("The string or number is NOT a palindrome");

    }
}
