package Lec3_Scanner;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String args[]) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Hello. Enter your name: ");
        String name = Keyboard.nextLine();
        System.out.println(name);
        System.out.print("Enter our age: ");
        int age = Keyboard.nextInt();
        System.out.println("Hello "+ name + " you are "+ age +" years old");
    }
}
