package Chapter08;//Простой пример абстракции
abstract class P{
    abstract void callme();
    // абстрактные классы могут содержать и конкретные методы
    void callmetoo(){
        System.out.println("Это конкретный метод");
    }
}
class R extends P{
    void callme(){
        System.out.println("Реализация метода callme() из класса R");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        R r = new R();
        r.callme();
        r.callmetoo();
    }
}
