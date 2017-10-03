package Chapter18;
import java.util.*;
public class TreeMapDemo {
    public static void main(String[] args) {
        //создать древовидное отображение
        TreeMap<String,Double>tm=new TreeMap<String,Double>();

        //ввести элементы в древовидное отображение
        tm.put("Джон Доу",new Double(3434.34));
        tm.put("Джон Бармен",new Double(123.22));
        tm.put("Виктор Арташ",new Double(1378.00));
        tm.put("Максим Гаврош",new Double(99.22));
        tm.put("Митроха Войлок",new Double(-19.08));

        //получить множество записей
        Set<Map.Entry<String,Double>>set =tm.entrySet();

        //вывести множество записей
        for(Map.Entry<String,Double>me:set){
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //внести сумму 1000 на счет Д.Д
        tm.put("Джон Доу",tm.get("Джон Доу")+1000);
        System.out.println("Новый остаток на счете Джона Доу: "+tm.get("Джон Доу"));
        }
}
