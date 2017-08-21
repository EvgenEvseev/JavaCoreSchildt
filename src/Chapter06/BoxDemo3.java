package Chapter06;
class Box2{
    double width;
    double height;
    double depth;
    //вывести обьем параллелепипеда
    void volume(){
        System.out.print("Объем равен ");
        System.out.println(width*height*depth);
    }
    // выведу  метод  для пробы
    void iff(){
        if((width*height*depth)>1000)System.out.println("Объем больше чем нужно");
                else System.out.println("Объем подходящий");
            System.out.println();
    }
}
class BoxDemo3 {
    public static void main(String args[]){
        Box2 mybox1=new Box2();
        Box2 mybox2=new Box2();
        //Присваивание значения переменным экземпляра mybox1
        mybox1.width=10;
        mybox1.height=20;
        mybox1.depth=15;
        //Присваивание других значений переменных экземпляра mybox2
        mybox2.width=3;
        mybox2.height=6;
        mybox2.depth=9;
        //Выведение объема параллелепипеда 1
        mybox1.volume();
        mybox1.iff();
        //Выведение объема параллелепипеда 2
        mybox2.volume();
        mybox2.iff();
    }
}
