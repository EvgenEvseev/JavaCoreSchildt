package Chapter29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Альфа","Бета","Гамма","Дельта","Кси","Омега"));

        Stream<String>myStream = myList.stream();
        Iterator<String> itr= myStream.iterator();
        while(itr.hasNext()) System.out.println(itr.next());
    }
}
