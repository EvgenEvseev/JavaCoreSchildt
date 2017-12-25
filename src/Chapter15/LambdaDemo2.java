package Chapter15;
interface numerictest{
    boolean test(int n);
}
public class LambdaDemo2 {
    public static void main(String[] args) {
        numerictest isEven = (n)->(n%2)==0;
        if(isEven.test(10)) System.out.println("Число 10 четное");
        if(!isEven.test(9)) System.out.println("Число 9 нечетное");

        numerictest isNonNeg = (n)->n>=0;

        if(isNonNeg.test(1)) System.out.println("Число неотрицательно");
        if(!isNonNeg.test(-1)) System.out.println("Число отрицательно");
    }
}
