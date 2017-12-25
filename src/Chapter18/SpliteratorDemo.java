package Chapter18;

import java.util.*;
public class SpliteratorDemo {
    public static void main(String[] args) {
        //создаем списочный массив double
        ArrayList<Double>vals=new ArrayList<Double>();

        //вводим значения в списочный массив
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0); 

        //вызываем метод tryAdvance() для вывода содержимого списочного массива
        System.out.print("Содержимое списочного массива vals:\n");
        Spliterator<Double> split =vals.spliterator();
        while(split.tryAdvance((n)->System.out.println(n)));
        System.out.println();

        //создаем новый списочный массив, содержащий квадратные корни числовых значений из списочного массива vals
        split=vals.spliterator();
        ArrayList<Double>sqrs=new ArrayList<>();
        while (split.tryAdvance((n)->sqrs.add(Math.sqrt(n))));

        //вызываем метод forEachRemaining() для вывода списочного массива
        System.out.print("Содержимое списочного массива sqrs: \n");
        split=sqrs.spliterator();
        split.forEachRemaining((n)->System.out.println(n));
        System.out.println();
    }
}
