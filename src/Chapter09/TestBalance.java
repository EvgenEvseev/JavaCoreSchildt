package Chapter09;
import Chapter09.MyPack.*;
public class TestBalance {
    public static void main(String[] args) {
        //класс Balance объявлен как public, поэтому им можно воспользоваться и вызвать его конструктор
        Balance test=new Balance("J.J.Jaspers",99.88);
        // и метод
        test.show();
    }
}
