package Chapter18;
//Применить итераторы вместе с классом Hashtable
import java.util.*;
public class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String,Double>balance= new Hashtable<String,Double>();

        String str;

        balance.put("Джон Доу",3434.34);
        balance.put("Том Смит",123.22);
        balance.put("Джейн Бейкер",1378.00);
        balance.put("Тод Холл",99.22);
        balance.put("Ральф Смит",-19.08);

        //выведем все счета в хэш таблице, сначала получим представление всех ключей в виде множества
        Set<String>set=balance.keySet();

        //получим итератор
        Iterator<String>itr=set.iterator();

        while(itr.hasNext()){
            str=itr.next();
            System.out.println(str+": "+balance.get(str));
        }
        System.out.println();

        //1000 для ДД
        balance.put("Джон Доу",balance.get("Джон Доу")+1000);
        System.out.println("Новый остаток на счете Джона Доу: "+balance.get("Джон Доу"));
    }
}
