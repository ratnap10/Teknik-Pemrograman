package PolymorphicSorting;

/*
    Strings.java
    Demonstrates selectionSort on an array of Strings.
*/

import java.util.Scanner;

public class Strings {
    /*
        Reads in an array of Strings, sorts them,
        then prints them in sorted order.
    */
    public static void main(String[] args) {
        String[] strList;
        int size;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nHow many Strings do you want to sort? ");
        size = scan.nextInt();
        scan.nextLine(); //membaca newline yang tersisa
        strList = new String[size];
        
        System.out.println("\nEnter the String...");
        for(int i=0; i < size; i++){
            strList[i] = scan.nextLine();
        }
        
        // Selection
        Sorting.selectionSort(strList);
        System.out.println("\n[ selection ]");
        System.out.println("Your Strings in sorted order...");
        for(int i=0; i < size; i++){
            System.out.print(strList[i] + " ");
        }
        System.out.println();
        
        // Ascending
        Sorting.insertionSort(strList);
        System.out.println("\n[ insertion : ascending ]");
        System.out.println("Your Strings in sorted order...");
        for(int i=0; i < size; i++){
            System.out.print(strList[i] + " ");
        }
        System.out.println();
        
        //Descending
        Sorting.insortDesc(strList);
        System.out.println("\n[ insertion : descending ]");
        System.out.println("Your Strings in sorted order...");
        for(int i=0; i < size; i++){
            System.out.print(strList[i] + " ");
        }
        System.out.println();
    }
}
