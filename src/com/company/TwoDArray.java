package com.company;


import java.io.*;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int row, col, i, j;
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Row Of The Array(max 10) :");
        row = sc.nextInt();
        System.out.println("Enter The Column Of The Array(max 10) :");
        col = sc.nextInt();
        System.out.println("Enter " + (row * col) + " Array Elements :");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Array Is : \n");
        PrintWriter writer=new PrintWriter(new OutputStreamWriter(System.out) {
            @Override
            public void write(int b) throws IOException {

            }
        });
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                writer.print(arr[i][j] + " ");


            }
            writer.println();
        }writer.flush();
        writer.close();
    }
}
