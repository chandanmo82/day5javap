package com.company;

//import java.util.Arrays;

public class AddsZero {
    static void findTriplets(int[] arr, int n, int sum) {
        int count = 0;
        for (int i = 0; i < n-2 ; i++) {
            for (int j = i + 1; j < n-1 ; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        count += 1;
                    }
                }
            }
        }
        System.out.println("There are " + count + " Triplets found in the array");
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, -1, -3, 1, 2 };
        int sum = 0;
        int n = arr.length;
        findTriplets(arr, n, sum);

    }


}
