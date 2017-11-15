package Chapter29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Альфа","Бета","Гамма","Дельта","Кси","Омега"));
        Stream<String>myStream=myList.stream();
        Spliterator<String>myspltr=myStream.spliterator();
        while(myspltr.tryAdvance((n)-> System.out.println(n)));
    }
}
