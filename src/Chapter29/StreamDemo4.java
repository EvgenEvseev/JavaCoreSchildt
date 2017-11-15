package Chapter29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<Double>myList=new ArrayList<>(Arrays.asList(7.0,18.0,10.0,24.0,17.0,5.0));

        Stream<Double>sqrtRoomStrm=myList.stream().map((a)->Math.sqrt(a));

        double productofsqt=sqrtRoomStrm.reduce(1.0,(a,b)->a*b);
        System.out.println("Произведение квадратных корней равно "+productofsqt);
    }
}
