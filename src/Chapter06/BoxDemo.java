package Chapter06;
// программа использующая класс Box
class Box {double width;
double height;
double depth;
}
// в этом классе обьявляется обьект типа Box
class BoxDemo{
    public static void main(String args[]){
        Box mybox = new Box();
        double vol;
        //присваивание значений переменным экземпляра mybox
        mybox.width=10;
        mybox.height=20;
        mybox.depth=15;
        //рассчитать объем параллелепипеда
        vol=mybox.width* mybox.height*mybox.depth;
        System.out.println("Объем равен "+vol);
        }
    }

