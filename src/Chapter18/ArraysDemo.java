package Chapter18;
//Продемонстрировать применение некоторых методов из класса Arrays
import java.util.*;
public class ArraysDemo {
    public static void main(String[] args) {
        //выделяем и инициализируем массив
        int array[]=new int[10];
        for(int i=0;i<10;i++)array[i]=-3*i;

        //выведем, отсортируем и снова выведем содержимое массива
        System.out.print("Исходный массив: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Отсортированный массив: ");
        display(array);

        //заполним массив и выведем содержимое
        Arrays.fill(array,2,6,-1);
        System.out.print("Массив после вызова метода fill(): ");
        display(array);

        //отсортируем и выведем содержимое массива
        Arrays.sort(array);
        System.out.print("Массив после повторной сортировки: ");
        display(array);

        //выполним двоичный поиск значения -9
        System.out.print("Значение -9 находится на позиции по индексу ");
        int index=Arrays.binarySearch(array,-9);
        System.out.print(index);
    }
    //опишем метод display
    static void display(int arr[]){
        for(int i:arr)System.out.print(i+" ");
        System.out.println();
    }
}
