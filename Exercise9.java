package Lec3_Scanner;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a sentence: ");
        String fixed = scanner.nextLine();
        System.out.println("Number: "+ num);
        System.out.println("Sentence: "+ fixed);
    }
}
