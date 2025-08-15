package Lec3_Scanner;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner Ten = new Scanner(System.in);
        System.out.print("Hello. Enter your fullname: ");
        String Fullname = Ten.nextLine();
        System.out.println("ten day du la :"+ Fullname);
    }
}
