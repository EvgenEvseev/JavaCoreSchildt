package Chapter10;
import java.util.Random;
public class MethNestTry {
    static void nesttry(int a){
        try{
            if(a==1)a=a/0;
            if(a==2) {int c[]={1};
            c[42]=99;}
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Индекс за прелделами массива "+e);
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        try{
            int a = r.nextInt(3);
            int b=42/a;
            System.out.println("a = "+a);
            nesttry(a);
        }catch (ArithmeticException e) {System.out.println("Деление на нуль "+e);}
    }
}
