package Chapter29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Альфа","Бета","Гамма","Дельта","Кси","Омега"));

        Stream<String>myStream=myList.stream();
        Spliterator<String>myspltr=myStream.spliterator();
        Spliterator<String>myspltr2=myspltr.trySplit();

        if(myspltr2!=null){
            System.out.println("Рузультат выводимый вторым сплитератором ");
            myspltr2.forEachRemaining((n)-> System.out.println(n));

            System.out.println("Результат выводимый первым сплитаретором ");
            myspltr.forEachRemaining((N)-> System.out.println(N));
        }
    }
}
