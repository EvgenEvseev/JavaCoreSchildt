package Practice01;

import java.util.Scanner;

public class SortedNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mass[] = new int[5];
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Enter number" + (i + 1) + ": ");
            mass[i] = scan.nextInt();
        }
        System.out.println("Initial array: ");
        for (int i = 0; i < mass.length; i++)
            System.out.print(mass[i] + " ");


        boolean sorted = false;
        for(int j=0;j<mass.length-1&&!sorted;j++){
            sorted=true;
        for (int i = 0; i < mass.length - 1-j; i++) {
            int s;
            int p;
            s = mass[i + 1];
            p = mass[i];
            if (mass[i] > mass[i + 1])
            {mass[i + 1] = p;
            mass[i] = s;
            sorted=false;}
        }
        }
        System.out.println("\nSorted array: ");
        for (int i = 0; i < mass.length; i++)
            System.out.print(mass[i] + " ");
    }
}



