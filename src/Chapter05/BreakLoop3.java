package Chapter05;

public class BreakLoop3 {
    public static void main(String args[]){
        for(int i=0;i<3;i++){
            System.out.print("Проход "+i+": ");
            for(int j=0;j<100;j++){
                if(j==33)break;//выход из вложенного цикла при j=33
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}
