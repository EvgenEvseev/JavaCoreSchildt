package Chapter29;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Double>myList=new ArrayList<>(Arrays.asList(9.0,4.0));

        double ProductOfSqrRoots=myList.parallelStream().reduce(1.0,(a,b)->Math.sqrt(a)*Math.sqrt(b),(a,b)->a*b);
        System.out.println("Квадратные корни "+ProductOfSqrRoots);
    }
}
