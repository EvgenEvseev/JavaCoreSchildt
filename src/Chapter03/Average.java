package Chapter03;
//Вычисление среднего из массива значений
public class Average {
    public static void main(String args[]){
        double nums_massive[]={20.3,30.2,40.5,56.2};
        double result =0;
        int i;
        for(i=0;i<4;i++)
            result=result+nums_massive[i];
        System.out.println("Среднее значение равно "+result/4);
    }
}