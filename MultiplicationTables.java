package com.company;
import java.util.Scanner;
public class MultiplicationTables {

    public static void main(String[] args) {
	// initialize variables
        Scanner keyboard = new Scanner(System.in);
        int size;

        System.out.println("Welcome to Multiplication Tables\n");
        System.out.println("How large would you like to see them?");

        size = keyboard.nextInt();
        while (size > 18 || size < 9) {
            System.out.println("Please enter a number between 9-18.");
            size = keyboard.nextInt();
        }
        for(int row = 0; row <= size; row++) {
            for(int col =0; col <= size; col++) {
                System.out.println(row +" * "+ col+" = "+(row*col));
            }
        }
    }
}
