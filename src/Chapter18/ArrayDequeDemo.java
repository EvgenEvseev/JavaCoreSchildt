package Chapter18;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        //создать двухстороннюю очередь
        ArrayDeque<String> ADQ = new ArrayDeque<String>();

        //используем класс ArrayDeque для орг-ции стека
        ADQ.push("A");
        ADQ.push("B");
        ADQ.push("D");
        ADQ.push("E");
        ADQ.push("F");
        ADQ.add("Darling");
        ADQ.add("A");
        ADQ.push("Head");
        Iterator<String>iterator=ADQ.iterator();
        System.out.println("Извелчение итератором: ");
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println("\nИзвлечение из стека: ");

        while(ADQ.peek()!=null)System.out.print(ADQ.pop()+" ");
            System.out.println();

    }
}
