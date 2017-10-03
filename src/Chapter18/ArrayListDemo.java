package Chapter18;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //создаем списочный массив
        ArrayList<String> al = new ArrayList<>();

        System.out.println("Начальный размер списочного массива: " + al.size());
        //ввести элементы в списочный массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1,"A2");
        System.out.println("Размер списочного массива после ввода элементов: "+al.size());

        //вывод списочного массива
        System.out.println("Содержимое массива: "+al);

        //удалим элементы
        al.remove("F");
        al.remove(2);

        System.out.println("Размер массива после удаения: "+al.size());
        System.out.println("Содержимое после удаления: "+al);
    }
}