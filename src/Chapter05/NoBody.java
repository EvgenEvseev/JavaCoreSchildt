package Chapter05;

public class NoBody {
    public static void main(String args[]){
        //Целевая часть цикла может быть пустой
        int i,j;
        i=100;
        j=200;
        // рассчитать среднее значение переменных i и j
        while (++i<--j);// нет тела у цикла
        System.out.println("Среднее значение равно " +i);
    }
}
