package Chapter07;
// В данном примере конструкторы опеределяются в классе Box
// для инициализации размеров параллелепипеда тремя разными способами
class Box{
    double width;
    double height;
    double depth;
    //конструктор, используемый при указании всех размеров
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
    //конструктор, используемый, когда ни один из размеров не указан
    Box(){
        width=-1;//значение -1 для обозначения неинициализированного параллелепипеда
        height=-1;
        depth=-1;
    }
    // конструктор используемый при создании куба
    Box(double len){
        width=height=depth=len;
    }
    // рассчитать и возвратить объем
    double volume(){
        return width*height*depth;
    }
}
public class OverloadCons {
    public static void main(String args[]){
        //Создать параллелепипеды используя разные конструкторы
        Box mybox1=new Box(10,20,15);
        Box mybox2=new Box();
        Box mybox3=new Box(7);
        // получить объем первого параллелепипеда
        System.out.println("Объем mybox1 равен "+mybox1.volume());
        //второго
        System.out.println("Объем mybox2 равен "+mybox2.volume());
        //третьего
        System.out.println("Объем mybox3 равен "+mybox3.volume());
    }
}
