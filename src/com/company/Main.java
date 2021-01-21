package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        firstArray();
        secondArray();
        thirdArray();
        fourthArray();
        fifthArray();
        int[] forSixthArray = {1, 1, 1, 1, 1, 1,1,1,6,2};
        System.out.println(sixthArray(forSixthArray));
        seventhArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, -2);
    }

    public static void firstArray() {
        int[] arr = {0,1,0,1,1,0,1,0,0,1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                arr[i] = 1;
                System.out.println("Было 0, стало: " +arr[i]);
            } else {
                arr[i] = 0;
                System.out.println("Было 1, стало: " +arr[i]);
            }
        }
        System.out.println("____________________________________________");
    }
    public static void secondArray(){
        int[] arr2 = new int[8];
        int n = -3;
        for (int i = 0; i < arr2.length; i++) {
            n = n + 3;
            arr2[i] = n;
            System.out.println(arr2[i]);
        }
        System.out.println("____________________________________________");
    }

    public static void thirdArray(){
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i] < 6){
                arr3[i] = arr3[i]*2;
                System.out.println(arr3[i]);
            } else {
                continue;
            }
        }
        System.out.println("____________________________________________");
    }

    public  static void fourthArray() {
        int n = 4;
        int[][] arr4 = new int[n][n];

        for (int i = 0; i < n; i++) {
            arr4[i][i] = 1;
            arr4[i][n - i - 1] = 1;
            System.out.println(arr4[i][n - i - 1]);
        }
        System.out.println("____________________________________________");
    }

    public static void fifthArray() {
        int max = 1;
        int min = 1;
        int[] arr5 = {10,5,6,9,12,15,7,40,-3,28,4,80,0,1,-4,};
        for (int i = 0; i < arr5.length; i++) {
            if(arr5[i] >= max){
                max = arr5[i];
            } else if(arr5[i] <= min){
                min = arr5[i];
            } else {
                continue;
            }
        }
        System.out.println("Min= " +min);
        System.out.println("Max= " +max);
        System.out.println("____________________________________________");
    }

    public static boolean sixthArray(int[] array){
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < array.length - 2; i++) {
            sumLeft = sumLeft + array[i];
        }
        sumRight = array[array.length - 2] + array[array.length - 1];
        if (sumLeft == sumRight){
            return true;
        } else {
            return false;
        }
    }

        static void seventhArray(int[] arr, int n) {
            System.out.println("____________________________________________");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.print("(n = " + n + ") ");
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    int tmp = arr[arr.length - 1];
                    for (int j = arr.length - 1; j > 0; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[0] = tmp;
                }
            } else if (n < 0) {
                for (int i = 0; i < n * (-1); i++) {
                    // Left
                    int tmp = arr[0];
                    for (int j = 0; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[arr.length - 1] = tmp;
                }
            }
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
}
