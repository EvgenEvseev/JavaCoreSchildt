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

Collect2 array16= new Collect2();
        array16.addnew(0);
        array16.addnew(1);
        array16.addnew(2);
        array16.addnew(3);
        array16.addnew(4);
        array16.addnew(5);
        array16.addnew(6);
        array16.addnew(7);
        array16.addnew(8);
        array16.addnew(9);
        array16.addnew(10);
        array16.addnew(11);
        array16.addnew(12);
        array16.addnew(13);
        array16.addnew(14);
        array16.addnew(15);
        array16.addnew(111);
        array16.addnew(222);
        array16.addnew(333);

        array16.addnew(1,55555);
        array16.addnew(2,66666);

        array16.addnew(22222,23453);
        System.out.println(array16);
    }
}
