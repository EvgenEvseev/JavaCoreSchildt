package Chapter29;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<Integer>(Arrays.asList(7,18,10,24,17,5));
        System.out.println("Исходный список "+myList);

        Stream<Integer>myStream=myList.stream();

        Optional<Integer>minVal=myStream.min(Integer::compare);
        if(minVal.isPresent()) System.out.println("Min значение "+minVal);

        myStream=myList.stream();
        Optional<Integer>maxVal=myStream.max(Integer::compare);
        if(maxVal.isPresent()) System.out.println("Max значение "+maxVal);

        Stream<Integer>sortedStream=myList.stream().sorted();
        System.out.println("Отсортированный поток ");
        sortedStream.forEach((n)-> System.out.print(n+" "));
        System.out.println();

        Stream<Integer>oddVals = myList.stream().sorted().filter((n)->(n%2)==1);
        System.out.println("Нечетные значения ");
        oddVals.forEach((n)-> System.out.print(n+" "));
        System.out.println();

        oddVals=myList.stream().filter((n)->(n%2)==1).filter((n)->n>5);
        System.out.println("Нечетные значения больше 5");
        oddVals.forEach((n)-> System.out.print(n+" "));
        System.out.println();

        System.out.println("Исходный список "+myList);
    }
}
