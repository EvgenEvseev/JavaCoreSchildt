package Chapter07;
//Простой пример рекурсии
class Factorial{
    //это рекурсивный метод
    int fact(int n){

        int result;
        if(n==1)return 1;
        result = fact(n-1)*n;
        System.out.println(result);
        return result;
    }
}
public class Recursion {
    public static void main(String args[]){
        Factorial f=new Factorial();
        System.out.println("Факториал 3 равен "+ f.fact(3));
        System.out.println("Факториал 5 равен "+f.fact(5));
        System.out.println("Факториал 13 равен "+f.fact(13));
    }
}
