package Practice01;

import java.util.Scanner;

public class AskName2 {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello "+name);
    }
}