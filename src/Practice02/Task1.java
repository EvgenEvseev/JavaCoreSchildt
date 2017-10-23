package Practice02;
import java.util.*;
/*
addInc(индекс, значение) и addInc(значение) - добавление элемента.
remDec(индекс) и remDec(значение)- удаление элемента.
find(индекс) и find(значение)- поиск элемента.
aver - среднее арифметическое

 */
 class Colletion01 extends ArrayList<Integer> {

     public void addInc(int index, Integer element) {
         if(element==null) System.out.println("В коллекции не допускается значение null");
         else
         add(0);
         for (int i = 0; i < size(); i++) {
             set(i, get(i) + element);
         }
     }

     public void addInc(Integer element) {
         if(element==null) System.out.println("В коллекции не допускается значение null");
         else
         add(0);
         for (int i = 0; i < size(); i++) {
             set(i, get(i) + element);
         }
     }

     public void remDec(int index){
         int j=get(index);
         remove(index);
         for (int i = 0; i < size(); i++) {
             set(i, get(i) - j);
         }
     }

     public void remDec(Integer element){
         if(remove(element))
         for (int i = 0; i < size(); i++)
             set(i, get(i) - element);
         else System.out.println("Элемент "+element+" для удаления не найден");
     }

     public void find(Integer element){
         for(int i=0;i<size();i++){
             if(element==get(i)) {System.out.println("Элемент "+element+" найден по индексу : "+i);
             break;}
             else if(i!=size()-1)continue;
             else {
                 System.out.println("Элемент "+element+" не найден ");
             break;}
         }
     }

     public void find(int index){
         if(index>size()) System.out.println("\nРазмер динамического массива меньше чем "+index);
         else
        System.out.print("Элемент по индексу "+index+" имеет значение "+get(index));
     }

     public void aver(){
         int sum=0;
         for(int i=0;i<size();i++)sum+=get(i);
         int ave=sum/size();
         System.out.println("Среднее арифметическое дин.массива равно "+ave);
     }
 }



public class Task1 {
    public static void main(String[] args) {
Colletion01 col=new Colletion01();

col.addInc(0,10);
col.addInc(1,20);
col.addInc(2,30);
col.addInc(3,40);
col.addInc(4,50);
        System.out.println(col);
col.addInc(60);
col.addInc(70);
col.addInc(80);
        System.out.println(col);
col.remDec((Integer)10);
col.remDec((Integer)80);
        System.out.println(col);
col.remDec(6);
        System.out.println(col);
col.find(3);
col.find(44);
col.find((Integer)60);
col.find((Integer)666);

col.aver();
        System.out.println("Максимум - " +Collections.max(col));
        System.out.println("Минимум - " +Collections.min(col));

System.out.println(col);
    }
}
