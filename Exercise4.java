package Lec3_Scanner;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String args[]){
        Scanner Tong = new Scanner(System.in);
        System.out.print("nhap so thuc a: ");
        double a = Tong.nextInt();
        System.out.print("nhap so thuc b: ");
        double b = Tong.nextInt();
        System.out.println("gia tri trung binh cua hai so la: " + (a + b)/2);
    }
    
}
