package Chapter18;
//Применение специального компаратора
import java.util.*;

//компаратор для сравнения символьных строк в обратном порядке

class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;
        //выполнить сравнение в обратном порядке
        return bStr.compareTo(aStr);
    }
}

    class MyComp2 implements Comparator<String>{
        public int compare(String a,String b){
            String aStr,bStr;
            aStr=a;
            bStr=b;
            //выполнить сравнение в естественном порядке
            return aStr.compareTo(bStr);
        }
}
public class CompDemo {
    public static void main(String[] args) {
        //создать древовидное множетсва TreeSet
        TreeSet<String>ts=new TreeSet<String>(new MyComp());
        //ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        //ввести элементы из древовидного множества
        for(String element:ts)
            System.out.print(element +" ");
        System.out.println();

    }
}
