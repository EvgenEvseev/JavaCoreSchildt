package Chapter18;
//продемонстрировать применение различных алгоритмов коллекций
import java.util.*;
public class AlgorithmsDemo {
    public static void main(String[] args) {
        //создаем неинициализированный связный список
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);
        ll.add(777);
        ll.add(-44);
        //создаем компаратор с обратным упорядочением
        Comparator<Integer>r=Collections.reverseOrder();

        //сортируем список с поощью этого компаратора
        Collections.sort(ll,r);

        System.out.print("Список отсортирован в обратном порядке: ");

        for(int i:ll)System.out.print(i+" ");
        System.out.println();

        //перетасуем список и выведем данные
        Collections.shuffle(ll);
        System.out.print("Список перетасован: ");

        for(int i:ll)System.out.print(i+" ");
        System.out.println();

        System.out.println("Минимум: "+Collections.min(ll));
        System.out.println("Максимум: "+Collections.max(ll));
    }
}
