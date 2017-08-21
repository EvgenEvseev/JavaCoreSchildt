package Chapter06;
// В этом примере программы для инициализации размеров параллелепипеда в классе Box применяется параметризированный конструктор
 class Box6{
    double width,height,depth;
    //Это конструктор класса Box
    Box6(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    //рассчитать и возвратить объем
    double volume(){
        return width*height*depth;
    }
}
public class BoxDemo7 {
     public static void main(String args[]){
         //Объявить, выделить память и инициализировать объекты типа Box6
         Box6 mybox1=new Box6(10,20,15);
         Box6 mybox2=new Box6(3,6,9);
         // объем первого
         System.out.println("Объем1 равен "+mybox1.volume());
         // объем второго
         System.out.println("Объем2 равен "+mybox2.volume());
     }
}
