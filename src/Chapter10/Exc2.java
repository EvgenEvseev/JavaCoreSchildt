package Chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int d,a;
        try{// констроль
            d=0;
            a=42/d;
            System.out.println("Это не выведется");
        }catch (ArithmeticException e) {
            //перехват
            System.out.println("Деление на нуль");
        }
        System.out.println("После операцции catch");
    }
}
