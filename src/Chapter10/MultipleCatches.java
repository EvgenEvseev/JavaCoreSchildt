package Chapter10;

public class MultipleCatches {
    public static void main(String[] args) {
        try{
            int a = args.length+1;
            System.out.println("a = "+a);
            int b=42/a;
            int c[]={1};
            c[32]=224;
        }catch (ArithmeticException e){
            System.out.println("Деление на нуль: "+e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Индексация за пределами массива "+e);
        }
        System.out.println("После блоков try/catch");
    }
}
