package Chapter08;
//использовать ключевое слово super с целью предотвратить сокрытие имен
class D{
    int i;
}
//создание подкласса раширением класса D
class E extends D{
    int i;//этот член i скрывает i из суперкласса D
    E(int a,int b){
        super.i=a;// i из D
        i=b;      // i из E
    }
    void show(){
        System.out.println("Член i в суперклассе : "+super.i);
        System.out.println("Член i в подклассе : "+i);
    }
}
public class UseSuper {
    public static void main(String[] args) {
        E subOb = new E(1,2);
        subOb.show();
    }
}
