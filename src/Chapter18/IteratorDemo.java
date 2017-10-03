package Chapter18;
import java.util.*;
public class IteratorDemo {
    public static void main(String[] args) {
        //создаем списочный массив
        ArrayList<String>AL=new ArrayList<String>();

        //вводим элементы в списочный массив
        AL.add("C");
        AL.add("A");
        AL.add("E");
        AL.add("B");
        AL.add("D");
        AL.add("F");

        //используем итераторы для вывода списочного содержимого AL
        System.out.print("Исходное содержимое списочного массива AL: ");
        Iterator<String>ITR=AL.iterator();
        while(ITR.hasNext()){
            String element = ITR.next();
            System.out.print(element+" ");
        }
        System.out.println();

        //Видоизменяем перебираемые обьекты
        ListIterator<String>LITR=AL.listIterator();
        while(LITR.hasNext()){
            String element = LITR.next();
            LITR.set(element+"+");
        }
        System.out.print("Измененное содержимое списочного массива AL: ");
        ITR=AL.iterator();
        while (ITR.hasNext()){
            String element=ITR.next();
            System.out.print(element+" ");
        }
        System.out.println();

        //Теперь отобразим список в обратном порядке
        System.out.print("Изменненный в обратном порядке список: ");
        while (LITR.hasPrevious()){
            String element =LITR.previous();
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
