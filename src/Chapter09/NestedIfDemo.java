package Chapter09;
//этот класс содержит интерфейс как свой член
class A{
    //это вложенный интерфейс
    public interface NestedIf{
        boolean isNotNegative(int x);
    }
}
//этот класс реализует вложеннй интерфейс
class B implements A.NestedIf{
    public boolean isNotNegative(int x){
        return x<0?false:true;
    }
}
public class NestedIfDemo {
    public static void main(String[] args) {
        //используем ссылку на вложенный интерфейс
        A.NestedIf nif=new B();
        if(nif.isNotNegative(10))System.out.println("Число 10 неотрицательное");
        if((nif.isNotNegative(-12))==false)System.out.println("Число -12 отрицательное");
    }
}
