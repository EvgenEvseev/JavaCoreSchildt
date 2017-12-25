package Chapter15;
interface MyNumber{
    double getValue();
}
public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber mynum;

        mynum=()-> 123.45;

        System.out.println("Фиксированное значение "+mynum.getValue());
        mynum=()->Math.random()*100;

        System.out.println("Случайное значение "+mynum.getValue());
        System.out.println("Еще одно случайное значения "+mynum.getValue());
    }
}
