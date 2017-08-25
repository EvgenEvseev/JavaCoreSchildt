package Chapter07;
//Использовать массив для передачи методу переменного количества аргументов.
// Это старый подход к обработке аргументов переменной длины
public class PassArray {
    static void vaTest(int v[]){
        System.out.println("\nКоличество аргументов: "+v.length+" Содержимое: ");
        for(int x:v)System.out.print(x+" ");
    }
    public static void main(String args[]){
        // обратить внимание на порядок создания массива для хранения аргументов
        int n1[]={10};
        int n2[]={1,2,3};
        int n3[]={};
        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}
