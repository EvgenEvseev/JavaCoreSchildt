package Chapter18;
//использование метода thenComparing() для сортировки счетов сначала по фамилии, а затем по имени
import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.*;

//компаратор сравнивающий фамилии
class CompLastNames implements Comparator<String>{
    public int compare(String aStr,String bStr){
    int i,j;
    //найти индекс символа, с которого начинается фамилия
    i = aStr.lastIndexOf(' ');
    j = bStr.lastIndexOf(' ');
    return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
        }
}

//сортируем счета фкладчиков по ФИО, если фамилии одинаковые
class CompThenByFirstName implements Comparator<String>{
    public int compare(String aStr,String bStr){
        return aStr.compareToIgnoreCase(bStr);
    }
}

public class TreeMapDemo2A {
    public static void main(String[] args) {
        //используем метод thenComparing() для создания компаратора сравнивающего сначала фамилии а зачтем ФИО если
        //фамилии одинаковые
        CompLastNames compLN = new CompLastNames();
        Comparator<String>compLastThenFirst=compLN.thenComparing(new CompThenByFirstName());

        //создать древовидное отображение
        TreeMap<String,Double>tm=new TreeMap<>(compLastThenFirst);

        //введем элементы в древовидное отображените
        tm.put("Андрей Калясин",new Double(222.33));
        tm.put("Виктор Калясин",new Double(555.22));
        tm.put("Павел Железняк",new Double(666.77));
        tm.put("Павел Андронов",new Double(888.66));
        tm.put("Евгений Андронов",new Double(666.99));

        //получить множество элементов
        Set<Map.Entry<String,Double>>set =tm.entrySet();

        //выведем элементы из множества
        for(Map.Entry<String,Double>me:set){
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }
        System.out.println();
    }
}
