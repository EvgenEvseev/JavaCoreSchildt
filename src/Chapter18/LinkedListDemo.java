package Chapter18;
//Продемонстрировать применение класса LinkedList
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        //создаем связный список
        LinkedList<String>LL=new LinkedList<String>();

        //введем элементы в связный список
        LL.add("F");
        LL.add("B");
        LL.add("D");
        LL.add("E");
        LL.add("C");
        LL.addLast("Z");
        LL.addFirst("A");
        LL.add(1,"A2");
        System.out.println("Исходное содержимое связного списка LL: "+LL);

        //Удаляем элементы из LL
        LL.remove("F");
        LL.remove(2);
        System.out.println("Содержимое связного списка LL "+"после удаления элементов: "+LL);

        //Удляем первый и последний элементы
        LL.removeLast();
        LL.removeFirst();

        System.out.println("Содержимое LL после удаления первого и последнего элемента списка: "+LL);

        //получить и присвоить значение
        LL.set(2,LL.get(2) +" изменено");

        System.out.println("Содержимое после изменения: "+LL);
    }
}
