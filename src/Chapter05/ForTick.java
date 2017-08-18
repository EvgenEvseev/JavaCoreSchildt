package Chapter05;
// продемонстрировать применение цикла for
public class ForTick {
    public static void main(String args[]){
        int n;
        for(n=0;n<11;n++)
        System.out.println("этаж: "+n);
        //объявить переменную в самом цикле for
        for(int z=10;z>0;z--)
            System.out.println("этаж: "+z);
    }
}
