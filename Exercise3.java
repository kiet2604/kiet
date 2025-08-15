package Lec3_Scanner;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String args[]) {
        Scanner Tong = new Scanner(System.in);
        System.out.print("nhap so nguyen a: ");
        int a = Tong.nextInt();
        System.out.print("nhap so nguyen b: ");
        int b = Tong.nextInt();
        System.out.println("tong hai so la: " + (a + b));
    }
}
