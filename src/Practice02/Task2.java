package Practice02;
/*
Вообщем:
добавление элементов производим с помощью метода addnew
 */
import java.util.*;
class Collect2 extends ArrayList<Integer> {
private int CAPA;
    Collect2(int capacity) {
        ensureCapacity(capacity);
        CAPA=capacity;
    }
    Collect2() {
        ensureCapacity(16);
        CAPA=16;
    }
    void addnew(Integer element){
        add(element);
        if(indexOf(element)>CAPA-1)remove(0);
        trimToSize();
    }
    void addnew(int index,Integer element){
        if(index>CAPA-1) System.out.println("Данный индекс("+index+") недопустим, максимальная вместимость коллекции - "+CAPA);
        else
        add(element);
        if(indexOf(element)>CAPA-1)remove(0);
        trimToSize();
    }
}

public class Task2 {
    public static void main(String[] args) {
Collect2 array=new Collect2(7);
        array.addnew(0);
        array.addnew(1);
        array.addnew(2);
        array.addnew(3);
        array.addnew(4);
        array.addnew(5);
        array.addnew(6);
        array.addnew(7);
        array.addnew(8);
        array.addnew(9);
        array.addnew(10);

        array.addnew(1,22222);
        array.addnew(2,55889);
        array.addnew(2222,2222);
        System.out.println(array);
    }
}
