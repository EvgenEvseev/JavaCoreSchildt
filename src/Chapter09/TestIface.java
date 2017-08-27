package Chapter09;
interface Callback{
    void callback(int param);
}
//реализуем его в классе
class Client implements Callback {
    public void callback(int p) {
        System.out.println("Метод callback, вызываемый со значением " + p);
    }
    void nonIfaceMeth() {
        System.out.println("В классах, реализующих интерфейся могут определятся другие члены");
    }
}

// вызываем метод callback интерфейса Callback через переменную ссылки на интерфейс
public class TestIface {
    public static void main(String[] args) {
        Callback c= new Client();
        c.callback(42);
    }
}
