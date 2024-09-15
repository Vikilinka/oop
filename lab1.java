package oop1;

import java.util.Random;
import java.util.Arrays;


public class lab1 {
	
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr =RandomArray(rand, 12);
        System.out.print("Array before sort: ");
        printArray(arr);
        sortArray(arr, 1);
        System.out.print("descending order: ");
        printArray(arr);
        sortArray(arr, 2);
        System.out.print("ascending order: ");
        printArray(arr);
    }
    
    private static int[] RandomArray(Random rand, int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(-200, 200);
        }
        return arr;
    }
    
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    private static void sortArray(int[] arr, int choice) {
        if (choice == 1) {
            sortDescending(arr);
        } else if (choice == 2) {
            sortAscending(arr);
        }
    }
    
    private static void sortDescending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    
    private static void sortAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
