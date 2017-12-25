package Chapter15;
interface StringFunct{
    String func(String n);
}
public class LambdasAsArgumentsDemo {
        static String stringOp(StringFunc sf,String s){
            return sf.func(s);
        }

    public static void main(String[] args) {
        String inStr = "Лямбда выражения повышают эффективность Java";
        String outStr;
        System.out.println("Это исходная стркоа "+inStr);

        outStr=stringOp((str)->str.toUpperCase(),inStr);
        System.out.println("Эта строка уже в верхнем регистре"+ outStr);
    }
}

