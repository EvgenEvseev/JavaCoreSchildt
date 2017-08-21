package Chapter06;
//Теперь метод volume() возвращает объем параллелепипеда
class Box3{
    double width;
    double height;
    double depth;
    // рассчитать и возвратить объем
    double volume(){
        return width*height*depth;
    }
}
class BoxDemo4 {
    public static void main(String args[]){
      Box3 mybox1=new Box3();
      Box3 mybox2=new Box3();

      //Присваивание значений mybox1
        mybox1.width=10;
        mybox1.height=20;
        mybox1.depth=15;
        //Присваивание других значений mybox2
        mybox2.width=3;
        mybox2.height=6;
        mybox2.depth=9;
        //Вывод 1
        System.out.println("Объем1 равен "+mybox1.volume());
        System.out.println("Объем2 равен "+mybox2.volume());

    }
}
