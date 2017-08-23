package Chapter07;
// в этой версии класса Box2 один объект допускается инициализировать другим объектом
class Box2{
    double width;
    double height;
    double depth;
    // в качестве параметра этого конструктора используется объект типа Box2
    Box2(Box2 lol){//передача объекта конструктору
        width=lol.width;
        height=lol.height;
        depth=lol.depth;
 }
 // конструктор используемый для указания всех размеров
    Box2(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    // конструктор используемый если ни один параметр не укащан
    Box2(){
        width=-1;
        height=-1;
        depth=-1;
    }
    // конструктор используемый при создании куба
    Box2(double len){
        width=height=depth=len;
    }
    // рассчет и возврат объема
    double volume(){
        return width*height*depth;
    }
}
public class OverloadCons2 {
    public static void main(String args[]){
        //создать параллелепипеды используя разные конструкторы
        Box2 mybox1=new Box2(10,20,15);
        Box2 mybox2=new Box2();
        Box2 mybox3=new Box2(7);
        Box2 myclone=new Box2(mybox1);// копия mybox1
        //объем первого, второго, куба и клонаю
        System.out.println("Объем mybox1 равен: "+mybox1.volume());
        System.out.println("Объем mybox2 равен: "+mybox2.volume());
        System.out.println("Объем куба равен: "+mybox3.volume());
        System.out.println("Объем клона равен: "+myclone.volume());
    }
}
