package Chapter08;

import com.sun.org.apache.bcel.internal.generic.NEW;

//В этой программе наследование применяется для расширения класса Box
class Box{
    double width;
    double height;
    double depth;
    // конструирование клона объекта
    Box(Box obj){//  передача объекта конструктору
        width=obj.width;
        height=obj.height;
        depth=obj.depth;
    }
    //Конструктор для указания размеров
    Box(double w,double h,double d){
        width =w;
        height=h;
        depth=d;
    }
    //Конструктор при отсутствии размеров
    Box(){
        width=-1;
        height=-1;
        depth=-1;
    }
    //Конструктор для куба
    Box(double len){
        width=depth=height=len;
    }
    //рассчет и возврат объема
    double volume(){
        return width*height*depth;
    }
}
//расширение класса Box используя наследование EXTENDS
class NewBox extends Box{
    double weight;// вес параллелепипедыча
    //конструктор
    NewBox(double w,double h,double d,double m){
        width=w;
        height=h;
        depth=d;
        weight=m;
    }
}
public class DemoBoxWeight {
    public static void main(String[] args) {
        NewBox mybox1=new NewBox(10,20,15,34.3);
        NewBox mybox2=new NewBox(2,3,4,0.076);

        double vol=mybox1.volume();
        System.out.println("Объем mybox1 равен: "+vol);
        System.out.println("Вес mybox1 равен: "+mybox1.weight);
        System.out.println();

        vol=mybox2.volume();
        System.out.println("Объем mybox2 равен: "+vol);
        System.out.println("Вес mybox2 равен: "+mybox2.weight);
    }
}
