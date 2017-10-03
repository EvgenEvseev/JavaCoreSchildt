package Chapter18;
//используем компаратор для сортировки счетов по фамилиям вкладчиков
import java.util.*;

//сравним последние слова в обеих символьных строках
class TComp implements Comparator<String>{
    public int compare(String aStr,String bStr){
        int i,j,k;

        //найти индекс символа, с которого начинается фамилия
        i=aStr.lastIndexOf(' ');
        j=bStr.lastIndexOf(' ');
        k=aStr.substring(i).compareTo(bStr.substring(j));
        if(k==0)//Фамилиии совпадают - проверка имени и фамилии полностью
            return aStr.compareTo(bStr);
        else return k;
    }
}
public class TreeMapDemo2 {
    public static void main(String[] args) {
        //создаем древовидное множество
        TreeMap<String,Double>tm=new TreeMap<String,Double>(new TComp());

        //вводим элементы в древовидное отображение
        tm.put("Максим Гаврош",new Double(3434.34));
        tm.put("Пася Войлок",new Double(123.22));
        tm.put("Виктор Арташ",new Double(1278.00));
        tm.put("Тод Халл",new Double(99.22));
        tm.put("Митроха Войлок",new Double(-19.08));

        //получим множество элементов
        Set<Map.Entry<String,Double>>set=tm.entrySet();

        //выводим элементы из множества
        for(Map.Entry<String,Double>me:set){
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        //внесем штуку для Тода Халла, вот он обрадуется !
        tm.put("Тод Халл",tm.get("Тод Халл")+1000);
        System.out.println("Новый остаток на счете Тода Халла:"+tm.get("Тод Халл"));
    }
}
