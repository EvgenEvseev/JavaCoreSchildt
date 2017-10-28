package Chapter10;

public class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 /0;
            System.out.println("a = " + a);
            try {
                if (a == 1) a = a / 0;
                else {
                    int c[] = {1};
                    c[42] = 99;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Индекс за пределами массива "+e);
            }
        }catch (ArithmeticException e){
            System.out.println("Деление на нуль "+e);
        }
    }
}