package Chapter09;

public class IfTest3 {
    public static void main(String[] args) {
        IntStack mystack;// создание переменной ссылки на интерфейс
        DynStack ds= new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds; //загрузить динамический стек
        // размещаем числа в стеке
        for(int i=0;i<12;i++)mystack.push(i);

        mystack=fs;// загрузить фиксированный стек
        for(int i=0;i<8;i++)mystack.push(i);

        mystack=ds;
        System.out.println("Значения в динамическом стеке: ");
        for(int i=0;i<12;i++)System.out.println(mystack.pop());

        mystack=fs;
        System.out.println("Значения в фиксированном стеке: ");
        for(int i=0;i<8;i++)System.out.println(mystack.pop());
    }
}
