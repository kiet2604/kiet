package Lec3_Scanner;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three words: ");
        String w1 = scanner.next();
        String w2 = scanner.next();
        String w3 = scanner.next();
        scanner.nextLine();
        System.out.println("Word 1: "+ w1);
        System.out.println("Word 2: "+ w2);
        System.out.println("Word 3: "+ w3);
    }
}
