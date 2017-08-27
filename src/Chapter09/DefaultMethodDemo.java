package Chapter09;
interface MyIF{
    int getNumber();
    default String getString(){
        return "Объект типа String по умолчанию";
    }
}
class MyIFImp implements MyIF{
    public int getNumber(){
        return 100;
    }
}
class MyIFImp2 implements MyIF {
    public int getNumber() {
        return 99;
    }
    //переопределение метода по умолчанию
    public String getString() {
        return("Другая символьная строка");
    }
}
public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
        MyIFImp2 obj1=new MyIFImp2();
        System.out.println(obj1.getNumber());
        System.out.println(obj1.getString());
    }
}
