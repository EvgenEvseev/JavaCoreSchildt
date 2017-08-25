package Chapter07;
//Перегрузка методов с аргументами переменной длины
public class VarArgs3 {
    static void vaTest(int...v){
        System.out.print("vaTest(int ...): "+"Количество аргуметов: "+v.length+" Содержимое: ");
        for(int x:v)System.out.print(x+" ");
        System.out.println();
    }
    static void vaTest(boolean...v){
        System.out.print("vaTest(boolean ...) "+"Количество аргументов: "+v.length+" Содержимое: ");
        for (boolean x:v)System.out.print(x+" ");
        System.out.println();
    }
    static void vaTest(String msg, int...v){
        System.out.print("vaTest(String, int...): "+msg+" Количество аргументов: "+ v.length+" Содержимое: ");
        for(int x:v)System.out.print(x+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest("символьная переменная msg",10,20,30,40,50);
        vaTest(true,false,false);
    }
}
