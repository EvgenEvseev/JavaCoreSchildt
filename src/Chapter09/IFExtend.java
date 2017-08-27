package Chapter09;
//один интерфейс может расширять другой
interface A1{
    void meth1();
    void meth2();
}
//теперь новый интерфейс наследует методы meth1,meth2 и добавляет новый meth3
interface B1 extends A1{
    void meth3();
}
//Этот класс должен реализовать все методы из интерфейсов A1 B1
class MyClass implements B1{
    public void meth1(){
        System.out.println("Метод 1");
    }
    public void meth2(){
        System.out.println("Метод 2");
    }
    public void meth3(){
        System.out.println("Метод 3");
    }

}
class IFExtend {
    public static void main(String[] args) {
        MyClass my=new MyClass();
        my.meth1();
        my.meth2();
        my.meth3();
    }
}
