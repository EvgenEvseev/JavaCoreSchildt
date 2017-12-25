package Chapter15;
interface Numeric{
    int func(int n);
        }
public class BlockLambdaDemo {
    public static void main(String[] args) {
        Numeric factorial=(n)->{
            int result=1;
            for(int i=1;i<=n;i++)
                result=i*result;
                return result;
        };
        System.out.println("Факториал числа 3 равен "+factorial.func(3));
        System.out.println("Факториал числа 6 равен "+factorial.func(6));
    }
}
