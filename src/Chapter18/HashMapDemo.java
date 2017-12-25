package Chapter18;
import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        //создаем хэш отображение
        HashMap<String,Double>hm=new HashMap<String,Double>();

        //вводим элементы в хэш-отображение
        hm.put("Джон Доу", new Double(3434.34));
        hm.put("Том Смит",new Double(123.22));
        hm.put("Джейн Бейкер",new Double(1378.00));
        hm.put("Тод Холл",new Double(99.22));
        hm.put("Ральф Смит",new Double(-19.08));
        int n=0;
        //получаем множество записей
        Set<Map.Entry<String,Double>>set = hm.entrySet();

        //выводим множество записей
        for(Map.Entry<String, Double> me:set){
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //внесем сумму 1000 на счет Джона Доу
        hm.put("Джон Доу",hm.get("Джон Доу")+1000);
        System.out.println("Новый остаток на счете Джона Доу: "+hm.get("Джон Доу"));
    }
}
