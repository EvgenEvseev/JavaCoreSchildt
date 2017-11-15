package Chapter29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double>myList=new ArrayList<>(Arrays.asList(1.1,3.6,9.2,4.7,12.1,5.0));

        System.out.println("Исходные значения ");
        myList.stream().forEach((a)->{
            System.out.print(a+" ");
        });
        System.out.println();

        IntStream cStrm=myList.stream().mapToInt((a)->(int)Math.ceil(a));
        System.out.println("Максимально допустимые пределы значений из списка Mylist ");

        cStrm.forEach((a)->{
            System.out.print(a+" ");
        });
    }
}
