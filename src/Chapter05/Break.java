package Chapter05;
// применение оператора break в качестве цивилизованной формы оператора goto
public class Break {
    public static void main(String args[]){
        boolean t=false;
        first:{
            second:{
                third:{
                    System.out.println("Предшествует оператору break");
                    if(!t) break third;// выход из блока second
                    System.out.println("Этот оператор third");
                }// выход из блока происходит с конца
                System.out.println("Этот оператор second");
            }
            System.out.println("Этот оператор first");
        }
    }
}
