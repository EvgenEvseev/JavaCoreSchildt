package Chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try{
            int a=0;
            int b =42/a;
        }catch (Exception e){
            System.out.println("Перехват исключения суперкласса");
        };//catch (ArithmeticException e){
          //  System.out.println("Недостижимый код");
        }
    }

