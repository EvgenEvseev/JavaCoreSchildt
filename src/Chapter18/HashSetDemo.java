package Chapter18;
import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        //создаем хэш-множество
        LinkedHashSet<String>HS=new LinkedHashSet<String>();

        //вводим элементы в это множество
        HS.add("Бета");
        HS.add("Альфа");
        HS.add("Эта");
        HS.add("Гамма");
        HS.add("Эпсилон");
        HS.add("Омега");

        System.out.println(HS);
    }
}
