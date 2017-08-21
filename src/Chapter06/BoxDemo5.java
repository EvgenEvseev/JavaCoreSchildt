package Chapter06;
// в этой программе применяется метод с параметрами
class Box4{
    double width;
    double height;
    double depth;
    //рассчитать и возвратить объем
    double volume(){
        return width*height*depth;
    }
    //установить размеры параллелепипеда
    void setDim(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
}
class BoxDemo5 {
    public static void main(String args[]){
        Box4 mybox1=new Box4();
        Box4 mybox2=new Box4();
        //инициализировать каждый экземпляр класса Box
        mybox1.setDim(10,20,15);
        mybox2.setDim(3,6,9);
        //получить объем 1
        System.out.println("Объем равен "+mybox1.volume() );
        //объем 2
        System.out.println("Объем равен "+mybox2.volume());

    }
}
