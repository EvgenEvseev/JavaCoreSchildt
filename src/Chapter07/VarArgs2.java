package Chapter07;
//Использование аргументов переменной длины вместе со страндартными аргументами
public class VarArgs2 {
    // а данном примере msg - обычный параметр а v - параметр пемременной длины
    static void vaTest(String msg, int...v){
        System.out.print(msg+v.length+" Содержимое: ");
        for (int x:v)System.out.print(x+" ");
        System.out.println();
    }
    public static void main(String args[]){
        vaTest("Один параметр переменной длины : ",10);
        vaTest("Три параметра переменной длины : ",1,2,3);
        vaTest("Без параметров переменной длины : ");
    }
}
