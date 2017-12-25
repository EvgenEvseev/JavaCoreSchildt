package Chapter15;
interface NumericTest{
    boolean test(int n,int d);
}
public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest isFactor = (n,d)->(n%d)==0;
        if(isFactor.test(10,2)) System.out.println("Число 2 является множителем 10");
        if(!isFactor.test(10,3)) System.out.println("Число 3 не является множителем 10");
    }
}
