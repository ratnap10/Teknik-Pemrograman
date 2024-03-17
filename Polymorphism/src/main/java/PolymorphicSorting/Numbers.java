package PolymorphicSorting;

/*
    Numbers.java
    Demonstrates selectionSort on an array of integers.
*/

import java.util.Scanner;

public class Numbers {
    /*
        Reads in an array of integers, sorts them,
        then prints them in sorted order.
    */
    public static void main(String[] args) {
        Integer[] intList;  //int ubah jadi Integer
        int size;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size];
        
        System.out.println("\nEnter the numbers...");
        for(int i=0; i < size; i++){
            intList[i] = scan.nextInt();
        }
        
        // Selection
        Sorting.selectionSort(intList);
        System.out.println("\n[ selection ]");
        System.out.println("Your numbers in sorted order...");
        for(int i=0; i < size; i++){
            System.out.print(intList[i] + " ");
        }
        System.out.println();
        
        // Ascending
        Sorting.insertionSort(intList);
        System.out.println("\n[ insertion : ascending ]");
        System.out.println("Your numbers in sorted order...");
        for(int i=0; i < size; i++){
            System.out.print(intList[i] + " ");
        }
        System.out.println();
        
        // Descending
        Sorting.insortDesc(intList);
        System.out.println("\n[ insertion : descending ]");
        System.out.println("Your numbers in sorted order...");
        for(int i=0; i < size; i++){
            System.out.print(intList[i] + " ");
        }
        System.out.println();
    }
}
