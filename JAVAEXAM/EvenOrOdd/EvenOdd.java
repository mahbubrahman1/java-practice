package JAVAEXAM.EvenOrOdd;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int i = input.nextInt();
        if (i % 2 == 0) {
            System.out.println("this number is even");
        } else {
            System.out.println("this number is odd");
        }
    }
}
