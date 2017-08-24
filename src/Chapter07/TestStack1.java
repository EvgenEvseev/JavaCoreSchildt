package Chapter07;
// В этом классе определяется целочисленный стек, который может содержать 10 значений
class Stack1 {
    // теперь переменные stck и tos являются закрытыми. Это означает, что они не могут
    // быть случайно или намеренно изменены таким образом, чтобы нарушить стек.
    private int stck[] = new int[10];
    private int tos;

    // инициализировать вершину стека
    Stack1() {
        tos = -1;
    }

    // разместить элемент в стеке
    void push(int item) {
        if (tos == 9) System.out.println("Стек заполнен.");
        else stck[++tos] = item;
    }

    //извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        } else return stck[tos--];
    }
}
public class TestStack1 {
        public static void main(String args[]){
            Stack1 mystack1=new Stack1();
            Stack1 mystack2=new Stack1();
            //размещаем числа в стеке
            for(int i=0;i<10;i++)mystack1.push(i);
            for(int i=10;i<20;i++)mystack2.push(i);
            //извлечь эти числа из стека
            System.out.println("Стек в mystack1: ");
            for(int i=0;i<10;i++)System.out.println(mystack1.pop());
            System.out.println("Стек в mystack2: ");
            for(int i=10;i<20;i++)System.out.println(mystack2.pop());
            //эти операторы недопустимы
            // mystack1.tos=-2;
            //mystack2.stck[3]=100;
        }
}

