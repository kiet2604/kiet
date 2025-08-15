package Lec3_Scanner;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("##");
        System.out.println("Enter words separated by '##': ");
        while(scanner.hasNext()){
            String word = scanner.next();
            System.out.println("Word: "+ word);
        }
    }
}
