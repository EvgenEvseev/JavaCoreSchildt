package Chapter08;
class Box1{
    private double width;
    private double height;
    private double depth;
    // конструирование клона объекта
    Box1(Box1 obj){//  передача объекта конструктору
        width=obj.width;
        height=obj.height;
        depth=obj.depth;
    }
    //Конструктор для указания размеров
    Box1(double w,double h,double d){
        width =w;
        height=h;
        depth=d;
    }
    //Конструктор при отсутствии размеров
    Box1(){
        width=-1;
        height=-1;
        depth=-1;
    }
    //Конструктор для куба
    Box1(double len){
        width=depth=height=len;
    }
    //рассчет и возврат объема
    double volume(){
        return width*height*depth;
    }
}
//Теперь в классе NewBox1 реализованы все конструкторы
class NewBox1 extends Box1{
    double weight;//вес параллелепипеда
    //передача объекта конструктору
    NewBox1(NewBox1 obj){
        super(obj);
        weight= obj.weight;
    }
    NewBox1(double w, double h,double d,double m){
        super(w,h,d);//вызов конструктора из суперкласса
        weight=m;
    }
    //конструктор, применяемый по умолчанию
    NewBox1(){
        super();
        weight=-1;
    }
    //конструктор для куба
    NewBox1(double len,double m){
        super(len);
        weight=m;
    }
}
public class DemoSuper {
    public static void main(String[] args) {
        NewBox1 mybox1 = new NewBox1(10,20,15,34.3);
        NewBox1 mybox2 = new NewBox1(2,3,4,0.076);
        NewBox1 mybox3 = new NewBox1();
        NewBox1 mycube = new NewBox1(3,2);
        NewBox1 myclone = new NewBox1(mybox1);
        double vol;

        vol=mybox1.volume();
        System.out.println("Объем mybox1 равен "+vol);
        System.out.println("Вес mybox1 равен "+mybox1.weight);
        System.out.println();

        vol=mybox2.volume();
        System.out.println("Объем mybox2 равен "+vol);
        System.out.println("Вес mybox2 равен "+mybox2.weight);
        System.out.println();

        vol=mybox3.volume();
        System.out.println("Объем mybox3 равен "+vol);
        System.out.println("Вес mybox3 равен "+mybox3.weight);
        System.out.println();

        vol=myclone.volume();
        System.out.println("Объем myclone равен "+vol);
        System.out.println("Вес myclone равен "+myclone.weight);
        System.out.println();

        vol=mycube.volume();
        System.out.println("Объем mycube равен "+vol);
        System.out.println("Вес mycube равен "+mycube.weight);
        System.out.println();
    }
}
