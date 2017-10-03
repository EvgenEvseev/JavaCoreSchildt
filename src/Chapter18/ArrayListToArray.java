package Chapter18;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        //создать списочный массив
        ArrayList<Integer> al =new ArrayList<>();
        //введем элементы
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Содержимое списочного массива al: "+al);
        //получить обычный массив
        Integer mass[]= new Integer[al.size()];
        mass = al.toArray(mass);

        int sum=0;
        //суммируем элементы массива
        for(int i:mass)sum+=i;
        System.out.println("сумма - "+sum);

    }
}
