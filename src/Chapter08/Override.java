package Chapter08;//преопределение метода
class K{
    int i,j;
    K(int a,int b){
        i=a;
        j=b;
    }
    // вывод переменных i,j
    void show(){
        System.out.println("i и j : "+i+" и "+ j);
    }
}
class L extends K {
    int k;
    L(int a,int b,int c){
        super(a,b);
        k=c;
    }
    //вывод содержимого переменной k с помощью метода, переопределяющео метод show() из класса L
    void show(){
        System.out.println("k: "+k);
    }
    void show2(){
        super.show();
    }
}
public class Override {
    public static void main(String[] args) {
        L subObj = new L(1,2,3);
        subObj.show(); // вызов метода show подкласса L
        subObj.show2();//вызов метода show2 в котором вызывается метод show из суперкласса
    }
}
