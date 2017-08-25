package Chapter08;
//Методы с отличающимися сигнатурами сичитаются перегружаемыми а не переопределяемыми
class N{
    int i,j;
    N(int a,int b){
        i=a;
        j=b;
    }
    void show(){
        System.out.println("i и j: "+i+" и "+j);
    }
}
class O extends N{
    int k;
    O(int a,int b,int c){
        super(a,b);
        k=c;
    }
    //Перегружаем метод show
    void show(String msg){
        System.out.println(msg+k);
    }
}
public class Override2 {
    public static void main(String[] args) {
        O subObj = new O(1,2,3);
        subObj.show("Это k:");
        subObj.show();
    }
}
