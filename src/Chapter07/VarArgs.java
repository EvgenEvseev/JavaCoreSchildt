package Chapter07;
//Продемонстрировать прмиенение аргументов переменной длины
public class VarArgs {
    static void vaTest(int ...v){
        System.out.print("Количество аргументов: "+v.length+" Содержимое: " );
        for(int x:v)System.out.print(x+" ");
        System.out.println();}
        public static void main(String args[]) {
            //обратите внимание на возможные способы вызова метода vaTest() с аргументами переменной длины
            vaTest(10);
            vaTest(1, 2, 3);
            vaTest();
        }
    }

