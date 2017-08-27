package Chapter09;
//реализация интерфейса IntStack для стека фиксированного размера
class FixedStack implements IntStack{
    private int stck[];
    private int tos;
    //выделяем память и инициализируем стек
    FixedStack(int size){
        stck=new int[size];
        tos=-1;
    }
    //размещаем элемент в стеке
    public void push(int item){
        if(tos==stck.length-1)System.out.println("Стек заполнен");
        else stck[++tos]=item;
    }
    //извлекаем элемент из стека
    public int pop(){
        if(tos<0){
            System.out.println("Стек не загружен");
            return 0;
        }
        else return stck[tos--];
    }
}
class IfTest {
    public static void main(String[] args) {
        FixedStack mystack1=new FixedStack(5);
        FixedStack mystack2=new FixedStack(8);

        //размещаем числа в стеке
        for(int i=0;i<5;i++)mystack1.push(i);
        for(int i=0;i<8;i++)mystack2.push(i);

        //извлекаем числа из стека
        System.out.println("Стек в mystack1: ");
        for(int i=0;i<5;i++)System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2: ");
        for(int i=0;i<8;i++)System.out.println(mystack2.pop());
    }
}
