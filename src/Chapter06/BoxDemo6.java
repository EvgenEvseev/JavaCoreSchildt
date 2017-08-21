package Chapter06;
class Box5 {
    double width;
    double height;
    double depth;

    //Это конструктор класса Box
    Box5() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
        //Рассчитать и возвратить объем
    }
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo6 {
        public static void main(String args[]){
            //объявить, выделить память и инициализировать объекты типа Box
            Box5 mybox1=new Box5();
            Box5 mybox2=new Box5();
            // объем первого
            System.out.println("Объем1 равен "+mybox1.volume());
            // объем второго
            System.out.println("Объем2 равен "+mybox2.volume());
        }
}

