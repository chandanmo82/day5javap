package com.company;

import java.util.Scanner;

public class SwapNumbers {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("before swapping the value of a =" + a + ",the value of b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping the value of a =" + a + ",the value of b=" + b);
    }

}

