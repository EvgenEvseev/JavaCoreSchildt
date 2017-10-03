package Chapter18;

import java.util.ArrayDeque;

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

        System.out.print("Извлечение из стека: ");

        while(ADQ.peek()!=null)System.out.print(ADQ.pop()+" ");
            System.out.println();
    }
}
