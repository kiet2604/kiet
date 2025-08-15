package Lec3_Scanner;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a boolean (true/false): ");
        boolean bool = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("You entered: "+ bool);
    }
}