package Chapter08;//Динамическая диспетчиризация методов
class X{
    void callme(){
        System.out.println("В методе callme() из класса X");
    }
}
class Y extends X{
    // переопределяем метод callme()
    void callme(){
        System.out.println("В методе callme() из класса Y");
    }
}
class Z extends X{
    //переопределить метод
    void callme(){
        System.out.println("В методе callme() из класса Z");
    }
}
public class DisPatch {
    public static void main(String[] args) {
        X x=new X();
        Y y=new Y();
        Z z=new Z();

        // ВНИМАНИЕ ССЫЛКИ
        X r; // ссылка на объект типа X
        r=x;// переменная r ссылается на объект типа X, соответственно метод вызывается из X
        r.callme();
        r=y;// а тут эта переменная ссылается уже на обьект типа Y
        r.callme();
        r.callme();
        System.out.println();

        x.callme(); // тут вызывал обычным способом
        y.callme();
        z.callme();
    }
}
