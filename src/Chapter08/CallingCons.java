package Chapter08;
// Продемонстрировать порядок вызова конструкторов
// Создадим суперкласс
class F{
    F(){
        System.out.println("В конструкторе A");
    }
}
//создадим подкласс путем рассширения F
class G extends F{
    G(){
        System.out.println("В конструкторе G");
    }
}
//еще один подкласс путем расширения G
class H extends G{
    H(){
        System.out.println("В конструкторе H");
    }
}
public class CallingCons {
    public static void main(String[] args) {
        H h = new H();
    }
}
