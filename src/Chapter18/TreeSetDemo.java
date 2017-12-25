package Chapter18;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
       //создаем древовидное множество типа TreeSet
        TreeSet<String>TS = new TreeSet<String>();

        //введем элементы в множество
        TS.add("C");
        TS.add("B");
        TS.add("X");
        TS.add("D");
        TS.add("F");
        TS.add("E");
        System.out.println(TS);
        // Методы из интерфейса NavigableSet
        System.out.println("Subset  "+TS.subSet("C","F"));
        System.out.println("Ceiling "+TS.ceiling("A"));
        System.out.println("Floor   "+TS.floor("X"));
        System.out.println("Lower   "+TS.lower("E"));
        System.out.println("Higher  "+TS.higher("B"));
    }
}
